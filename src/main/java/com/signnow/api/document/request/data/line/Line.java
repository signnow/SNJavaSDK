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

/**
 * Represents a line in a document.
 */
public final class Line extends ApiData {

  /**
   * The x-coordinate of the line.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the line.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The width of the line.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the line.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The subtype of the line.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The page number where the line is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The fill color of the line.
   */
  @JsonProperty("fill_color")
  private final String fillColor;

  /**
   * The width of the line.
   */
  @JsonProperty("line_width")
  private final int lineWidth;

  /**
   * The control points of the line.
   */
  @JsonProperty("control_points")
  private final ControlPointCollection controlPoints;

  /**
   * Constructs a new Line with the specified parameters.
   *
   * @param x the x-coordinate of the line
   * @param y the y-coordinate of the line
   * @param width the width of the line
   * @param height the height of the line
   * @param subtype the subtype of the line
   * @param pageNumber the page number where the line is located
   * @param fillColor the fill color of the line
   * @param lineWidth the width of the line
   * @param controlPoints the control points of the line
   */
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

  /**
   * Returns the x-coordinate of the line.
   *
   * @return the x-coordinate of the line
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the line.
   *
   * @return the y-coordinate of the line
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the width of the line.
   *
   * @return the width of the line
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the line.
   *
   * @return the height of the line
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Returns the subtype of the line.
   *
   * @return the subtype of the line
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * Returns the page number where the line is located.
   *
   * @return the page number where the line is located
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the fill color of the line.
   *
   * @return the fill color of the line
   */
  public String getFillColor() {
    return this.fillColor;
  }

  /**
   * Returns the width of the line.
   *
   * @return the width of the line
   */
  public int getLineWidth() {
    return this.lineWidth;
  }

  /**
   * Returns the control points of the line.
   *
   * @return the control points of the line
   */
  public ControlPointCollection getControlPoints() {
    return this.controlPoints;
  }

  /**
   * Converts this line to a map.
   *
   * @return a map representation of this line
   */
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

  /**
   * Creates a new Line from the specified map.
   *
   * @param data a map containing the data for the line
   * @return a new Line created from the specified map
   */
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