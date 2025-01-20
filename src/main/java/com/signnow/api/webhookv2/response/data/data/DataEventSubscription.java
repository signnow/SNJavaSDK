/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a data event subscription.
 */
public final class DataEventSubscription extends ApiData {

  /**
   * The ID of the event subscription.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The type of the entity associated with the event subscription.
   */
  @JsonProperty("entity_type")
  private final String entityType;

  /**
   * The event associated with the subscription.
   */
  @JsonProperty("event")
  private final String event;

  /**
   * The ID of the entity associated with the event subscription.
   */
  @JsonProperty("entity_id")
  private final int entityId;

  /**
   * The status of the event subscription.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * The JSON attributes associated with the event subscription.
   */
  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  /**
   * The creation timestamp of the event subscription.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The version of the event subscription.
   */
  @JsonProperty("version")
  private final int version;

  /**
   * The unique ID of the entity associated with the event subscription.
   */
  @JsonProperty("entity_unique_id")
  private final String entityUniqueId;

  /**
   * The name of the application associated with the event subscription.
   */
  @JsonProperty("application_name")
  private final String applicationName;

  /**
   * Constructs a new DataEventSubscription with the specified parameters.
   *
   * @param id the ID of the event subscription
   * @param entityType the type of the entity associated with the event subscription
   * @param event the event associated with the subscription
   * @param entityId the ID of the entity associated with the event subscription
   * @param active the status of the event subscription
   * @param jsonAttributes the JSON attributes associated with the event subscription
   * @param created the creation timestamp of the event subscription
   * @param version the version of the event subscription
   * @param entityUniqueId the unique ID of the entity associated with the event subscription
   * @param applicationName the name of the application associated with the event subscription
   */
  @JsonCreator
  public DataEventSubscription(
      @JsonProperty("id") String id,
      @JsonProperty("entity_type") String entityType,
      @JsonProperty("event") String event,
      @JsonProperty("entity_id") int entityId,
      @JsonProperty("active") boolean active,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("created") int created,
      @JsonProperty("version") int version,
      @JsonProperty("entity_unique_id") String entityUniqueId,
      @JsonProperty("application_name") String applicationName) {
    this.id = id;
    this.entityType = entityType;
    this.event = event;
    this.entityId = entityId;
    this.active = active;
    this.jsonAttributes = jsonAttributes;
    this.created = created;
    this.version = version;
    this.entityUniqueId = entityUniqueId;
    this.applicationName = applicationName;
  }

  /**
   * Returns the ID of the event subscription.
   *
   * @return the ID of the event subscription
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the type of the entity associated with the event subscription.
   *
   * @return the type of the entity associated with the event subscription
   */
  public String getEntityType() {
    return entityType;
  }

  /**
   * Returns the event associated with the subscription.
   *
   * @return the event associated with the subscription
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * Returns the ID of the entity associated with the event subscription.
   *
   * @return the ID of the entity associated with the event subscription
   */
  public int getEntityId() {
    return this.entityId;
  }

  /**
   * Returns the unique ID of the entity associated with the event subscription.
   *
   * @return the unique ID of the entity associated with the event subscription
   */
  public String getEntityUniqueId() {
    return this.entityUniqueId;
  }

  /**
   * Returns the status of the event subscription.
   *
   * @return the status of the event subscription
   */
  public boolean isActive() {
    return this.active;
  }

  /**
   * Returns the JSON attributes associated with the event subscription.
   *
   * @return the JSON attributes associated with the event subscription
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
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
   * Returns the creation timestamp of the event subscription.
   *
   * @return the creation timestamp of the event subscription
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the version of the event subscription.
   *
   * @return the version of the event subscription
   */
  public int getVersion() {
    return this.version;
  }

  /**
   * Converts this DataEventSubscription to a Map.
   *
   * @return a Map representing this DataEventSubscription
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("event", this.getEvent());
    map.put("entity_type", this.getEntityType());
    map.put("entity_id", this.getEntityId());
    map.put("entity_unique_id", this.getEntityUniqueId());
    map.put("active", this.isActive());
    map.put("json_attributes", this.getJsonAttributes().toMap());
    map.put("application_name", this.getApplicationName());
    map.put("created", this.getCreated());
    map.put("version", this.getVersion());
    return map;
  }

  /**
   * Creates a new DataEventSubscription from the specified Map.
   *
   * @param data a Map containing the data for the new DataEventSubscription
   * @return a new DataEventSubscription created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static DataEventSubscription fromMap(@NotNull Map<String, Object> data) {
    return new DataEventSubscription(
        (String) data.get("id"),
        (String) data.get("entity_type"),
        (String) data.get("event"),
        (Integer) data.get("entity_id"),
        (Boolean) data.get("active"),
        JsonAttribute.fromMap(
            Cast.safeToMap(data.get("json_attributes"), String.class, Object.class)),
        (Integer) data.get("created"),
        (Integer) data.get("version"),
        (String) data.getOrDefault("entity_unique_id", null),
        (String) data.getOrDefault("application_name", null));
  }
}