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
import com.signnow.api.documentinvite.request.SigningLinkPostRequest;
import com.signnow.api.documentinvite.response.SigningLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SigningLinkTest extends BaseTest {

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
  public void testPostSigningLink() {
    expectation = this.expectation("create_signing_link", "post");

    SigningLinkPostRequest request =
        new SigningLinkPostRequest(faker.documentId(), faker.redirectUri());

    assertDoesNotThrow(
        () -> {
          SigningLinkPostResponse response = (SigningLinkPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "SigningLinkPostResponse should not be null.");
          assertInstanceOf(SigningLinkPostResponse.class, response);
          assertInstanceOf(String.class, response.getUrl());
          assertNotNull(response.getUrlNoSignup());

          this.assertSame(expectation.get("url"), response.getUrl());
          this.assertSame(expectation.get("url_no_signup"), response.getUrlNoSignup());
        },
        "Sending SigningLinkPostRequest should not throw any exception.");
  }
}
