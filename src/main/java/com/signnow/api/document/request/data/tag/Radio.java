/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.tag;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Radio button in a document.
 */
public final class Radio extends ApiData {

  /**
   * The page number where the radio button is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The x-coordinate of the radio button.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the radio button.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The width of the radio button.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the radio button.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The checked status of the radio button.
   */
  @JsonProperty("checked")
  private final String checked;

  /**
   * The value of the radio button.
   */
  @JsonProperty("value")
  private final String value;

  /**
   * The x-offset of the radio button.
   */
  @JsonProperty("x-offset")
  private final int xOffset;

  /**
   * The y-offset of the radio button.
   */
  @JsonProperty("y-offset")
  private final int yOffset;

  /**
   * Constructor for the Radio class.
   *
   * @param pageNumber The page number where the radio button is located.
   * @param x The x-coordinate of the radio button.
   * @param y The y-coordinate of the radio button.
   * @param width The width of the radio button.
   * @param height The height of the radio button.
   * @param checked The checked status of the radio button.
   * @param value The value of the radio button.
   * @param xOffset The x-offset of the radio button.
   * @param yOffset The y-offset of the radio button.
   */
  @JsonCreator
  public Radio(
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("checked") String checked,
      @JsonProperty("value") String value,
      @JsonProperty("x-offset") int xOffset,
      @JsonProperty("y-offset") int yOffset) {
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.checked = checked;
    this.value = value;
    this.xOffset = xOffset;
    this.yOffset = yOffset;
  }

  /**
   * @return The page number where the radio button is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The x-coordinate of the radio button.
   */
  public int getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the radio button.
   */
  public int getY() {
    return this.y;
  }

  /**
   * @return The width of the radio button.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * @return The height of the radio button.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * @return The checked status of the radio button.
   */
  public String getChecked() {
    return this.checked;
  }

  /**
   * @return The value of the radio button.
   */
  public String getValue() {
    return this.value;
  }

  /**
   * @return The x-offset of the radio button.
   */
  public int getXOffset() {
    return this.xOffset;
  }

  /**
   * @return The y-offset of the radio button.
   */
  public int getYOffset() {
    return this.yOffset;
  }

  /**
   * Converts the Radio object to a Map.
   *
   * @return A Map representation of the Radio object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("checked", this.getChecked());
    map.put("value", this.getValue());
    map.put("x-offset", this.getXOffset());
    map.put("y-offset", this.getYOffset());
    return map;
  }

  /**
   * Creates a Radio object from a Map.
   *
   * @param data The Map to convert to a Radio object.
   * @return A new Radio object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Radio fromMap(@NotNull Map<String, Object> data) {
    return new Radio(
        (int) data.getOrDefault("page_number", 0),
        (int) data.getOrDefault("x", 0),
        (int) data.getOrDefault("y", 0),
        (int) data.getOrDefault("width", 0),
        (int) data.getOrDefault("height", 0),
        (String) data.getOrDefault("checked", ""),
        (String) data.getOrDefault("value", ""),
        (int) data.getOrDefault("x-offset", 0),
        (int) data.getOrDefault("y-offset", 0));
  }
}