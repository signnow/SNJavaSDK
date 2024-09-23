/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.line;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Line extends ApiData {

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

  @JsonProperty("fill_color")
  private final String fillColor;

  @JsonProperty("line_width")
  private final int lineWidth;

  @JsonProperty("control_points")
  private final ControlPointCollection controlPoints;

  @JsonCreator
  public Line(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("fill_color") String fillColor,
      @JsonProperty("line_width") int lineWidth,
      @JsonProperty("control_points") ControlPointCollection controlPoints) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.subtype = subtype;
    this.pageNumber = pageNumber;
    this.fillColor = fillColor;
    this.lineWidth = lineWidth;
    this.controlPoints = controlPoints;
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

  public String getFillColor() {
    return this.fillColor;
  }

  public int getLineWidth() {
    return this.lineWidth;
  }

  public ControlPointCollection getControlPoints() {
    return this.controlPoints;
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
    map.put("fill_color", this.getFillColor());
    map.put("line_width", this.getLineWidth());
    map.put("control_points", this.getControlPoints());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Line fromMap(@NotNull Map<String, Object> data) {
    return new Line(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("width"),
        (int) data.get("height"),
        (String) data.get("subtype"),
        (int) data.get("page_number"),
        (String) data.get("fill_color"),
        (int) data.get("line_width"),
        (ControlPointCollection) data.get("control_points"));
  }
}
