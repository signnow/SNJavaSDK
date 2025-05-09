/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.template.request.RoutingDetailsGetRequest;
import com.signnow.api.template.request.RoutingDetailsPostRequest;
import com.signnow.api.template.request.RoutingDetailsPutRequest;
import com.signnow.api.template.response.RoutingDetailsGetResponse;
import com.signnow.api.template.response.RoutingDetailsPostResponse;
import com.signnow.api.template.response.RoutingDetailsPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoutingDetailsTest extends BaseTest {

  private ApiClient apiClient;

  private SignNowFaker faker;

  private Expectation expectation;

  @BeforeEach
  public void setUp() {
    try {
      apiClient = this.client();
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }
    faker = this.faker();
  }

  @Test
  public void testPostRoutingDetails() {
    expectation = this.expectation("create_routing_details", "post");

    RoutingDetailsPostRequest request = new RoutingDetailsPostRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          RoutingDetailsPostResponse response =
              (RoutingDetailsPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "RoutingDetailsPostResponse should not be null.");

          this.assertSame(expectation.get("routing_details"), response.getRoutingDetails());
          this.assertSame(expectation.get("cc"), response.getCc());
          this.assertSame(expectation.get("cc_step"), response.getCcStep());
          this.assertSame(expectation.get("viewers"), response.getViewers());
          this.assertSame(expectation.get("approvers"), response.getApprovers());
          this.assertSame(
              expectation.get("invite_link_instructions"), response.getInviteLinkInstructions());
        },
        "Sending RoutingDetailsPostRequest should not throw any exception.");
  }

  @Test
  public void testPutRoutingDetails() {
    expectation = this.expectation("update_routing_details", "put");

    RoutingDetailsPutRequest request =
        new RoutingDetailsPutRequest(
            faker.templateRoutingDetailsTemplateData(),
            faker.templateRoutingDetailsTemplateDataObject(),
            faker.templateRoutingDetailsCc(),
            faker.templateRoutingDetailsCcStep(),
            faker.templateRoutingDetailsViewers(),
            faker.templateRoutingDetailsApprovers(),
            faker.templateRoutingDetailsInviteLinkInstructions());
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          RoutingDetailsPutResponse response = (RoutingDetailsPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "RoutingDetailsPutResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("document_id"), response.getDocumentId());
          this.assertSame(expectation.get("data"), response.getData());
          this.assertSame(expectation.get("cc"), response.getCc());
          this.assertSame(expectation.get("cc_step"), response.getCcStep());
          this.assertSame(expectation.get("viewers"), response.getViewers());
          this.assertSame(expectation.get("approvers"), response.getApprovers());
          this.assertSame(
              expectation.get("invite_link_instructions"), response.getInviteLinkInstructions());
        },
        "Sending RoutingDetailsPutRequest should not throw any exception.");
  }

  @Test
  public void testGetRoutingDetails() {
    expectation = this.expectation("get_routing_details", "get");

    RoutingDetailsGetRequest request = new RoutingDetailsGetRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          RoutingDetailsGetResponse response = (RoutingDetailsGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "RoutingDetailsGetResponse should not be null.");

          this.assertSame(expectation.get("routing_details"), response.getRoutingDetails());
          this.assertSame(expectation.get("cc"), response.getCc());
          this.assertSame(expectation.get("cc_step"), response.getCcStep());
          this.assertSame(expectation.get("viewers"), response.getViewers());
          this.assertSame(expectation.get("approvers"), response.getApprovers());
          this.assertSame(expectation.get("attributes"), response.getAttributes());
          this.assertSame(
              expectation.get("invite_link_instructions"), response.getInviteLinkInstructions());
        },
        "Sending RoutingDetailsGetRequest should not throw any exception.");
  }
}
