/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.user.request.ResetPasswordPostRequest;
import com.signnow.api.user.response.ResetPasswordPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ResetPasswordTest extends BaseTest {

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
    expectation = this.expectation("reset_password", "post");
  }

  @Test
  public void testPostResetPassword() {
    ResetPasswordPostRequest request = new ResetPasswordPostRequest(faker.email());

    assertDoesNotThrow(
        () -> {
          ResetPasswordPostResponse response = (ResetPasswordPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "Response should not be null.");

          assertEquals(expectation.get("status"), response.getStatus());
        },
        "Sending ResetPasswordPostRequest should not throw any exception.");
  }
}
