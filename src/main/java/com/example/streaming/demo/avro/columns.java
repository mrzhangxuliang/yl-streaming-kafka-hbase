/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.example.streaming.demo.avro;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class columns extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"columns\",\"namespace\":\"com.example.streaming.demo.avro\",\"fields\":[{\"name\":\"nick\",\"type\":[\"string\",\"null\"],\"default\":null},{\"name\":\"grade\",\"type\":[\"int\",\"null\"],\"default\":null},{\"name\":\"uid\",\"type\":[\"string\",\"null\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence nick;
  @Deprecated public java.lang.Integer grade;
  @Deprecated public java.lang.CharSequence uid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public columns() {}

  /**
   * All-args constructor.
   */
  public columns(java.lang.CharSequence nick, java.lang.Integer grade, java.lang.CharSequence uid) {
    this.nick = nick;
    this.grade = grade;
    this.uid = uid;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nick;
    case 1: return grade;
    case 2: return uid;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nick = (java.lang.CharSequence)value$; break;
    case 1: grade = (java.lang.Integer)value$; break;
    case 2: uid = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nick' field.
   */
  public java.lang.CharSequence getNick() {
    return nick;
  }

  /**
   * Sets the value of the 'nick' field.
   * @param value the value to set.
   */
  public void setNick(java.lang.CharSequence value) {
    this.nick = value;
  }

  /**
   * Gets the value of the 'grade' field.
   */
  public java.lang.Integer getGrade() {
    return grade;
  }

  /**
   * Sets the value of the 'grade' field.
   * @param value the value to set.
   */
  public void setGrade(java.lang.Integer value) {
    this.grade = value;
  }

  /**
   * Gets the value of the 'uid' field.
   */
  public java.lang.CharSequence getUid() {
    return uid;
  }

  /**
   * Sets the value of the 'uid' field.
   * @param value the value to set.
   */
  public void setUid(java.lang.CharSequence value) {
    this.uid = value;
  }

  /** Creates a new columns RecordBuilder */
  public static com.example.streaming.demo.avro.columns.Builder newBuilder() {
    return new com.example.streaming.demo.avro.columns.Builder();
  }
  
  /** Creates a new columns RecordBuilder by copying an existing Builder */
  public static com.example.streaming.demo.avro.columns.Builder newBuilder(com.example.streaming.demo.avro.columns.Builder other) {
    return new com.example.streaming.demo.avro.columns.Builder(other);
  }
  
  /** Creates a new columns RecordBuilder by copying an existing columns instance */
  public static com.example.streaming.demo.avro.columns.Builder newBuilder(com.example.streaming.demo.avro.columns other) {
    return new com.example.streaming.demo.avro.columns.Builder(other);
  }
  
  /**
   * RecordBuilder for columns instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<columns>
    implements org.apache.avro.data.RecordBuilder<columns> {

    private java.lang.CharSequence nick;
    private java.lang.Integer grade;
    private java.lang.CharSequence uid;

    /** Creates a new Builder */
    private Builder() {
      super(com.example.streaming.demo.avro.columns.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.example.streaming.demo.avro.columns.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nick)) {
        this.nick = data().deepCopy(fields()[0].schema(), other.nick);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.grade)) {
        this.grade = data().deepCopy(fields()[1].schema(), other.grade);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.uid)) {
        this.uid = data().deepCopy(fields()[2].schema(), other.uid);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing columns instance */
    private Builder(com.example.streaming.demo.avro.columns other) {
            super(com.example.streaming.demo.avro.columns.SCHEMA$);
      if (isValidValue(fields()[0], other.nick)) {
        this.nick = data().deepCopy(fields()[0].schema(), other.nick);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.grade)) {
        this.grade = data().deepCopy(fields()[1].schema(), other.grade);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.uid)) {
        this.uid = data().deepCopy(fields()[2].schema(), other.uid);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'nick' field */
    public java.lang.CharSequence getNick() {
      return nick;
    }
    
    /** Sets the value of the 'nick' field */
    public com.example.streaming.demo.avro.columns.Builder setNick(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.nick = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'nick' field has been set */
    public boolean hasNick() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'nick' field */
    public com.example.streaming.demo.avro.columns.Builder clearNick() {
      nick = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'grade' field */
    public java.lang.Integer getGrade() {
      return grade;
    }
    
    /** Sets the value of the 'grade' field */
    public com.example.streaming.demo.avro.columns.Builder setGrade(java.lang.Integer value) {
      validate(fields()[1], value);
      this.grade = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'grade' field has been set */
    public boolean hasGrade() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'grade' field */
    public com.example.streaming.demo.avro.columns.Builder clearGrade() {
      grade = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'uid' field */
    public java.lang.CharSequence getUid() {
      return uid;
    }
    
    /** Sets the value of the 'uid' field */
    public com.example.streaming.demo.avro.columns.Builder setUid(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.uid = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'uid' field has been set */
    public boolean hasUid() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'uid' field */
    public com.example.streaming.demo.avro.columns.Builder clearUid() {
      uid = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public columns build() {
      try {
        columns record = new columns();
        record.nick = fieldSetFlags()[0] ? this.nick : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.grade = fieldSetFlags()[1] ? this.grade : (java.lang.Integer) defaultValue(fields()[1]);
        record.uid = fieldSetFlags()[2] ? this.uid : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
