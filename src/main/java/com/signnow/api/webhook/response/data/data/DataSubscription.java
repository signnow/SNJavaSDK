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

/**
 * DataSubscription class extends ApiData.
 * It represents the data subscription in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataSubscription extends ApiData {

  /**
   * The id of the data subscription.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The event of the data subscription.
   */
  @JsonProperty("event")
  private final String event;

  /**
   * The entity id of the data subscription.
   */
  @JsonProperty("entity_id")
  private final int entityId;

  /**
   * The action of the data subscription.
   */
  @JsonProperty("action")
  private final String action;

  /**
   * The json attributes of the data subscription.
   */
  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  /**
   * The created timestamp of the data subscription.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The content of the data subscription.
   */
  @JsonProperty("content")
  private final Content content;

  /**
   * Constructor for DataSubscription class.
   *
   * @param id The id of the data subscription.
   * @param event The event of the data subscription.
   * @param entityId The entity id of the data subscription.
   * @param action The action of the data subscription.
   * @param jsonAttributes The json attributes of the data subscription.
   * @param created The created timestamp of the data subscription.
   * @param content The content of the data subscription.
   */
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

  /**
   * @return The id of the data subscription.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The event of the data subscription.
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * @return The entity id of the data subscription.
   */
  public int getEntityId() {
    return this.entityId;
  }

  /**
   * @return The action of the data subscription.
   */
  public String getAction() {
    return this.action;
  }

  /**
   * @return The json attributes of the data subscription.
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * @return The created timestamp of the data subscription.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * @return The content of the data subscription.
   */
  public Content getContent() {
    return this.content;
  }

  /**
   * Converts the DataSubscription object to a Map.
   *
   * @return A Map representation of the DataSubscription object.
   */
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

  /**
   * Creates a DataSubscription object from a Map.
   *
   * @param data The Map to convert to a DataSubscription object.
   * @return A new DataSubscription object.
   */
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