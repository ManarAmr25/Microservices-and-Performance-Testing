// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: top_rating.proto

package com.example.trendingservice.grpc;

import java.util.List;

/**
 * Protobuf type {@code rating.TopRatingReply}
 */
public final class TopRatingReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rating.TopRatingReply)
    TopRatingReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopRatingReply.newBuilder() to construct.
  private TopRatingReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopRatingReply() {
    ratings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopRatingReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.trendingservice.grpc.RatingProto.internal_static_rating_TopRatingReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.trendingservice.grpc.RatingProto.internal_static_rating_TopRatingReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.trendingservice.grpc.TopRatingReply.class, com.example.trendingservice.grpc.TopRatingReply.Builder.class);
  }

  public static final int RATINGS_FIELD_NUMBER = 1;
  private java.util.List<com.example.trendingservice.grpc.Rating> ratings_;
  /**
   * <code>repeated .rating.Rating ratings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.trendingservice.grpc.Rating> getRatingsList() {
    return ratings_;
  }
  /**
   * <code>repeated .rating.Rating ratings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.trendingservice.grpc.RatingOrBuilder>
      getRatingsOrBuilderList() {
    return ratings_;
  }
  /**
   * <code>repeated .rating.Rating ratings = 1;</code>
   */
  @java.lang.Override
  public int getRatingsCount() {
    return ratings_.size();
  }
  /**
   * <code>repeated .rating.Rating ratings = 1;</code>
   */
  @java.lang.Override
  public com.example.trendingservice.grpc.Rating getRatings(int index) {
    return ratings_.get(index);
  }
  /**
   * <code>repeated .rating.Rating ratings = 1;</code>
   */
  @java.lang.Override
  public com.example.trendingservice.grpc.RatingOrBuilder getRatingsOrBuilder(
      int index) {
    return ratings_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < ratings_.size(); i++) {
      output.writeMessage(1, ratings_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ratings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ratings_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.trendingservice.grpc.TopRatingReply)) {
      return super.equals(obj);
    }
    com.example.trendingservice.grpc.TopRatingReply other = (com.example.trendingservice.grpc.TopRatingReply) obj;

    if (!getRatingsList()
        .equals(other.getRatingsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRatingsCount() > 0) {
      hash = (37 * hash) + RATINGS_FIELD_NUMBER;
      hash = (53 * hash) + getRatingsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.trendingservice.grpc.TopRatingReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.trendingservice.grpc.TopRatingReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rating.TopRatingReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rating.TopRatingReply)
      com.example.trendingservice.grpc.TopRatingReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.trendingservice.grpc.RatingProto.internal_static_rating_TopRatingReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.trendingservice.grpc.RatingProto.internal_static_rating_TopRatingReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.trendingservice.grpc.TopRatingReply.class, com.example.trendingservice.grpc.TopRatingReply.Builder.class);
    }

    // Construct using com.example.ratingsservice.grpc.TopRatingReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ratingsBuilder_ == null) {
        ratings_ = java.util.Collections.emptyList();
      } else {
        ratings_ = null;
        ratingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.trendingservice.grpc.RatingProto.internal_static_rating_TopRatingReply_descriptor;
    }

    @java.lang.Override
    public com.example.trendingservice.grpc.TopRatingReply getDefaultInstanceForType() {
      return com.example.trendingservice.grpc.TopRatingReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.trendingservice.grpc.TopRatingReply build() {
      com.example.trendingservice.grpc.TopRatingReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.trendingservice.grpc.TopRatingReply buildPartial() {
      com.example.trendingservice.grpc.TopRatingReply result = new com.example.trendingservice.grpc.TopRatingReply(this);
      int from_bitField0_ = bitField0_;
      if (ratingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ratings_ = java.util.Collections.unmodifiableList(ratings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ratings_ = ratings_;
      } else {
        result.ratings_ = ratingsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.trendingservice.grpc.TopRatingReply) {
        return mergeFrom((com.example.trendingservice.grpc.TopRatingReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.trendingservice.grpc.TopRatingReply other) {
      if (other == com.example.trendingservice.grpc.TopRatingReply.getDefaultInstance()) return this;
      if (ratingsBuilder_ == null) {
        if (!other.ratings_.isEmpty()) {
          if (ratings_.isEmpty()) {
            ratings_ = other.ratings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRatingsIsMutable();
            ratings_.addAll(other.ratings_);
          }
          onChanged();
        }
      } else {
        if (!other.ratings_.isEmpty()) {
          if (ratingsBuilder_.isEmpty()) {
            ratingsBuilder_.dispose();
            ratingsBuilder_ = null;
            ratings_ = other.ratings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ratingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRatingsFieldBuilder() : null;
          } else {
            ratingsBuilder_.addAllMessages(other.ratings_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
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
              com.example.trendingservice.grpc.Rating m =
                  input.readMessage(
                      com.example.trendingservice.grpc.Rating.parser(),
                      extensionRegistry);
              if (ratingsBuilder_ == null) {
                ensureRatingsIsMutable();
                ratings_.add(m);
              } else {
                ratingsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.trendingservice.grpc.Rating> ratings_ =
      java.util.Collections.emptyList();
    private void ensureRatingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ratings_ = new java.util.ArrayList<com.example.trendingservice.grpc.Rating>(ratings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.trendingservice.grpc.Rating, com.example.trendingservice.grpc.Rating.Builder, com.example.trendingservice.grpc.RatingOrBuilder> ratingsBuilder_;

    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public java.util.List<com.example.trendingservice.grpc.Rating> getRatingsList() {
      if (ratingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ratings_);
      } else {
        return ratingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public int getRatingsCount() {
      if (ratingsBuilder_ == null) {
        return ratings_.size();
      } else {
        return ratingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public com.example.trendingservice.grpc.Rating getRatings(int index) {
      if (ratingsBuilder_ == null) {
        return ratings_.get(index);
      } else {
        return ratingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder setRatings(
            List<com.example.trendingservice.models.Rating> fetchedRatings ){

      if (ratingsBuilder_ == null) {
        if (fetchedRatings == null) {
          throw new NullPointerException();
        }
        ensureRatingsIsMutable();

        for (com.example.trendingservice.models.Rating rating : fetchedRatings) {
          Rating.Builder tmp = Rating.newBuilder().setMoveId(rating.getMovieId());
          tmp.setRate(rating.getRating());
          ratings_.add(tmp.build());

        }
        onChanged();
      } else {
        for (com.example.trendingservice.models.Rating rating : fetchedRatings) {
          Rating.Builder tmp = Rating.newBuilder().setMoveId(rating.getMovieId());
          tmp.setRate(rating.getRating());
          ratingsBuilder_.addMessage(tmp.build());
        }
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder setRatings(
        int index, com.example.trendingservice.grpc.Rating.Builder builderForValue) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.set(index, builderForValue.build());
        onChanged();
      } else {
        ratingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder addRatings(com.example.trendingservice.grpc.Rating value) {
      if (ratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatingsIsMutable();
        ratings_.add(value);
        onChanged();
      } else {
        ratingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder addRatings(
        int index, com.example.trendingservice.grpc.Rating value) {
      if (ratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatingsIsMutable();
        ratings_.add(index, value);
        onChanged();
      } else {
        ratingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder addRatings(
        com.example.trendingservice.grpc.Rating.Builder builderForValue) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.add(builderForValue.build());
        onChanged();
      } else {
        ratingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder addRatings(
        int index, com.example.trendingservice.grpc.Rating.Builder builderForValue) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.add(index, builderForValue.build());
        onChanged();
      } else {
        ratingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder addAllRatings(
        java.lang.Iterable<? extends com.example.trendingservice.grpc.Rating> values) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ratings_);
        onChanged();
      } else {
        ratingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder clearRatings() {
      if (ratingsBuilder_ == null) {
        ratings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ratingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public Builder removeRatings(int index) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.remove(index);
        onChanged();
      } else {
        ratingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public com.example.trendingservice.grpc.Rating.Builder getRatingsBuilder(
        int index) {
      return getRatingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public com.example.trendingservice.grpc.RatingOrBuilder getRatingsOrBuilder(
        int index) {
      if (ratingsBuilder_ == null) {
        return ratings_.get(index);  } else {
        return ratingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public java.util.List<? extends com.example.trendingservice.grpc.RatingOrBuilder>
         getRatingsOrBuilderList() {
      if (ratingsBuilder_ != null) {
        return ratingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ratings_);
      }
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public com.example.trendingservice.grpc.Rating.Builder addRatingsBuilder() {
      return getRatingsFieldBuilder().addBuilder(
          com.example.trendingservice.grpc.Rating.getDefaultInstance());
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public com.example.trendingservice.grpc.Rating.Builder addRatingsBuilder(
        int index) {
      return getRatingsFieldBuilder().addBuilder(
          index, com.example.trendingservice.grpc.Rating.getDefaultInstance());
    }
    /**
     * <code>repeated .rating.Rating ratings = 1;</code>
     */
    public java.util.List<com.example.trendingservice.grpc.Rating.Builder>
         getRatingsBuilderList() {
      return getRatingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.trendingservice.grpc.Rating, com.example.trendingservice.grpc.Rating.Builder, com.example.trendingservice.grpc.RatingOrBuilder>
        getRatingsFieldBuilder() {
      if (ratingsBuilder_ == null) {
        ratingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.trendingservice.grpc.Rating, com.example.trendingservice.grpc.Rating.Builder, com.example.trendingservice.grpc.RatingOrBuilder>(
                ratings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ratings_ = null;
      }
      return ratingsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rating.TopRatingReply)
  }

  // @@protoc_insertion_point(class_scope:rating.TopRatingReply)
  private static final com.example.trendingservice.grpc.TopRatingReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.trendingservice.grpc.TopRatingReply();
  }

  public static com.example.trendingservice.grpc.TopRatingReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopRatingReply>
      PARSER = new com.google.protobuf.AbstractParser<TopRatingReply>() {
    @java.lang.Override
    public TopRatingReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TopRatingReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopRatingReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.trendingservice.grpc.TopRatingReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

