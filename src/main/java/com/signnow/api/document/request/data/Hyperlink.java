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

/**
 * This class represents a Hyperlink with its properties and methods.
 */
public final class Hyperlink extends ApiData {

  /**
   * The x-coordinate of the hyperlink.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the hyperlink.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The size of the hyperlink.
   */
  @JsonProperty("size")
  private final int size;

  /**
   * The width of the hyperlink.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the hyperlink.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The page number where the hyperlink is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The font of the hyperlink.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The line height of the hyperlink.
   */
  @JsonProperty("line_height")
  private final int lineHeight;

  /**
   * The field id of the hyperlink.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * Constructor for creating a Hyperlink object with all properties.
   *
   * @param x The x-coordinate of the hyperlink.
   * @param y The y-coordinate of the hyperlink.
   * @param size The size of the hyperlink.
   * @param width The width of the hyperlink.
   * @param height The height of the hyperlink.
   * @param pageNumber The page number where the hyperlink is located.
   * @param font The font of the hyperlink.
   * @param lineHeight The line height of the hyperlink.
   * @param fieldId The field id of the hyperlink.
   */
  @JsonCreator
  public Hyperlink(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("font") String font,
      @JsonProperty("line_height") int lineHeight,
      @JsonProperty("field_id") String fieldId) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.font = font;
    this.lineHeight = lineHeight;
    this.fieldId = fieldId;
  }

  /**
   * Constructor for creating a Hyperlink object with only some properties.
   *
   * @param x The x-coordinate of the hyperlink.
   * @param y The y-coordinate of the hyperlink.
   * @param size The size of the hyperlink.
   * @param width The width of the hyperlink.
   * @param height The height of the hyperlink.
   * @param pageNumber The page number where the hyperlink is located.
   */
  public Hyperlink(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.font = null;
    this.lineHeight = 0;
    this.fieldId = null;
  }

  /**
   * @return The x-coordinate of the hyperlink.
   */
  public int getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the hyperlink.
   */
  public int getY() {
    return this.y;
  }

  /**
   * @return The size of the hyperlink.
   */
  public int getSize() {
    return this.size;
  }

  /**
   * @return The width of the hyperlink.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * @return The height of the hyperlink.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * @return The page number where the hyperlink is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The font of the hyperlink.
   */
  public String getFont() {
    return this.font;
  }

  /**
   * @return The line height of the hyperlink.
   */
  public int getLineHeight() {
    return this.lineHeight;
  }

  /**
   * @return The field id of the hyperlink.
   */
  public String getFieldId() {
    return this.fieldId;
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
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("size", this.getSize());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("page_number", this.getPageNumber());
    map.put("font", this.getFont());
    map.put("line_height", this.getLineHeight());
    map.put("field_id", this.getFieldId());
    return map;
  }

  /**
   * Creates a Hyperlink object from a Map.
   *
   * @param data The Map containing the Hyperlink data.
   * @return A new Hyperlink object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Hyperlink fromMap(@NotNull Map<String, Object> data) {
    return new Hyperlink(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("size"),
        (int) data.get("width"),
        (int) data.get("height"),
        (int) data.get("page_number"),
        (String) data.get("font"),
        (int) data.get("line_height"),
        (String) data.getOrDefault("field_id", ""));
  }
}