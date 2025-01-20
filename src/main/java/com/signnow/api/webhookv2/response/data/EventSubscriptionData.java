/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the data of an event subscription.
 */
public final class EventSubscriptionData extends ApiData {

  /**
   * The id of the event subscription.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The type of the entity associated with the event subscription.
   */
  @JsonProperty("entity_type")
  private final String entityType;

  /**
   * The event associated with the event subscription.
   */
  @JsonProperty("event")
  private final String event;

  /**
   * The id of the entity associated with the event subscription.
   */
  @JsonProperty("entity_id")
  private final int entityId;

  /**
   * The unique id of the entity associated with the event subscription.
   */
  @JsonProperty("entity_unique_id")
  private final String entityUniqueId;

  /**
   * The request method of the event subscription.
   */
  @JsonProperty("request_method")
  private final String requestMethod;

  /**
   * The action of the event subscription.
   */
  @JsonProperty("action")
  private final String action;

  /**
   * The JSON attributes of the event subscription.
   */
  @JsonProperty("json_attributes")
  private final com.signnow.api.webhookv2.response.data.JsonAttribute jsonAttributes;

  /**
   * The active status of the event subscription.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * The name of the application associated with the event subscription.
   */
  @JsonProperty("application_name")
  private final String applicationName;

  /**
   * The version of the event subscription.
   */
  @JsonProperty("version")
  private final String version;

  /**
   * The creation time of the event subscription.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The count of events associated with the event subscription.
   */
  @JsonProperty("event_count")
  private final int eventCount;

  /**
   * Constructs an EventSubscriptionData object with the specified parameters.
   *
   * @param id the id of the event subscription
   * @param entityType the type of the entity associated with the event subscription
   * @param event the event associated with the event subscription
   * @param entityId the id of the entity associated with the event subscription
   * @param entityUniqueId the unique id of the entity associated with the event subscription
   * @param requestMethod the request method of the event subscription
   * @param action the action of the event subscription
   * @param jsonAttributes the JSON attributes of the event subscription
   * @param active the active status of the event subscription
   * @param applicationName the name of the application associated with the event subscription
   * @param version the version of the event subscription
   * @param created the creation time of the event subscription
   * @param eventCount the count of events associated with the event subscription
   */
  @JsonCreator
  public EventSubscriptionData(
      @JsonProperty("id") String id,
      @JsonProperty("entity_type") String entityType,
      @JsonProperty("event") String event,
      @JsonProperty("entity_id") int entityId,
      @JsonProperty("entity_unique_id") String entityUniqueId,
      @JsonProperty("request_method") String requestMethod,
      @JsonProperty("action") String action,
      @JsonProperty("json_attributes")
          com.signnow.api.webhookv2.response.data.JsonAttribute jsonAttributes,
      @JsonProperty("active") boolean active,
      @JsonProperty("application_name") String applicationName,
      @JsonProperty("version") String version,
      @JsonProperty("created") int created,
      @JsonProperty("event_count") int eventCount) {
    this.id = id;
    this.entityType = entityType;
    this.event = event;
    this.entityId = entityId;
    this.entityUniqueId = entityUniqueId;
    this.requestMethod = requestMethod;
    this.action = action;
    this.jsonAttributes = jsonAttributes;
    this.version = version;
    this.active = active;
    this.applicationName = applicationName;
    this.created = created;
    this.eventCount = eventCount;
  }

  /**
   * Returns the id of the event subscription.
   *
   * @return the id of the event subscription
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the application associated with the event subscription.
   *
   * @return the name of the application associated with the event subscription
   */
  public String getApplicationName() {
    return this.applicationName;
  }

  /**
   * Returns the id of the entity associated with the event subscription.
   *
   * @return the id of the entity associated with the event subscription
   */
  public int getEntityId() {
    return this.entityId;
  }

  /**
   * Returns the type of the entity associated with the event subscription.
   *
   * @return the type of the entity associated with the event subscription
   */
  public String getEntityType() {
    return this.entityType;
  }

  /**
   * Returns the unique id of the entity associated with the event subscription.
   *
   * @return the unique id of the entity associated with the event subscription
   */
  public String getEntityUniqueId() {
    return this.entityUniqueId;
  }

  /**
   * Returns the event associated with the event subscription.
   *
   * @return the event associated with the event subscription
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * Returns the JSON attributes of the event subscription.
   *
   * @return the JSON attributes of the event subscription
   */
  public com.signnow.api.webhookv2.response.data.JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * Returns the request method of the event subscription.
   *
   * @return the request method of the event subscription
   */
  public String getRequestMethod() {
    return this.requestMethod;
  }

  /**
   * Returns the version of the event subscription.
   *
   * @return the version of the event subscription
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Returns the active status of the event subscription.
   *
   * @return the active status of the event subscription
   */
  public boolean isActive() {
    return this.active;
  }

  /**
   * Returns the action of the event subscription.
   *
   * @return the action of the event subscription
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Returns the creation time of the event subscription.
   *
   * @return the creation time of the event subscription
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the count of events associated with the event subscription.
   *
   * @return the count of events associated with the event subscription
   */
  public int getEventCount() {
    return this.eventCount;
  }

  /**
   * Converts the event subscription data to a map.
   *
   * @return a map representing the event subscription data
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("entity_type", this.getEntityType());
    map.put("event", this.getEvent());
    map.put("entity_id", this.getEntityId());
    map.put("entity_unique_id", this.getEntityUniqueId());
    map.put("request_method", this.getRequestMethod());
    map.put("action", this.getAction());
    map.put("json_attributes", this.getJsonAttributes().toMap());
    map.put("active", this.isActive());
    map.put("application_name", this.getApplicationName());
    map.put("version", this.getVersion());
    map.put("created", this.getCreated());
    map.put("event_count", this.getEventCount());
    return map;
  }

  /**
   * Creates an EventSubscriptionData object from a map.
   *
   * @param data a map representing the event subscription data
   * @return an EventSubscriptionData object
   */
  @NotNull
  @Contract("_ -> new")
  public static EventSubscriptionData fromMap(@NotNull Map<String, Object> data) {
    return new EventSubscriptionData(
        (String) data.get("id"),
        (String) data.get("entity_type"),
        (String) data.get("event"),
        (int) data.get("entity_id"),
        (String) data.get("entity_unique_id"),
        (String) data.get("request_method"),
        (String) data.get("action"),
        JsonAttribute.fromMap(
            Cast.safeToMap(data.get("json_attributes"), String.class, Object.class)),
        (Boolean) data.get("active"),
        (String) data.get("application_name"),
        (String) data.get("version"),
        (Integer) data.get("created"),
        (Integer) data.get("event_count"));
  }
}