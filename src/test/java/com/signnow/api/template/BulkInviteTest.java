/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.template.request.BulkInvitePostRequest;
import com.signnow.api.template.response.BulkInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BulkInviteTest extends BaseTest {

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
  public void testPostBulkInvite() {
    expectation = this.expectation("bulk_invite", "post");

    BulkInvitePostRequest request =
        new BulkInvitePostRequest(
            faker.file(),
            faker.folderId(),
            faker.clientTimestamp(),
            faker.documentName(),
            faker.subject(),
            faker.emailMessage());
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          BulkInvitePostResponse response = (BulkInvitePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "BulkInvitePostResponse should not be null.");

          this.assertSame(expectation.get("status"), response.getStatus());
        },
        "Sending BulkInvitePostRequest should not throw any exception.");
  }
}
