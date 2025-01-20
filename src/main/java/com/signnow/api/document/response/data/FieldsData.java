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

/**
 * FieldsData class extends ApiData.
 * It represents the data of a field in a document.
 */
public final class FieldsData extends ApiData {

  /**
   * The id of the field.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the field.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The type of the field.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The value of the field.
   */
  @JsonProperty("value")
  private final String value;

  /**
   * Constructor for FieldsData.
   *
   * @param id    The id of the field.
   * @param name  The name of the field.
   * @param type  The type of the field.
   * @param value The value of the field.
   */
  @JsonCreator
  public FieldsData(
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("type") String type,
      @JsonProperty("value") String value) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.value = value;
  }

  /**
   * Returns the id of the field.
   *
   * @return The id of the field.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the field.
   *
   * @return The name of the field.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the type of the field.
   *
   * @return The type of the field.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the value of the field.
   *
   * @return The value of the field.
   */
  public String getValue() {
    return this.value;
  }

  /**
   * Converts the FieldsData object to a Map.
   *
   * @return A Map representation of the FieldsData object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    map.put("type", this.getType());
    map.put("value", this.getValue());
    return map;
  }

  /**
   * Creates a FieldsData object from a Map.
   *
   * @param data The Map to convert to a FieldsData object.
   * @return A new FieldsData object.
   */
  @NotNull
  @Contract("_ -> new")
  public static FieldsData fromMap(@NotNull Map<String, Object> data) {
    return new FieldsData(
        (String) data.get("id"),
        (String) data.get("name"),
        (String) data.get("type"),
        (String) data.get("value"));
  }
}