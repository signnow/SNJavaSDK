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
import com.signnow.api.user.request.EmailVerifyPutRequest;
import com.signnow.api.user.response.EmailVerifyPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailVerifyTest extends BaseTest {

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
    expectation = this.expectation("user_email_verify", "put");
  }

  @Test
  public void testPutEmailVerify() {
    EmailVerifyPutRequest request =
        new EmailVerifyPutRequest(faker.email(), faker.verificationToken());

    assertDoesNotThrow(
        () -> {
          EmailVerifyPutResponse response = (EmailVerifyPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "Response should not be null.");

          this.assertSame(expectation.get("email"), response.getEmail());
        },
        "Sending EmailVerifyPutRequest should not throw any exception.");
  }
}
