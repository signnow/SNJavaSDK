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
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Page extends ApiData {

  @JsonProperty("src")
  private final String src;

  @JsonProperty("size")
  private final Size size;

  @JsonCreator
  public Page(@JsonProperty("src") String src, @JsonProperty("size") Size size) {
    this.src = src;
    this.size = size;
  }

  public String getSrc() {
    return this.src;
  }

  public Size getSize() {
    return this.size;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("src", this.getSrc());
    map.put("size", this.getSize());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Page fromMap(@NotNull Map<String, Object> data) {
    return new Page(
        (String) data.get("src"),
        Size.fromMap(Cast.safeToMap(data.get("size"), String.class, Object.class)));
  }
}
