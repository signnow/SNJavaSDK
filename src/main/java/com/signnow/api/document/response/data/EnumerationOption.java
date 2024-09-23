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

public final class EnumerationOption extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("enumeration_id")
  private final String enumerationId;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("updated")
  private final String updated;

  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  @JsonCreator
  public EnumerationOption(
      @JsonProperty("id") String id,
      @JsonProperty("enumeration_id") String enumerationId,
      @JsonProperty("data") String data,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes) {
    this.id = id;
    this.enumerationId = enumerationId;
    this.data = data;
    this.created = created;
    this.updated = updated;
    this.jsonAttributes = jsonAttributes;
  }

  public String getId() {
    return this.id;
  }

  public String getEnumerationId() {
    return this.enumerationId;
  }

  public String getData() {
    return this.data;
  }

  public String getCreated() {
    return this.created;
  }

  public String getUpdated() {
    return this.updated;
  }

  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

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

  @NotNull
  @Contract("_ -> new")
  public static EnumerationOption fromMap(@NotNull Map<String, Object> data) {
    return new EnumerationOption(
        (String) data.get("id"),
        (String) data.get("enumeration_id"),
        (String) data.get("data"),
        (String) data.get("created"),
        (String) data.get("updated"),
        (JsonAttribute) data.get("json_attributes"));
  }
}
