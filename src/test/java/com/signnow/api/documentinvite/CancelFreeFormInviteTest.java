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
import com.signnow.api.documentinvite.request.CancelFreeFormInvitePutRequest;
import com.signnow.api.documentinvite.response.CancelFreeFormInvitePutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CancelFreeFormInviteTest extends BaseTest {

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
  public void testPutCancelFreeFormInvite() {
    expectation = this.expectation("cancel_free_form_invite", "put");

    CancelFreeFormInvitePutRequest request = new CancelFreeFormInvitePutRequest(faker.reason());
    request.withInviteId(faker.inviteId());

    assertDoesNotThrow(
        () -> {
          CancelFreeFormInvitePutResponse response =
              (CancelFreeFormInvitePutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "CancelFreeFormInvitePutResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
        },
        "Sending CancelFreeFormInvitePutRequest should not throw any exception.");
  }
}
