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
import com.signnow.api.embeddedgroupinvite.request.GroupInviteLinkPostRequest;
import com.signnow.api.embeddedgroupinvite.response.GroupInviteLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmbeddedGroupInviteLinkTest extends BaseTest {

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
  public void testPostGroupInviteLink() {
    expectation = this.expectation("create_link_for_embedded_invite_document_group", "post");

    GroupInviteLinkPostRequest request =
        new GroupInviteLinkPostRequest(faker.email(), faker.authMethod(), faker.linkExpiration());
    request.withDocumentGroupId(faker.documentGroupId());
    request.withEmbeddedInviteId(faker.embeddedInviteId());

    assertDoesNotThrow(
        () -> {
          GroupInviteLinkPostResponse response =
              (GroupInviteLinkPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "GroupInviteLinkPostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending GroupInviteLinkPostRequest should not throw any exception.");
  }
}
