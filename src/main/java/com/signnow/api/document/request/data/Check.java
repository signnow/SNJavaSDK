/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Check extends ApiData {

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonCreator
  public Check(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("page_number") int pageNumber) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.subtype = subtype;
    this.pageNumber = pageNumber;
  }

  public Check(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.subtype = "check";
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

  public String getSubtype() {
    return this.subtype;
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
    map.put("subtype", this.getSubtype());
    map.put("page_number", this.getPageNumber());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Check fromMap(@NotNull Map<String, Object> data) {
    return new Check(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("width"),
        (int) data.get("height"),
        (String) data.get("subtype"),
        (int) data.get("page_number"));
  }
}
