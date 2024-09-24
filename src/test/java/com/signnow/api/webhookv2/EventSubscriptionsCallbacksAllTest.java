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
import com.signnow.api.webhookv2.request.EventSubscriptionsCallbacksAllGetRequest;
import com.signnow.api.webhookv2.response.EventSubscriptionsCallbacksAllGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import org.junit.jupiter.api.Test;

public class EventSubscriptionsCallbacksAllTest extends BaseTest {

  private ApiClient apiClient;

  private Expectation expectation;

  @Test
  public void testGetEventSubscriptionsCallbacksAll() {
    try {
      apiClient = this.client();
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }

    expectation = this.expectation("get_all_event_subscriptions_callbacks_v2", "get");

    EventSubscriptionsCallbacksAllGetRequest request =
        new EventSubscriptionsCallbacksAllGetRequest();

    assertDoesNotThrow(
        () -> {
          EventSubscriptionsCallbacksAllGetResponse response =
              (EventSubscriptionsCallbacksAllGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "EventSubscriptionsCallbacksAllGetResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending EventSubscriptionsCallbacksAllGetRequest should not throw any exception.");
  }
}
