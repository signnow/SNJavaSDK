/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.embeddedinvite.request.DocumentInviteDeleteRequest;
import com.signnow.api.embeddedinvite.request.DocumentInvitePostRequest;
import com.signnow.api.embeddedinvite.response.DocumentInviteDeleteResponse;
import com.signnow.api.embeddedinvite.response.DocumentInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentInviteTest extends BaseTest {

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
  public void testPostDocumentInvite() {
    expectation = this.expectation("create_embedded_invite", "post");

    DocumentInvitePostRequest request =
        new DocumentInvitePostRequest(
            faker.embeddedInviteDocumentInviteInvites(), faker.nameFormula());
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentInvitePostResponse response =
              (DocumentInvitePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentInvitePostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentInvitePostRequest should not throw any exception.");
  }

  @Test
  public void testDeleteDocumentInvite() {
    DocumentInviteDeleteRequest request = new DocumentInviteDeleteRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentInviteDeleteResponse response =
              (DocumentInviteDeleteResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentInviteDeleteResponse should not be null.");
        },
        "Sending DocumentInviteDeleteRequest should not throw any exception.");
  }
}
