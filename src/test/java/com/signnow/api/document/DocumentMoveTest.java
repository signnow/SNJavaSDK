/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.document.request.DocumentMovePostRequest;
import com.signnow.api.document.response.DocumentMovePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentMoveTest extends BaseTest {

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
  public void testPostDocumentMove() {
    expectation = this.expectation("move_document", "post");

    DocumentMovePostRequest request = new DocumentMovePostRequest(faker.folderId());
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentMovePostResponse response = (DocumentMovePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentMovePostResponse should not be null.");
          this.assertSame(expectation.get("result"), response.getResult());
        },
        "Sending DocumentMovePostRequest should not throw any exception.");
  }
}
