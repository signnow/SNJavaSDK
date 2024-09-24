/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class DataInvite extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("order")
  private final int order;

  @JsonProperty("status")
  private final String status;

  @JsonCreator
  public DataInvite(
      @JsonProperty("id") String id,
      @JsonProperty("email") String email,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("order") int order,
      @JsonProperty("status") String status) {
    this.id = id;
    this.email = email;
    this.roleId = roleId;
    this.order = order;
    this.status = status;
  }

  public String getId() {
    return this.id;
  }

  public String getEmail() {
    return this.email;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public int getOrder() {
    return this.order;
  }

  public String getStatus() {
    return this.status;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("email", this.getEmail());
    map.put("role_id", this.getRoleId());
    map.put("order", this.getOrder());
    map.put("status", this.getStatus());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static DataInvite fromMap(@NotNull Map<String, Object> data) {
    return new DataInvite(
        (String) data.get("id"),
        (String) data.get("email"),
        (String) data.get("role_id"),
        (Integer) data.get("order"),
        (String) data.get("status"));
  }
}
