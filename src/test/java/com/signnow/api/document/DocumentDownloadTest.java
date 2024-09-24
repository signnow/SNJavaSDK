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
import com.signnow.api.document.request.DocumentDownloadGetRequest;
import com.signnow.api.document.response.DocumentDownloadGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentDownloadTest extends BaseTest {

  private ApiClient apiClient;

  private SignNowFaker faker;

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
  public void testGetDocumentDownload() {
    DocumentDownloadGetRequest request = new DocumentDownloadGetRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentDownloadGetResponse response =
              (DocumentDownloadGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentDownloadGetResponse should not be null.");
        },
        "Sending DocumentDownloadGetRequest should not throw any exception.");
  }
}
