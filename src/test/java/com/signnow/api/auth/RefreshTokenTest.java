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
import com.signnow.api.auth.request.RefreshTokenPostRequest;
import com.signnow.api.auth.response.RefreshTokenPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RefreshTokenTest extends BaseTest {

  private ApiClient apiClient;

  private SignNowFaker faker;

  private Expectation expectation;

  @BeforeEach
  public void setUp() {
    try {
      this.apiClient = this.client();
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }
    this.faker = this.faker();
    this.expectation = this.expectation("refresh_access_token", "post");
  }

  @Test
  public void testPostRefreshToken() {
    RefreshTokenPostRequest request =
        new RefreshTokenPostRequest(
            faker.refreshToken(),
            faker.scope(),
            faker.expirationTime(),
            faker.grantType("refresh_token"));

    assertDoesNotThrow(
        () -> {
          RefreshTokenPostResponse response = (RefreshTokenPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "RefreshTokenPostResponse should not be null.");

          this.assertSame(this.expectation.get("expires_in"), response.getExpiresIn());
          this.assertSame(this.expectation.get("token_type"), response.getTokenType());
          this.assertSame(this.expectation.get("access_token"), response.getAccessToken());
          this.assertSame(this.expectation.get("refresh_token"), response.getRefreshToken());
          this.assertSame(this.expectation.get("scope"), response.getScope());
          this.assertSame(this.expectation.get("last_login"), response.getLastLogin());
        },
        "Sending RefreshTokenPostRequest should not throw any exception.");
  }
}
