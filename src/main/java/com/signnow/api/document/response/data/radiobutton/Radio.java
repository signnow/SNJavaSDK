/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.radiobutton;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Radio extends ApiData {

  @JsonProperty("radio_id")
  private final String radioId;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("checked")
  private final String checked;

  @JsonProperty("value")
  private final String value;

  @JsonCreator
  public Radio(
      @JsonProperty("radio_id") String radioId,
      @JsonProperty("created") String created,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("checked") String checked,
      @JsonProperty("value") String value) {
    this.radioId = radioId;
    this.created = created;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.checked = checked;
    this.value = value;
  }

  public String getRadioId() {
    return this.radioId;
  }

  public String getCreated() {
    return this.created;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public String getChecked() {
    return this.checked;
  }

  public String getValue() {
    return this.value;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("radio_id", this.getRadioId());
    map.put("created", this.getCreated());
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("checked", this.getChecked());
    map.put("value", this.getValue());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Radio fromMap(@NotNull Map<String, Object> data) {
    return new Radio(
        (String) data.get("radio_id"),
        (String) data.get("created"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("checked"),
        (String) data.get("value"));
  }
}
