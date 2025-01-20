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

/**
 * This class represents a SubscriptionPutRequest.
 * It is used to update an event subscription.
 */
@ApiEndpoint(
    name = "updateEventSubscription",
    url = "/api/v2/events/{event_subscription_id}",
    method = "put",
    auth = "basic",
    namespace = "webhook",
    entity = "subscription",
    type = "application/json")
public final class SubscriptionPutRequest implements RequestInterface<Object> {

  /**
   * The event for the subscription.
   */
  private final String event;

  /**
   * The entity id for the subscription.
   */
  private final String entityId;

  /**
   * The action for the subscription.
   */
  private final String action;

  /**
   * The attributes for the subscription.
   */
  private final Attribute attributes;

  /**
   * The URI parameters for the subscription.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new SubscriptionPutRequest.
   *
   * @param event the event for the subscription
   * @param entityId the entity id for the subscription
   * @param action the action for the subscription
   * @param attributes the attributes for the subscription
   */
  public SubscriptionPutRequest(
      String event, String entityId, String action, Attribute attributes) {
    this.event = event;
    this.entityId = entityId;
    this.action = action;
    this.attributes = attributes;
  }

  /**
   * Returns the event for the subscription.
   *
   * @return the event
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * Returns the entity id for the subscription.
   *
   * @return the entity id
   */
  public String getEntityId() {
    return this.entityId;
  }

  /**
   * Returns the action for the subscription.
   *
   * @return the action
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Returns the attributes for the subscription.
   *
   * @return the attributes
   */
  public Attribute getAttributes() {
    return this.attributes;
  }

  /**
   * Adds the event subscription id to the URI parameters.
   *
   * @param eventSubscriptionId the event subscription id
   * @return the updated SubscriptionPutRequest
   */
  public SubscriptionPutRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  /**
   * Returns a copy of the URI parameters.
   *
   * @return a copy of the URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a map of the payload for the subscription.
   *
   * @return a map of the payload
   */
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