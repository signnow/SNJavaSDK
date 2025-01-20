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
 * This class represents a Subscription Post Request.
 * It implements the RequestInterface with Object as the type parameter.
 */
@ApiEndpoint(
    name = "createEventSubscription",
    url = "/api/v2/events",
    method = "post",
    auth = "bearer",
    namespace = "webhook",
    entity = "subscription",
    type = "application/json")
public final class SubscriptionPostRequest implements RequestInterface<Object> {

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
   * The secret key for the subscription.
   */
  private final String secretKey;

  /**
   * Constructs a new SubscriptionPostRequest with the specified event, entity ID, action, attributes, and secret key.
   *
   * @param event      the event for the subscription
   * @param entityId   the entity ID for the subscription
   * @param action     the action for the subscription
   * @param attributes the attributes for the subscription
   * @param secretKey  the secret key for the subscription
   */
  public SubscriptionPostRequest(
      String event, String entityId, String action, Attribute attributes, String secretKey) {
    this.event = event;
    this.entityId = entityId;
    this.action = action;
    this.attributes = attributes;
    this.secretKey = secretKey;
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
   * Returns the secret key for the subscription.
   *
   * @return the secret key for the subscription
   */
  public String getSecretKey() {
    return this.secretKey;
  }

  /**
   * Returns a new HashMap for URI parameters.
   *
   * @return a new HashMap for URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a map of the payload for the subscription post request.
   *
   * @return a map of the payload for the subscription post request
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("event", this.getEvent());
    map.put("entity_id", this.getEntityId());
    map.put("action", this.getAction());
    map.put("attributes", this.getAttributes() != null ? this.getAttributes() : null);
    map.put("secret_key", this.getSecretKey());
    return map;
  }
}