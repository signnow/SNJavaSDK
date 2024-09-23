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

public final class Size extends ApiData {

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonCreator
  public Size(@JsonProperty("width") int width, @JsonProperty("height") int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Size fromMap(@NotNull Map<String, Object> data) {
    return new Size((int) data.get("width"), (int) data.get("height"));
  }
}
