/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.proto;

public final class V1beta1Certificates {
  private V1beta1Certificates() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface CertificateSigningRequestOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.certificates.v1beta1.CertificateSigningRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * The certificate request itself and any additional information.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
     * </code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * The certificate request itself and any additional information.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec getSpec();
    /**
     *
     *
     * <pre>
     * The certificate request itself and any additional information.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpecOrBuilder
        getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Derived information about the request.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
     * </code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Derived information about the request.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus getStatus();
    /**
     *
     *
     * <pre>
     * Derived information about the request.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * Describes a certificate signing request
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequest}
   */
  public static final class CertificateSigningRequest extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequest)
      CertificateSigningRequestOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CertificateSigningRequest.newBuilder() to construct.
    private CertificateSigningRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CertificateSigningRequest() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CertificateSigningRequest(
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
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                        .Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Certificates
                            .CertificateSigningRequestStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.class,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
                  .class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec spec_;
    /**
     *
     *
     * <pre>
     * The certificate request itself and any additional information.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
     * </code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * The certificate request itself and any additional information.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
              .getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * The certificate request itself and any additional information.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
              .getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus status_;
    /**
     *
     *
     * <pre>
     * Derived information about the request.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
     * </code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Derived information about the request.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
              .getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Derived information about the request.
     * +optional
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
              .getDefaultInstance()
          : status_;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
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
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest other =
          (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        parseFrom(
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Describes a certificate signing request
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequest}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequest)
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.class,
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest build() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest result =
            new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec spec_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.Builder,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
          getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
                    .newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * The certificate request itself and any additional information.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec spec = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.Builder,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec,
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Certificates
                      .CertificateSigningRequestSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
          status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                  .Builder,
              io.kubernetes.client.proto.V1beta1Certificates
                  .CertificateSigningRequestStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
          getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                    .newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Derived information about the request.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                  .Builder,
              io.kubernetes.client.proto.V1beta1Certificates
                  .CertificateSigningRequestStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus,
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Certificates
                      .CertificateSigningRequestStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequest)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequest)
    private static final io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest();
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CertificateSigningRequest> PARSER =
        new com.google.protobuf.AbstractParser<CertificateSigningRequest>() {
          @java.lang.Override
          public CertificateSigningRequest parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CertificateSigningRequest(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CertificateSigningRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CertificateSigningRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CertificateSigningRequestConditionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * request approval state, currently Approved or Denied.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * request approval state, currently Approved or Denied.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * request approval state, currently Approved or Denied.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * brief reason for the request state
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    boolean hasReason();
    /**
     *
     *
     * <pre>
     * brief reason for the request state
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    java.lang.String getReason();
    /**
     *
     *
     * <pre>
     * brief reason for the request state
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    com.google.protobuf.ByteString getReasonBytes();

    /**
     *
     *
     * <pre>
     * human readable message with details about the request state
     * +optional
     * </pre>
     *
     * <code>optional string message = 3;</code>
     */
    boolean hasMessage();
    /**
     *
     *
     * <pre>
     * human readable message with details about the request state
     * +optional
     * </pre>
     *
     * <code>optional string message = 3;</code>
     */
    java.lang.String getMessage();
    /**
     *
     *
     * <pre>
     * human readable message with details about the request state
     * +optional
     * </pre>
     *
     * <code>optional string message = 3;</code>
     */
    com.google.protobuf.ByteString getMessageBytes();

    /**
     *
     *
     * <pre>
     * timestamp for the last update to this condition
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
     */
    boolean hasLastUpdateTime();
    /**
     *
     *
     * <pre>
     * timestamp for the last update to this condition
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastUpdateTime();
    /**
     *
     *
     * <pre>
     * timestamp for the last update to this condition
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastUpdateTimeOrBuilder();
  }
  /** Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition} */
  public static final class CertificateSigningRequestCondition
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition)
      CertificateSigningRequestConditionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CertificateSigningRequestCondition.newBuilder() to construct.
    private CertificateSigningRequestCondition(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CertificateSigningRequestCondition() {
      type_ = "";
      reason_ = "";
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CertificateSigningRequestCondition(
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
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                reason_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                message_ = bs;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = lastUpdateTime_.toBuilder();
                }
                lastUpdateTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastUpdateTime_);
                  lastUpdateTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
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
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                  .class,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                  .Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * request approval state, currently Approved or Denied.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * request approval state, currently Approved or Denied.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * request approval state, currently Approved or Denied.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private volatile java.lang.Object reason_;
    /**
     *
     *
     * <pre>
     * brief reason for the request state
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * brief reason for the request state
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reason_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * brief reason for the request state
     * +optional
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     */
    public com.google.protobuf.ByteString getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 3;
    private volatile java.lang.Object message_;
    /**
     *
     *
     * <pre>
     * human readable message with details about the request state
     * +optional
     * </pre>
     *
     * <code>optional string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * human readable message with details about the request state
     * +optional
     * </pre>
     *
     * <code>optional string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * human readable message with details about the request state
     * +optional
     * </pre>
     *
     * <code>optional string message = 3;</code>
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LASTUPDATETIME_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Meta.Time lastUpdateTime_;
    /**
     *
     *
     * <pre>
     * timestamp for the last update to this condition
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
     */
    public boolean hasLastUpdateTime() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * timestamp for the last update to this condition
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastUpdateTime() {
      return lastUpdateTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastUpdateTime_;
    }
    /**
     *
     *
     * <pre>
     * timestamp for the last update to this condition
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastUpdateTimeOrBuilder() {
      return lastUpdateTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastUpdateTime_;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getLastUpdateTime());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getLastUpdateTime());
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
      if (!(obj
          instanceof
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition other =
          (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasReason() == other.hasReason());
      if (hasReason()) {
        result = result && getReason().equals(other.getReason());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage().equals(other.getMessage());
      }
      result = result && (hasLastUpdateTime() == other.hasLastUpdateTime());
      if (hasLastUpdateTime()) {
        result = result && getLastUpdateTime().equals(other.getLastUpdateTime());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasReason()) {
        hash = (37 * hash) + REASON_FIELD_NUMBER;
        hash = (53 * hash) + getReason().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      if (hasLastUpdateTime()) {
        hash = (37 * hash) + LASTUPDATETIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastUpdateTime().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        parseFrom(
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
            prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /** Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition} */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition)
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestConditionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                    .class,
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getLastUpdateTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        reason_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        if (lastUpdateTimeBuilder_ == null) {
          lastUpdateTime_ = null;
        } else {
          lastUpdateTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
          build() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition result =
            new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.reason_ = reason_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (lastUpdateTimeBuilder_ == null) {
          result.lastUpdateTime_ = lastUpdateTime_;
        } else {
          result.lastUpdateTime_ = lastUpdateTimeBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                .getDefaultInstance()) return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasReason()) {
          bitField0_ |= 0x00000002;
          reason_ = other.reason_;
          onChanged();
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasLastUpdateTime()) {
          mergeLastUpdateTime(other.getLastUpdateTime());
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * request approval state, currently Approved or Denied.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * request approval state, currently Approved or Denied.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * request approval state, currently Approved or Denied.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * request approval state, currently Approved or Denied.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * request approval state, currently Approved or Denied.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * request approval state, currently Approved or Denied.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object reason_ = "";
      /**
       *
       *
       * <pre>
       * brief reason for the request state
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * brief reason for the request state
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reason_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * brief reason for the request state
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public com.google.protobuf.ByteString getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * brief reason for the request state
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder setReason(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * brief reason for the request state
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000002);
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * brief reason for the request state
       * +optional
       * </pre>
       *
       * <code>optional string reason = 2;</code>
       */
      public Builder setReasonBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        reason_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       *
       *
       * <pre>
       * human readable message with details about the request state
       * +optional
       * </pre>
       *
       * <code>optional string message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * human readable message with details about the request state
       * +optional
       * </pre>
       *
       * <code>optional string message = 3;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * human readable message with details about the request state
       * +optional
       * </pre>
       *
       * <code>optional string message = 3;</code>
       */
      public com.google.protobuf.ByteString getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * human readable message with details about the request state
       * +optional
       * </pre>
       *
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * human readable message with details about the request state
       * +optional
       * </pre>
       *
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * human readable message with details about the request state
       * +optional
       * </pre>
       *
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Time lastUpdateTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastUpdateTimeBuilder_;
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public boolean hasLastUpdateTime() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastUpdateTime() {
        if (lastUpdateTimeBuilder_ == null) {
          return lastUpdateTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastUpdateTime_;
        } else {
          return lastUpdateTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public Builder setLastUpdateTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastUpdateTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastUpdateTime_ = value;
          onChanged();
        } else {
          lastUpdateTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public Builder setLastUpdateTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastUpdateTimeBuilder_ == null) {
          lastUpdateTime_ = builderForValue.build();
          onChanged();
        } else {
          lastUpdateTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public Builder mergeLastUpdateTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastUpdateTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && lastUpdateTime_ != null
              && lastUpdateTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastUpdateTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastUpdateTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastUpdateTime_ = value;
          }
          onChanged();
        } else {
          lastUpdateTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public Builder clearLastUpdateTime() {
        if (lastUpdateTimeBuilder_ == null) {
          lastUpdateTime_ = null;
          onChanged();
        } else {
          lastUpdateTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastUpdateTimeBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getLastUpdateTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastUpdateTimeOrBuilder() {
        if (lastUpdateTimeBuilder_ != null) {
          return lastUpdateTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastUpdateTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastUpdateTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * timestamp for the last update to this condition
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastUpdateTime = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastUpdateTimeFieldBuilder() {
        if (lastUpdateTimeBuilder_ == null) {
          lastUpdateTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastUpdateTime(), getParentForChildren(), isClean());
          lastUpdateTime_ = null;
        }
        return lastUpdateTimeBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition)
    private static final io.kubernetes.client.proto.V1beta1Certificates
            .CertificateSigningRequestCondition
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition();
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CertificateSigningRequestCondition> PARSER =
        new com.google.protobuf.AbstractParser<CertificateSigningRequestCondition>() {
          @java.lang.Override
          public CertificateSigningRequestCondition parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CertificateSigningRequestCondition(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CertificateSigningRequestCondition> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CertificateSigningRequestCondition> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CertificateSigningRequestListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.certificates.v1beta1.CertificateSigningRequestList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest>
        getItemsList();
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest getItems(int index);
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    int getItemsCount();
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder>
        getItemsOrBuilderList();
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder
        getItemsOrBuilder(int index);
  }
  /** Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestList} */
  public static final class CertificateSigningRequestList
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestList)
      CertificateSigningRequestListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CertificateSigningRequestList.newBuilder() to construct.
    private CertificateSigningRequestList(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CertificateSigningRequestList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CertificateSigningRequestList(
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
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Certificates
                              .CertificateSigningRequest>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
                            .PARSER,
                        extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList.class,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList.Builder
                  .class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest>
        items_;
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest>
        getItemsList() {
      return items_;
    }
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest getItems(
        int index) {
      return items_.get(index);
    }
    /**
     * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder
        getItemsOrBuilder(int index) {
      return items_.get(index);
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
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
      if (!(obj
          instanceof
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList other =
          (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        parseFrom(
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /** Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestList} */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestList)
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList.class,
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList build() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList result =
            new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest>
          items_ = java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder>
          itemsBuilder_;

      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest>
          getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest getItems(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder addAllItems(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
          getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder
          getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
                    .getDefaultInstance());
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder
          addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest
                    .getDefaultInstance());
      }
      /**
       * <code>repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequest items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest,
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequest.Builder,
                  io.kubernetes.client.proto.V1beta1Certificates
                      .CertificateSigningRequestOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestList)
    private static final io.kubernetes.client.proto.V1beta1Certificates
            .CertificateSigningRequestList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList();
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CertificateSigningRequestList> PARSER =
        new com.google.protobuf.AbstractParser<CertificateSigningRequestList>() {
          @java.lang.Override
          public CertificateSigningRequestList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CertificateSigningRequestList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CertificateSigningRequestList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CertificateSigningRequestList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CertificateSigningRequestSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Base64-encoded PKCS#10 CSR data
     * </pre>
     *
     * <code>optional bytes request = 1;</code>
     */
    boolean hasRequest();
    /**
     *
     *
     * <pre>
     * Base64-encoded PKCS#10 CSR data
     * </pre>
     *
     * <code>optional bytes request = 1;</code>
     */
    com.google.protobuf.ByteString getRequest();

    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    java.util.List<java.lang.String> getUsagesList();
    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    int getUsagesCount();
    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    java.lang.String getUsages(int index);
    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    com.google.protobuf.ByteString getUsagesBytes(int index);

    /**
     *
     *
     * <pre>
     * Information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string username = 2;</code>
     */
    boolean hasUsername();
    /**
     *
     *
     * <pre>
     * Information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string username = 2;</code>
     */
    java.lang.String getUsername();
    /**
     *
     *
     * <pre>
     * Information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string username = 2;</code>
     */
    com.google.protobuf.ByteString getUsernameBytes();

    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 3;</code>
     */
    boolean hasUid();
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 3;</code>
     */
    java.lang.String getUid();
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 3;</code>
     */
    com.google.protobuf.ByteString getUidBytes();

    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    java.util.List<java.lang.String> getGroupsList();
    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    int getGroupsCount();
    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    java.lang.String getGroups(int index);
    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    com.google.protobuf.ByteString getGroupsBytes(int index);

    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    int getExtraCount();
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    boolean containsExtra(java.lang.String key);
    /** Use {@link #getExtraMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
        getExtra();
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
        getExtraMap();
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getExtraOrDefault(
        java.lang.String key,
        io.kubernetes.client.proto.V1beta1Certificates.ExtraValue defaultValue);
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getExtraOrThrow(java.lang.String key);
  }
  /**
   *
   *
   * <pre>
   * This information is immutable after the request is created. Only the Request
   * and Usages fields can be set on creation, other fields are derived by
   * Kubernetes and cannot be modified by users.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec}
   */
  public static final class CertificateSigningRequestSpec
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec)
      CertificateSigningRequestSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CertificateSigningRequestSpec.newBuilder() to construct.
    private CertificateSigningRequestSpec(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CertificateSigningRequestSpec() {
      request_ = com.google.protobuf.ByteString.EMPTY;
      usages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      username_ = "";
      uid_ = "";
      groups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CertificateSigningRequestSpec(
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
                bitField0_ |= 0x00000001;
                request_ = input.readBytes();
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                username_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                uid_ = bs;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  groups_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000010;
                }
                groups_.add(bs);
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  usages_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                usages_.add(bs);
                break;
              }
            case 50:
              {
                if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                  extra_ =
                      com.google.protobuf.MapField.newMapField(
                          ExtraDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000020;
                }
                com.google.protobuf.MapEntry<
                        java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
                    extra__ =
                        input.readMessage(
                            ExtraDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                extra_.getMutableMap().put(extra__.getKey(), extra__.getValue());
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
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          groups_ = groups_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          usages_ = usages_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 6:
          return internalGetExtra();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.class,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.Builder
                  .class);
    }

    private int bitField0_;
    public static final int REQUEST_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString request_;
    /**
     *
     *
     * <pre>
     * Base64-encoded PKCS#10 CSR data
     * </pre>
     *
     * <code>optional bytes request = 1;</code>
     */
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Base64-encoded PKCS#10 CSR data
     * </pre>
     *
     * <code>optional bytes request = 1;</code>
     */
    public com.google.protobuf.ByteString getRequest() {
      return request_;
    }

    public static final int USAGES_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList usages_;
    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList getUsagesList() {
      return usages_;
    }
    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    public int getUsagesCount() {
      return usages_.size();
    }
    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    public java.lang.String getUsages(int index) {
      return usages_.get(index);
    }
    /**
     *
     *
     * <pre>
     * allowedUsages specifies a set of usage contexts the key will be
     * valid for.
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     * </pre>
     *
     * <code>repeated string usages = 5;</code>
     */
    public com.google.protobuf.ByteString getUsagesBytes(int index) {
      return usages_.getByteString(index);
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object username_;
    /**
     *
     *
     * <pre>
     * Information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string username = 2;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string username = 2;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string username = 2;</code>
     */
    public com.google.protobuf.ByteString getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UID_FIELD_NUMBER = 3;
    private volatile java.lang.Object uid_;
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 3;</code>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 3;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uid_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * UID information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>optional string uid = 3;</code>
     */
    public com.google.protobuf.ByteString getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GROUPS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList groups_;
    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getGroupsList() {
      return groups_;
    }
    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    public int getGroupsCount() {
      return groups_.size();
    }
    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    public java.lang.String getGroups(int index) {
      return groups_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Group information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>repeated string groups = 4;</code>
     */
    public com.google.protobuf.ByteString getGroupsBytes(int index) {
      return groups_.getByteString(index);
    }

    public static final int EXTRA_FIELD_NUMBER = 6;

    private static final class ExtraDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          defaultEntry =
              com.google.protobuf.MapEntry
                  .<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
                      newDefaultInstance(
                          io.kubernetes.client.proto.V1beta1Certificates
                              .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_ExtraEntry_descriptor,
                          com.google.protobuf.WireFormat.FieldType.STRING,
                          "",
                          com.google.protobuf.WireFormat.FieldType.MESSAGE,
                          io.kubernetes.client.proto.V1beta1Certificates.ExtraValue
                              .getDefaultInstance());
    }

    private com.google.protobuf.MapField<
            java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
        extra_;

    private com.google.protobuf.MapField<
            java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
        internalGetExtra() {
      if (extra_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ExtraDefaultEntryHolder.defaultEntry);
      }
      return extra_;
    }

    public int getExtraCount() {
      return internalGetExtra().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    public boolean containsExtra(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetExtra().getMap().containsKey(key);
    }
    /** Use {@link #getExtraMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<
            java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
        getExtra() {
      return getExtraMap();
    }
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    public java.util.Map<
            java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
        getExtraMap() {
      return internalGetExtra().getMap();
    }
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getExtraOrDefault(
        java.lang.String key,
        io.kubernetes.client.proto.V1beta1Certificates.ExtraValue defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          map = internalGetExtra().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Extra information about the requesting user.
     * See user.Info interface for details.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;</code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getExtraOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          map = internalGetExtra().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, request_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uid_);
      }
      for (int i = 0; i < groups_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, groups_.getRaw(i));
      }
      for (int i = 0; i < usages_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, usages_.getRaw(i));
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetExtra(), ExtraDefaultEntryHolder.defaultEntry, 6);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, request_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < groups_.size(); i++) {
          dataSize += computeStringSizeNoTag(groups_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getGroupsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < usages_.size(); i++) {
          dataSize += computeStringSizeNoTag(usages_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getUsagesList().size();
      }
      for (java.util.Map.Entry<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          entry : internalGetExtra().getMap().entrySet()) {
        com.google.protobuf.MapEntry<
                java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
            extra__ =
                ExtraDefaultEntryHolder.defaultEntry
                    .newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, extra__);
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
      if (!(obj
          instanceof
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec other =
          (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec) obj;

      boolean result = true;
      result = result && (hasRequest() == other.hasRequest());
      if (hasRequest()) {
        result = result && getRequest().equals(other.getRequest());
      }
      result = result && getUsagesList().equals(other.getUsagesList());
      result = result && (hasUsername() == other.hasUsername());
      if (hasUsername()) {
        result = result && getUsername().equals(other.getUsername());
      }
      result = result && (hasUid() == other.hasUid());
      if (hasUid()) {
        result = result && getUid().equals(other.getUid());
      }
      result = result && getGroupsList().equals(other.getGroupsList());
      result = result && internalGetExtra().equals(other.internalGetExtra());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRequest()) {
        hash = (37 * hash) + REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getRequest().hashCode();
      }
      if (getUsagesCount() > 0) {
        hash = (37 * hash) + USAGES_FIELD_NUMBER;
        hash = (53 * hash) + getUsagesList().hashCode();
      }
      if (hasUsername()) {
        hash = (37 * hash) + USERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getUsername().hashCode();
      }
      if (hasUid()) {
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
      }
      if (getGroupsCount() > 0) {
        hash = (37 * hash) + GROUPS_FIELD_NUMBER;
        hash = (53 * hash) + getGroupsList().hashCode();
      }
      if (!internalGetExtra().getMap().isEmpty()) {
        hash = (37 * hash) + EXTRA_FIELD_NUMBER;
        hash = (53 * hash) + internalGetExtra().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        parseFrom(
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * This information is immutable after the request is created. Only the Request
     * and Usages fields can be set on creation, other fields are derived by
     * Kubernetes and cannot be modified by users.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec)
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 6:
            return internalGetExtra();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 6:
            return internalGetMutableExtra();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.class,
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec.newBuilder()
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
        request_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        usages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        groups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        internalGetMutableExtra().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec build() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec result =
            new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.request_ = request_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          usages_ = usages_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.usages_ = usages_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          groups_ = groups_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.groups_ = groups_;
        result.extra_ = internalGetExtra();
        result.extra_.makeImmutable();
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
                .getDefaultInstance()) return this;
        if (other.hasRequest()) {
          setRequest(other.getRequest());
        }
        if (!other.usages_.isEmpty()) {
          if (usages_.isEmpty()) {
            usages_ = other.usages_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUsagesIsMutable();
            usages_.addAll(other.usages_);
          }
          onChanged();
        }
        if (other.hasUsername()) {
          bitField0_ |= 0x00000004;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasUid()) {
          bitField0_ |= 0x00000008;
          uid_ = other.uid_;
          onChanged();
        }
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
        internalGetMutableExtra().mergeFrom(other.internalGetExtra());
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.ByteString request_ = com.google.protobuf.ByteString.EMPTY;
      /**
       *
       *
       * <pre>
       * Base64-encoded PKCS#10 CSR data
       * </pre>
       *
       * <code>optional bytes request = 1;</code>
       */
      public boolean hasRequest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Base64-encoded PKCS#10 CSR data
       * </pre>
       *
       * <code>optional bytes request = 1;</code>
       */
      public com.google.protobuf.ByteString getRequest() {
        return request_;
      }
      /**
       *
       *
       * <pre>
       * Base64-encoded PKCS#10 CSR data
       * </pre>
       *
       * <code>optional bytes request = 1;</code>
       */
      public Builder setRequest(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        request_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Base64-encoded PKCS#10 CSR data
       * </pre>
       *
       * <code>optional bytes request = 1;</code>
       */
      public Builder clearRequest() {
        bitField0_ = (bitField0_ & ~0x00000001);
        request_ = getDefaultInstance().getRequest();
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList usages_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureUsagesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          usages_ = new com.google.protobuf.LazyStringArrayList(usages_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public com.google.protobuf.ProtocolStringList getUsagesList() {
        return usages_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public int getUsagesCount() {
        return usages_.size();
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public java.lang.String getUsages(int index) {
        return usages_.get(index);
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public com.google.protobuf.ByteString getUsagesBytes(int index) {
        return usages_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public Builder setUsages(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsagesIsMutable();
        usages_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public Builder addUsages(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsagesIsMutable();
        usages_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public Builder addAllUsages(java.lang.Iterable<java.lang.String> values) {
        ensureUsagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, usages_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public Builder clearUsages() {
        usages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUsages specifies a set of usage contexts the key will be
       * valid for.
       * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
       *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
       * </pre>
       *
       * <code>repeated string usages = 5;</code>
       */
      public Builder addUsagesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsagesIsMutable();
        usages_.add(value);
        onChanged();
        return this;
      }

      private java.lang.Object username_ = "";
      /**
       *
       *
       * <pre>
       * Information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string username = 2;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string username = 2;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            username_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string username = 2;</code>
       */
      public com.google.protobuf.ByteString getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string username = 2;</code>
       */
      public Builder setUsername(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string username = 2;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000004);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string username = 2;</code>
       */
      public Builder setUsernameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        username_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object uid_ = "";
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 3;</code>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 3;</code>
       */
      public java.lang.String getUid() {
        java.lang.Object ref = uid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 3;</code>
       */
      public com.google.protobuf.ByteString getUidBytes() {
        java.lang.Object ref = uid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          uid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 3;</code>
       */
      public Builder setUid(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 3;</code>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * UID information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>optional string uid = 3;</code>
       */
      public Builder setUidBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        uid_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList groups_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureGroupsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          groups_ = new com.google.protobuf.LazyStringArrayList(groups_);
          bitField0_ |= 0x00000010;
        }
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList getGroupsList() {
        return groups_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public int getGroupsCount() {
        return groups_.size();
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public java.lang.String getGroups(int index) {
        return groups_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public com.google.protobuf.ByteString getGroupsBytes(int index) {
        return groups_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public Builder setGroups(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public Builder addGroups(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public Builder addAllGroups(java.lang.Iterable<java.lang.String> values) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, groups_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public Builder clearGroups() {
        groups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Group information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>repeated string groups = 4;</code>
       */
      public Builder addGroupsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          extra_;

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          internalGetExtra() {
        if (extra_ == null) {
          return com.google.protobuf.MapField.emptyMapField(ExtraDefaultEntryHolder.defaultEntry);
        }
        return extra_;
      }

      private com.google.protobuf.MapField<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          internalGetMutableExtra() {
        onChanged();
        ;
        if (extra_ == null) {
          extra_ = com.google.protobuf.MapField.newMapField(ExtraDefaultEntryHolder.defaultEntry);
        }
        if (!extra_.isMutable()) {
          extra_ = extra_.copy();
        }
        return extra_;
      }

      public int getExtraCount() {
        return internalGetExtra().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Extra information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;
       * </code>
       */
      public boolean containsExtra(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetExtra().getMap().containsKey(key);
      }
      /** Use {@link #getExtraMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          getExtra() {
        return getExtraMap();
      }
      /**
       *
       *
       * <pre>
       * Extra information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;
       * </code>
       */
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          getExtraMap() {
        return internalGetExtra().getMap();
      }
      /**
       *
       *
       * <pre>
       * Extra information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getExtraOrDefault(
          java.lang.String key,
          io.kubernetes.client.proto.V1beta1Certificates.ExtraValue defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
            map = internalGetExtra().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Extra information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getExtraOrThrow(
          java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
            map = internalGetExtra().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearExtra() {
        internalGetMutableExtra().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Extra information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;
       * </code>
       */
      public Builder removeExtra(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableExtra().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<
              java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
          getMutableExtra() {
        return internalGetMutableExtra().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Extra information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;
       * </code>
       */
      public Builder putExtra(
          java.lang.String key, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableExtra().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Extra information about the requesting user.
       * See user.Info interface for details.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.api.certificates.v1beta1.ExtraValue&gt; extra = 6;
       * </code>
       */
      public Builder putAllExtra(
          java.util.Map<java.lang.String, io.kubernetes.client.proto.V1beta1Certificates.ExtraValue>
              values) {
        internalGetMutableExtra().getMutableMap().putAll(values);
        return this;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestSpec)
    private static final io.kubernetes.client.proto.V1beta1Certificates
            .CertificateSigningRequestSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CertificateSigningRequestSpec> PARSER =
        new com.google.protobuf.AbstractParser<CertificateSigningRequestSpec>() {
          @java.lang.Override
          public CertificateSigningRequestSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CertificateSigningRequestSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CertificateSigningRequestSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CertificateSigningRequestSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CertificateSigningRequestStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    java.util.List<
            io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition>
        getConditionsList();
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition getConditions(
        int index);
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    int getConditionsCount();
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Certificates
                    .CertificateSigningRequestConditionOrBuilder>
        getConditionsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestConditionOrBuilder
        getConditionsOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * If request was approved, the controller will place the issued certificate here.
     * +optional
     * </pre>
     *
     * <code>optional bytes certificate = 2;</code>
     */
    boolean hasCertificate();
    /**
     *
     *
     * <pre>
     * If request was approved, the controller will place the issued certificate here.
     * +optional
     * </pre>
     *
     * <code>optional bytes certificate = 2;</code>
     */
    com.google.protobuf.ByteString getCertificate();
  }
  /** Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus} */
  public static final class CertificateSigningRequestStatus
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus)
      CertificateSigningRequestStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CertificateSigningRequestStatus.newBuilder() to construct.
    private CertificateSigningRequestStatus(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CertificateSigningRequestStatus() {
      conditions_ = java.util.Collections.emptyList();
      certificate_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CertificateSigningRequestStatus(
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
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  conditions_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Certificates
                              .CertificateSigningRequestCondition>();
                  mutable_bitField0_ |= 0x00000001;
                }
                conditions_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Certificates
                            .CertificateSigningRequestCondition.PARSER,
                        extensionRegistry));
                break;
              }
            case 18:
              {
                bitField0_ |= 0x00000001;
                certificate_ = input.readBytes();
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          conditions_ = java.util.Collections.unmodifiableList(conditions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus.class,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus.Builder
                  .class);
    }

    private int bitField0_;
    public static final int CONDITIONS_FIELD_NUMBER = 1;
    private java.util.List<
            io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition>
        conditions_;
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition>
        getConditionsList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V1beta1Certificates
                    .CertificateSigningRequestConditionOrBuilder>
        getConditionsOrBuilderList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    public int getConditionsCount() {
      return conditions_.size();
    }
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
        getConditions(int index) {
      return conditions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Conditions applied to the request, such as approval or denial.
     * +optional
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Certificates
            .CertificateSigningRequestConditionOrBuilder
        getConditionsOrBuilder(int index) {
      return conditions_.get(index);
    }

    public static final int CERTIFICATE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString certificate_;
    /**
     *
     *
     * <pre>
     * If request was approved, the controller will place the issued certificate here.
     * +optional
     * </pre>
     *
     * <code>optional bytes certificate = 2;</code>
     */
    public boolean hasCertificate() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * If request was approved, the controller will place the issued certificate here.
     * +optional
     * </pre>
     *
     * <code>optional bytes certificate = 2;</code>
     */
    public com.google.protobuf.ByteString getCertificate() {
      return certificate_;
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
      for (int i = 0; i < conditions_.size(); i++) {
        output.writeMessage(1, conditions_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, certificate_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < conditions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, conditions_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, certificate_);
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
      if (!(obj
          instanceof
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus other =
          (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus) obj;

      boolean result = true;
      result = result && getConditionsList().equals(other.getConditionsList());
      result = result && (hasCertificate() == other.hasCertificate());
      if (hasCertificate()) {
        result = result && getCertificate().equals(other.getCertificate());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getConditionsCount() > 0) {
        hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getConditionsList().hashCode();
      }
      if (hasCertificate()) {
        hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
        hash = (53 * hash) + getCertificate().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        parseFrom(
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /** Protobuf type {@code k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus} */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus)
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                    .class,
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getConditionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          conditionsBuilder_.clear();
        }
        certificate_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
          build() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus result =
            new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (conditionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            conditions_ = java.util.Collections.unmodifiableList(conditions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.conditions_ = conditions_;
        } else {
          result.conditions_ = conditionsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.certificate_ = certificate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
                .getDefaultInstance()) return this;
        if (conditionsBuilder_ == null) {
          if (!other.conditions_.isEmpty()) {
            if (conditions_.isEmpty()) {
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureConditionsIsMutable();
              conditions_.addAll(other.conditions_);
            }
            onChanged();
          }
        } else {
          if (!other.conditions_.isEmpty()) {
            if (conditionsBuilder_.isEmpty()) {
              conditionsBuilder_.dispose();
              conditionsBuilder_ = null;
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              conditionsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getConditionsFieldBuilder()
                      : null;
            } else {
              conditionsBuilder_.addAllMessages(other.conditions_);
            }
          }
        }
        if (other.hasCertificate()) {
          setCertificate(other.getCertificate());
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
        io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition>
          conditions_ = java.util.Collections.emptyList();

      private void ensureConditionsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          conditions_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1beta1Certificates
                      .CertificateSigningRequestCondition>(conditions_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                  .Builder,
              io.kubernetes.client.proto.V1beta1Certificates
                  .CertificateSigningRequestConditionOrBuilder>
          conditionsBuilder_;

      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition>
          getConditionsList() {
        if (conditionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(conditions_);
        } else {
          return conditionsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public int getConditionsCount() {
        if (conditionsBuilder_ == null) {
          return conditions_.size();
        } else {
          return conditionsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
          getConditions(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder setConditions(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.set(index, value);
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder setConditions(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.set(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder addConditions(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(index, value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder addConditions(
          int index,
          io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder addAllConditions(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V1beta1Certificates
                          .CertificateSigningRequestCondition>
              values) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conditions_);
          onChanged();
        } else {
          conditionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder clearConditions() {
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public Builder removeConditions(int index) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.remove(index);
          onChanged();
        } else {
          conditionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
              .Builder
          getConditionsBuilder(int index) {
        return getConditionsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates
              .CertificateSigningRequestConditionOrBuilder
          getConditionsOrBuilder(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V1beta1Certificates
                      .CertificateSigningRequestConditionOrBuilder>
          getConditionsOrBuilderList() {
        if (conditionsBuilder_ != null) {
          return conditionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(conditions_);
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
              .Builder
          addConditionsBuilder() {
        return getConditionsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
              .Builder
          addConditionsBuilder(int index) {
        return getConditionsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Conditions applied to the request, such as approval or denial.
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.certificates.v1beta1.CertificateSigningRequestCondition conditions = 1;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                  .Builder>
          getConditionsBuilderList() {
        return getConditionsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition,
              io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                  .Builder,
              io.kubernetes.client.proto.V1beta1Certificates
                  .CertificateSigningRequestConditionOrBuilder>
          getConditionsFieldBuilder() {
        if (conditionsBuilder_ == null) {
          conditionsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition,
                  io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestCondition
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Certificates
                      .CertificateSigningRequestConditionOrBuilder>(
                  conditions_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          conditions_ = null;
        }
        return conditionsBuilder_;
      }

      private com.google.protobuf.ByteString certificate_ = com.google.protobuf.ByteString.EMPTY;
      /**
       *
       *
       * <pre>
       * If request was approved, the controller will place the issued certificate here.
       * +optional
       * </pre>
       *
       * <code>optional bytes certificate = 2;</code>
       */
      public boolean hasCertificate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * If request was approved, the controller will place the issued certificate here.
       * +optional
       * </pre>
       *
       * <code>optional bytes certificate = 2;</code>
       */
      public com.google.protobuf.ByteString getCertificate() {
        return certificate_;
      }
      /**
       *
       *
       * <pre>
       * If request was approved, the controller will place the issued certificate here.
       * +optional
       * </pre>
       *
       * <code>optional bytes certificate = 2;</code>
       */
      public Builder setCertificate(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        certificate_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * If request was approved, the controller will place the issued certificate here.
       * +optional
       * </pre>
       *
       * <code>optional bytes certificate = 2;</code>
       */
      public Builder clearCertificate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        certificate_ = getDefaultInstance().getCertificate();
        onChanged();
        return this;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.certificates.v1beta1.CertificateSigningRequestStatus)
    private static final io.kubernetes.client.proto.V1beta1Certificates
            .CertificateSigningRequestStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus();
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CertificateSigningRequestStatus> PARSER =
        new com.google.protobuf.AbstractParser<CertificateSigningRequestStatus>() {
          @java.lang.Override
          public CertificateSigningRequestStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CertificateSigningRequestStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CertificateSigningRequestStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CertificateSigningRequestStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Certificates.CertificateSigningRequestStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExtraValueOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.certificates.v1beta1.ExtraValue)
      com.google.protobuf.MessageOrBuilder {

    /** <code>repeated string items = 1;</code> */
    java.util.List<java.lang.String> getItemsList();
    /** <code>repeated string items = 1;</code> */
    int getItemsCount();
    /** <code>repeated string items = 1;</code> */
    java.lang.String getItems(int index);
    /** <code>repeated string items = 1;</code> */
    com.google.protobuf.ByteString getItemsBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * ExtraValue masks the value so protobuf can generate
   * +protobuf.nullable=true
   * +protobuf.options.(gogoproto.goproto_stringer)=false
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.certificates.v1beta1.ExtraValue}
   */
  public static final class ExtraValue extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.certificates.v1beta1.ExtraValue)
      ExtraValueOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExtraValue.newBuilder() to construct.
    private ExtraValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExtraValue() {
      items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExtraValue(
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
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  items_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                items_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = items_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Certificates
          .internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Certificates.ExtraValue.class,
              io.kubernetes.client.proto.V1beta1Certificates.ExtraValue.Builder.class);
    }

    public static final int ITEMS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList items_;
    /** <code>repeated string items = 1;</code> */
    public com.google.protobuf.ProtocolStringList getItemsList() {
      return items_;
    }
    /** <code>repeated string items = 1;</code> */
    public int getItemsCount() {
      return items_.size();
    }
    /** <code>repeated string items = 1;</code> */
    public java.lang.String getItems(int index) {
      return items_.get(index);
    }
    /** <code>repeated string items = 1;</code> */
    public com.google.protobuf.ByteString getItemsBytes(int index) {
      return items_.getByteString(index);
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
      for (int i = 0; i < items_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, items_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < items_.size(); i++) {
          dataSize += computeStringSizeNoTag(items_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getItemsList().size();
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Certificates.ExtraValue)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Certificates.ExtraValue other =
          (io.kubernetes.client.proto.V1beta1Certificates.ExtraValue) obj;

      boolean result = true;
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parseFrom(
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
        io.kubernetes.client.proto.V1beta1Certificates.ExtraValue prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ExtraValue masks the value so protobuf can generate
     * +protobuf.nullable=true
     * +protobuf.options.(gogoproto.goproto_stringer)=false
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.certificates.v1beta1.ExtraValue}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.certificates.v1beta1.ExtraValue)
        io.kubernetes.client.proto.V1beta1Certificates.ExtraValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Certificates.ExtraValue.class,
                io.kubernetes.client.proto.V1beta1Certificates.ExtraValue.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Certificates.ExtraValue.newBuilder()
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
        items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Certificates
            .internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Certificates.ExtraValue.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue build() {
        io.kubernetes.client.proto.V1beta1Certificates.ExtraValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue buildPartial() {
        io.kubernetes.client.proto.V1beta1Certificates.ExtraValue result =
            new io.kubernetes.client.proto.V1beta1Certificates.ExtraValue(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = items_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1beta1Certificates.ExtraValue) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Certificates.ExtraValue) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Certificates.ExtraValue other) {
        if (other == io.kubernetes.client.proto.V1beta1Certificates.ExtraValue.getDefaultInstance())
          return this;
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
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
        io.kubernetes.client.proto.V1beta1Certificates.ExtraValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Certificates.ExtraValue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.LazyStringList items_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = new com.google.protobuf.LazyStringArrayList(items_);
          bitField0_ |= 0x00000001;
        }
      }
      /** <code>repeated string items = 1;</code> */
      public com.google.protobuf.ProtocolStringList getItemsList() {
        return items_.getUnmodifiableView();
      }
      /** <code>repeated string items = 1;</code> */
      public int getItemsCount() {
        return items_.size();
      }
      /** <code>repeated string items = 1;</code> */
      public java.lang.String getItems(int index) {
        return items_.get(index);
      }
      /** <code>repeated string items = 1;</code> */
      public com.google.protobuf.ByteString getItemsBytes(int index) {
        return items_.getByteString(index);
      }
      /** <code>repeated string items = 1;</code> */
      public Builder setItems(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addItems(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addAllItems(java.lang.Iterable<java.lang.String> values) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder clearItems() {
        items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /** <code>repeated string items = 1;</code> */
      public Builder addItemsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.certificates.v1beta1.ExtraValue)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.certificates.v1beta1.ExtraValue)
    private static final io.kubernetes.client.proto.V1beta1Certificates.ExtraValue DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Certificates.ExtraValue();
    }

    public static io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExtraValue> PARSER =
        new com.google.protobuf.AbstractParser<ExtraValue>() {
          @java.lang.Override
          public ExtraValue parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExtraValue(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExtraValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExtraValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Certificates.ExtraValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_ExtraEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_ExtraEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/k8s.io/api/certificates/v1beta1/genera"
          + "ted.proto\022\037k8s.io.api.certificates.v1bet"
          + "a1\0324k8s.io/apimachinery/pkg/apis/meta/v1"
          + "/generated.proto\032/k8s.io/apimachinery/pk"
          + "g/runtime/generated.proto\0326k8s.io/apimac"
          + "hinery/pkg/runtime/schema/generated.prot"
          + "o\"\377\001\n\031CertificateSigningRequest\022B\n\010metad"
          + "ata\030\001 \001(\01320.k8s.io.apimachinery.pkg.apis"
          + ".meta.v1.ObjectMeta\022L\n\004spec\030\002 \001(\0132>.k8s."
          + "io.api.certificates.v1beta1.CertificateS"
          + "igningRequestSpec\022P\n\006status\030\003 \001(\0132@.k8s."
          + "io.api.certificates.v1beta1.CertificateS"
          + "igningRequestStatus\"\227\001\n\"CertificateSigni"
          + "ngRequestCondition\022\014\n\004type\030\001 \001(\t\022\016\n\006reas"
          + "on\030\002 \001(\t\022\017\n\007message\030\003 \001(\t\022B\n\016lastUpdateT"
          + "ime\030\004 \001(\0132*.k8s.io.apimachinery.pkg.apis"
          + ".meta.v1.Time\"\254\001\n\035CertificateSigningRequ"
          + "estList\022@\n\010metadata\030\001 \001(\0132..k8s.io.apima"
          + "chinery.pkg.apis.meta.v1.ListMeta\022I\n\005ite"
          + "ms\030\002 \003(\0132:.k8s.io.api.certificates.v1bet"
          + "a1.CertificateSigningRequest\"\244\002\n\035Certifi"
          + "cateSigningRequestSpec\022\017\n\007request\030\001 \001(\014\022"
          + "\016\n\006usages\030\005 \003(\t\022\020\n\010username\030\002 \001(\t\022\013\n\003uid"
          + "\030\003 \001(\t\022\016\n\006groups\030\004 \003(\t\022X\n\005extra\030\006 \003(\0132I."
          + "k8s.io.api.certificates.v1beta1.Certific"
          + "ateSigningRequestSpec.ExtraEntry\032Y\n\nExtr"
          + "aEntry\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.k8s"
          + ".io.api.certificates.v1beta1.ExtraValue:"
          + "\0028\001\"\217\001\n\037CertificateSigningRequestStatus\022"
          + "W\n\nconditions\030\001 \003(\0132C.k8s.io.api.certifi"
          + "cates.v1beta1.CertificateSigningRequestC"
          + "ondition\022\023\n\013certificate\030\002 \001(\014\"\033\n\nExtraVa"
          + "lue\022\r\n\005items\030\001 \003(\tB:\n\032io.kubernetes.clie"
          + "nt.protoB\023V1beta1CertificatesZ\007v1beta1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequest_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestCondition_descriptor,
            new java.lang.String[] {
              "Type", "Reason", "Message", "LastUpdateTime",
            });
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_descriptor,
            new java.lang.String[] {
              "Request", "Usages", "Username", "Uid", "Groups", "Extra",
            });
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_ExtraEntry_descriptor =
        internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_ExtraEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestSpec_ExtraEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_certificates_v1beta1_CertificateSigningRequestStatus_descriptor,
            new java.lang.String[] {
              "Conditions", "Certificate",
            });
    internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_certificates_v1beta1_ExtraValue_descriptor,
            new java.lang.String[] {
              "Items",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
