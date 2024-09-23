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
import com.signnow.api.documentgroup.request.DownloadDocumentGroupPostRequest;
import com.signnow.api.documentgroup.response.DownloadDocumentGroupPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DownloadDocumentGroupTest extends BaseTest {

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
  public void testPostDownloadDocumentGroup() {
    DownloadDocumentGroupPostRequest request =
        new DownloadDocumentGroupPostRequest(
            faker.type(),
            faker.withHistory(),
            faker.documentGroupDownloadDocumentGroupDocumentOrder());
    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          DownloadDocumentGroupPostResponse response =
              (DownloadDocumentGroupPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DownloadDocumentGroupPostResponse should not be null.");
        },
        "Sending DownloadDocumentGroupPostRequest should not throw any exception.");
  }
}
