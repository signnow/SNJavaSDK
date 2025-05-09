/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/** This class represents an EnumerationOption which extends ApiData. */
public final class EnumerationOption extends ApiData {

  /** The id of the EnumerationOption. */
  @JsonProperty("id")
  private final String id;

  /** The enumeration id of the EnumerationOption. */
  @JsonProperty("enumeration_id")
  private final String enumerationId;

  /** The data of the EnumerationOption. */
  @JsonProperty("data")
  private final String data;

  /** The created timestamp of the EnumerationOption. */
  @JsonProperty("created")
  private final String created;

  /** The updated timestamp of the EnumerationOption. */
  @JsonProperty("updated")
  private final String updated;

  /**
   * The json attributes of the EnumerationOption. Can be either a String or a JsonAttribute
   * instance.
   */
  @JsonProperty("json_attributes")
  private final Object jsonAttributes;

  /**
   * Constructor for EnumerationOption.
   *
   * @param id The id of the EnumerationOption.
   * @param enumerationId The enumeration id of the EnumerationOption.
   * @param data The data of the EnumerationOption.
   * @param created The created timestamp of the EnumerationOption.
   * @param updated The updated timestamp of the EnumerationOption.
   * @param jsonAttributes The json attributes of the EnumerationOption.
   */
  @JsonCreator
  public EnumerationOption(
      @JsonProperty("id") String id,
      @JsonProperty("enumeration_id") String enumerationId,
      @JsonProperty("data") String data,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("json_attributes") Object jsonAttributes) {
    this.id = id;
    this.enumerationId = enumerationId;
    this.data = data;
    this.created = created;
    this.updated = updated;
    this.jsonAttributes = jsonAttributes;
  }

  /**
   * @return The id of the EnumerationOption.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The enumeration id of the EnumerationOption.
   */
  public String getEnumerationId() {
    return this.enumerationId;
  }

  /**
   * @return The data of the EnumerationOption.
   */
  public String getData() {
    return this.data;
  }

  /**
   * @return The created timestamp of the EnumerationOption.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * @return The updated timestamp of the EnumerationOption.
   */
  public String getUpdated() {
    return this.updated;
  }

  /**
   * @return The json attributes of the EnumerationOption.
   */
  public Object getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * Checks if json_attributes is a String.
   *
   * @return true if json_attributes is a String, false otherwise.
   */
  public boolean isJsonAttributesString() {
    return jsonAttributes instanceof String;
  }

  /**
   * Get the json attributes as a JsonAttribute if possible.
   *
   * @return The JsonAttribute or null if not applicable.
   */
  public JsonAttribute getJsonAttributesAsObject() {
    return (jsonAttributes instanceof JsonAttribute) ? (JsonAttribute) jsonAttributes : null;
  }

  /**
   * Get the json attributes as a String if possible.
   *
   * @return The String representation or null if not applicable.
   */
  public String getJsonAttributesAsString() {
    return (jsonAttributes instanceof String) ? (String) jsonAttributes : null;
  }

  /**
   * Converts the EnumerationOption to a Map.
   *
   * @return A Map representation of the EnumerationOption.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("enumeration_id", this.getEnumerationId());
    map.put("data", this.getData());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    map.put("json_attributes", this.getJsonAttributes());
    return map;
  }

  /**
   * Creates an EnumerationOption from a Map.
   *
   * @param data The Map to create the EnumerationOption from.
   * @return A new EnumerationOption created from the provided Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static EnumerationOption fromMap(@NotNull Map<String, Object> data) {
    return new EnumerationOption(
        (String) data.get("id"),
        (String) data.get("enumeration_id"),
        (String) data.get("data"),
        (String) data.get("created"),
        (String) data.get("updated"),
        data.get("json_attributes"));
  }
}
