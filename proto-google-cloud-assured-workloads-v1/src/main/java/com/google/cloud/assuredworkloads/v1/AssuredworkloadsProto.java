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

public final class AssuredworkloadsProto {
  private AssuredworkloadsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_DeleteWorkloadRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_DeleteWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_GetWorkloadRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_GetWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_Workload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_Workload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_Workload_KMSSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_Workload_KMSSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_Workload_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_Workload_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "7google/cloud/assuredworkloads/v1/assuredworkloads.proto\022 google.cloud.assuredw"
          + "orkloads.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032#google/longrunning/operations.pr"
          + "oto\032\036google/protobuf/duration.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\266\001\n"
          + "\025CreateWorkloadRequest\022@\n"
          + "\006parent\030\001 \001("
          + "\tB0\340A\002\372A*\022(assuredworkloads.googleapis.com/Workload\022A\n"
          + "\010workload\030\002 \001("
          + "\0132*.google.cloud.assuredworkloads.v1.WorkloadB\003\340A\002\022\030\n"
          + "\013external_id\030\003 \001(\tB\003\340A\001\"\220\001\n"
          + "\025UpdateWorkloadRequest\022A\n"
          + "\010workload\030\001 \001(\013"
          + "2*.google.cloud.assuredworkloads.v1.WorkloadB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"j\n"
          + "\025DeleteWorkloadRequest\022>\n"
          + "\004name\030\001 \001(\tB0\340A\002\372A*\n"
          + "(assuredworkloads.googleapis.com/Workload\022\021\n"
          + "\004etag\030\002 \001(\tB\003\340A\001\"T\n"
          + "\022GetWorkloadRequest\022>\n"
          + "\004name\030\001 \001(\tB0\340A\002\372A*\n"
          + "(assuredworkloads.googleapis.com/Workload\"\217\001\n"
          + "\024ListWorkloadsRequest\022@\n"
          + "\006parent\030\001 \001("
          + "\tB0\340A\002\372A*\022(assuredworkloads.googleapis.com/Workload\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\022\016\n"
          + "\006filter\030\004 \001(\t\"o\n"
          + "\025ListWorkloadsResponse\022=\n"
          + "\tworkloads\030\001 \003(\0132*.google.cloud.assuredworkloads.v1.Workload\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\240\014\n"
          + "\010Workload\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\001\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022O\n"
          + "\tresources\030\003 \003(\01327.goo"
          + "gle.cloud.assuredworkloads.v1.Workload.ResourceInfoB\003\340A\003\022^\n"
          + "\021compliance_regime\030\004 "
          + "\001(\0162;.google.cloud.assuredworkloads.v1.Workload.ComplianceRegimeB\006\340A\002\340A\005\0227\n"
          + "\013create_time\030\005"
          + " \001(\0132\032.google.protobuf.TimestampB\006\340A\003\340A\005\022\037\n"
          + "\017billing_account\030\006 \001(\tB\006\340A\002\340A\004\022\021\n"
          + "\004etag\030\t \001(\tB\003\340A\001\022K\n"
          + "\006labels\030\n"
          + " \003(\01326."
          + "google.cloud.assuredworkloads.v1.Workload.LabelsEntryB\003\340A\001\022)\n"
          + "\034provisioned_resources_parent\030\r"
          + " \001(\tB\003\340A\004\022Q\n"
          + "\014kms_settings\030\016 "
          + "\001(\01326.google.cloud.assuredworkloads.v1.Workload.KMSSettingsB\003\340A\004\022[\n"
          + "\021resource_settings\030\017 \003(\0132;.google.cloud.assuredworklo"
          + "ads.v1.Workload.ResourceSettingsB\003\340A\004\032\357\001\n"
          + "\014ResourceInfo\022\023\n"
          + "\013resource_id\030\001 \001(\003\022[\n\r"
          + "resource_type\030\002 \001(\0162D.google.cloud.assure"
          + "dworkloads.v1.Workload.ResourceInfo.ResourceType\"m\n"
          + "\014ResourceType\022\035\n"
          + "\031RESOURCE_TYPE_UNSPECIFIED\020\000\022\024\n"
          + "\020CONSUMER_PROJECT\020\001\022\033\n"
          + "\027ENCRYPTION_KEYS_PROJECT\020\002\022\013\n"
          + "\007KEYRING\020\003\032\217\001\n"
          + "\013KMSSettings\022A\n"
          + "\022next_rotation_time\030\001 \001(\0132\032.google.protobuf.TimestampB"
          + "\t\340A\002\340A\004\340A\005\022=\n"
          + "\017rotation_period\030\002 \001(\0132\031.google.protobuf.DurationB"
          + "\t\340A\002\340A\004\340A\005\032\232\001\n"
          + "\020ResourceSettings\022\023\n"
          + "\013resource_id\030\001 \001(\t\022[\n\r"
          + "resource_type\030\002 \001(\0162D.google.cloud.assuredworkloa"
          + "ds.v1.Workload.ResourceInfo.ResourceType\022\024\n"
          + "\014display_name\030\003 \001(\t\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"\330\001\n"
          + "\020ComplianceRegime\022!\n"
          + "\035COMPLIANCE_REGIME_UNSPECIFIED\020\000\022\007\n"
          + "\003IL4\020\001\022\010\n"
          + "\004CJIS\020\002\022\020\n"
          + "\014FEDRAMP_HIGH\020\003\022\024\n"
          + "\020FEDRAMP_MODERATE\020\004\022\026\n"
          + "\022US_REGIONAL_ACCESS\020\005\022\t\n"
          + "\005HIPAA\020\006\022\013\n"
          + "\007HITRUST\020\007\022\032\n"
          + "\026EU_REGIONS_AND_SUPPORT\020\010\022\032\n"
          + "\026CA_REGIONS_AND_SUPPORT\020\t:u\352Ar\n"
          + "(assuredworkloads.googleapis.com/Workload\022Forganizations/{organiza"
          + "tion}/locations/{location}/workloads/{workload}\"\344\001\n"
          + "\037CreateWorkloadOperationMetadata\0224\n"
          + "\013create_time\030\001"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\001\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\001\022\023\n"
          + "\006parent\030\003 \001(\tB\003\340A\001\022[\n"
          + "\021compliance_regime\030\004 \001(\0162;.google.cloud.assuredworkl"
          + "oads.v1.Workload.ComplianceRegimeB\003\340A\0012\342\010\n"
          + "\027AssuredWorkloadsService\022\357\001\n"
          + "\016CreateWorkload\0227.google.cloud.assuredworkloads.v1"
          + ".CreateWorkloadRequest\032\035.google.longrunn"
          + "ing.Operation\"\204\001\202\323\344\223\002>\"2/v1/{parent=orga"
          + "nizations/*/locations/*}/workloads:\010workload\332A\017parent,workload\312A+\n"
          + "\010Workload\022\037CreateWorkloadOperationMetadata\022\333\001\n"
          + "\016UpdateWorkload\0227.google.cloud.assuredworkloads."
          + "v1.UpdateWorkloadRequest\032*.google.cloud."
          + "assuredworkloads.v1.Workload\"d\202\323\344\223\002G2;/v"
          + "1/{workload.name=organizations/*/locatio"
          + "ns/*/workloads/*}:\010workload\332A\024workload,update_mask\022\244\001\n"
          + "\016DeleteWorkload\0227.google.cloud.assuredworkloads.v1.DeleteWorkloadR"
          + "equest\032\026.google.protobuf.Empty\"A\202\323\344\223\0024*2"
          + "/v1/{name=organizations/*/locations/*/workloads/*}\332A\004name\022\262\001\n"
          + "\013GetWorkload\0224.google.cloud.assuredworkloads.v1.GetWorkload"
          + "Request\032*.google.cloud.assuredworkloads."
          + "v1.Workload\"A\202\323\344\223\0024\0222/v1/{name=organizat"
          + "ions/*/locations/*/workloads/*}\332A\004name\022\305\001\n\r"
          + "ListWorkloads\0226.google.cloud.assuredworkloads.v1.ListWorkloadsRequest\0327.googl"
          + "e.cloud.assuredworkloads.v1.ListWorkload"
          + "sResponse\"C\202\323\344\223\0024\0222/v1/{parent=organizat"
          + "ions/*/locations/*}/workloads\332A\006parent\032S"
          + "\312A\037assuredworkloads.googleapis.com\322A.htt"
          + "ps://www.googleapis.com/auth/cloud-platformB\335\002\n"
          + "$com.google.cloud.assuredworkloads.v1B\025AssuredworkloadsProtoP\001ZPgoogle.go"
          + "lang.org/genproto/googleapis/cloud/assuredworkloads/v1;assuredworkloads\252\002"
          + " Google.Cloud.AssuredWorkloads.V1\312\002 Google\\Clou"
          + "d\\AssuredWorkloads\\V1\352\002#Google::Cloud::AssuredWorkloads::V1\352A]\n"
          + "(assuredworkloads.googleapis.com/Location\0221organizations/"
          + "{organization}/locations/{location}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Workload", "ExternalId",
            });
    internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_UpdateWorkloadRequest_descriptor,
            new java.lang.String[] {
              "Workload", "UpdateMask",
            });
    internal_static_google_cloud_assuredworkloads_v1_DeleteWorkloadRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_assuredworkloads_v1_DeleteWorkloadRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_DeleteWorkloadRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
            });
    internal_static_google_cloud_assuredworkloads_v1_GetWorkloadRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_assuredworkloads_v1_GetWorkloadRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_GetWorkloadRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_ListWorkloadsResponse_descriptor,
            new java.lang.String[] {
              "Workloads", "NextPageToken",
            });
    internal_static_google_cloud_assuredworkloads_v1_Workload_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_assuredworkloads_v1_Workload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_Workload_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Resources",
              "ComplianceRegime",
              "CreateTime",
              "BillingAccount",
              "Etag",
              "Labels",
              "ProvisionedResourcesParent",
              "KmsSettings",
              "ResourceSettings",
            });
    internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceInfo_descriptor =
        internal_static_google_cloud_assuredworkloads_v1_Workload_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceInfo_descriptor,
            new java.lang.String[] {
              "ResourceId", "ResourceType",
            });
    internal_static_google_cloud_assuredworkloads_v1_Workload_KMSSettings_descriptor =
        internal_static_google_cloud_assuredworkloads_v1_Workload_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_assuredworkloads_v1_Workload_KMSSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_Workload_KMSSettings_descriptor,
            new java.lang.String[] {
              "NextRotationTime", "RotationPeriod",
            });
    internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceSettings_descriptor =
        internal_static_google_cloud_assuredworkloads_v1_Workload_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_Workload_ResourceSettings_descriptor,
            new java.lang.String[] {
              "ResourceId", "ResourceType", "DisplayName",
            });
    internal_static_google_cloud_assuredworkloads_v1_Workload_LabelsEntry_descriptor =
        internal_static_google_cloud_assuredworkloads_v1_Workload_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_assuredworkloads_v1_Workload_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_Workload_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_assuredworkloads_v1_CreateWorkloadOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "DisplayName", "Parent", "ComplianceRegime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
