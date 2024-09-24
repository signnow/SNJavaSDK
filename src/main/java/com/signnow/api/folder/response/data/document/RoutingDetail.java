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

public final class RoutingDetail extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("updated")
  private final String updated;

  @JsonProperty("data")
  private final Data data;

  @JsonProperty("invite_link_instructions")
  private final String inviteLinkInstructions;

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

  public String getId() {
    return this.id;
  }

  public Data getData() {
    return this.data;
  }

  public String getCreated() {
    return this.created;
  }

  public String getUpdated() {
    return this.updated;
  }

  public String getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }

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
