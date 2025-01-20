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
 * This class represents an IntegrationObject which extends ApiData.
 */
public final class IntegrationObject extends ApiData {

  /**
   * The x-coordinate of the IntegrationObject.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the IntegrationObject.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The size of the IntegrationObject.
   */
  @JsonProperty("size")
  private final int size;

  /**
   * The width of the IntegrationObject.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the IntegrationObject.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The page number of the IntegrationObject.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The font of the IntegrationObject.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The data of the IntegrationObject.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The status of the IntegrationObject.
   */
  @JsonProperty("status")
  private final int status;

  /**
   * The color of the IntegrationObject.
   */
  @JsonProperty("color")
  private final String color;

  /**
   * The creation time of the IntegrationObject.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The active status of the IntegrationObject.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * The line height of the IntegrationObject.
   */
  @JsonProperty("line_height")
  private final int lineHeight;

  /**
   * The bold status of the IntegrationObject.
   */
  @JsonProperty("bold")
  private final boolean bold;

  /**
   * The italic status of the IntegrationObject.
   */
  @JsonProperty("italic")
  private final boolean italic;

  /**
   * The underline status of the IntegrationObject.
   */
  @JsonProperty("underline")
  private final boolean underline;

  /**
   * The field id of the IntegrationObject.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * The API integration id of the IntegrationObject.
   */
  @JsonProperty("api_integration_id")
  private final String apiIntegrationId;

  /**
   * Constructor for IntegrationObject.
   *
   * @param x The x-coordinate.
   * @param y The y-coordinate.
   * @param size The size.
   * @param width The width.
   * @param height The height.
   * @param pageNumber The page number.
   * @param font The font.
   * @param data The data.
   * @param status The status.
   * @param color The color.
   * @param created The creation time.
   * @param active The active status.
   * @param lineHeight The line height.
   * @param bold The bold status.
   * @param italic The italic status.
   * @param underline The underline status.
   * @param fieldId The field id.
   * @param apiIntegrationId The API integration id.
   */
  @JsonCreator
  public IntegrationObject(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("font") String font,
      @JsonProperty("data") String data,
      @JsonProperty("status") int status,
      @JsonProperty("color") String color,
      @JsonProperty("created") int created,
      @JsonProperty("active") boolean active,
      @JsonProperty("line_height") int lineHeight,
      @JsonProperty("bold") boolean bold,
      @JsonProperty("italic") boolean italic,
      @JsonProperty("underline") boolean underline,
      @JsonProperty("field_id") String fieldId,
      @JsonProperty("api_integration_id") String apiIntegrationId) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.font = font;
    this.data = data;
    this.status = status;
    this.color = color;
    this.created = created;
    this.active = active;
    this.lineHeight = lineHeight;
    this.bold = bold;
    this.italic = italic;
    this.underline = underline;
    this.fieldId = fieldId;
    this.apiIntegrationId = apiIntegrationId;
  }

  /**
   * Overloaded constructor for IntegrationObject.
   *
   * @param x The x-coordinate.
   * @param y The y-coordinate.
   * @param size The size.
   * @param width The width.
   * @param height The height.
   * @param pageNumber The page number.
   * @param font The font.
   * @param data The data.
   * @param status The status.
   * @param color The color.
   * @param created The creation time.
   * @param active The active status.
   * @param lineHeight The line height.
   */
  public IntegrationObject(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("font") String font,
      @JsonProperty("data") String data,
      @JsonProperty("status") int status,
      @JsonProperty("color") String color,
      @JsonProperty("created") int created,
      @JsonProperty("active") boolean active,
      @JsonProperty("line_height") int lineHeight) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.font = font;
    this.data = data;
    this.status = status;
    this.color = color;
    this.created = created;
    this.active = active;
    this.lineHeight = lineHeight;
    this.bold = false;
    this.italic = false;
    this.underline = false;
    this.fieldId = null;
    this.apiIntegrationId = null;
  }

  /**
   * Returns the x-coordinate.
   *
   * @return The x-coordinate.
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate.
   *
   * @return The y-coordinate.
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the size.
   *
   * @return The size.
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Returns the width.
   *
   * @return The width.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height.
   *
   * @return The height.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Returns the page number.
   *
   * @return The page number.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the font.
   *
   * @return The font.
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns the data.
   *
   * @return The data.
   */
  public String getData() {
    return this.data;
  }

  /**
   * Returns the status.
   *
   * @return The status.
   */
  public int getStatus() {
    return this.status;
  }

  /**
   * Returns the color.
   *
   * @return The color.
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Returns the bold status.
   *
   * @return The bold status.
   */
  public boolean isBold() {
    return this.bold;
  }

  /**
   * Returns the italic status.
   *
   * @return The italic status.
   */
  public boolean isItalic() {
    return this.italic;
  }

  /**
   * Returns the underline status.
   *
   * @return The underline status.
   */
  public boolean isUnderline() {
    return this.underline;
  }

  /**
   * Returns the creation time.
   *
   * @return The creation time.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the active status.
   *
   * @return The active status.
   */
  public boolean isActive() {
    return this.active;
  }

  /**
   * Returns the line height.
   *
   * @return The line height.
   */
  public int getLineHeight() {
    return this.lineHeight;
  }

  /**
   * Returns the field id.
   *
   * @return The field id.
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Returns the API integration id.
   *
   * @return The API integration id.
   */
  public String getApiIntegrationId() {
    return this.apiIntegrationId;
  }

  /**
   * Converts the IntegrationObject to a Map.
   *
   * @return The Map representation of the IntegrationObject.
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
    map.put("data", this.getData());
    map.put("status", this.getStatus());
    map.put("color", this.getColor());
    map.put("bold", this.isBold());
    map.put("italic", this.isItalic());
    map.put("underline", this.isUnderline());
    map.put("created", this.getCreated());
    map.put("active", this.isActive());
    map.put("line_height", this.getLineHeight());
    map.put("field_id", this.getFieldId());
    map.put("api_integration_id", this.getApiIntegrationId());
    return map;
  }

  /**
   * Creates an IntegrationObject from a Map.
   *
   * @param data The Map representation of the IntegrationObject.
   * @return The IntegrationObject.
   */
  @NotNull
  @Contract("_ -> new")
  public static IntegrationObject fromMap(@NotNull Map<String, Object> data) {
    return new IntegrationObject(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("size"),
        (int) data.get("width"),
        (int) data.get("height"),
        (int) data.get("page_number"),
        (String) data.get("font"),
        (String) data.get("data"),
        (int) data.get("status"),
        (String) data.get("color"),
        (int) data.get("created"),
        (boolean) data.get("active"),
        (int) data.get("line_height"),
        (boolean) data.getOrDefault("bold", false),
        (boolean) data.getOrDefault("italic", false),
        (boolean) data.getOrDefault("underline", false),
        (String) data.getOrDefault("field_id", ""),
        (String) data.getOrDefault("api_integration_id", null));
  }
}