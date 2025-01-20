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
 * EntityLabel class extends ApiData.
 * It represents the label entity in the system.
 */
public final class EntityLabel extends ApiData {

  /**
   * The name of the label.
   */
  @JsonProperty("label_name")
  private final String labelName;

  /**
   * Flag indicating if the label is a system label.
   */
  @JsonProperty("is_system")
  private final boolean isSystem;

  /**
   * The timestamp of the last update of the label.
   */
  @JsonProperty("updated")
  private final String updated;

  /**
   * Constructor for EntityLabel.
   *
   * @param labelName the name of the label
   * @param isSystem flag indicating if the label is a system label
   * @param updated the timestamp of the last update of the label
   */
  @JsonCreator
  public EntityLabel(
      @JsonProperty("label_name") String labelName,
      @JsonProperty("is_system") boolean isSystem,
      @JsonProperty("updated") String updated) {
    this.labelName = labelName;
    this.isSystem = isSystem;
    this.updated = updated;
  }

  /**
   * Returns the name of the label.
   *
   * @return the name of the label
   */
  public String getLabelName() {
    return this.labelName;
  }

  /**
   * Returns whether the label is a system label.
   *
   * @return true if the label is a system label, false otherwise
   */
  public boolean isSystem() {
    return this.isSystem;
  }

  /**
   * Returns the timestamp of the last update of the label.
   *
   * @return the timestamp of the last update of the label
   */
  public String getUpdated() {
    return this.updated;
  }

  /**
   * Converts the EntityLabel to a Map.
   *
   * @return a Map representing the EntityLabel
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("label_name", this.getLabelName());
    map.put("is_system", this.isSystem());
    map.put("updated", this.getUpdated());
    return map;
  }

  /**
   * Creates an EntityLabel from a Map.
   *
   * @param data a Map containing the data for the EntityLabel
   * @return a new EntityLabel created from the Map
   */
  @NotNull
  @Contract("_ -> new")
  public static EntityLabel fromMap(@NotNull Map<String, Object> data) {
    return new EntityLabel(
        (String) data.get("label_name"),
        (Boolean) data.get("is_system"),
        (String) data.get("updated"));
  }
}