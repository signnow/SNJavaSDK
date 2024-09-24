/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.auth;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.auth.request.TokenGetRequest;
import com.signnow.api.auth.request.TokenPostRequest;
import com.signnow.api.auth.response.TokenGetResponse;
import com.signnow.api.auth.response.TokenPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TokenTest extends BaseTest {

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
  public void testPostToken() {
    expectation = this.expectation("generate_access_token", "post");

    TokenPostRequest request =
        new TokenPostRequest(
            faker.username(),
            faker.password(),
            faker.grantType("password"),
            faker.scope(),
            faker.code());

    assertDoesNotThrow(
        () -> {
          TokenPostResponse response = (TokenPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "TokenPostResponse should not be null.");

          this.assertSame(expectation.get("expires_in"), response.getExpiresIn());
          this.assertSame(expectation.get("token_type"), response.getTokenType());
          this.assertSame(expectation.get("access_token"), response.getAccessToken());
          this.assertSame(expectation.get("refresh_token"), response.getRefreshToken());
          this.assertSame(expectation.get("scope"), response.getScope());
          this.assertSame(expectation.get("last_login"), response.getLastLogin());
        },
        "Sending TokenPostRequest should not throw any exception.");
  }

  @Test
  public void testGetToken() {
    expectation = this.expectation("verify_access_token", "get");

    TokenGetRequest request = new TokenGetRequest();

    assertDoesNotThrow(
        () -> {
          TokenGetResponse response = (TokenGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "TokenGetResponse should not be null.");

          this.assertSame(expectation.get("access_token"), response.getAccessToken());
          this.assertSame(expectation.get("scope"), response.getScope());
          this.assertSame(expectation.get("expires_in"), response.getExpiresIn());
          this.assertSame(expectation.get("token_type"), response.getTokenType());
        },
        "Sending TokenGetRequest should not throw any exception.");
  }
}
