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

/**
 * This class represents the routing detail of a document.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RoutingDetail extends ApiData {

  /**
   * The id of the routing detail.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The data collection of the routing detail.
   */
  @JsonProperty("data")
  private final DataCollection data;

  /**
   * The creation timestamp of the routing detail.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The update timestamp of the routing detail.
   */
  @JsonProperty("updated")
  private final int updated;

  /**
   * Constructs a new RoutingDetail with the specified id, data, created and updated.
   *
   * @param id the id of the routing detail
   * @param data the data collection of the routing detail
   * @param created the creation timestamp of the routing detail
   * @param updated the update timestamp of the routing detail
   */
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

  /**
   * Returns the id of the routing detail.
   *
   * @return the id of the routing detail
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the data collection of the routing detail.
   *
   * @return the data collection of the routing detail
   */
  public DataCollection getData() {
    return this.data;
  }

  /**
   * Returns the creation timestamp of the routing detail.
   *
   * @return the creation timestamp of the routing detail
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the update timestamp of the routing detail.
   *
   * @return the update timestamp of the routing detail
   */
  public int getUpdated() {
    return this.updated;
  }

  /**
   * Converts the routing detail to a map.
   *
   * @return a map representing the routing detail
   */
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

  /**
   * Creates a new RoutingDetail from the specified map.
   *
   * @param data a map representing the routing detail
   * @return a new RoutingDetail created from the map
   */
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