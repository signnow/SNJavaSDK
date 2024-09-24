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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Data extends ApiData {

  @JsonProperty("default_email")
  private final String defaultEmail;

  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("signing_order")
  private final int signingOrder;

  @JsonCreator
  public Data(
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("inviter_role") boolean inviterRole,
      @JsonProperty("name") String name,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("signing_order") int signingOrder) {
    this.defaultEmail = defaultEmail;
    this.inviterRole = inviterRole;
    this.name = name;
    this.roleId = roleId;
    this.signingOrder = signingOrder;
  }

  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  public boolean isInviterRole() {
    return this.inviterRole;
  }

  public String getName() {
    return this.name;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public int getSigningOrder() {
    return this.signingOrder;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("default_email", this.getDefaultEmail());
    map.put("inviter_role", this.isInviterRole());
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    map.put("signing_order", this.getSigningOrder());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data(
        (String) data.get("default_email"),
        (Boolean) data.get("inviter_role"),
        (String) data.get("name"),
        (String) data.get("role_id"),
        (Integer) data.get("signing_order"));
  }
}
