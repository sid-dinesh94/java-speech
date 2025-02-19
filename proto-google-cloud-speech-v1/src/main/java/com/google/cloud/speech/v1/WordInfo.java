/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

/**
 *
 *
 * <pre>
 * Word-specific information for recognized words.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.WordInfo}
 */
public final class WordInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.WordInfo)
    WordInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WordInfo.newBuilder() to construct.
  private WordInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WordInfo() {
    word_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private WordInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (startTime_ != null) {
                subBuilder = startTime_.toBuilder();
              }
              startTime_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startTime_);
                startTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (endTime_ != null) {
                subBuilder = endTime_.toBuilder();
              }
              endTime_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endTime_);
                endTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              word_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_WordInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.WordInfo.class,
            com.google.cloud.speech.v1.WordInfo.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration startTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  public com.google.protobuf.Duration getStartTime() {
    return startTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  public com.google.protobuf.DurationOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration endTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  public com.google.protobuf.Duration getEndTime() {
    return endTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getEndTimeOrBuilder() {
    return getEndTime();
  }

  public static final int WORD_FIELD_NUMBER = 3;
  private volatile java.lang.Object word_;
  /**
   *
   *
   * <pre>
   * Output only. The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   */
  public java.lang.String getWord() {
    java.lang.Object ref = word_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      word_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   */
  public com.google.protobuf.ByteString getWordBytes() {
    java.lang.Object ref = word_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      word_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (startTime_ != null) {
      output.writeMessage(1, getStartTime());
    }
    if (endTime_ != null) {
      output.writeMessage(2, getEndTime());
    }
    if (!getWordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, word_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStartTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEndTime());
    }
    if (!getWordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, word_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1.WordInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.WordInfo other = (com.google.cloud.speech.v1.WordInfo) obj;

    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime().equals(other.getEndTime())) return false;
    }
    if (!getWord().equals(other.getWord())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    hash = (37 * hash) + WORD_FIELD_NUMBER;
    hash = (53 * hash) + getWord().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.WordInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.WordInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.WordInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.speech.v1.WordInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Word-specific information for recognized words.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.WordInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.WordInfo)
      com.google.cloud.speech.v1.WordInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_WordInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.WordInfo.class,
              com.google.cloud.speech.v1.WordInfo.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.WordInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      if (endTimeBuilder_ == null) {
        endTime_ = null;
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }
      word_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_WordInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.WordInfo getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.WordInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.WordInfo build() {
      com.google.cloud.speech.v1.WordInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.WordInfo buildPartial() {
      com.google.cloud.speech.v1.WordInfo result = new com.google.cloud.speech.v1.WordInfo(this);
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      if (endTimeBuilder_ == null) {
        result.endTime_ = endTime_;
      } else {
        result.endTime_ = endTimeBuilder_.build();
      }
      result.word_ = word_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v1.WordInfo) {
        return mergeFrom((com.google.cloud.speech.v1.WordInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.WordInfo other) {
      if (other == com.google.cloud.speech.v1.WordInfo.getDefaultInstance()) return this;
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
      }
      if (!other.getWord().isEmpty()) {
        word_ = other.word_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.speech.v1.WordInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1.WordInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public com.google.protobuf.Duration getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Duration value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Duration.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Duration value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
              com.google.protobuf.Duration.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getStartTimeBuilder() {

      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the start of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration start_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Duration endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        endTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public boolean hasEndTime() {
      return endTimeBuilder_ != null || endTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public com.google.protobuf.Duration getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Duration value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
        onChanged();
      } else {
        endTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Duration.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
        onChanged();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Duration value) {
      if (endTimeBuilder_ == null) {
        if (endTime_ != null) {
          endTime_ =
              com.google.protobuf.Duration.newBuilder(endTime_).mergeFrom(value).buildPartial();
        } else {
          endTime_ = value;
        }
        onChanged();
      } else {
        endTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public Builder clearEndTime() {
      if (endTimeBuilder_ == null) {
        endTime_ = null;
        onChanged();
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getEndTimeBuilder() {

      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : endTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time offset relative to the beginning of the audio,
     * and corresponding to the end of the spoken word.
     * This field is only set if `enable_word_time_offsets=true` and only
     * in the top hypothesis.
     * This is an experimental feature and the accuracy of the time offset can
     * vary.
     * </pre>
     *
     * <code>.google.protobuf.Duration end_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getEndTime(), getParentForChildren(), isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
    }

    private java.lang.Object word_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The word corresponding to this set of information.
     * </pre>
     *
     * <code>string word = 3;</code>
     */
    public java.lang.String getWord() {
      java.lang.Object ref = word_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        word_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The word corresponding to this set of information.
     * </pre>
     *
     * <code>string word = 3;</code>
     */
    public com.google.protobuf.ByteString getWordBytes() {
      java.lang.Object ref = word_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        word_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The word corresponding to this set of information.
     * </pre>
     *
     * <code>string word = 3;</code>
     */
    public Builder setWord(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      word_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The word corresponding to this set of information.
     * </pre>
     *
     * <code>string word = 3;</code>
     */
    public Builder clearWord() {

      word_ = getDefaultInstance().getWord();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The word corresponding to this set of information.
     * </pre>
     *
     * <code>string word = 3;</code>
     */
    public Builder setWordBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      word_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.WordInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.WordInfo)
  private static final com.google.cloud.speech.v1.WordInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.WordInfo();
  }

  public static com.google.cloud.speech.v1.WordInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WordInfo> PARSER =
      new com.google.protobuf.AbstractParser<WordInfo>() {
        @java.lang.Override
        public WordInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new WordInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<WordInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WordInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1.WordInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
