/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ludapivovarevich;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-04-17")
public class FamilyPlants implements org.apache.thrift.TBase<FamilyPlants, FamilyPlants._Fields>, java.io.Serializable, Cloneable, Comparable<FamilyPlants> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FamilyPlants");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FLOWERING_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("floweringTime", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField LIST_PLANTS_FIELD_DESC = new org.apache.thrift.protocol.TField("listPlants", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FamilyPlantsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FamilyPlantsTupleSchemeFactory();

  public int id; // required
  public String name; // required
  public FloweringTime floweringTime; // required
  public java.util.List<Plant> listPlants; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    FLOWERING_TIME((short)3, "floweringTime"),
    LIST_PLANTS((short)4, "listPlants");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // FLOWERING_TIME
          return FLOWERING_TIME;
        case 4: // LIST_PLANTS
          return LIST_PLANTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FLOWERING_TIME, new org.apache.thrift.meta_data.FieldMetaData("floweringTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FloweringTime.class)));
    tmpMap.put(_Fields.LIST_PLANTS, new org.apache.thrift.meta_data.FieldMetaData("listPlants", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Plant.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FamilyPlants.class, metaDataMap);
  }

  public FamilyPlants() {
  }

  public FamilyPlants(
    int id,
    String name,
    FloweringTime floweringTime,
    java.util.List<Plant> listPlants)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.name = name;
    this.floweringTime = floweringTime;
    this.listPlants = listPlants;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FamilyPlants(FamilyPlants other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetFloweringTime()) {
      this.floweringTime = new FloweringTime(other.floweringTime);
    }
    if (other.isSetListPlants()) {
      java.util.List<Plant> __this__listPlants = new java.util.ArrayList<Plant>(other.listPlants.size());
      for (Plant other_element : other.listPlants) {
        __this__listPlants.add(new Plant(other_element));
      }
      this.listPlants = __this__listPlants;
    }
  }

  public FamilyPlants deepCopy() {
    return new FamilyPlants(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    this.floweringTime = null;
    this.listPlants = null;
  }

  public int getId() {
    return this.id;
  }

  public FamilyPlants setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public FamilyPlants setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public FloweringTime getFloweringTime() {
    return this.floweringTime;
  }

  public FamilyPlants setFloweringTime(FloweringTime floweringTime) {
    this.floweringTime = floweringTime;
    return this;
  }

  public void unsetFloweringTime() {
    this.floweringTime = null;
  }

  /** Returns true if field floweringTime is set (has been assigned a value) and false otherwise */
  public boolean isSetFloweringTime() {
    return this.floweringTime != null;
  }

  public void setFloweringTimeIsSet(boolean value) {
    if (!value) {
      this.floweringTime = null;
    }
  }

  public int getListPlantsSize() {
    return (this.listPlants == null) ? 0 : this.listPlants.size();
  }

  public java.util.Iterator<Plant> getListPlantsIterator() {
    return (this.listPlants == null) ? null : this.listPlants.iterator();
  }

  public void addToListPlants(Plant elem) {
    if (this.listPlants == null) {
      this.listPlants = new java.util.ArrayList<Plant>();
    }
    this.listPlants.add(elem);
  }

  public java.util.List<Plant> getListPlants() {
    return this.listPlants;
  }

  public FamilyPlants setListPlants(java.util.List<Plant> listPlants) {
    this.listPlants = listPlants;
    return this;
  }

  public void unsetListPlants() {
    this.listPlants = null;
  }

  /** Returns true if field listPlants is set (has been assigned a value) and false otherwise */
  public boolean isSetListPlants() {
    return this.listPlants != null;
  }

  public void setListPlantsIsSet(boolean value) {
    if (!value) {
      this.listPlants = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case FLOWERING_TIME:
      if (value == null) {
        unsetFloweringTime();
      } else {
        setFloweringTime((FloweringTime)value);
      }
      break;

    case LIST_PLANTS:
      if (value == null) {
        unsetListPlants();
      } else {
        setListPlants((java.util.List<Plant>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case FLOWERING_TIME:
      return getFloweringTime();

    case LIST_PLANTS:
      return getListPlants();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case FLOWERING_TIME:
      return isSetFloweringTime();
    case LIST_PLANTS:
      return isSetListPlants();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FamilyPlants)
      return this.equals((FamilyPlants)that);
    return false;
  }

  public boolean equals(FamilyPlants that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_floweringTime = true && this.isSetFloweringTime();
    boolean that_present_floweringTime = true && that.isSetFloweringTime();
    if (this_present_floweringTime || that_present_floweringTime) {
      if (!(this_present_floweringTime && that_present_floweringTime))
        return false;
      if (!this.floweringTime.equals(that.floweringTime))
        return false;
    }

    boolean this_present_listPlants = true && this.isSetListPlants();
    boolean that_present_listPlants = true && that.isSetListPlants();
    if (this_present_listPlants || that_present_listPlants) {
      if (!(this_present_listPlants && that_present_listPlants))
        return false;
      if (!this.listPlants.equals(that.listPlants))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetFloweringTime()) ? 131071 : 524287);
    if (isSetFloweringTime())
      hashCode = hashCode * 8191 + floweringTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetListPlants()) ? 131071 : 524287);
    if (isSetListPlants())
      hashCode = hashCode * 8191 + listPlants.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(FamilyPlants other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFloweringTime()).compareTo(other.isSetFloweringTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFloweringTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.floweringTime, other.floweringTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetListPlants()).compareTo(other.isSetListPlants());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetListPlants()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.listPlants, other.listPlants);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FamilyPlants(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("floweringTime:");
    if (this.floweringTime == null) {
      sb.append("null");
    } else {
      sb.append(this.floweringTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("listPlants:");
    if (this.listPlants == null) {
      sb.append("null");
    } else {
      sb.append(this.listPlants);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (floweringTime != null) {
      floweringTime.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FamilyPlantsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FamilyPlantsStandardScheme getScheme() {
      return new FamilyPlantsStandardScheme();
    }
  }

  private static class FamilyPlantsStandardScheme extends org.apache.thrift.scheme.StandardScheme<FamilyPlants> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FamilyPlants struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FLOWERING_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.floweringTime = new FloweringTime();
              struct.floweringTime.read(iprot);
              struct.setFloweringTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LIST_PLANTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.listPlants = new java.util.ArrayList<Plant>(_list0.size);
                Plant _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Plant();
                  _elem1.read(iprot);
                  struct.listPlants.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setListPlantsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FamilyPlants struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.floweringTime != null) {
        oprot.writeFieldBegin(FLOWERING_TIME_FIELD_DESC);
        struct.floweringTime.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.listPlants != null) {
        oprot.writeFieldBegin(LIST_PLANTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.listPlants.size()));
          for (Plant _iter3 : struct.listPlants)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FamilyPlantsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FamilyPlantsTupleScheme getScheme() {
      return new FamilyPlantsTupleScheme();
    }
  }

  private static class FamilyPlantsTupleScheme extends org.apache.thrift.scheme.TupleScheme<FamilyPlants> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FamilyPlants struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetFloweringTime()) {
        optionals.set(2);
      }
      if (struct.isSetListPlants()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetFloweringTime()) {
        struct.floweringTime.write(oprot);
      }
      if (struct.isSetListPlants()) {
        {
          oprot.writeI32(struct.listPlants.size());
          for (Plant _iter4 : struct.listPlants)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FamilyPlants struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.floweringTime = new FloweringTime();
        struct.floweringTime.read(iprot);
        struct.setFloweringTimeIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.listPlants = new java.util.ArrayList<Plant>(_list5.size);
          Plant _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new Plant();
            _elem6.read(iprot);
            struct.listPlants.add(_elem6);
          }
        }
        struct.setListPlantsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
