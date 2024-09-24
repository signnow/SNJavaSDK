/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ApproverPut extends ApiData {

  @JsonProperty("name")
  private final String name;

  @JsonProperty("signing_order")
  private final int signingOrder;

  @JsonProperty("default_email")
  private final String defaultEmail;

  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  @JsonCreator
  public ApproverPut(
      @JsonProperty("name") String name,
      @JsonProperty("signing_order") int signingOrder,
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("inviter_role") boolean inviterRole) {
    this.name = name;
    this.signingOrder = signingOrder;
    this.defaultEmail = defaultEmail;
    this.inviterRole = inviterRole;
  }

  public ApproverPut(
      @JsonProperty("name") String name, @JsonProperty("signing_order") int signingOrder) {
    this.name = name;
    this.signingOrder = signingOrder;
    this.defaultEmail = null;
    this.inviterRole = false;
  }

  public String getName() {
    return this.name;
  }

  public int getSigningOrder() {
    return this.signingOrder;
  }

  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  public boolean isInviterRole() {
    return this.inviterRole;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("signing_order", this.getSigningOrder());
    map.put("default_email", this.getDefaultEmail());
    map.put("inviter_role", this.isInviterRole());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static ApproverPut fromMap(@NotNull Map<String, Object> data) {
    return new ApproverPut(
        (String) data.get("name"),
        (Integer) data.get("signing_order"),
        (String) data.getOrDefault("default_email", ""),
        (Boolean) data.getOrDefault("inviter_role", false));
  }
}
