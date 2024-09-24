/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ApproverGet extends ApiData {

  @JsonProperty("default_email")
  private final String defaultEmail;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("signing_order")
  private final int signingOrder;

  @JsonCreator
  public ApproverGet(
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("name") String name,
      @JsonProperty("signing_order") int signingOrder) {
    this.defaultEmail = defaultEmail;
    this.name = name;
    this.signingOrder = signingOrder;
  }

  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  public String getName() {
    return this.name;
  }

  public int getSigningOrder() {
    return this.signingOrder;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("default_email", this.getDefaultEmail());
    map.put("name", this.getName());
    map.put("signing_order", this.getSigningOrder());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static ApproverGet fromMap(@NotNull Map<String, Object> data) {
    return new ApproverGet(
        (String) data.get("default_email"),
        (String) data.get("name"),
        (Integer) data.get("signing_order"));
  }
}
