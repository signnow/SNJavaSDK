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
import com.signnow.api.user.request.InitialGetRequest;
import com.signnow.api.user.request.InitialPutRequest;
import com.signnow.api.user.response.InitialGetResponse;
import com.signnow.api.user.response.InitialPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InitialTest extends BaseTest {

  private ApiClient apiClient;

  private SignNowFaker faker;

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
  public void testGetInitial() {
    Expectation expectation = this.expectation("get_user_initials", "get");
    InitialGetRequest request = new InitialGetRequest();

    assertDoesNotThrow(
        () -> {
          InitialGetResponse response = (InitialGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "Response should not be null.");

          this.assertSame(expectation.get("unique_id"), response.getUniqueId());
          this.assertSame(expectation.get("width"), response.getWidth());
          this.assertSame(expectation.get("height"), response.getHeight());
          this.assertSame(expectation.get("data"), response.getData());
          this.assertSame(expectation.get("created"), response.getCreated());
        },
        "Sending InitialGetRequest should not throw any exception.");
  }

  @Test
  public void testPutInitial() {
    Expectation expectation = this.expectation("update_user_initials", "put");
    InitialPutRequest request = new InitialPutRequest(faker.data());

    assertDoesNotThrow(
        () -> {
          InitialPutResponse response = (InitialPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "Response should not be null.");
          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("width"), response.getWidth());
          this.assertSame(expectation.get("height"), response.getHeight());
          this.assertSame(expectation.get("created"), response.getCreated());
        },
        "Sending InitialPutRequest should not throw any exception.");
  }
}
