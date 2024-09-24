/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.premiumaccess;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class GatewaySubscription extends ApiData {

  @JsonProperty("gateway")
  private final String gateway;

  @JsonProperty("auto_renew")
  private final Boolean autoRenew;

  @JsonCreator
  public GatewaySubscription(
      @JsonProperty("gateway") String gateway, @JsonProperty("auto_renew") Boolean autoRenew) {
    this.gateway = gateway;
    this.autoRenew = autoRenew;
  }

  public String getGateway() {
    return this.gateway;
  }

  public Boolean isAutoRenew() {
    return this.autoRenew;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("gateway", this.getGateway());
    map.put("auto_renew", this.isAutoRenew());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static GatewaySubscription fromMap(@NotNull Map<String, Object> data) {
    return new GatewaySubscription(
        (String) data.getOrDefault("gateway", null),
        (Boolean) data.getOrDefault("auto_renew", null));
  }
}
