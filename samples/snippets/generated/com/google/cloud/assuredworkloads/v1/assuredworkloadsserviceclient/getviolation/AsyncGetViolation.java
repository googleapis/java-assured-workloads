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

package com.google.cloud.assuredworkloads.v1.samples;

// [START assuredworkloads_v1_generated_assuredworkloadsserviceclient_getviolation_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.assuredworkloads.v1.AssuredWorkloadsServiceClient;
import com.google.cloud.assuredworkloads.v1.GetViolationRequest;
import com.google.cloud.assuredworkloads.v1.Violation;
import com.google.cloud.assuredworkloads.v1.ViolationName;

public class AsyncGetViolation {

  public static void main(String[] args) throws Exception {
    asyncGetViolation();
  }

  public static void asyncGetViolation() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AssuredWorkloadsServiceClient assuredWorkloadsServiceClient =
        AssuredWorkloadsServiceClient.create()) {
      GetViolationRequest request =
          GetViolationRequest.newBuilder()
              .setName(
                  ViolationName.of("[ORGANIZATION]", "[LOCATION]", "[WORKLOAD]", "[VIOLATION]")
                      .toString())
              .build();
      ApiFuture<Violation> future =
          assuredWorkloadsServiceClient.getViolationCallable().futureCall(request);
      // Do something.
      Violation response = future.get();
    }
  }
}
// [END assuredworkloads_v1_generated_assuredworkloadsserviceclient_getviolation_async]
