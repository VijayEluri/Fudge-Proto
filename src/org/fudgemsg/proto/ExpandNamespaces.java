/* Copyright 2009 by OpenGamma Inc and other contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fudgemsg.proto;

import java.util.List;

import org.fudgemsg.proto.antlr.ProtoLexer;

/**
 * Implementation of the name expansion phase of compilation. This will walk an AST, expanding any declarations to fully qualified namespaces.
 * 
 * @author Andrew
 */
/* package */ class ExpandNamespaces implements ASTWalker {
  
  /* package */ static final ExpandNamespaces INSTANCE = new ExpandNamespaces ();
  
  private ExpandNamespaces () {
  }
  
  private AST walkEnumNode (final Compiler.Context context, final AST node, final String namespace, final MessageDefinition outerMessage) {
    final List<AST> children = node.getChildNodes ();
    final AST identifier = children.get (0);
    final String fullIdentifier = namespace + "." + identifier.getNodeValue ();
    context.addDefinition (outerMessage.createEnumDefinition (fullIdentifier, identifier.getCodePosition ()));
    children.set (0, new ASTNode (identifier, fullIdentifier));
    return new ASTNode (node, children);
  }
  
  private String getString (final AST node) {
    switch (node.getNodeLabel ()) {
    case ProtoLexer.IDENTIFIER : {
      final StringBuilder sb = new StringBuilder (node.getNodeValue ());
      final List<AST> children = node.getChildNodes ();
      if (children != null) {
        for (AST child : children) {
          sb.append ('.').append (child.getNodeValue ());
        }
      }
      return sb.toString ();
    }
    case ProtoLexer.STRING :
      return ((LiteralValue.StringValue)LiteralValue.parse (node)).get ();
    case ProtoLexer.ML_STRING : {
      final String s = node.getNodeValue ().trim ().replace ("\r\n", "\n").replace ("\r", "\n");
      int i = s.indexOf ('\n');
      int j = s.lastIndexOf ('\n');
      return s.substring (i + 1, j);
    }
    default :
      return node.getNodeValue (); 
    }
  }
  
  private void walkBindingNode (final Compiler.Context context, final AST node, final MessageDefinition message) {
    List<AST> children = node.getChildNodes ();
    final String identifier = getString (children.get (0));
    final Binding binding = message.createLanguageBinding (identifier);
    for (int i = 1; i < children.size (); i += 2) {
      final String key = getString (children.get (i));
      final String value = getString (children.get (i + 1));
      final Binding.Data prev = binding.getData (key);
      if (prev != null) {
        context.error (node.getCodePosition (), identifier + " language binding for " + message.getName () + " already defined for '" + key + "'");
        context.warning (prev.getCodePosition (), "this was the location of the previous definition");
      }
      binding.setData (key, value, node.getCodePosition ());
    }
  }
  
  private AST walkMessageNode (final Compiler.Context context, final AST node, final String namespace, final MessageDefinition outerMessage) {
    final List<AST> children = node.getChildNodes ();
    final String localNamespace;
    final AST identifier = children.get (0);
    if (namespace.length () != 0) {
      children.set (0, new ASTNode (identifier, localNamespace = namespace + "." + identifier.getNodeValue ()));
    } else {
      localNamespace = identifier.getNodeValue ();
    }
    final MessageDefinition messageDefinition = outerMessage.createMessageDefinition (localNamespace, identifier.getCodePosition ()); 
    context.addDefinition (messageDefinition);
    for (int i = 1; i < children.size (); i++) {
      final AST element = children.get (i);
      switch (element.getNodeLabel ()) {
      case ProtoLexer.BINDING :
        walkBindingNode (context, element, messageDefinition);
        children.remove (i);
        i--;
        break;
      case ProtoLexer.ENUM :
        children.set (i, walkEnumNode (context, element, localNamespace, messageDefinition));
        break;
      case ProtoLexer.MESSAGE :
        children.set (i, walkMessageNode (context, element, localNamespace, messageDefinition));
        break;
      }
    }
    return new ASTNode (node, children);
  }
  
  private void walkNamespaceNode (final Compiler.Context context, final AST node, final String parentNamespace) {
    final List<AST> children = node.getChildNodes ();
    final AST identifier = fixupFullIdentifier (children.get (0));
    final String namespace;
    if (parentNamespace.length () == 0) {
      namespace = identifier.getNodeValue ();
    } else {
      namespace = parentNamespace + "." + identifier.getNodeValue ();
    }
    for (int i = 1; i < children.size (); i++) {
      walkRootNode (context, children.get (i), namespace);
    }
  }
  
  private AST walkTaxonomyNode (final Compiler.Context context, final AST node, final String parentNamespace) {
    final List<AST> children = node.getChildNodes ();
    AST identifier = fixupFullIdentifier (children.get (0));
    if (parentNamespace.length () != 0) {
      identifier = new ASTNode (identifier, parentNamespace + "." + identifier.getNodeValue ());
    }
    children.set (0, identifier);
    context.addDefinition (new TaxonomyDefinition (identifier.getNodeValue (), identifier.getCodePosition ()));
    return new ASTNode (node, children);
  }
  
  private void walkRootNode (final Compiler.Context context, final AST node, final String namespace) {
    switch (node.getNodeLabel ()) {
    case ProtoLexer.ENUM :
      context.addExpandedRoot (walkEnumNode (context, node, namespace, MessageDefinition.NULL));
      break;
    case ProtoLexer.MESSAGE :
      context.addExpandedRoot (walkMessageNode (context, node, namespace, MessageDefinition.NULL));
      break;
    case ProtoLexer.NAMESPACE :
      walkNamespaceNode (context, node, namespace);
      break;
    case ProtoLexer.TAXONOMY :
      context.addExpandedRoot (walkTaxonomyNode (context, node, namespace));
      break;
    default :
      throw new IllegalStateException ("invalid root type '" + node.getNodeLabel () + "'"); 
    }
  }
  
  @Override
  public void walkAstNode (final Compiler.Context context, final AST node) {
    walkRootNode (context, node, "");
  }
  
  /* package */ static AST fixupFullIdentifier (final AST node) {
    final List<AST> children = node.getChildNodes ();
    if ((children == null) || (children.size () == 0)) return node;
    final StringBuilder identifier = new StringBuilder (node.getNodeValue ());
    for (AST child : children) {
      identifier.append ('.').append (child.getNodeValue ());
    }
    return new ASTNode (ProtoLexer.IDENTIFIER, identifier.toString (), null, node.getCodePosition ()); 
  }
  
}