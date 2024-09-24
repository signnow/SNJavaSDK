/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.line;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Line extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("line_width")
  private final String lineWidth;

  @JsonProperty("control_points")
  private final ControlPointCollection controlPoints;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("fill_color")
  private final String fillColor;

  @JsonCreator
  public Line(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("line_width") String lineWidth,
      @JsonProperty("control_points") ControlPointCollection controlPoints,
      @JsonProperty("created") String created,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email,
      @JsonProperty("fill_color") String fillColor) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.subtype = subtype;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.lineWidth = lineWidth;
    this.controlPoints = controlPoints;
    this.created = created;
    this.allowEditing = allowEditing;
    this.userId = userId;
    this.email = email;
    this.fillColor = fillColor;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getSubtype() {
    return this.subtype;
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

  public String getFillColor() {
    return this.fillColor;
  }

  public String getLineWidth() {
    return this.lineWidth;
  }

  public ControlPointCollection getControlPoints() {
    return this.controlPoints;
  }

  public String getCreated() {
    return this.created;
  }

  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("subtype", this.getSubtype());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("fill_color", this.getFillColor());
    map.put("line_width", this.getLineWidth());
    map.put("control_points", this.getControlPoints());
    map.put("created", this.getCreated());
    map.put("allow_editing", this.isAllowEditing());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Line fromMap(@NotNull Map<String, Object> data) {
    return new Line(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("subtype"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("line_width"),
        (ControlPointCollection) data.get("control_points"),
        (String) data.get("created"),
        (Boolean) data.get("allow_editing"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", ""),
        (String) data.getOrDefault("fill_color", null));
  }
}
