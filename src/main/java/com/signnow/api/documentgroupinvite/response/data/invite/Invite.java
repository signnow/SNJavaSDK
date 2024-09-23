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

public final class Invite extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("steps")
  private final StepCollection steps;

  @JsonCreator
  public Invite(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("steps") StepCollection steps) {
    this.id = id;
    this.status = status;
    this.steps = steps;
  }

  public String getId() {
    return this.id;
  }

  public String getStatus() {
    return this.status;
  }

  public StepCollection getSteps() {
    return this.steps;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("status", this.getStatus());
    map.put("steps", this.getSteps());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Invite fromMap(@NotNull Map<String, Object> data) {
    return new Invite(
        (String) data.get("id"), (String) data.get("status"), (StepCollection) data.get("steps"));
  }
}
