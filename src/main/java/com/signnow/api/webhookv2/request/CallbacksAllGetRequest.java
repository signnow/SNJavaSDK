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
 * This class represents a request to get all callbacks for a specific event subscription.
 * The request is made to the "getEventSubscriptionCallbacksV2" API endpoint.
 */
@ApiEndpoint(
    name = "getEventSubscriptionCallbacksV2",
    url = "/v2/event-subscriptions/{event_subscription_id}/callbacks",
    method = "get",
    auth = "bearer",
    namespace = "webhookV2",
    entity = "callbacksAll",
    type = "application/json")
public final class CallbacksAllGetRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Adds the event subscription ID to the URI parameters.
   *
   * @param eventSubscriptionId The ID of the event subscription.
   * @return The current request object with the updated URI parameters.
   */
  public CallbacksAllGetRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  /**
   * Returns a new map containing the URI parameters for the request.
   *
   * @return A new map containing the URI parameters.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns an empty map as the payload for the request.
   *
   * @return An empty map.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}