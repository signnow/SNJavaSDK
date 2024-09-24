/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response.data.invite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Step extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("order")
  private final int order;

  @JsonProperty("actions")
  private final ActionCollection actions;

  @JsonCreator
  public Step(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("order") int order,
      @JsonProperty("actions") ActionCollection actions) {
    this.id = id;
    this.status = status;
    this.order = order;
    this.actions = actions;
  }

  public String getId() {
    return this.id;
  }

  public String getStatus() {
    return this.status;
  }

  public int getOrder() {
    return this.order;
  }

  public ActionCollection getActions() {
    return this.actions;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("status", this.getStatus());
    map.put("order", this.getOrder());
    map.put("actions", this.getActions());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Step fromMap(@NotNull Map<String, Object> data) {
    return new Step(
        (String) data.get("id"),
        (String) data.get("status"),
        (Integer) data.get("order"),
        (ActionCollection) data.get("actions"));
  }
}
