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

/**
 * This class represents a Line in the signNow API.
 */
public final class Line extends ApiData {

  /**
   * The id of the Line.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The page number where the Line is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The subtype of the Line.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The x-coordinate of the Line.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the Line.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The width of the Line.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the Line.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The line width of the Line.
   */
  @JsonProperty("line_width")
  private final String lineWidth;

  /**
   * The control points of the Line.
   */
  @JsonProperty("control_points")
  private final ControlPointCollection controlPoints;

  /**
   * The creation date of the Line.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The flag indicating if the Line is editable.
   */
  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  /**
   * The user id who created the Line.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email of the user who created the Line.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The fill color of the Line.
   */
  @JsonProperty("fill_color")
  private final String fillColor;

  /**
   * Constructor for the Line class.
   *
   * @param id The id of the Line.
   * @param pageNumber The page number where the Line is located.
   * @param subtype The subtype of the Line.
   * @param x The x-coordinate of the Line.
   * @param y The y-coordinate of the Line.
   * @param width The width of the Line.
   * @param height The height of the Line.
   * @param lineWidth The line width of the Line.
   * @param controlPoints The control points of the Line.
   * @param created The creation date of the Line.
   * @param allowEditing The flag indicating if the Line is editable.
   * @param userId The user id who created the Line.
   * @param email The email of the user who created the Line.
   * @param fillColor The fill color of the Line.
   */
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

  /**
   * @return The id of the Line.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The user id who created the Line.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The email of the user who created the Line.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The page number where the Line is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The subtype of the Line.
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * @return The x-coordinate of the Line.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the Line.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The width of the Line.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the Line.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * @return The fill color of the Line.
   */
  public String getFillColor() {
    return this.fillColor;
  }

  /**
   * @return The line width of the Line.
   */
  public String getLineWidth() {
    return this.lineWidth;
  }

  /**
   * @return The control points of the Line.
   */
  public ControlPointCollection getControlPoints() {
    return this.controlPoints;
  }

  /**
   * @return The creation date of the Line.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * @return The flag indicating if the Line is editable.
   */
  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  /**
   * Converts the Line object to a Map.
   *
   * @return A Map representing the Line object.
   */
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

  /**
   * Creates a Line object from a Map.
   *
   * @param data A Map representing a Line object.
   * @return A Line object.
   */
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