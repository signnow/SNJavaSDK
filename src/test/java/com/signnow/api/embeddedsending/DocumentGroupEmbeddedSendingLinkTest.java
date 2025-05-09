/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.embeddedsending;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import com.signnow.BaseTest;
import com.signnow.api.embeddedsending.request.DocumentGroupEmbeddedSendingLinkPostRequest;
import com.signnow.api.embeddedsending.response.DocumentGroupEmbeddedSendingLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentGroupEmbeddedSendingLinkTest extends BaseTest {

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
  public void testPostDocumentGroupEmbeddedSendingLink() {
    expectation = this.expectation("create_document_group_embedded_sending_link", "post");

    DocumentGroupEmbeddedSendingLinkPostRequest request =
        new DocumentGroupEmbeddedSendingLinkPostRequest(
            faker.redirectUri(), faker.linkExpiration(), faker.redirectTarget());

    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          DocumentGroupEmbeddedSendingLinkPostResponse response =
              (DocumentGroupEmbeddedSendingLinkPostResponse) apiClient.send(request).getResponse();
          ;

          assertNotNull(
              response, "DocumentGroupEmbeddedSendingLinkPostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentGroupEmbeddedSendingLinkPostRequest should not throw any exception.");
  }
}
