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
import com.signnow.api.webhookv2.request.CallbackGetRequest;
import com.signnow.api.webhookv2.response.CallbackGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CallbackTest extends BaseTest {

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
  public void testGetCallback() {
    expectation = this.expectation("get_event_subscription_callback", "get");

    CallbackGetRequest request = new CallbackGetRequest();
    request.withEventSubscriptionId(faker.eventSubscriptionId()).withCallbackId(faker.callbackId());

    assertDoesNotThrow(
        () -> {
          CallbackGetResponse response = (CallbackGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "CallbackGetResponse should not be null.");
          assertNotNull(response.getData(), "Response data should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending CallbackGetRequest should not throw any exception.");
  }
}
