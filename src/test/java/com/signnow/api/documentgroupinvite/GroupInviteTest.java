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
import com.signnow.api.documentgroupinvite.request.GroupInviteGetRequest;
import com.signnow.api.documentgroupinvite.request.GroupInvitePostRequest;
import com.signnow.api.documentgroupinvite.response.GroupInviteGetResponse;
import com.signnow.api.documentgroupinvite.response.GroupInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupInviteTest extends BaseTest {

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
  public void testPostGroupInvite() {
    expectation = this.expectation("invite_to_sign_document_group", "post");

    GroupInvitePostRequest request =
        new GroupInvitePostRequest(
            faker.documentGroupInviteGroupInviteInviteSteps(),
            faker.documentGroupInviteGroupInviteCc(),
            faker.documentGroupInviteGroupInviteEmailGroups(),
            faker.documentGroupInviteGroupInviteCompletionEmails(),
            faker.booleanValue(),
            faker.clientTimestamp(),
            faker.ccSubject(),
            faker.ccMessage());
    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          GroupInvitePostResponse response = (GroupInvitePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "GroupInvitePostResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("pending_invite_link"), response.getPendingInviteLink());
        },
        "Sending GroupInvitePostRequest should not throw any exception.");
  }

  @Test
  public void testGetGroupInvite() {
    expectation = this.expectation("get_document_group_invite", "get");

    GroupInviteGetRequest request = new GroupInviteGetRequest();
    request.withDocumentGroupId(faker.documentGroupId());
    request.withInviteId(faker.inviteId());

    assertDoesNotThrow(
        () -> {
          GroupInviteGetResponse response = (GroupInviteGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "GroupInviteGetResponse should not be null.");
          assertNotNull(response.getInvite(), "Invite should not be null.");

          this.assertSame(expectation.get("invite"), response.getInvite());
        },
        "Sending GroupInviteGetRequest should not throw any exception.");
  }
}
