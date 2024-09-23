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

@ApiEndpoint(
    name = "deleteEventSubscription",
    url = "/api/v2/events/{event_subscription_id}",
    method = "delete",
    auth = "basic",
    namespace = "webhook",
    entity = "subscription",
    type = "application/json")
public final class SubscriptionDeleteRequest implements RequestInterface<String> {

  private final Map<String, String> uriParams = new HashMap<>();

  public SubscriptionDeleteRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
