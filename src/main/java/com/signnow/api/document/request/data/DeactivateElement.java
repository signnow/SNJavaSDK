/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a DeactivateElement object with properties and methods.
 */
public final class DeactivateElement extends ApiData {

  /**
   * The type of the DeactivateElement.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The unique ID of the DeactivateElement.
   */
  @JsonProperty("unique_id")
  private final String uniqueId;

  /**
   * Constructor for DeactivateElement.
   *
   * @param type     The type of the DeactivateElement.
   * @param uniqueId The unique ID of the DeactivateElement.
   */
  @JsonCreator
  public DeactivateElement(
      @JsonProperty("type") String type, @JsonProperty("unique_id") String uniqueId) {
    this.type = type;
    this.uniqueId = uniqueId;
  }

  /**
   * Returns the type of the DeactivateElement.
   *
   * @return The type of the DeactivateElement.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the unique ID of the DeactivateElement.
   *
   * @return The unique ID of the DeactivateElement.
   */
  public String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * Converts the DeactivateElement to a Map.
   *
   * @return A Map representation of the DeactivateElement.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("unique_id", this.getUniqueId());
    return map;
  }

  /**
   * Creates a DeactivateElement from a Map.
   *
   * @param data The Map to convert to a DeactivateElement.
   * @return A new DeactivateElement created from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static DeactivateElement fromMap(@NotNull Map<String, Object> data) {
    return new DeactivateElement((String) data.get("type"), (String) data.get("unique_id"));
  }
}