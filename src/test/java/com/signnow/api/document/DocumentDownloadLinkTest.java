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
import com.signnow.api.document.request.DocumentDownloadLinkPostRequest;
import com.signnow.api.document.response.DocumentDownloadLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentDownloadLinkTest extends BaseTest {

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
  public void testPostDocumentDownloadLink() {
    expectation = this.expectation("create_document_download_link", "post");

    DocumentDownloadLinkPostRequest request = new DocumentDownloadLinkPostRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentDownloadLinkPostResponse response =
              (DocumentDownloadLinkPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentDownloadLinkPostResponse should not be null.");
          assertNotNull(response.getLink(), "Link should not be null.");
          this.assertSame(expectation.get("link"), response.getLink());
        },
        "Sending DocumentDownloadLinkPostRequest should not throw any exception.");
  }
}
