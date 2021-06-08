// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rtcm.proto

package com.fty.utils;

public final class Out {
  private Out() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:rtcm.User)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    boolean hasCard();
    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    com.fty.utils.Out.Card getCard();

    /**
     * <code>string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 age = 3;</code>
     */
    int getAge();

    /**
     * <code>bool hasCar = 4;</code>
     */
    boolean getHasCar();

    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    java.util.List<java.lang.Integer> getLikeNumsList();
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    int getLikeNumsCount();
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    int getLikeNums(int index);
  }
  /**
   * Protobuf type {@code rtcm.User}
   */
  public  static final class User extends
      com.google.protobuf.GeneratedMessageLite<
          User, User.Builder> implements
      // @@protoc_insertion_point(message_implements:rtcm.User)
      UserOrBuilder {
    private User() {
      name_ = "";
      likeNums_ = emptyIntList();
    }
    private int bitField0_;
    public static final int CARD_FIELD_NUMBER = 1;
    private com.fty.utils.Out.Card card_;
    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    @java.lang.Override
    public boolean hasCard() {
      return card_ != null;
    }
    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    @java.lang.Override
    public com.fty.utils.Out.Card getCard() {
      return card_ == null ? com.fty.utils.Out.Card.getDefaultInstance() : card_;
    }
    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    private void setCard(com.fty.utils.Out.Card value) {
      if (value == null) {
        throw new NullPointerException();
      }
      card_ = value;
      
      }
    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    private void setCard(
        com.fty.utils.Out.Card.Builder builderForValue) {
      card_ = builderForValue.build();
      
    }
    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeCard(com.fty.utils.Out.Card value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (card_ != null &&
          card_ != com.fty.utils.Out.Card.getDefaultInstance()) {
        card_ =
          com.fty.utils.Out.Card.newBuilder(card_).mergeFrom(value).buildPartial();
      } else {
        card_ = value;
      }
      
    }
    /**
     * <code>.rtcm.Card card = 1;</code>
     */
    private void clearCard() {  card_ = null;
      
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.String name_;
    /**
     * <code>string name = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <code>string name = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <code>string name = 2;</code>
     */
    private void setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
    }
    /**
     * <code>string name = 2;</code>
     */
    private void clearName() {
      
      name_ = getDefaultInstance().getName();
    }
    /**
     * <code>string name = 2;</code>
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value.toStringUtf8();
    }

    public static final int AGE_FIELD_NUMBER = 3;
    private int age_;
    /**
     * <code>int32 age = 3;</code>
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    private void setAge(int value) {
      
      age_ = value;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    private void clearAge() {
      
      age_ = 0;
    }

    public static final int HASCAR_FIELD_NUMBER = 4;
    private boolean hasCar_;
    /**
     * <code>bool hasCar = 4;</code>
     */
    @java.lang.Override
    public boolean getHasCar() {
      return hasCar_;
    }
    /**
     * <code>bool hasCar = 4;</code>
     */
    private void setHasCar(boolean value) {
      
      hasCar_ = value;
    }
    /**
     * <code>bool hasCar = 4;</code>
     */
    private void clearHasCar() {
      
      hasCar_ = false;
    }

    public static final int LIKENUMS_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList likeNums_;
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLikeNumsList() {
      return likeNums_;
    }
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    @java.lang.Override
    public int getLikeNumsCount() {
      return likeNums_.size();
    }
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    @java.lang.Override
    public int getLikeNums(int index) {
      return likeNums_.getInt(index);
    }
    private int likeNumsMemoizedSerializedSize = -1;
    private void ensureLikeNumsIsMutable() {
      if (!likeNums_.isModifiable()) {
        likeNums_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(likeNums_);
       }
    }
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    private void setLikeNums(
        int index, int value) {
      ensureLikeNumsIsMutable();
      likeNums_.setInt(index, value);
    }
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    private void addLikeNums(int value) {
      ensureLikeNumsIsMutable();
      likeNums_.addInt(value);
    }
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    private void addAllLikeNums(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureLikeNumsIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, likeNums_);
    }
    /**
     * <code>repeated int32 likeNums = 11;</code>
     */
    private void clearLikeNums() {
      likeNums_ = emptyIntList();
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (card_ != null) {
        output.writeMessage(1, getCard());
      }
      if (!name_.isEmpty()) {
        output.writeString(2, getName());
      }
      if (age_ != 0) {
        output.writeInt32(3, age_);
      }
      if (hasCar_ != false) {
        output.writeBool(4, hasCar_);
      }
      if (getLikeNumsList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(likeNumsMemoizedSerializedSize);
      }
      for (int i = 0; i < likeNums_.size(); i++) {
        output.writeInt32NoTag(likeNums_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (card_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCard());
      }
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getName());
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, age_);
      }
      if (hasCar_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, hasCar_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < likeNums_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(likeNums_.getInt(i));
        }
        size += dataSize;
        if (!getLikeNumsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        likeNumsMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.fty.utils.Out.User parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.fty.utils.Out.User parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.fty.utils.Out.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.fty.utils.Out.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.fty.utils.Out.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.fty.utils.Out.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.fty.utils.Out.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.fty.utils.Out.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.fty.utils.Out.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.fty.utils.Out.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.fty.utils.Out.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.fty.utils.Out.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.fty.utils.Out.User prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code rtcm.User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.fty.utils.Out.User, Builder> implements
        // @@protoc_insertion_point(builder_implements:rtcm.User)
        com.fty.utils.Out.UserOrBuilder {
      // Construct using com.fty.utils.Out.User.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>.rtcm.Card card = 1;</code>
       */
      @java.lang.Override
      public boolean hasCard() {
        return instance.hasCard();
      }
      /**
       * <code>.rtcm.Card card = 1;</code>
       */
      @java.lang.Override
      public com.fty.utils.Out.Card getCard() {
        return instance.getCard();
      }
      /**
       * <code>.rtcm.Card card = 1;</code>
       */
      public Builder setCard(com.fty.utils.Out.Card value) {
        copyOnWrite();
        instance.setCard(value);
        return this;
        }
      /**
       * <code>.rtcm.Card card = 1;</code>
       */
      public Builder setCard(
          com.fty.utils.Out.Card.Builder builderForValue) {
        copyOnWrite();
        instance.setCard(builderForValue);
        return this;
      }
      /**
       * <code>.rtcm.Card card = 1;</code>
       */
      public Builder mergeCard(com.fty.utils.Out.Card value) {
        copyOnWrite();
        instance.mergeCard(value);
        return this;
      }
      /**
       * <code>.rtcm.Card card = 1;</code>
       */
      public Builder clearCard() {  copyOnWrite();
        instance.clearCard();
        return this;
      }

      /**
       * <code>string name = 2;</code>
       */
      @java.lang.Override
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>string name = 2;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>string name = 2;</code>
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <code>int32 age = 3;</code>
       */
      @java.lang.Override
      public int getAge() {
        return instance.getAge();
      }
      /**
       * <code>int32 age = 3;</code>
       */
      public Builder setAge(int value) {
        copyOnWrite();
        instance.setAge(value);
        return this;
      }
      /**
       * <code>int32 age = 3;</code>
       */
      public Builder clearAge() {
        copyOnWrite();
        instance.clearAge();
        return this;
      }

      /**
       * <code>bool hasCar = 4;</code>
       */
      @java.lang.Override
      public boolean getHasCar() {
        return instance.getHasCar();
      }
      /**
       * <code>bool hasCar = 4;</code>
       */
      public Builder setHasCar(boolean value) {
        copyOnWrite();
        instance.setHasCar(value);
        return this;
      }
      /**
       * <code>bool hasCar = 4;</code>
       */
      public Builder clearHasCar() {
        copyOnWrite();
        instance.clearHasCar();
        return this;
      }

      /**
       * <code>repeated int32 likeNums = 11;</code>
       */
      @java.lang.Override
      public java.util.List<java.lang.Integer>
          getLikeNumsList() {
        return java.util.Collections.unmodifiableList(
            instance.getLikeNumsList());
      }
      /**
       * <code>repeated int32 likeNums = 11;</code>
       */
      @java.lang.Override
      public int getLikeNumsCount() {
        return instance.getLikeNumsCount();
      }
      /**
       * <code>repeated int32 likeNums = 11;</code>
       */
      @java.lang.Override
      public int getLikeNums(int index) {
        return instance.getLikeNums(index);
      }
      /**
       * <code>repeated int32 likeNums = 11;</code>
       */
      public Builder setLikeNums(
          int index, int value) {
        copyOnWrite();
        instance.setLikeNums(index, value);
        return this;
      }
      /**
       * <code>repeated int32 likeNums = 11;</code>
       */
      public Builder addLikeNums(int value) {
        copyOnWrite();
        instance.addLikeNums(value);
        return this;
      }
      /**
       * <code>repeated int32 likeNums = 11;</code>
       */
      public Builder addAllLikeNums(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        copyOnWrite();
        instance.addAllLikeNums(values);
        return this;
      }
      /**
       * <code>repeated int32 likeNums = 11;</code>
       */
      public Builder clearLikeNums() {
        copyOnWrite();
        instance.clearLikeNums();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:rtcm.User)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.fty.utils.Out.User();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          likeNums_.makeImmutable();
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.fty.utils.Out.User other = (com.fty.utils.Out.User) arg1;
          card_ = visitor.visitMessage(card_, other.card_);
          name_ = visitor.visitString(!name_.isEmpty(), name_,
              !other.name_.isEmpty(), other.name_);
          age_ = visitor.visitInt(age_ != 0, age_,
              other.age_ != 0, other.age_);
          hasCar_ = visitor.visitBoolean(hasCar_ != false, hasCar_,
              other.hasCar_ != false, other.hasCar_);
          likeNums_= visitor.visitIntList(likeNums_, other.likeNums_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  com.fty.utils.Out.Card.Builder subBuilder = null;
                  if (card_ != null) {
                    subBuilder = card_.toBuilder();
                  }
                  card_ = input.readMessage(com.fty.utils.Out.Card.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(card_);
                    card_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 18: {
                  java.lang.String s = input.readStringRequireUtf8();

                  name_ = s;
                  break;
                }
                case 24: {

                  age_ = input.readInt32();
                  break;
                }
                case 32: {

                  hasCar_ = input.readBool();
                  break;
                }
                case 88: {
                  if (!likeNums_.isModifiable()) {
                    likeNums_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(likeNums_);
                  }
                  likeNums_.addInt(input.readInt32());
                  break;
                }
                case 90: {
                  int length = input.readRawVarint32();
                  int limit = input.pushLimit(length);
                  if (!likeNums_.isModifiable() && input.getBytesUntilLimit() > 0) {
                    likeNums_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(likeNums_);
                  }
                  while (input.getBytesUntilLimit() > 0) {
                    likeNums_.addInt(input.readInt32());
                  }
                  input.popLimit(limit);
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.fty.utils.Out.User> parser = PARSER;
          if (parser == null) {
            synchronized (com.fty.utils.Out.User.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:rtcm.User)
    private static final com.fty.utils.Out.User DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new User();
    }

    public static com.fty.utils.Out.User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<User> PARSER;

    public static com.google.protobuf.Parser<User> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface CardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:rtcm.Card)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>double cash = 2;</code>
     */
    double getCash();

    /**
     * <code>string sign = 3;</code>
     */
    java.lang.String getSign();
    /**
     * <code>string sign = 3;</code>
     */
    com.google.protobuf.ByteString
        getSignBytes();

    /**
     * <code>float foo = 4;</code>
     */
    float getFoo();
  }
  /**
   * Protobuf type {@code rtcm.Card}
   */
  public  static final class Card extends
      com.google.protobuf.GeneratedMessageLite<
          Card, Card.Builder> implements
      // @@protoc_insertion_point(message_implements:rtcm.Card)
      CardOrBuilder {
    private Card() {
      sign_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    private void setId(int value) {
      
      id_ = value;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    private void clearId() {
      
      id_ = 0;
    }

    public static final int CASH_FIELD_NUMBER = 2;
    private double cash_;
    /**
     * <code>double cash = 2;</code>
     */
    @java.lang.Override
    public double getCash() {
      return cash_;
    }
    /**
     * <code>double cash = 2;</code>
     */
    private void setCash(double value) {
      
      cash_ = value;
    }
    /**
     * <code>double cash = 2;</code>
     */
    private void clearCash() {
      
      cash_ = 0D;
    }

    public static final int SIGN_FIELD_NUMBER = 3;
    private java.lang.String sign_;
    /**
     * <code>string sign = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getSign() {
      return sign_;
    }
    /**
     * <code>string sign = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSignBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(sign_);
    }
    /**
     * <code>string sign = 3;</code>
     */
    private void setSign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sign_ = value;
    }
    /**
     * <code>string sign = 3;</code>
     */
    private void clearSign() {
      
      sign_ = getDefaultInstance().getSign();
    }
    /**
     * <code>string sign = 3;</code>
     */
    private void setSignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sign_ = value.toStringUtf8();
    }

    public static final int FOO_FIELD_NUMBER = 4;
    private float foo_;
    /**
     * <code>float foo = 4;</code>
     */
    @java.lang.Override
    public float getFoo() {
      return foo_;
    }
    /**
     * <code>float foo = 4;</code>
     */
    private void setFoo(float value) {
      
      foo_ = value;
    }
    /**
     * <code>float foo = 4;</code>
     */
    private void clearFoo() {
      
      foo_ = 0F;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (cash_ != 0D) {
        output.writeDouble(2, cash_);
      }
      if (!sign_.isEmpty()) {
        output.writeString(3, getSign());
      }
      if (foo_ != 0F) {
        output.writeFloat(4, foo_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (cash_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, cash_);
      }
      if (!sign_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getSign());
      }
      if (foo_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, foo_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.fty.utils.Out.Card parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.fty.utils.Out.Card parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.fty.utils.Out.Card parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.fty.utils.Out.Card parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.fty.utils.Out.Card parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.fty.utils.Out.Card parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.fty.utils.Out.Card parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.fty.utils.Out.Card parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.fty.utils.Out.Card parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.fty.utils.Out.Card parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.fty.utils.Out.Card parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.fty.utils.Out.Card parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.fty.utils.Out.Card prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code rtcm.Card}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.fty.utils.Out.Card, Builder> implements
        // @@protoc_insertion_point(builder_implements:rtcm.Card)
        com.fty.utils.Out.CardOrBuilder {
      // Construct using com.fty.utils.Out.Card.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>int32 id = 1;</code>
       */
      @java.lang.Override
      public int getId() {
        return instance.getId();
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>double cash = 2;</code>
       */
      @java.lang.Override
      public double getCash() {
        return instance.getCash();
      }
      /**
       * <code>double cash = 2;</code>
       */
      public Builder setCash(double value) {
        copyOnWrite();
        instance.setCash(value);
        return this;
      }
      /**
       * <code>double cash = 2;</code>
       */
      public Builder clearCash() {
        copyOnWrite();
        instance.clearCash();
        return this;
      }

      /**
       * <code>string sign = 3;</code>
       */
      @java.lang.Override
      public java.lang.String getSign() {
        return instance.getSign();
      }
      /**
       * <code>string sign = 3;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getSignBytes() {
        return instance.getSignBytes();
      }
      /**
       * <code>string sign = 3;</code>
       */
      public Builder setSign(
          java.lang.String value) {
        copyOnWrite();
        instance.setSign(value);
        return this;
      }
      /**
       * <code>string sign = 3;</code>
       */
      public Builder clearSign() {
        copyOnWrite();
        instance.clearSign();
        return this;
      }
      /**
       * <code>string sign = 3;</code>
       */
      public Builder setSignBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSignBytes(value);
        return this;
      }

      /**
       * <code>float foo = 4;</code>
       */
      @java.lang.Override
      public float getFoo() {
        return instance.getFoo();
      }
      /**
       * <code>float foo = 4;</code>
       */
      public Builder setFoo(float value) {
        copyOnWrite();
        instance.setFoo(value);
        return this;
      }
      /**
       * <code>float foo = 4;</code>
       */
      public Builder clearFoo() {
        copyOnWrite();
        instance.clearFoo();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:rtcm.Card)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.fty.utils.Out.Card();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.fty.utils.Out.Card other = (com.fty.utils.Out.Card) arg1;
          id_ = visitor.visitInt(id_ != 0, id_,
              other.id_ != 0, other.id_);
          cash_ = visitor.visitDouble(cash_ != 0D, cash_,
              other.cash_ != 0D, other.cash_);
          sign_ = visitor.visitString(!sign_.isEmpty(), sign_,
              !other.sign_.isEmpty(), other.sign_);
          foo_ = visitor.visitFloat(foo_ != 0F, foo_,
              other.foo_ != 0F, other.foo_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 8: {

                  id_ = input.readInt32();
                  break;
                }
                case 17: {

                  cash_ = input.readDouble();
                  break;
                }
                case 26: {
                  java.lang.String s = input.readStringRequireUtf8();

                  sign_ = s;
                  break;
                }
                case 37: {

                  foo_ = input.readFloat();
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.fty.utils.Out.Card> parser = PARSER;
          if (parser == null) {
            synchronized (com.fty.utils.Out.Card.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:rtcm.Card)
    private static final com.fty.utils.Out.Card DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new Card();
    }

    public static com.fty.utils.Out.Card getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Card> PARSER;

    public static com.google.protobuf.Parser<Card> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}