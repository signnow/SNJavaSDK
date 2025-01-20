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

/**
 * This class represents a Hyperlink object with various properties.
 */
public final class Hyperlink extends ApiData {

  /**
   * The ID of the hyperlink.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The page number where the hyperlink is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The x-coordinate of the hyperlink.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the hyperlink.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The font used for the hyperlink.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The size of the hyperlink.
   */
  @JsonProperty("size")
  private final String size;

  /**
   * The data associated with the hyperlink.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The label of the hyperlink.
   */
  @JsonProperty("label")
  private final String label;

  /**
   * The line height of the hyperlink.
   */
  @JsonProperty("line_height")
  private final String lineHeight;

  /**
   * The original font size of the hyperlink.
   */
  @JsonProperty("original_font_size")
  private final String originalFontSize;

  /**
   * The creation date of the hyperlink.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The flag indicating if editing is allowed.
   */
  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  /**
   * The user ID associated with the hyperlink.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email associated with the hyperlink.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Constructor for the Hyperlink class.
   *
   * @param id The ID of the hyperlink.
   * @param pageNumber The page number where the hyperlink is located.
   * @param x The x-coordinate of the hyperlink.
   * @param y The y-coordinate of the hyperlink.
   * @param font The font used for the hyperlink.
   * @param size The size of the hyperlink.
   * @param data The data associated with the hyperlink.
   * @param label The label of the hyperlink.
   * @param lineHeight The line height of the hyperlink.
   * @param originalFontSize The original font size of the hyperlink.
   * @param created The creation date of the hyperlink.
   * @param allowEditing The flag indicating if editing is allowed.
   * @param userId The user ID associated with the hyperlink.
   * @param email The email associated with the hyperlink.
   */
  @JsonCreator
  public Hyperlink(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("font") String font,
      @JsonProperty("size") String size,
      @JsonProperty("data") String data,
      @JsonProperty("label") String label,
      @JsonProperty("line_height") String lineHeight,
      @JsonProperty("original_font_size") String originalFontSize,
      @JsonProperty("created") String created,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.font = font;
    this.size = size;
    this.data = data;
    this.label = label;
    this.lineHeight = lineHeight;
    this.originalFontSize = originalFontSize;
    this.created = created;
    this.allowEditing = allowEditing;
    this.userId = userId;
    this.email = email;
  }

  /**
   * Returns the ID of the hyperlink.
   *
   * @return The ID of the hyperlink.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user ID associated with the hyperlink.
   *
   * @return The user ID associated with the hyperlink.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the email associated with the hyperlink.
   *
   * @return The email associated with the hyperlink.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the page number where the hyperlink is located.
   *
   * @return The page number where the hyperlink is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the x-coordinate of the hyperlink.
   *
   * @return The x-coordinate of the hyperlink.
   */
  public String getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the hyperlink.
   *
   * @return The y-coordinate of the hyperlink.
   */
  public String getY() {
    return this.y;
  }

  /**
   * Returns the font used for the hyperlink.
   *
   * @return The font used for the hyperlink.
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns the size of the hyperlink.
   *
   * @return The size of the hyperlink.
   */
  public String getSize() {
    return this.size;
  }

  /**
   * Returns the data associated with the hyperlink.
   *
   * @return The data associated with the hyperlink.
   */
  public String getData() {
    return this.data;
  }

  /**
   * Returns the label of the hyperlink.
   *
   * @return The label of the hyperlink.
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Returns the line height of the hyperlink.
   *
   * @return The line height of the hyperlink.
   */
  public String getLineHeight() {
    return this.lineHeight;
  }

  /**
   * Returns the original font size of the hyperlink.
   *
   * @return The original font size of the hyperlink.
   */
  public String getOriginalFontSize() {
    return this.originalFontSize;
  }

  /**
   * Returns the creation date of the hyperlink.
   *
   * @return The creation date of the hyperlink.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the flag indicating if editing is allowed.
   *
   * @return The flag indicating if editing is allowed.
   */
  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  /**
   * Converts the Hyperlink object to a Map.
   *
   * @return A Map representation of the Hyperlink object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("font", this.getFont());
    map.put("size", this.getSize());
    map.put("data", this.getData());
    map.put("label", this.getLabel());
    map.put("line_height", this.getLineHeight());
    map.put("original_font_size", this.getOriginalFontSize());
    map.put("created", this.getCreated());
    map.put("allow_editing", this.isAllowEditing());
    return map;
  }

  /**
   * Creates a Hyperlink object from a Map.
   *
   * @param data The Map containing the data for the Hyperlink object.
   * @return A new Hyperlink object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Hyperlink fromMap(@NotNull Map<String, Object> data) {
    return new Hyperlink(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("font"),
        (String) data.get("size"),
        (String) data.get("data"),
        (String) data.get("label"),
        (String) data.get("line_height"),
        (String) data.get("original_font_size"),
        (String) data.get("created"),
        (Boolean) data.get("allow_editing"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", ""));
  }
}