/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.tag;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Radio extends ApiData {

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("checked")
  private final String checked;

  @JsonProperty("value")
  private final String value;

  @JsonProperty("x-offset")
  private final int xOffset;

  @JsonProperty("y-offset")
  private final int yOffset;

  @JsonCreator
  public Radio(
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("checked") String checked,
      @JsonProperty("value") String value,
      @JsonProperty("x-offset") int xOffset,
      @JsonProperty("y-offset") int yOffset) {
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.checked = checked;
    this.value = value;
    this.xOffset = xOffset;
    this.yOffset = yOffset;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public String getChecked() {
    return this.checked;
  }

  public String getValue() {
    return this.value;
  }

  public int getXOffset() {
    return this.xOffset;
  }

  public int getYOffset() {
    return this.yOffset;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("checked", this.getChecked());
    map.put("value", this.getValue());
    map.put("x-offset", this.getXOffset());
    map.put("y-offset", this.getYOffset());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Radio fromMap(@NotNull Map<String, Object> data) {
    return new Radio(
        (int) data.getOrDefault("page_number", 0),
        (int) data.getOrDefault("x", 0),
        (int) data.getOrDefault("y", 0),
        (int) data.getOrDefault("width", 0),
        (int) data.getOrDefault("height", 0),
        (String) data.getOrDefault("checked", ""),
        (String) data.getOrDefault("value", ""),
        (int) data.getOrDefault("x-offset", 0),
        (int) data.getOrDefault("y-offset", 0));
  }
}
