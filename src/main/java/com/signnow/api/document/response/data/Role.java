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

public final class Role extends ApiData {

  @JsonProperty("unique_id")
  private final String uniqueId;

  @JsonProperty("signing_order")
  private final String signingOrder;

  @JsonProperty("name")
  private final String name;

  @JsonCreator
  public Role(
      @JsonProperty("unique_id") String uniqueId,
      @JsonProperty("signing_order") String signingOrder,
      @JsonProperty("name") String name) {
    this.uniqueId = uniqueId;
    this.signingOrder = signingOrder;
    this.name = name;
  }

  public String getUniqueId() {
    return this.uniqueId;
  }

  public String getSigningOrder() {
    return this.signingOrder;
  }

  public String getName() {
    return this.name;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("unique_id", this.getUniqueId());
    map.put("signing_order", this.getSigningOrder());
    map.put("name", this.getName());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Role fromMap(@NotNull Map<String, Object> data) {
    return new Role(
        (String) data.get("unique_id"),
        (String) data.get("signing_order"),
        (String) data.get("name"));
  }
}
