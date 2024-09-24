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
import com.signnow.api.document.request.FieldExtractPostRequest;
import com.signnow.api.document.response.FieldExtractPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FieldExtractTest extends BaseTest {

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
  public void testPostFieldExtract() {
    expectation = this.expectation("upload_document_with_tags_extract", "post");

    FieldExtractPostRequest request =
        new FieldExtractPostRequest(
            faker.file(),
            faker.documentFieldExtractTags(),
            faker.parseType(),
            faker.password(),
            faker.clientTimestamp());

    assertDoesNotThrow(
        () -> {
          FieldExtractPostResponse response = (FieldExtractPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "FieldExtractPostResponse should not be null.");
          this.assertSame(expectation.get("id"), response.getId());
        },
        "Sending FieldExtractPostRequest should not throw any exception.");
  }
}
