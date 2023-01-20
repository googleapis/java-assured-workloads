/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.assuredworkloads.v1.stub;

import static com.google.cloud.assuredworkloads.v1.AssuredWorkloadsServiceClient.ListViolationsPagedResponse;
import static com.google.cloud.assuredworkloads.v1.AssuredWorkloadsServiceClient.ListWorkloadsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest;
import com.google.cloud.assuredworkloads.v1.AcknowledgeViolationResponse;
import com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata;
import com.google.cloud.assuredworkloads.v1.CreateWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.DeleteWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.GetViolationRequest;
import com.google.cloud.assuredworkloads.v1.GetWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.ListViolationsRequest;
import com.google.cloud.assuredworkloads.v1.ListViolationsResponse;
import com.google.cloud.assuredworkloads.v1.ListWorkloadsRequest;
import com.google.cloud.assuredworkloads.v1.ListWorkloadsResponse;
import com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest;
import com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesResponse;
import com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.Violation;
import com.google.cloud.assuredworkloads.v1.Workload;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the AssuredWorkloadsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class AssuredWorkloadsServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public OperationCallable<CreateWorkloadRequest, Workload, CreateWorkloadOperationMetadata>
      createWorkloadOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createWorkloadOperationCallable()");
  }

  public UnaryCallable<CreateWorkloadRequest, Operation> createWorkloadCallable() {
    throw new UnsupportedOperationException("Not implemented: createWorkloadCallable()");
  }

  public UnaryCallable<UpdateWorkloadRequest, Workload> updateWorkloadCallable() {
    throw new UnsupportedOperationException("Not implemented: updateWorkloadCallable()");
  }

  public UnaryCallable<RestrictAllowedResourcesRequest, RestrictAllowedResourcesResponse>
      restrictAllowedResourcesCallable() {
    throw new UnsupportedOperationException("Not implemented: restrictAllowedResourcesCallable()");
  }

  public UnaryCallable<DeleteWorkloadRequest, Empty> deleteWorkloadCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteWorkloadCallable()");
  }

  public UnaryCallable<GetWorkloadRequest, Workload> getWorkloadCallable() {
    throw new UnsupportedOperationException("Not implemented: getWorkloadCallable()");
  }

  public UnaryCallable<ListWorkloadsRequest, ListWorkloadsPagedResponse>
      listWorkloadsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listWorkloadsPagedCallable()");
  }

  public UnaryCallable<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloadsCallable() {
    throw new UnsupportedOperationException("Not implemented: listWorkloadsCallable()");
  }

  public UnaryCallable<ListViolationsRequest, ListViolationsPagedResponse>
      listViolationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listViolationsPagedCallable()");
  }

  public UnaryCallable<ListViolationsRequest, ListViolationsResponse> listViolationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listViolationsCallable()");
  }

  public UnaryCallable<GetViolationRequest, Violation> getViolationCallable() {
    throw new UnsupportedOperationException("Not implemented: getViolationCallable()");
  }

  public UnaryCallable<AcknowledgeViolationRequest, AcknowledgeViolationResponse>
      acknowledgeViolationCallable() {
    throw new UnsupportedOperationException("Not implemented: acknowledgeViolationCallable()");
  }

  @Override
  public abstract void close();
}
