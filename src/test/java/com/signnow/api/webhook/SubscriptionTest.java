/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.webhook.request.SubscriptionDeleteRequest;
import com.signnow.api.webhook.request.SubscriptionGetRequest;
import com.signnow.api.webhook.request.SubscriptionPostRequest;
import com.signnow.api.webhook.request.SubscriptionPutRequest;
import com.signnow.api.webhook.response.SubscriptionDeleteResponse;
import com.signnow.api.webhook.response.SubscriptionGetResponse;
import com.signnow.api.webhook.response.SubscriptionPostResponse;
import com.signnow.api.webhook.response.SubscriptionPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscriptionTest extends BaseTest {

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
  public void testPostSubscription() {
    SubscriptionPostRequest request =
        new SubscriptionPostRequest(
            faker.event(),
            faker.entityId(),
            faker.action(),
            faker.webhookSubscriptionAttributes(),
            faker.secretKey());

    assertDoesNotThrow(
        () -> {
          SubscriptionPostResponse response = (SubscriptionPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "SubscriptionPostResponse should not be null.");
        },
        "Sending SubscriptionPostRequest should not throw any exception.");
  }

  @Test
  public void testGetSubscription() {
    expectation = this.expectation("get_event_subscriptions", "get");

    SubscriptionGetRequest request = new SubscriptionGetRequest();

    assertDoesNotThrow(
        () -> {
          SubscriptionGetResponse response = (SubscriptionGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "SubscriptionGetResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending SubscriptionGetRequest should not throw any exception.");
  }

  @Test
  public void testPutSubscription() {
    SubscriptionPutRequest request =
        new SubscriptionPutRequest(
            faker.event(), faker.entityId(), faker.action(), faker.webhookSubscriptionAttributes());
    request.withEventSubscriptionId(faker.eventSubscriptionId());

    assertDoesNotThrow(
        () -> {
          SubscriptionPutResponse response = (SubscriptionPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "SubscriptionPutResponse should not be null.");
        },
        "Sending SubscriptionPutRequest should not throw any exception.");
  }

  @Test
  public void testDeleteSubscription() {
    SubscriptionDeleteRequest request = new SubscriptionDeleteRequest();
    request.withEventSubscriptionId(faker.eventSubscriptionId());

    assertDoesNotThrow(
        () -> {
          SubscriptionDeleteResponse response =
              (SubscriptionDeleteResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "SubscriptionDeleteResponse should not be null.");
        },
        "Sending SubscriptionDeleteRequest should not throw any exception.");
  }
}
