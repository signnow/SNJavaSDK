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
 * This class represents a request to delete an event subscription.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "deleteEventSubscriptionV2",
    url = "/v2/event-subscriptions/{event_subscription_id}",
    method = "delete",
    auth = "bearer",
    namespace = "webhookV2",
    entity = "eventSubscription",
    type = "application/json")
public final class EventSubscriptionDeleteRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Adds the event subscription ID to the URI parameters.
   *
   * @param eventSubscriptionId The ID of the event subscription to be deleted.
   * @return The current instance of EventSubscriptionDeleteRequest.
   */
  public EventSubscriptionDeleteRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters for the request.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a new empty HashMap as the payload for the request.
   *
   * @return A new empty HashMap.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
