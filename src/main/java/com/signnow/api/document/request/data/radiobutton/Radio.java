/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.radiobutton;

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
   * The value of the radio button.
   */
  @JsonProperty("value")
  private final String value;

  /**
   * The checked status of the radio button.
   */
  @JsonProperty("checked")
  private final int checked;

  /**
   * The page number where the radio button is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * Constructor for the Radio class.
   *
   * @param x The x-coordinate of the radio button.
   * @param y The y-coordinate of the radio button.
   * @param width The width of the radio button.
   * @param height The height of the radio button.
   * @param value The value of the radio button.
   * @param checked The checked status of the radio button.
   * @param pageNumber The page number where the radio button is located.
   */
  @JsonCreator
  public Radio(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("value") String value,
      @JsonProperty("checked") int checked,
      @JsonProperty("page_number") int pageNumber) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.value = value;
    this.checked = checked;
    this.pageNumber = pageNumber;
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
   * @return The value of the radio button.
   */
  public String getValue() {
    return this.value;
  }

  /**
   * @return The checked status of the radio button.
   */
  public int getChecked() {
    return this.checked;
  }

  /**
   * @return The page number where the radio button is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Converts the radio button data to a map.
   *
   * @return A map containing the radio button data.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("value", this.getValue());
    map.put("checked", this.getChecked());
    map.put("page_number", this.getPageNumber());
    return map;
  }

  /**
   * Creates a new Radio object from a map of data.
   *
   * @param data A map containing the radio button data.
   * @return A new Radio object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Radio fromMap(@NotNull Map<String, Object> data) {
    return new Radio(
        (int) data.getOrDefault("x", 0),
        (int) data.getOrDefault("y", 0),
        (int) data.getOrDefault("width", 0),
        (int) data.getOrDefault("height", 0),
        (String) data.getOrDefault("value", ""),
        (int) data.getOrDefault("checked", 0),
        (int) data.getOrDefault("page_number", 0));
  }
}