/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.embeddedgroupinvite.request.GroupInviteDeleteRequest;
import com.signnow.api.embeddedgroupinvite.request.GroupInvitePostRequest;
import com.signnow.api.embeddedgroupinvite.response.GroupInviteDeleteResponse;
import com.signnow.api.embeddedgroupinvite.response.GroupInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmbeddedGroupInviteTest extends BaseTest {

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
    expectation = this.expectation("create_embedded_invite_for_document_group", "post");

    GroupInvitePostRequest request =
        new GroupInvitePostRequest(
            faker.embeddedGroupInviteGroupInviteInvites(), faker.booleanValue());
    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          GroupInvitePostResponse response = (GroupInvitePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "GroupInvitePostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending GroupInvitePostRequest should not throw any exception.");
  }

  @Test
  public void testDeleteGroupInvite() {
    GroupInviteDeleteRequest request = new GroupInviteDeleteRequest();
    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          GroupInviteDeleteResponse response = (GroupInviteDeleteResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "GroupInviteDeleteResponse should not be null.");
        },
        "Sending GroupInviteDeleteRequest should not throw any exception.");
  }
}
