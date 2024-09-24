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
import com.signnow.api.document.request.DocumentMergePostRequest;
import com.signnow.api.document.response.DocumentMergePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentMergeTest extends BaseTest {

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
  public void testPostDocumentMerge() {
    expectation = this.expectation("merge_documents", "post");

    DocumentMergePostRequest request =
        new DocumentMergePostRequest(
            faker.name(), faker.documentDocumentMergeDocumentIds(), faker.booleanValue());

    assertDoesNotThrow(
        () -> {
          DocumentMergePostResponse response = (DocumentMergePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentMergePostResponse should not be null.");
          this.assertSame(expectation.get("document_id"), response.getDocumentId());
        },
        "Sending DocumentMergePostRequest should not throw any exception.");
  }
}
