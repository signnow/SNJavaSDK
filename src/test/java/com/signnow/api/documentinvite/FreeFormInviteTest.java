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
import com.signnow.api.documentinvite.request.FreeFormInviteGetRequest;
import com.signnow.api.documentinvite.request.FreeFormInvitePostRequest;
import com.signnow.api.documentinvite.response.FreeFormInviteGetResponse;
import com.signnow.api.documentinvite.response.FreeFormInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FreeFormInviteTest extends BaseTest {

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
  public void testPostFreeFormInvite() {
    expectation = this.expectation("create_free_form_invite", "post");

    FreeFormInvitePostRequest request =
        new FreeFormInvitePostRequest(
            faker.to(),
            faker.from(),
            faker.documentInviteFreeFormInviteCc(),
            faker.subject(),
            faker.message(),
            faker.ccSubject(),
            faker.ccMessage(),
            faker.language(),
            faker.clientTimestamp(),
            faker.callbackUrl(),
            faker.booleanValue(),
            faker.redirectUri(),
            faker.closeRedirectUri(),
            faker.redirectTarget());
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          FreeFormInvitePostResponse response =
              (FreeFormInvitePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "FreeFormInvitePostResponse should not be null.");

          this.assertSame(expectation.get("result"), response.getResult());
          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("callback_url"), response.getCallbackUrl());
        },
        "Sending FreeFormInvitePostRequest should not throw any exception.");
  }

  @Test
  public void testGetFreeFormInvite() {
    expectation = this.expectation("get_document_free_form_invites", "get");

    FreeFormInviteGetRequest request = new FreeFormInviteGetRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          FreeFormInviteGetResponse response = (FreeFormInviteGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "FreeFormInviteGetResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
          this.assertSame(expectation.get("meta"), response.getMeta());
        },
        "Sending FreeFormInviteGetRequest should not throw any exception.");
  }
}
