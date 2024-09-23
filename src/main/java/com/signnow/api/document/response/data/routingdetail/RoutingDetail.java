/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.routingdetail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RoutingDetail extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("data")
  private final DataCollection data;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("updated")
  private final int updated;

  @JsonCreator
  public RoutingDetail(
      @JsonProperty("id") String id,
      @JsonProperty("data") DataCollection data,
      @JsonProperty("created") int created,
      @JsonProperty("updated") int updated) {
    this.id = id;
    this.data = data;
    this.created = created;
    this.updated = updated;
  }

  public String getId() {
    return this.id;
  }

  public DataCollection getData() {
    return this.data;
  }

  public int getCreated() {
    return this.created;
  }

  public int getUpdated() {
    return this.updated;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("data", this.getData());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static RoutingDetail fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetail(
        (String) data.get("id"),
        (DataCollection) data.get("data"),
        (Integer) data.get("created"),
        (Integer) data.get("updated"));
  }
}
