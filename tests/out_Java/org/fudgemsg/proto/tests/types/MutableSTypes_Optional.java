// Automatically created - do not modify
// Created from types.proto:211(10)
package org.fudgemsg.proto.tests.types;
public class MutableSTypes_Optional implements java.io.Serializable, TypesBase {
  private static final long serialVersionUID = 2511807829388664249l;
  private boolean __Bool;
  public static final String _BOOL_KEY = "_Bool";
  private byte __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private double __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private float __Float;
  public static final String _FLOAT_KEY = "_Float";
  private boolean __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private int __Int;
  public static final String _INT_KEY = "_Int";
  private long __Long;
  public static final String _LONG_KEY = "_Long";
  private short __Short;
  public static final String _SHORT_KEY = "_Short";
  private String __String;
  public static final String _STRING_KEY = "_String";
  private org.fudgemsg.proto.tests.types.SubMessage __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private org.fudgemsg.proto.tests.types.CustomEnum __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private org.fudgemsg.FudgeFieldContainer __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private org.fudgemsg.types.FudgeDate __Date;
  public static final String _DATE_KEY = "_Date";
  private java.util.Date __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private org.fudgemsg.types.FudgeTime __Time;
  public static final String _TIME_KEY = "_Time";
  public MutableSTypes_Optional () {
  }
  protected MutableSTypes_Optional (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (_BOOL_KEY);
    if (fudgeField != null)  {
      try {
        set_Bool (fudgeMsg.getFieldValue (Boolean.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Bool' is not boolean", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_BYTE_KEY);
    if (fudgeField != null)  {
      try {
        set_Byte (fudgeMsg.getFieldValue (Byte.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Byte' is not byte", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_DOUBLE_KEY);
    if (fudgeField != null)  {
      try {
        set_Double (fudgeMsg.getFieldValue (Double.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Double' is not double", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_FLOAT_KEY);
    if (fudgeField != null)  {
      try {
        set_Float (fudgeMsg.getFieldValue (Float.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Float' is not float", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_INDICATOR_KEY);
    if (fudgeField != null)  {
      set_Indicator (fudgeField.getValue () != null);
    }
    fudgeField = fudgeMsg.getByName (_INT_KEY);
    if (fudgeField != null)  {
      try {
        set_Int (fudgeMsg.getFieldValue (Integer.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Int' is not integer", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_LONG_KEY);
    if (fudgeField != null)  {
      try {
        set_Long (fudgeMsg.getFieldValue (Long.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Long' is not long", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_SHORT_KEY);
    if (fudgeField != null)  {
      try {
        set_Short (fudgeMsg.getFieldValue (Short.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Short' is not short", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_STRING_KEY);
    if (fudgeField != null)  {
      try {
        set_String (fudgeField.getValue ().toString ());
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_String' is not string", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_SUBMESSAGE_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.proto.tests.types.SubMessage fudge1;
        fudge1 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
        set_SubMessage (fudge1);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_SubMessage' is not SubMessage message", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_CUSTOMENUM_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.proto.tests.types.CustomEnum fudge1;
        fudge1 = org.fudgemsg.proto.tests.types.CustomEnum.fromFudgeEncoding (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        set_CustomEnum (fudge1);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_CustomEnum' is not CustomEnum enum", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_MESSAGE_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge1;
        fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
        set_Message (fudge1);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Message' is not anonymous/unknown message", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_DATE_KEY);
    if (fudgeField != null)  {
      try {
        set_Date (fudgeMsg.getFieldValue (org.fudgemsg.types.FudgeDate.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Date' is not date", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_DATETIME_KEY);
    if (fudgeField != null)  {
      try {
        set_DateTime (fudgeMsg.getFieldValue (java.util.Date.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_DateTime' is not datetime", e);
      }
    }
    fudgeField = fudgeMsg.getByName (_TIME_KEY);
    if (fudgeField != null)  {
      try {
        set_Time (fudgeMsg.getFieldValue (org.fudgemsg.types.FudgeTime.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableSTypes_Optional - field '_Time' is not time", e);
      }
    }
  }
  public MutableSTypes_Optional (boolean _Bool, byte _Byte, double _Double, float _Float, boolean _Indicator, int _Int, long _Long, short _Short, String _String, org.fudgemsg.proto.tests.types.SubMessage _SubMessage, org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum, org.fudgemsg.FudgeFieldContainer _Message, org.fudgemsg.types.FudgeDate _Date, java.util.Date _DateTime, org.fudgemsg.types.FudgeTime _Time) {
    __Bool = _Bool;
    __Byte = _Byte;
    __Double = _Double;
    __Float = _Float;
    __Indicator = _Indicator;
    __Int = _Int;
    __Long = _Long;
    __Short = _Short;
    __String = _String;
    if (_SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = _SubMessage;
    }
    __CustomEnum = _CustomEnum;
    __Message = _Message;
    __Date = _Date;
    __DateTime = _DateTime;
    __Time = _Time;
  }
  public MutableSTypes_Optional (final MutableSTypes_Optional source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    __Bool = source.__Bool;
    __Byte = source.__Byte;
    __Double = source.__Double;
    __Float = source.__Float;
    __Indicator = source.__Indicator;
    __Int = source.__Int;
    __Long = source.__Long;
    __Short = source.__Short;
    __String = source.__String;
    if (source.__SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = source.__SubMessage;
    }
    __CustomEnum = source.__CustomEnum;
    __Message = source.__Message;
    __Date = source.__Date;
    __DateTime = source.__DateTime;
    __Time = source.__Time;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (_BOOL_KEY, null, __Bool);
    msg.add (_BYTE_KEY, null, __Byte);
    msg.add (_DOUBLE_KEY, null, __Double);
    msg.add (_FLOAT_KEY, null, __Float);
    if (__Indicator) msg.add (_INDICATOR_KEY, null, org.fudgemsg.types.IndicatorType.INSTANCE);
    msg.add (_INT_KEY, null, __Int);
    msg.add (_LONG_KEY, null, __Long);
    msg.add (_SHORT_KEY, null, __Short);
    if (__String != null)  {
      msg.add (_STRING_KEY, null, __String);
    }
    if (__SubMessage != null)  {
      msg.add (_SUBMESSAGE_KEY, null, __SubMessage.toFudgeMsg (fudgeContext));
    }
    if (__CustomEnum != null)  {
      msg.add (_CUSTOMENUM_KEY, null, __CustomEnum.getFudgeEncoding ());
    }
    if (__Message != null)  {
      msg.add (_MESSAGE_KEY, null, fudgeContext.newMessage (__Message));
    }
    if (__Date != null)  {
      msg.add (_DATE_KEY, null, __Date);
    }
    if (__DateTime != null)  {
      msg.add (_DATETIME_KEY, null, __DateTime);
    }
    if (__Time != null)  {
      msg.add (_TIME_KEY, null, __Time);
    }
  }
  public static MutableSTypes_Optional fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new MutableSTypes_Optional (fudgeMsg);
  }
  public boolean get_Bool () {
    return __Bool;
  }
  public void set_Bool (boolean _Bool) {
    __Bool = _Bool;
  }
  public byte get_Byte () {
    return __Byte;
  }
  public void set_Byte (byte _Byte) {
    __Byte = _Byte;
  }
  public double get_Double () {
    return __Double;
  }
  public void set_Double (double _Double) {
    __Double = _Double;
  }
  public float get_Float () {
    return __Float;
  }
  public void set_Float (float _Float) {
    __Float = _Float;
  }
  public boolean get_Indicator () {
    return __Indicator;
  }
  public void set_Indicator (boolean _Indicator) {
    __Indicator = _Indicator;
  }
  public int get_Int () {
    return __Int;
  }
  public void set_Int (int _Int) {
    __Int = _Int;
  }
  public long get_Long () {
    return __Long;
  }
  public void set_Long (long _Long) {
    __Long = _Long;
  }
  public short get_Short () {
    return __Short;
  }
  public void set_Short (short _Short) {
    __Short = _Short;
  }
  public String get_String () {
    return __String;
  }
  public void set_String (String _String) {
    __String = _String;
  }
  public org.fudgemsg.proto.tests.types.SubMessage get_SubMessage () {
    return __SubMessage;
  }
  public void set_SubMessage (org.fudgemsg.proto.tests.types.SubMessage _SubMessage) {
    if (_SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = _SubMessage;
    }
  }
  public org.fudgemsg.proto.tests.types.CustomEnum get_CustomEnum () {
    return __CustomEnum;
  }
  public void set_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum) {
    __CustomEnum = _CustomEnum;
  }
  public org.fudgemsg.FudgeFieldContainer get_Message () {
    return __Message;
  }
  public void set_Message (org.fudgemsg.FudgeFieldContainer _Message) {
    __Message = _Message;
  }
  public org.fudgemsg.types.FudgeDate get_Date () {
    return __Date;
  }
  public void set_Date (org.fudgemsg.types.FudgeDate _Date) {
    __Date = _Date;
  }
  public java.util.Date get_DateTime () {
    return __DateTime;
  }
  public void set_DateTime (java.util.Date _DateTime) {
    __DateTime = _DateTime;
  }
  public org.fudgemsg.types.FudgeTime get_Time () {
    return __Time;
  }
  public void set_Time (org.fudgemsg.types.FudgeTime _Time) {
    __Time = _Time;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof MutableSTypes_Optional)) return false;
    MutableSTypes_Optional msg = (MutableSTypes_Optional)o;
    if (__Bool != msg.__Bool) return false;
    if (__Byte != msg.__Byte) return false;
    if (__Double != msg.__Double) return false;
    if (__Float != msg.__Float) return false;
    if (__Indicator != msg.__Indicator) return false;
    if (__Int != msg.__Int) return false;
    if (__Long != msg.__Long) return false;
    if (__Short != msg.__Short) return false;
    if (__String != null) {
      if (msg.__String != null) {
        if (!__String.equals (msg.__String)) return false;
      }
      else return false;
    }
    else if (msg.__String != null) return false;
    if (__SubMessage != null) {
      if (msg.__SubMessage != null) {
        if (!__SubMessage.equals (msg.__SubMessage)) return false;
      }
      else return false;
    }
    else if (msg.__SubMessage != null) return false;
    if (__CustomEnum != null) {
      if (msg.__CustomEnum != null) {
        if (!__CustomEnum.equals (msg.__CustomEnum)) return false;
      }
      else return false;
    }
    else if (msg.__CustomEnum != null) return false;
    if (__Message != null) {
      if (msg.__Message != null) {
        if (!__Message.equals (msg.__Message)) return false;
      }
      else return false;
    }
    else if (msg.__Message != null) return false;
    if (__Date != null) {
      if (msg.__Date != null) {
        if (!__Date.equals (msg.__Date)) return false;
      }
      else return false;
    }
    else if (msg.__Date != null) return false;
    if (__DateTime != null) {
      if (msg.__DateTime != null) {
        if (!__DateTime.equals (msg.__DateTime)) return false;
      }
      else return false;
    }
    else if (msg.__DateTime != null) return false;
    if (__Time != null) {
      if (msg.__Time != null) {
        if (!__Time.equals (msg.__Time)) return false;
      }
      else return false;
    }
    else if (msg.__Time != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (__Bool) hc++;
    hc = (hc * 31) + (int)__Byte;
    hc = (hc * 31) + (int)__Double;
    hc = (hc * 31) + (int)__Float;
    hc *= 31;
    if (__Indicator) hc++;
    hc = (hc * 31) + (int)__Int;
    hc = (hc * 31) + (int)__Long;
    hc = (hc * 31) + (int)__Short;
    hc *= 31;
    if (__String != null) hc += __String.hashCode ();
    hc *= 31;
    if (__SubMessage != null) hc += __SubMessage.hashCode ();
    hc *= 31;
    if (__CustomEnum != null) hc += __CustomEnum.hashCode ();
    hc *= 31;
    if (__Message != null) hc += __Message.hashCode ();
    hc *= 31;
    if (__Date != null) hc += __Date.hashCode ();
    hc *= 31;
    if (__DateTime != null) hc += __DateTime.hashCode ();
    hc *= 31;
    if (__Time != null) hc += __Time.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}