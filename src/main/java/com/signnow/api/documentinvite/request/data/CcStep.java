/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class CcStep extends ApiData {

  @JsonProperty("name")
  private final String name;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("step")
  private final int step;

  @JsonCreator
  public CcStep(
      @JsonProperty("name") String name,
      @JsonProperty("email") String email,
      @JsonProperty("step") int step) {
    this.name = name;
    this.email = email;
    this.step = step;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public int getStep() {
    return this.step;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("email", this.getEmail());
    map.put("step", this.getStep());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static CcStep fromMap(@NotNull Map<String, Object> data) {
    return new CcStep(
        (String) data.get("name"), (String) data.get("email"), (Integer) data.get("step"));
  }
}
