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
import com.signnow.api.webhookv2.request.EventSubscriptionDeleteRequest;
import com.signnow.api.webhookv2.request.EventSubscriptionGetRequest;
import com.signnow.api.webhookv2.request.EventSubscriptionPutRequest;
import com.signnow.api.webhookv2.response.EventSubscriptionDeleteResponse;
import com.signnow.api.webhookv2.response.EventSubscriptionGetResponse;
import com.signnow.api.webhookv2.response.EventSubscriptionPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EventSubscriptionTest extends BaseTest {

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
  public void testGetEventSubscription() {
    expectation = this.expectation("get_event_subscription_v2", "get");

    EventSubscriptionGetRequest request = new EventSubscriptionGetRequest();
    request.withEventSubscriptionId(faker.eventSubscriptionId());

    assertDoesNotThrow(
        () -> {
          EventSubscriptionGetResponse response =
              (EventSubscriptionGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "EventSubscriptionGetResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending EventSubscriptionGetRequest should not throw any exception.");
  }

  @Test
  public void testPutEventSubscription() {
    EventSubscriptionPutRequest request =
        new EventSubscriptionPutRequest(
            faker.event(),
            faker.entityId(),
            faker.action(),
            faker.webhookV2EventSubscriptionAttributes());
    request.withEventSubscriptionId(faker.eventSubscriptionId());

    assertDoesNotThrow(
        () -> {
          EventSubscriptionPutResponse response =
              (EventSubscriptionPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "EventSubscriptionPutResponse should not be null.");
        },
        "Sending EventSubscriptionPutRequest should not throw any exception.");
  }

  @Test
  public void testDeleteEventSubscription() {
    EventSubscriptionDeleteRequest request = new EventSubscriptionDeleteRequest();
    request.withEventSubscriptionId(faker.eventSubscriptionId());

    assertDoesNotThrow(
        () -> {
          EventSubscriptionDeleteResponse response =
              (EventSubscriptionDeleteResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "EventSubscriptionDeleteResponse should not be null.");
        },
        "Sending EventSubscriptionDeleteRequest should not throw any exception.");
  }
}
