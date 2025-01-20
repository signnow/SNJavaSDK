/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.request;

import com.signnow.api.webhookv2.request.data.Attribute;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to update an event subscription.
 * It implements the RequestInterface with Object as the type parameter.
 */
@ApiEndpoint(
    name = "updateEventSubscriptionsSubscriptionV2",
    url = "/v2/event-subscriptions/{event_subscription_id}",
    method = "put",
    auth = "bearer",
    namespace = "webhookV2",
    entity = "eventSubscription",
    type = "application/json")
public final class EventSubscriptionPutRequest implements RequestInterface<Object> {

  /**
   * The event for the subscription.
   */
  private final String event;

  /**
   * The entity ID for the subscription.
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
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new EventSubscriptionPutRequest with the specified event, entity ID, action, and attributes.
   *
   * @param event the event for the subscription
   * @param entityId the entity ID for the subscription
   * @param action the action for the subscription
   * @param attributes the attributes for the subscription
   */
  public EventSubscriptionPutRequest(
      String event, String entityId, String action, Attribute attributes) {
    this.event = event;
    this.entityId = entityId;
    this.action = action;
    this.attributes = attributes;
  }

  /**
   * Returns the event for the subscription.
   *
   * @return the event for the subscription
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * Returns the entity ID for the subscription.
   *
   * @return the entity ID for the subscription
   */
  public String getEntityId() {
    return this.entityId;
  }

  /**
   * Returns the action for the subscription.
   *
   * @return the action for the subscription
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Returns the attributes for the subscription.
   *
   * @return the attributes for the subscription
   */
  public Attribute getAttributes() {
    return this.attributes;
  }

  /**
   * Adds the event subscription ID to the URI parameters and returns this request.
   *
   * @param eventSubscriptionId the event subscription ID
   * @return this request
   */
  public EventSubscriptionPutRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters for this request.
   *
   * @return a new HashMap containing the URI parameters for this request
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map containing the payload for this request.
   *
   * @return a Map containing the payload for this request
   */
  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("event", this.getEvent());
    map.put("entity_id", this.getEntityId());
    map.put("action", this.getAction());
    map.put("attributes", this.getAttributes());
    return map;
  }
}