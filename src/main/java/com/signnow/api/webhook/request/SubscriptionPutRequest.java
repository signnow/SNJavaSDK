/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.request;

import com.signnow.api.webhook.request.data.Attribute;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "updateEventSubscription",
    url = "/api/v2/events/{event_subscription_id}",
    method = "put",
    auth = "basic",
    namespace = "webhook",
    entity = "subscription",
    type = "application/json")
public final class SubscriptionPutRequest implements RequestInterface<Object> {

  private final String event;

  private final String entityId;

  private final String action;

  private final Attribute attributes;

  private final HashMap<String, String> uriParams = new HashMap<>();

  public SubscriptionPutRequest(
      String event, String entityId, String action, Attribute attributes) {
    this.event = event;
    this.entityId = entityId;
    this.action = action;
    this.attributes = attributes;
  }

  public String getEvent() {
    return this.event;
  }

  public String getEntityId() {
    return this.entityId;
  }

  public String getAction() {
    return this.action;
  }

  public Attribute getAttributes() {
    return this.attributes;
  }

  public SubscriptionPutRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("event", this.getEvent());
    map.put("entity_id", this.getEntityId());
    map.put("action", this.getAction());
    map.put("attributes", this.getAttributes());
    return map;
  }
}
