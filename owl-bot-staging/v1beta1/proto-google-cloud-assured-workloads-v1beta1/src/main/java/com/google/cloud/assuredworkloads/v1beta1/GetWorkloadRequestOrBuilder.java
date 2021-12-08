// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads_v1beta1.proto

package com.google.cloud.assuredworkloads.v1beta1;

public interface GetWorkloadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1beta1.GetWorkloadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Workload to fetch. This is the
   * workloads's relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the Workload to fetch. This is the
   * workloads's relative path in the API, formatted as
   * "organizations/{organization_id}/locations/{location_id}/workloads/{workload_id}".
   * For example,
   * "organizations/123/locations/us-east1/workloads/assured-workload-1".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
