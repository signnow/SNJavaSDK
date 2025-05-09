/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedsending;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import com.signnow.BaseTest;
import com.signnow.api.embeddedsending.request.DocumentEmbeddedSendingLinkPostRequest;
import com.signnow.api.embeddedsending.response.DocumentEmbeddedSendingLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentEmbeddedSendingLinkTest extends BaseTest {

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
  public void testPostDocumentEmbeddedSendingLink() {
    expectation = this.expectation("create_document_embedded_sending_link", "post");

    DocumentEmbeddedSendingLinkPostRequest request =
        new DocumentEmbeddedSendingLinkPostRequest(
            faker.type(), faker.redirectUri(), faker.linkExpiration(), faker.redirectTarget());

    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentEmbeddedSendingLinkPostResponse response =
              (DocumentEmbeddedSendingLinkPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentEmbeddedSendingLinkPostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentEmbeddedSendingLinkPostRequest should not throw any exception.");
  }
}
