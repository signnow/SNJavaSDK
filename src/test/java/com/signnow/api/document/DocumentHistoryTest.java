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
import com.signnow.api.document.request.DocumentHistoryGetRequest;
import com.signnow.api.document.response.DocumentHistoryGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentHistoryTest extends BaseTest {

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
  public void testGetDocumentHistory() {
    expectation = this.expectation("get_document_history_full", "get");

    DocumentHistoryGetRequest request = new DocumentHistoryGetRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentHistoryGetResponse response =
              (DocumentHistoryGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentHistoryGetResponse should not be null.");

          this.assertSame(expectation.get("unique_id"), response.getUniqueId());
          this.assertSame(expectation.get("user_id"), response.getUserId());
          this.assertSame(expectation.get("document_id"), response.getDocumentId());
          this.assertSame(expectation.get("client_app_name"), response.getClientAppName());
          this.assertSame(expectation.get("ip_address"), response.getIpAddress());
          this.assertSame(expectation.get("email"), response.getEmail());
          this.assertSame(expectation.get("field_id"), response.getFieldId());
          this.assertSame(expectation.get("element_id"), response.getElementId());
          this.assertSame(expectation.get("json_attributes"), response.getJsonAttributes());
          this.assertSame(expectation.get("client_timestamp"), response.getClientTimestamp());
          this.assertSame(expectation.get("created"), response.getCreated());
          this.assertSame(expectation.get("origin"), response.getOrigin());
          this.assertSame(expectation.get("event"), response.getEvent());
        },
        "Sending DocumentHistoryGetRequest should not throw any exception.");
  }
}
