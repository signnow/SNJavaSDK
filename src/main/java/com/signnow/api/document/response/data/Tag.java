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

public final class Tag extends ApiData {

  @JsonProperty("type")
  private final String type;

  @JsonProperty("name")
  private final String name;

  @JsonCreator
  public Tag(@JsonProperty("type") String type, @JsonProperty("name") String name) {
    this.type = type;
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("name", this.getName());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Tag fromMap(@NotNull Map<String, Object> data) {
    return new Tag((String) data.get("type"), (String) data.get("name"));
  }
}
