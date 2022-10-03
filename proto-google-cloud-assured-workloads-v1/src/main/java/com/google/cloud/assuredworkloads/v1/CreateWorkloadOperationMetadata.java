/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1;

/**
 *
 *
 * <pre>
 * Operation metadata to give request details of CreateWorkload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata}
 */
public final class CreateWorkloadOperationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata)
    CreateWorkloadOperationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWorkloadOperationMetadata.newBuilder() to construct.
  private CreateWorkloadOperationMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWorkloadOperationMetadata() {
    displayName_ = "";
    parent_ = "";
    complianceRegime_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWorkloadOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
        .internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
        .internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata.class,
            com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata.Builder.class);
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp createTime_;
  /**
   *
   *
   * <pre>
   * Optional. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Optional. The display name of the workload.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The display name of the workload.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Optional. The parent of the workload.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The parent of the workload.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPLIANCE_REGIME_FIELD_NUMBER = 4;
  private int complianceRegime_;
  /**
   *
   *
   * <pre>
   * Optional. Compliance controls that should be applied to the resources managed by
   * the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for complianceRegime.
   */
  @java.lang.Override
  public int getComplianceRegimeValue() {
    return complianceRegime_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Compliance controls that should be applied to the resources managed by
   * the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The complianceRegime.
   */
  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime getComplianceRegime() {
    @SuppressWarnings("deprecation")
    com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime result =
        com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime.valueOf(complianceRegime_);
    return result == null
        ? com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime.UNRECOGNIZED
        : result;
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
    if (createTime_ != null) {
      output.writeMessage(1, getCreateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parent_);
    }
    if (complianceRegime_
        != com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime
            .COMPLIANCE_REGIME_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, complianceRegime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCreateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parent_);
    }
    if (complianceRegime_
        != com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime
            .COMPLIANCE_REGIME_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, complianceRegime_);
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
    if (!(obj instanceof com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata other =
        (com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata) obj;

    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime().equals(other.getCreateTime())) return false;
    }
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (!getParent().equals(other.getParent())) return false;
    if (complianceRegime_ != other.complianceRegime_) return false;
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
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + COMPLIANCE_REGIME_FIELD_NUMBER;
    hash = (53 * hash) + complianceRegime_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata prototype) {
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
   * Operation metadata to give request details of CreateWorkload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata)
      com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata.class,
              com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata.Builder.class);
    }

    // Construct using
    // com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      displayName_ = "";

      parent_ = "";

      complianceRegime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata build() {
      com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata buildPartial() {
      com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata result =
          new com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata(this);
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      result.displayName_ = displayName_;
      result.parent_ = parent_;
      result.complianceRegime_ = complianceRegime_;
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
      if (other instanceof com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata) {
        return mergeFrom(
            (com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata other) {
      if (other
          == com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
              .getDefaultInstance()) return this;
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.complianceRegime_ != 0) {
        setComplianceRegimeValue(other.getComplianceRegimeValue());
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
            case 10:
              {
                input.readMessage(getCreateTimeFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                displayName_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 32:
              {
                complianceRegime_ = input.readEnum();

                break;
              } // case 32
            default:
              {
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

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        createTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
              com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {

      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Time when the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(), getParentForChildren(), isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The display name of the workload.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The display name of the workload.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The display name of the workload.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The display name of the workload.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The display name of the workload.
     * </pre>
     *
     * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The parent of the workload.
     * </pre>
     *
     * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The parent of the workload.
     * </pre>
     *
     * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The parent of the workload.
     * </pre>
     *
     * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The parent of the workload.
     * </pre>
     *
     * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The parent of the workload.
     * </pre>
     *
     * <code>string parent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private int complianceRegime_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Compliance controls that should be applied to the resources managed by
     * the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for complianceRegime.
     */
    @java.lang.Override
    public int getComplianceRegimeValue() {
      return complianceRegime_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Compliance controls that should be applied to the resources managed by
     * the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for complianceRegime to set.
     * @return This builder for chaining.
     */
    public Builder setComplianceRegimeValue(int value) {

      complianceRegime_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Compliance controls that should be applied to the resources managed by
     * the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The complianceRegime.
     */
    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime getComplianceRegime() {
      @SuppressWarnings("deprecation")
      com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime result =
          com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime.valueOf(complianceRegime_);
      return result == null
          ? com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Compliance controls that should be applied to the resources managed by
     * the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The complianceRegime to set.
     * @return This builder for chaining.
     */
    public Builder setComplianceRegime(
        com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime value) {
      if (value == null) {
        throw new NullPointerException();
      }

      complianceRegime_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Compliance controls that should be applied to the resources managed by
     * the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearComplianceRegime() {

      complianceRegime_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata)
  private static final com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata();
  }

  public static com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkloadOperationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<CreateWorkloadOperationMetadata>() {
        @java.lang.Override
        public CreateWorkloadOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWorkloadOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkloadOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
