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

public final class CcStepGet extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("step")
  private final int step;

  @JsonCreator
  public CcStepGet(
      @JsonProperty("email") String email,
      @JsonProperty("name") String name,
      @JsonProperty("step") int step) {
    this.email = email;
    this.name = name;
    this.step = step;
  }

  public String getEmail() {
    return this.email;
  }

  public String getName() {
    return this.name;
  }

  public int getStep() {
    return this.step;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("name", this.getName());
    map.put("step", this.getStep());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static CcStepGet fromMap(@NotNull Map<String, Object> data) {
    return new CcStepGet(
        (String) data.get("email"), (String) data.get("name"), (Integer) data.get("step"));
  }
}
