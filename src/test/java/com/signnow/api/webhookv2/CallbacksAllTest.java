/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.webhookv2.request.CallbacksAllGetRequest;
import com.signnow.api.webhookv2.response.CallbacksAllGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CallbacksAllTest extends BaseTest {

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
  public void testGetCallbacksAll() {
    expectation = this.expectation("get_event_subscription_callbacks_v2", "get");

    CallbacksAllGetRequest request = new CallbacksAllGetRequest();
    request.withEventSubscriptionId(faker.eventSubscriptionId());

    assertDoesNotThrow(
        () -> {
          CallbacksAllGetResponse response = (CallbacksAllGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "CallbacksAllGetResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending CallbacksAllGetRequest should not throw any exception.");
  }
}