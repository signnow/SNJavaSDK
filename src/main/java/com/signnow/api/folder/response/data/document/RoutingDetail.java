/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the details of routing in the API data.
 */
public final class RoutingDetail extends ApiData {

  /**
   * The unique identifier of the routing detail.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The creation timestamp of the routing detail.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The last updated timestamp of the routing detail.
   */
  @JsonProperty("updated")
  private final String updated;

  /**
   * The data of the routing detail.
   */
  @JsonProperty("data")
  private final Data data;

  /**
   * The instructions for the invite link of the routing detail.
   */
  @JsonProperty("invite_link_instructions")
  private final String inviteLinkInstructions;

  /**
   * Constructs a new RoutingDetail with the specified details.
   *
   * @param id the unique identifier of the routing detail
   * @param created the creation timestamp of the routing detail
   * @param updated the last updated timestamp of the routing detail
   * @param data the data of the routing detail
   * @param inviteLinkInstructions the instructions for the invite link of the routing detail
   */
  @JsonCreator
  public RoutingDetail(
      @JsonProperty("id") String id,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("data") Data data,
      @JsonProperty("invite_link_instructions") String inviteLinkInstructions) {
    this.id = id;
    this.created = created;
    this.updated = updated;
    this.data = data;
    this.inviteLinkInstructions = inviteLinkInstructions;
  }

  /**
   * Returns the unique identifier of the routing detail.
   *
   * @return the unique identifier of the routing detail
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the data of the routing detail.
   *
   * @return the data of the routing detail
   */
  public Data getData() {
    return this.data;
  }

  /**
   * Returns the creation timestamp of the routing detail.
   *
   * @return the creation timestamp of the routing detail
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the last updated timestamp of the routing detail.
   *
   * @return the last updated timestamp of the routing detail
   */
  public String getUpdated() {
    return this.updated;
  }

  /**
   * Returns the instructions for the invite link of the routing detail.
   *
   * @return the instructions for the invite link of the routing detail
   */
  public String getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
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
    map.put("invite_link_instructions", this.getInviteLinkInstructions());
    return map;
  }

  /**
   * Creates a new RoutingDetail from the specified map.
   *
   * @param data a map representing the routing detail
   * @return a new RoutingDetail created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static RoutingDetail fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetail(
        (String) data.get("id"),
        (String) data.get("created"),
        (String) data.get("updated"),
        (Data) data.get("data"),
        (String) data.get("invite_link_instructions"));
  }
}
