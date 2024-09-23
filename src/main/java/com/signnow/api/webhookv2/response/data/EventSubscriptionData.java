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

public final class EventSubscriptionData extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("entity_type")
  private final String entityType;

  @JsonProperty("event")
  private final String event;

  @JsonProperty("entity_id")
  private final int entityId;

  @JsonProperty("entity_unique_id")
  private final String entityUniqueId;

  @JsonProperty("request_method")
  private final String requestMethod;

  @JsonProperty("action")
  private final String action;

  @JsonProperty("json_attributes")
  private final com.signnow.api.webhookv2.response.data.JsonAttribute jsonAttributes;

  @JsonProperty("active")
  private final boolean active;

  @JsonProperty("application_name")
  private final String applicationName;

  @JsonProperty("version")
  private final String version;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("event_count")
  private final int eventCount;

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

  public String getId() {
    return this.id;
  }

  public String getApplicationName() {
    return this.applicationName;
  }

  public int getEntityId() {
    return this.entityId;
  }

  public String getEntityType() {
    return this.entityType;
  }

  public String getEntityUniqueId() {
    return this.entityUniqueId;
  }

  public String getEvent() {
    return this.event;
  }

  public com.signnow.api.webhookv2.response.data.JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  public String getRequestMethod() {
    return this.requestMethod;
  }

  public String getVersion() {
    return this.version;
  }

  public boolean isActive() {
    return this.active;
  }

  public String getAction() {
    return this.action;
  }

  public int getCreated() {
    return this.created;
  }

  public int getEventCount() {
    return this.eventCount;
  }

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
