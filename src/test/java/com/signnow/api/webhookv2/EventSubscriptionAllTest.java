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
import com.signnow.api.webhookv2.request.EventSubscriptionAllGetRequest;
import com.signnow.api.webhookv2.response.EventSubscriptionAllGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EventSubscriptionAllTest extends BaseTest {

  private ApiClient apiClient;

  private Expectation expectation;

  @BeforeEach
  public void setUp() {
    try {
      apiClient = this.client();
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }
  }

  @Test
  public void testGetEventSubscriptionAll() {
    expectation = this.expectation("get_event_subscriptions_v2", "get");

    EventSubscriptionAllGetRequest request = new EventSubscriptionAllGetRequest();

    assertDoesNotThrow(
        () -> {
          EventSubscriptionAllGetResponse response =
              (EventSubscriptionAllGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "EventSubscriptionAllGetResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending EventSubscriptionAllGetRequest should not throw any exception.");
  }
}
