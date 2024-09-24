/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.smartfields;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.smartfields.request.DocumentPrefillSmartFieldPostRequest;
import com.signnow.api.smartfields.response.DocumentPrefillSmartFieldPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentPrefillSmartFieldTest extends BaseTest {

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
  public void testPostDocumentPrefillSmartField() {
    expectation = this.expectation("prefill_smart_fields", "post");

    DocumentPrefillSmartFieldPostRequest request =
        new DocumentPrefillSmartFieldPostRequest(
            faker.smartFieldsDocumentPrefillSmartFieldData(), faker.clientTimestampString());

    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentPrefillSmartFieldPostResponse response =
              (DocumentPrefillSmartFieldPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentPrefillSmartFieldPostResponse should not be null.");
          assertEquals(expectation.get("status"), response.getStatus());
        },
        "Sending DocumentPrefillSmartFieldPostRequest should not throw any exception.");
  }
}
