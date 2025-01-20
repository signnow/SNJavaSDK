/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a request to get a callback from an event subscription.
 * The request is configured with the event subscription ID and callback ID.
 * The request is sent to the specified API endpoint.
 */
@ApiEndpoint(
    name = "getEventSubscriptionCallback",
    url = "/v2/event-subscriptions/{event_subscription_id}/callbacks/{callback_id}",
    method = "get",
    auth = "bearer",
    namespace = "webhookV2",
    entity = "callback",
    type = "application/json")
public class CallbackGetRequest implements RequestInterface<String> {
  /**
   * A map to hold the URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Sets the event subscription ID for the request.
   *
   * @param eventSubscriptionId the event subscription ID
   * @return the updated request
   */
  public CallbackGetRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  /**
   * Sets the callback ID for the request.
   *
   * @param callbackId the callback ID
   * @return the updated request
   */
  public CallbackGetRequest withCallbackId(String callbackId) {
    this.uriParams.put("callback_id", callbackId);
    return this;
  }

  /**
   * Returns a new map with the URI parameters for the request.
   *
   * @return a new map with the URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a new map with the payload for the request.
   * In this case, the payload is empty.
   *
   * @return a new map with the payload
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
