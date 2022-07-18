// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads_service.proto

package com.google.cloud.assuredworkloads.v1beta1;

public final class AssuredworkloadsServiceProto {
  private AssuredworkloadsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/cloud/assuredworkloads/v1beta1/" +
      "assuredworkloads_service.proto\022%google.c" +
      "loud.assuredworkloads.v1beta1\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032<google/cloud/assuredworkloads/v1be" +
      "ta1/assuredworkloads.proto\032#google/longr" +
      "unning/operations.proto\032\033google/protobuf" +
      "/empty.proto2\217\r\n\027AssuredWorkloadsService" +
      "\022\371\001\n\016CreateWorkload\022<.google.cloud.assur" +
      "edworkloads.v1beta1.CreateWorkloadReques" +
      "t\032\035.google.longrunning.Operation\"\211\001\202\323\344\223\002" +
      "C\"7/v1beta1/{parent=organizations/*/loca" +
      "tions/*}/workloads:\010workload\332A\017parent,wo" +
      "rkload\312A+\n\010Workload\022\037CreateWorkloadOpera" +
      "tionMetadata\022\352\001\n\016UpdateWorkload\022<.google" +
      ".cloud.assuredworkloads.v1beta1.UpdateWo" +
      "rkloadRequest\032/.google.cloud.assuredwork" +
      "loads.v1beta1.Workload\"i\202\323\344\223\002L2@/v1beta1" +
      "/{workload.name=organizations/*/location" +
      "s/*/workloads/*}:\010workload\332A\024workload,up" +
      "date_mask\022\252\001\n\027RestrictAllowedServices\022E." +
      "google.cloud.assuredworkloads.v1beta1.Re" +
      "strictAllowedServicesRequest\032F.google.cl" +
      "oud.assuredworkloads.v1beta1.RestrictAll" +
      "owedServicesResponse\"\000\022\210\002\n\030RestrictAllow" +
      "edResources\022F.google.cloud.assuredworklo" +
      "ads.v1beta1.RestrictAllowedResourcesRequ" +
      "est\032G.google.cloud.assuredworkloads.v1be" +
      "ta1.RestrictAllowedResourcesResponse\"[\202\323" +
      "\344\223\002U\"P/v1beta1/{name=organizations/*/loc" +
      "ations/*/workloads/*}:restrictAllowedRes" +
      "ources:\001*\022\256\001\n\016DeleteWorkload\022<.google.cl" +
      "oud.assuredworkloads.v1beta1.DeleteWorkl" +
      "oadRequest\032\026.google.protobuf.Empty\"F\202\323\344\223" +
      "\0029*7/v1beta1/{name=organizations/*/locat" +
      "ions/*/workloads/*}\332A\004name\022\202\001\n\013GetWorklo" +
      "ad\0229.google.cloud.assuredworkloads.v1bet" +
      "a1.GetWorkloadRequest\032/.google.cloud.ass" +
      "uredworkloads.v1beta1.Workload\"\007\332A\004name\022" +
      "\257\001\n\023AnalyzeWorkloadMove\022A.google.cloud.a" +
      "ssuredworkloads.v1beta1.AnalyzeWorkloadM" +
      "oveRequest\032B.google.cloud.assuredworkloa" +
      "ds.v1beta1.AnalyzeWorkloadMoveResponse\"\021" +
      "\332A\016project,target\022\225\001\n\rListWorkloads\022;.go" +
      "ogle.cloud.assuredworkloads.v1beta1.List" +
      "WorkloadsRequest\032<.google.cloud.assuredw" +
      "orkloads.v1beta1.ListWorkloadsResponse\"\t" +
      "\332A\006parent\032S\312A\037assuredworkloads.googleapi" +
      "s.com\322A.https://www.googleapis.com/auth/" +
      "cloud-platformB\235\002\n)com.google.cloud.assu" +
      "redworkloads.v1beta1B\034AssuredworkloadsSe" +
      "rviceProtoP\001ZUgoogle.golang.org/genproto" +
      "/googleapis/cloud/assuredworkloads/v1bet" +
      "a1;assuredworkloads\252\002%Google.Cloud.Assur" +
      "edWorkloads.V1Beta1\312\002%Google\\Cloud\\Assur" +
      "edWorkloads\\V1beta1\352\002(Google::Cloud::Ass" +
      "uredWorkloads::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
