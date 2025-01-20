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
 * Text class extends ApiData and represents a text object in a document.
 */
public final class Text extends ApiData {

  /**
   * The x-coordinate of the text.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the text.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The size of the text.
   */
  @JsonProperty("size")
  private final int size;

  /**
   * The width of the text.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the text.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The subtype of the text.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The page number where the text is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The data of the text.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The font of the text.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The line height of the text.
   */
  @JsonProperty("line_height")
  private final int lineHeight;

  /**
   * The field id of the text.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * Constructor for Text class.
   *
   * @param x The x-coordinate of the text.
   * @param y The y-coordinate of the text.
   * @param size The size of the text.
   * @param width The width of the text.
   * @param height The height of the text.
   * @param subtype The subtype of the text.
   * @param pageNumber The page number where the text is located.
   * @param data The data of the text.
   * @param font The font of the text.
   * @param lineHeight The line height of the text.
   * @param fieldId The field id of the text.
   */
  @JsonCreator
  public Text(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data,
      @JsonProperty("font") String font,
      @JsonProperty("line_height") int lineHeight,
      @JsonProperty("field_id") String fieldId) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.subtype = subtype;
    this.pageNumber = pageNumber;
    this.data = data;
    this.font = font;
    this.lineHeight = lineHeight;
    this.fieldId = fieldId;
  }

  /**
   * Constructor for Text class with default values for subtype, font, lineHeight, and fieldId.
   *
   * @param x The x-coordinate of the text.
   * @param y The y-coordinate of the text.
   * @param size The size of the text.
   * @param width The width of the text.
   * @param height The height of the text.
   * @param pageNumber The page number where the text is located.
   * @param data The data of the text.
   */
  public Text(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.subtype = "text";
    this.pageNumber = pageNumber;
    this.data = data;
    this.font = null;
    this.lineHeight = 0;
    this.fieldId = null;
  }

  /**
   * @return The x-coordinate of the text.
   */
  public int getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the text.
   */
  public int getY() {
    return this.y;
  }

  /**
   * @return The size of the text.
   */
  public int getSize() {
    return this.size;
  }

  /**
   * @return The width of the text.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * @return The height of the text.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * @return The subtype of the text.
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * @return The page number where the text is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The data of the text.
   */
  public String getData() {
    return this.data;
  }

  /**
   * @return The font of the text.
   */
  public String getFont() {
    return this.font;
  }

  /**
   * @return The line height of the text.
   */
  public int getLineHeight() {
    return this.lineHeight;
  }

  /**
   * @return The field id of the text.
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Converts the Text object to a Map.
   *
   * @return A Map representation of the Text object.
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
    map.put("subtype", this.getSubtype());
    map.put("page_number", this.getPageNumber());
    map.put("data", this.getData());
    map.put("font", this.getFont());
    map.put("line_height", this.getLineHeight());
    map.put("field_id", this.getFieldId());
    return map;
  }

  /**
   * Creates a Text object from a Map.
   *
   * @param data The Map containing the data for the Text object.
   * @return A new Text object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Text fromMap(@NotNull Map<String, Object> data) {
    return new Text(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("size"),
        (int) data.get("width"),
        (int) data.get("height"),
        (String) data.get("subtype"),
        (int) data.get("page_number"),
        (String) data.get("data"),
        (String) data.get("font"),
        (int) data.get("line_height"),
        (String) data.getOrDefault("field_id", ""));
  }
}