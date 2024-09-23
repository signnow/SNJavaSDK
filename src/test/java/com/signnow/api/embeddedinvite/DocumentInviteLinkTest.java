/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.embeddedinvite.request.DocumentInviteLinkPostRequest;
import com.signnow.api.embeddedinvite.response.DocumentInviteLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentInviteLinkTest extends BaseTest {

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
  public void testPostDocumentInviteLink() {
    expectation = this.expectation("create_link_for_embedded_invite", "post");

    DocumentInviteLinkPostRequest request =
        new DocumentInviteLinkPostRequest(faker.authMethod(), faker.linkExpiration());
    request.withDocumentId(faker.documentId());
    request.withFieldInviteId(faker.fieldInviteId());

    assertDoesNotThrow(
        () -> {
          DocumentInviteLinkPostResponse response =
              (DocumentInviteLinkPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentInviteLinkPostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentInviteLinkPostRequest should not throw any exception.");
  }
}
