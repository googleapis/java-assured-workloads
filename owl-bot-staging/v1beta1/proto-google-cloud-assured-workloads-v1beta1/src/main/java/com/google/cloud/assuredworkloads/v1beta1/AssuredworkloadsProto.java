// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads_v1beta1.proto

package com.google.cloud.assuredworkloads.v1beta1;

public final class AssuredworkloadsProto {
  private AssuredworkloadsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_UpdateWorkloadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_UpdateWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_DeleteWorkloadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_DeleteWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_GetWorkloadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_GetWorkloadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_KMSSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_KMSSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_IL4Settings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_IL4Settings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_CJISSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_CJISSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampHighSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampHighSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampModerateSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampModerateSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/cloud/assuredworkloads/v1beta1/" +
      "assuredworkloads_v1beta1.proto\022%google.c" +
      "loud.assuredworkloads.v1beta1\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032#google/longrun" +
      "ning/operations.proto\032\036google/protobuf/d" +
      "uration.proto\032\033google/protobuf/empty.pro" +
      "to\032 google/protobuf/field_mask.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"\273\001\n\025Create" +
      "WorkloadRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\022" +
      "(assuredworkloads.googleapis.com/Workloa" +
      "d\022F\n\010workload\030\002 \001(\0132/.google.cloud.assur" +
      "edworkloads.v1beta1.WorkloadB\003\340A\002\022\030\n\013ext" +
      "ernal_id\030\003 \001(\tB\003\340A\001\"\225\001\n\025UpdateWorkloadRe" +
      "quest\022F\n\010workload\030\001 \001(\0132/.google.cloud.a" +
      "ssuredworkloads.v1beta1.WorkloadB\003\340A\002\0224\n" +
      "\013update_mask\030\002 \001(\0132\032.google.protobuf.Fie" +
      "ldMaskB\003\340A\002\"j\n\025DeleteWorkloadRequest\022>\n\004" +
      "name\030\001 \001(\tB0\340A\002\372A*\n(assuredworkloads.goo" +
      "gleapis.com/Workload\022\021\n\004etag\030\002 \001(\tB\003\340A\001\"" +
      "T\n\022GetWorkloadRequest\022>\n\004name\030\001 \001(\tB0\340A\002" +
      "\372A*\n(assuredworkloads.googleapis.com/Wor" +
      "kload\"\217\001\n\024ListWorkloadsRequest\022@\n\006parent" +
      "\030\001 \001(\tB0\340A\002\372A*\022(assuredworkloads.googlea" +
      "pis.com/Workload\022\021\n\tpage_size\030\002 \001(\005\022\022\n\np" +
      "age_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"t\n\025ListW" +
      "orkloadsResponse\022B\n\tworkloads\030\001 \003(\0132/.go" +
      "ogle.cloud.assuredworkloads.v1beta1.Work" +
      "load\022\027\n\017next_page_token\030\002 \001(\t\"\223\023\n\010Worklo" +
      "ad\022\021\n\004name\030\001 \001(\tB\003\340A\001\022\031\n\014display_name\030\002 " +
      "\001(\tB\003\340A\002\022T\n\tresources\030\003 \003(\0132<.google.clo" +
      "ud.assuredworkloads.v1beta1.Workload.Res" +
      "ourceInfoB\003\340A\003\022c\n\021compliance_regime\030\004 \001(" +
      "\0162@.google.cloud.assuredworkloads.v1beta" +
      "1.Workload.ComplianceRegimeB\006\340A\002\340A\005\0227\n\013c" +
      "reate_time\030\005 \001(\0132\032.google.protobuf.Times" +
      "tampB\006\340A\003\340A\005\022\037\n\017billing_account\030\006 \001(\tB\006\340" +
      "A\002\340A\004\022`\n\014il4_settings\030\007 \001(\0132;.google.clo" +
      "ud.assuredworkloads.v1beta1.Workload.IL4" +
      "SettingsB\013\030\001\340A\002\340A\004\340A\005H\000\022b\n\rcjis_settings" +
      "\030\010 \001(\0132<.google.cloud.assuredworkloads.v" +
      "1beta1.Workload.CJISSettingsB\013\030\001\340A\002\340A\004\340A" +
      "\005H\000\022q\n\025fedramp_high_settings\030\013 \001(\0132C.goo" +
      "gle.cloud.assuredworkloads.v1beta1.Workl" +
      "oad.FedrampHighSettingsB\013\030\001\340A\002\340A\004\340A\005H\000\022y" +
      "\n\031fedramp_moderate_settings\030\014 \001(\0132G.goog" +
      "le.cloud.assuredworkloads.v1beta1.Worklo" +
      "ad.FedrampModerateSettingsB\013\030\001\340A\002\340A\004\340A\005H" +
      "\000\022\021\n\004etag\030\t \001(\tB\003\340A\001\022P\n\006labels\030\n \003(\0132;.g" +
      "oogle.cloud.assuredworkloads.v1beta1.Wor" +
      "kload.LabelsEntryB\003\340A\001\022)\n\034provisioned_re" +
      "sources_parent\030\r \001(\tB\003\340A\004\022V\n\014kms_setting" +
      "s\030\016 \001(\0132;.google.cloud.assuredworkloads." +
      "v1beta1.Workload.KMSSettingsB\003\340A\004\022`\n\021res" +
      "ource_settings\030\017 \003(\0132@.google.cloud.assu" +
      "redworkloads.v1beta1.Workload.ResourceSe" +
      "ttingsB\003\340A\004\032\347\001\n\014ResourceInfo\022\023\n\013resource" +
      "_id\030\001 \001(\003\022`\n\rresource_type\030\002 \001(\0162I.googl" +
      "e.cloud.assuredworkloads.v1beta1.Workloa" +
      "d.ResourceInfo.ResourceType\"`\n\014ResourceT" +
      "ype\022\035\n\031RESOURCE_TYPE_UNSPECIFIED\020\000\022\024\n\020CO" +
      "NSUMER_PROJECT\020\001\022\033\n\027ENCRYPTION_KEYS_PROJ" +
      "ECT\020\002\032\217\001\n\013KMSSettings\022A\n\022next_rotation_t" +
      "ime\030\001 \001(\0132\032.google.protobuf.TimestampB\t\340" +
      "A\002\340A\004\340A\005\022=\n\017rotation_period\030\002 \001(\0132\031.goog" +
      "le.protobuf.DurationB\t\340A\002\340A\004\340A\005\032o\n\013IL4Se" +
      "ttings\022\\\n\014kms_settings\030\001 \001(\0132;.google.cl" +
      "oud.assuredworkloads.v1beta1.Workload.KM" +
      "SSettingsB\t\340A\002\340A\004\340A\005:\002\030\001\032p\n\014CJISSettings" +
      "\022\\\n\014kms_settings\030\001 \001(\0132;.google.cloud.as" +
      "suredworkloads.v1beta1.Workload.KMSSetti" +
      "ngsB\t\340A\002\340A\004\340A\005:\002\030\001\032w\n\023FedrampHighSetting" +
      "s\022\\\n\014kms_settings\030\001 \001(\0132;.google.cloud.a" +
      "ssuredworkloads.v1beta1.Workload.KMSSett" +
      "ingsB\t\340A\002\340A\004\340A\005:\002\030\001\032{\n\027FedrampModerateSe" +
      "ttings\022\\\n\014kms_settings\030\001 \001(\0132;.google.cl" +
      "oud.assuredworkloads.v1beta1.Workload.KM" +
      "SSettingsB\t\340A\002\340A\004\340A\005:\002\030\001\032\211\001\n\020ResourceSet" +
      "tings\022\023\n\013resource_id\030\001 \001(\t\022`\n\rresource_t" +
      "ype\030\002 \001(\0162I.google.cloud.assuredworkload" +
      "s.v1beta1.Workload.ResourceInfo.Resource" +
      "Type\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\240\001\n\020ComplianceRegime\022!\n\035COMP" +
      "LIANCE_REGIME_UNSPECIFIED\020\000\022\007\n\003IL4\020\001\022\010\n\004" +
      "CJIS\020\002\022\020\n\014FEDRAMP_HIGH\020\003\022\024\n\020FEDRAMP_MODE" +
      "RATE\020\004\022\026\n\022US_REGIONAL_ACCESS\020\005\022\t\n\005HIPAA\020" +
      "\006\022\013\n\007HITRUST\020\007:u\352Ar\n(assuredworkloads.go" +
      "ogleapis.com/Workload\022Forganizations/{or" +
      "ganization}/locations/{location}/workloa" +
      "ds/{workload}B\034\n\032compliance_regime_setti" +
      "ngs\"\351\001\n\037CreateWorkloadOperationMetadata\022" +
      "4\n\013create_time\030\001 \001(\0132\032.google.protobuf.T" +
      "imestampB\003\340A\001\022\031\n\014display_name\030\002 \001(\tB\003\340A\001" +
      "\022\023\n\006parent\030\003 \001(\tB\003\340A\001\022`\n\021compliance_regi" +
      "me\030\004 \001(\0162@.google.cloud.assuredworkloads" +
      ".v1beta1.Workload.ComplianceRegimeB\003\340A\0012" +
      "\243\t\n\027AssuredWorkloadsService\022\371\001\n\016CreateWo" +
      "rkload\022<.google.cloud.assuredworkloads.v" +
      "1beta1.CreateWorkloadRequest\032\035.google.lo" +
      "ngrunning.Operation\"\211\001\202\323\344\223\002C\"7/v1beta1/{" +
      "parent=organizations/*/locations/*}/work" +
      "loads:\010workload\332A\017parent,workload\312A+\n\010Wo" +
      "rkload\022\037CreateWorkloadOperationMetadata\022" +
      "\352\001\n\016UpdateWorkload\022<.google.cloud.assure" +
      "dworkloads.v1beta1.UpdateWorkloadRequest" +
      "\032/.google.cloud.assuredworkloads.v1beta1" +
      ".Workload\"i\202\323\344\223\002L2@/v1beta1/{workload.na" +
      "me=organizations/*/locations/*/workloads" +
      "/*}:\010workload\332A\024workload,update_mask\022\256\001\n" +
      "\016DeleteWorkload\022<.google.cloud.assuredwo" +
      "rkloads.v1beta1.DeleteWorkloadRequest\032\026." +
      "google.protobuf.Empty\"F\202\323\344\223\0029*7/v1beta1/" +
      "{name=organizations/*/locations/*/worklo" +
      "ads/*}\332A\004name\022\301\001\n\013GetWorkload\0229.google.c" +
      "loud.assuredworkloads.v1beta1.GetWorkloa" +
      "dRequest\032/.google.cloud.assuredworkloads" +
      ".v1beta1.Workload\"F\202\323\344\223\0029\0227/v1beta1/{nam" +
      "e=organizations/*/locations/*/workloads/" +
      "*}\332A\004name\022\324\001\n\rListWorkloads\022;.google.clo" +
      "ud.assuredworkloads.v1beta1.ListWorkload" +
      "sRequest\032<.google.cloud.assuredworkloads" +
      ".v1beta1.ListWorkloadsResponse\"H\202\323\344\223\0029\0227" +
      "/v1beta1/{parent=organizations/*/locatio" +
      "ns/*}/workloads\332A\006parent\032S\312A\037assuredwork" +
      "loads.googleapis.com\322A.https://www.googl" +
      "eapis.com/auth/cloud-platformB\366\002\n)com.go" +
      "ogle.cloud.assuredworkloads.v1beta1B\025Ass" +
      "uredworkloadsProtoP\001ZUgoogle.golang.org/" +
      "genproto/googleapis/cloud/assuredworkloa" +
      "ds/v1beta1;assuredworkloads\252\002%Google.Clo" +
      "ud.AssuredWorkloads.V1Beta1\312\002%Google\\Clo" +
      "ud\\AssuredWorkloads\\V1beta1\352\002(Google::Cl" +
      "oud::AssuredWorkloads::V1beta1\352A]\n(assur" +
      "edworkloads.googleapis.com/Location\0221org" +
      "anizations/{organization}/locations/{loc" +
      "ation}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
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
    internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_descriptor,
        new java.lang.String[] { "Parent", "Workload", "ExternalId", });
    internal_static_google_cloud_assuredworkloads_v1beta1_UpdateWorkloadRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_assuredworkloads_v1beta1_UpdateWorkloadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_UpdateWorkloadRequest_descriptor,
        new java.lang.String[] { "Workload", "UpdateMask", });
    internal_static_google_cloud_assuredworkloads_v1beta1_DeleteWorkloadRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_assuredworkloads_v1beta1_DeleteWorkloadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_DeleteWorkloadRequest_descriptor,
        new java.lang.String[] { "Name", "Etag", });
    internal_static_google_cloud_assuredworkloads_v1beta1_GetWorkloadRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_assuredworkloads_v1beta1_GetWorkloadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_GetWorkloadRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_ListWorkloadsResponse_descriptor,
        new java.lang.String[] { "Workloads", "NextPageToken", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Resources", "ComplianceRegime", "CreateTime", "BillingAccount", "Il4Settings", "CjisSettings", "FedrampHighSettings", "FedrampModerateSettings", "Etag", "Labels", "ProvisionedResourcesParent", "KmsSettings", "ResourceSettings", "ComplianceRegimeSettings", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceInfo_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceInfo_descriptor,
        new java.lang.String[] { "ResourceId", "ResourceType", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_KMSSettings_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_KMSSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_KMSSettings_descriptor,
        new java.lang.String[] { "NextRotationTime", "RotationPeriod", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_IL4Settings_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_IL4Settings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_IL4Settings_descriptor,
        new java.lang.String[] { "KmsSettings", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_CJISSettings_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_CJISSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_CJISSettings_descriptor,
        new java.lang.String[] { "KmsSettings", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampHighSettings_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampHighSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampHighSettings_descriptor,
        new java.lang.String[] { "KmsSettings", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampModerateSettings_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampModerateSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_FedrampModerateSettings_descriptor,
        new java.lang.String[] { "KmsSettings", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceSettings_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_ResourceSettings_descriptor,
        new java.lang.String[] { "ResourceId", "ResourceType", });
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_LabelsEntry_descriptor =
      internal_static_google_cloud_assuredworkloads_v1beta1_Workload_descriptor.getNestedTypes().get(7);
    internal_static_google_cloud_assuredworkloads_v1beta1_Workload_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_Workload_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadOperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "DisplayName", "Parent", "ComplianceRegime", });
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
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
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
