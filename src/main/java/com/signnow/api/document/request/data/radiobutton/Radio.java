/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.radiobutton;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Radio extends ApiData {

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("value")
  private final String value;

  @JsonProperty("checked")
  private final int checked;

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonCreator
  public Radio(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("value") String value,
      @JsonProperty("checked") int checked,
      @JsonProperty("page_number") int pageNumber) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.value = value;
    this.checked = checked;
    this.pageNumber = pageNumber;
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

  public String getValue() {
    return this.value;
  }

  public int getChecked() {
    return this.checked;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("value", this.getValue());
    map.put("checked", this.getChecked());
    map.put("page_number", this.getPageNumber());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Radio fromMap(@NotNull Map<String, Object> data) {
    return new Radio(
        (int) data.getOrDefault("x", 0),
        (int) data.getOrDefault("y", 0),
        (int) data.getOrDefault("width", 0),
        (int) data.getOrDefault("height", 0),
        (String) data.getOrDefault("value", ""),
        (int) data.getOrDefault("checked", 0),
        (int) data.getOrDefault("page_number", 0));
  }
}
