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

public final class FieldsData extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("type")
  private final String type;

  @JsonProperty("value")
  private final String value;

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

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public String getValue() {
    return this.value;
  }

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
