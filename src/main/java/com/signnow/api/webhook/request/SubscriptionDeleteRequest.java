/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to delete a subscription.
 * It implements the RequestInterface with a String type parameter.
 * The API endpoint is defined by the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "deleteEventSubscription",
    url = "/api/v2/events/{event_subscription_id}",
    method = "delete",
    auth = "basic",
    namespace = "webhook",
    entity = "subscription",
    type = "application/json")
public final class SubscriptionDeleteRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Adds the event subscription id to the URI parameters.
   *
   * @param eventSubscriptionId The id of the event subscription to be deleted.
   * @return The current SubscriptionDeleteRequest instance.
   */
  public SubscriptionDeleteRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  /**
   * Returns a copy of the URI parameters map.
   *
   * @return A new HashMap containing all URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns an empty payload map.
   *
   * @return A new empty HashMap.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}