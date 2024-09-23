/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentinvite.request.CancelInvitePutRequest;
import com.signnow.api.documentinvite.response.CancelInvitePutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CancelInviteTest extends BaseTest {

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
  public void testPutCancelInvite() {
    expectation = this.expectation("cancel_invite", "put");

    CancelInvitePutRequest request = new CancelInvitePutRequest(faker.reason());
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          CancelInvitePutResponse response = (CancelInvitePutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "CancelInvitePutResponse should not be null.");
          assertInstanceOf(
              CancelInvitePutResponse.class,
              response,
              "Response should be an instance of CancelInvitePutResponse.");

          this.assertSame(expectation.get("status"), response.getStatus());
        },
        "Sending CancelInvitePutRequest should not throw any exception.");
  }
}
