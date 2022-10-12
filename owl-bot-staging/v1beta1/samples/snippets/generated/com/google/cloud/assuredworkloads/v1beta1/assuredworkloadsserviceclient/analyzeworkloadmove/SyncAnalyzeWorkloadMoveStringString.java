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

package com.google.cloud.assuredworkloads.v1beta1.samples;

// [START assuredworkloads_v1beta1_generated_assuredworkloadsserviceclient_analyzeworkloadmove_stringstring_sync]
import com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse;
import com.google.cloud.assuredworkloads.v1beta1.AssuredWorkloadsServiceClient;

public class SyncAnalyzeWorkloadMoveStringString {

  public static void main(String[] args) throws Exception {
    syncAnalyzeWorkloadMoveStringString();
  }

  public static void syncAnalyzeWorkloadMoveStringString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AssuredWorkloadsServiceClient assuredWorkloadsServiceClient =
        AssuredWorkloadsServiceClient.create()) {
      String project = "project-309310695";
      String target = "target-880905839";
      AnalyzeWorkloadMoveResponse response =
          assuredWorkloadsServiceClient.analyzeWorkloadMove(project, target);
    }
  }
}
// [END assuredworkloads_v1beta1_generated_assuredworkloadsserviceclient_analyzeworkloadmove_stringstring_sync]
