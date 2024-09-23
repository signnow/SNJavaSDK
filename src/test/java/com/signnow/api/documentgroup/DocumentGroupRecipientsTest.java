/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentgroup.request.DocumentGroupRecipientsGetRequest;
import com.signnow.api.documentgroup.response.DocumentGroupRecipientsGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentGroupRecipientsTest extends BaseTest {

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
  public void testGetDocumentGroupRecipients() {
    expectation = this.expectation("get_document_group_recipients", "get");

    DocumentGroupRecipientsGetRequest request = new DocumentGroupRecipientsGetRequest();
    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          DocumentGroupRecipientsGetResponse response =
              (DocumentGroupRecipientsGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentGroupRecipientsGetResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentGroupRecipientsGetRequest should not throw any exception.");
  }
}
