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

public final class DataEventSubscription extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("entity_type")
  private final String entityType;

  @JsonProperty("event")
  private final String event;

  @JsonProperty("entity_id")
  private final int entityId;

  @JsonProperty("active")
  private final boolean active;

  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("version")
  private final int version;

  @JsonProperty("entity_unique_id")
  private final String entityUniqueId;

  @JsonProperty("application_name")
  private final String applicationName;

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

  public String getId() {
    return this.id;
  }

  public String getEntityType() {
    return entityType;
  }

  public String getEvent() {
    return this.event;
  }

  public int getEntityId() {
    return this.entityId;
  }

  public String getEntityUniqueId() {
    return this.entityUniqueId;
  }

  public boolean isActive() {
    return this.active;
  }

  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  public String getApplicationName() {
    return this.applicationName;
  }

  public int getCreated() {
    return this.created;
  }

  public int getVersion() {
    return this.version;
  }

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
