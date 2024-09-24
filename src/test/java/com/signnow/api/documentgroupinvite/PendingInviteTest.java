/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.documentgroupinvite;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentgroupinvite.request.PendingInviteGetRequest;
import com.signnow.api.documentgroupinvite.response.PendingInviteGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PendingInviteTest extends BaseTest {

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
  public void testGetPendingInvite() {
    expectation = this.expectation("get_pending_document_group_invites", "get");

    PendingInviteGetRequest request = new PendingInviteGetRequest();
    request.withDocumentGroupId(faker.documentGroupId());
    request.withInviteId(faker.inviteId());

    assertDoesNotThrow(
        () -> {
          PendingInviteGetResponse response = (PendingInviteGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "PendingInviteGetResponse should not be null.");

          this.assertSame(expectation.get("invites"), response.getInvites());
          this.assertSame(expectation.get("document_group_name"), response.getDocumentGroupName());
        },
        "Sending PendingInviteGetRequest should not throw any exception.");
  }
}
