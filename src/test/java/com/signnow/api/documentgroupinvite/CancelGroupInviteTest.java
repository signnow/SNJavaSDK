/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentgroupinvite.request.CancelGroupInvitePostRequest;
import com.signnow.api.documentgroupinvite.response.CancelGroupInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CancelGroupInviteTest extends BaseTest {

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
  public void testPostCancelGroupInvite() {
    expectation = this.expectation("cancel_document_group_invite", "post");

    CancelGroupInvitePostRequest request = new CancelGroupInvitePostRequest();
    request.withDocumentGroupId(faker.documentGroupId());
    request.withInviteId(faker.inviteId());

    assertDoesNotThrow(
        () -> {
          CancelGroupInvitePostResponse response =
              (CancelGroupInvitePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "CancelGroupInvitePostResponse should not be null.");
          this.assertSame(expectation.get("status"), response.getStatus());
        },
        "Sending CancelGroupInvitePostRequest should not throw any exception.");
  }
}
