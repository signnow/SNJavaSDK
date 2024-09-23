/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentinvite.request.SendInvitePostRequest;
import com.signnow.api.documentinvite.response.SendInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SendInviteTest extends BaseTest {

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
  public void testPostSendInvite() {
    expectation = this.expectation("send_field_invite", "post");

    SendInvitePostRequest request =
        new SendInvitePostRequest(
            faker.documentId(),
            faker.documentInviteSendInviteTo(),
            faker.from(),
            faker.subject(),
            faker.message(),
            faker.documentInviteSendInviteEmailGroups(),
            faker.documentInviteSendInviteCc(),
            faker.documentInviteSendInviteCcStep(),
            faker.documentInviteSendInviteViewers(),
            faker.ccSubject(),
            faker.ccMessage());

    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          SendInvitePostResponse response = (SendInvitePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "SendInvitePostResponse should not be null.");

          this.assertSame(expectation.get("status"), response.getStatus());
        },
        "Sending SendInvitePostRequest should not throw any exception.");
  }
}
