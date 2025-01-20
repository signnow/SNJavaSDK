/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.radiobutton;

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
   * The ID of the radio button.
   */
  @JsonProperty("radio_id")
  private final String radioId;

  /**
   * The creation date of the radio button.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The page number where the radio button is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The x-coordinate of the radio button.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the radio button.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The width of the radio button.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the radio button.
   */
  @JsonProperty("height")
  private final String height;

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
   * Constructor for the Radio class.
   *
   * @param radioId The ID of the radio button.
   * @param created The creation date of the radio button.
   * @param pageNumber The page number where the radio button is located.
   * @param x The x-coordinate of the radio button.
   * @param y The y-coordinate of the radio button.
   * @param width The width of the radio button.
   * @param height The height of the radio button.
   * @param checked The checked status of the radio button.
   * @param value The value of the radio button.
   */
  @JsonCreator
  public Radio(
      @JsonProperty("radio_id") String radioId,
      @JsonProperty("created") String created,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("checked") String checked,
      @JsonProperty("value") String value) {
    this.radioId = radioId;
    this.created = created;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.checked = checked;
    this.value = value;
  }

  /**
   * @return The ID of the radio button.
   */
  public String getRadioId() {
    return this.radioId;
  }

  /**
   * @return The creation date of the radio button.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * @return The page number where the radio button is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The x-coordinate of the radio button.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the radio button.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The width of the radio button.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the radio button.
   */
  public String getHeight() {
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
   * Converts the Radio object to a Map.
   *
   * @return A Map representation of the Radio object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("radio_id", this.getRadioId());
    map.put("created", this.getCreated());
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("checked", this.getChecked());
    map.put("value", this.getValue());
    return map;
  }

  /**
   * Creates a Radio object from a Map.
   *
   * @param data A Map containing the data for the Radio object.
   * @return A new Radio object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Radio fromMap(@NotNull Map<String, Object> data) {
    return new Radio(
        (String) data.get("radio_id"),
        (String) data.get("created"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("checked"),
        (String) data.get("value"));
  }
}