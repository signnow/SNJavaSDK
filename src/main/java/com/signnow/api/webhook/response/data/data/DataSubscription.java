/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataSubscription extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("event")
  private final String event;

  @JsonProperty("entity_id")
  private final int entityId;

  @JsonProperty("action")
  private final String action;

  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("content")
  private final Content content;

  @JsonCreator
  public DataSubscription(
      @JsonProperty("id") String id,
      @JsonProperty("event") String event,
      @JsonProperty("entity_id") int entityId,
      @JsonProperty("action") String action,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("created") int created,
      @JsonProperty("content") Content content) {
    this.id = id;
    this.event = event;
    this.entityId = entityId;
    this.action = action;
    this.jsonAttributes = jsonAttributes;
    this.created = created;
    this.content = content;
  }

  public String getId() {
    return this.id;
  }

  public String getEvent() {
    return this.event;
  }

  public int getEntityId() {
    return this.entityId;
  }

  public String getAction() {
    return this.action;
  }

  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  public int getCreated() {
    return this.created;
  }

  public Content getContent() {
    return this.content;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("event", this.getEvent());
    map.put("entity_id", this.getEntityId());
    map.put("action", this.getAction());
    map.put("json_attributes", this.getJsonAttributes());
    map.put("created", this.getCreated());
    map.put("content", this.getContent());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static DataSubscription fromMap(@NotNull Map<String, Object> data) {
    return new DataSubscription(
        (String) data.get("id"),
        (String) data.get("event"),
        (Integer) data.get("entity_id"),
        (String) data.get("action"),
        JsonAttribute.fromMap(
            Cast.safeToMap(data.get("json_attributes"), String.class, Object.class)),
        (int) data.get("created"),
        Content.fromMap(Cast.safeToMap(data.get("content"), String.class, Object.class)));
  }
}
