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
 * Represents a radio button in the signNow API.
 */
public final class Radiobutton extends ApiData {

  /**
   * The id of the radio button.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the radio button.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The name of the radio button.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The timestamp when the radio button was created on the server.
   */
  @JsonProperty("server_created_timestamp")
  private final String serverCreatedTimestamp;

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
   * The size of the radio button.
   */
  @JsonProperty("size")
  private final String size;

  /**
   * The line height of the radio button.
   */
  @JsonProperty("line_height")
  private final String lineHeight;

  /**
   * The page number where the radio button is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * Indicates whether the radio button is printed or not.
   */
  @JsonProperty("is_printed")
  private final boolean isPrinted;

  /**
   * The font of the radio button.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The original font size of the radio button.
   */
  @JsonProperty("original_font_size")
  private final String originalFontSize;

  /**
   * The collection of radio buttons.
   */
  @JsonProperty("radio")
  private final RadioCollection radio;

  /**
   * Constructs a new radio button with the specified details.
   *
   * @param id the id of the radio button
   * @param userId the user id associated with the radio button
   * @param name the name of the radio button
   * @param serverCreatedTimestamp the timestamp when the radio button was created on the server
   * @param x the x-coordinate of the radio button
   * @param y the y-coordinate of the radio button
   * @param size the size of the radio button
   * @param lineHeight the line height of the radio button
   * @param pageNumber the page number where the radio button is located
   * @param isPrinted whether the radio button is printed or not
   * @param font the font of the radio button
   * @param originalFontSize the original font size of the radio button
   * @param radio the collection of radio buttons
   */
  @JsonCreator
  public Radiobutton(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("name") String name,
      @JsonProperty("server_created_timestamp") String serverCreatedTimestamp,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("size") String size,
      @JsonProperty("line_height") String lineHeight,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("is_printed") boolean isPrinted,
      @JsonProperty("font") String font,
      @JsonProperty("original_font_size") String originalFontSize,
      @JsonProperty("radio") RadioCollection radio) {
    this.id = id;
    this.userId = userId;
    this.name = name;
    this.serverCreatedTimestamp = serverCreatedTimestamp;
    this.x = x;
    this.y = y;
    this.size = size;
    this.lineHeight = lineHeight;
    this.pageNumber = pageNumber;
    this.isPrinted = isPrinted;
    this.font = font;
    this.originalFontSize = originalFontSize;
    this.radio = radio;
  }

  /**
   * Returns the id of the radio button.
   *
   * @return the id of the radio button
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id associated with the radio button.
   *
   * @return the user id associated with the radio button
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the name of the radio button.
   *
   * @return the name of the radio button
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the timestamp when the radio button was created on the server.
   *
   * @return the timestamp when the radio button was created on the server
   */
  public String getServerCreatedTimestamp() {
    return this.serverCreatedTimestamp;
  }

  /**
   * Returns the x-coordinate of the radio button.
   *
   * @return the x-coordinate of the radio button
   */
  public String getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the radio button.
   *
   * @return the y-coordinate of the radio button
   */
  public String getY() {
    return this.y;
  }

  /**
   * Returns the size of the radio button.
   *
   * @return the size of the radio button
   */
  public String getSize() {
    return this.size;
  }

  /**
   * Returns the line height of the radio button.
   *
   * @return the line height of the radio button
   */
  public String getLineHeight() {
    return this.lineHeight;
  }

  /**
   * Returns the page number where the radio button is located.
   *
   * @return the page number where the radio button is located
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns whether the radio button is printed or not.
   *
   * @return true if the radio button is printed, false otherwise
   */
  public boolean isPrinted() {
    return this.isPrinted;
  }

  /**
   * Returns the font of the radio button.
   *
   * @return the font of the radio button
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns the original font size of the radio button.
   *
   * @return the original font size of the radio button
   */
  public String getOriginalFontSize() {
    return this.originalFontSize;
  }

  /**
   * Returns the collection of radio buttons.
   *
   * @return the collection of radio buttons
   */
  public RadioCollection getRadio() {
    return this.radio;
  }

  /**
   * Converts the radio button to a map.
   *
   * @return a map representing the radio button
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("name", this.getName());
    map.put("server_created_timestamp", this.getServerCreatedTimestamp());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("size", this.getSize());
    map.put("line_height", this.getLineHeight());
    map.put("page_number", this.getPageNumber());
    map.put("is_printed", this.isPrinted());
    map.put("font", this.getFont());
    map.put("original_font_size", this.getOriginalFontSize());
    map.put("radio", this.getRadio());
    return map;
  }

  /**
   * Creates a new radio button from the specified map.
   *
   * @param data a map containing the details of the radio button
   * @return a new radio button created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static Radiobutton fromMap(@NotNull Map<String, Object> data) {
    return new Radiobutton(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("name"),
        (String) data.get("server_created_timestamp"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("size"),
        (String) data.get("line_height"),
        (String) data.get("page_number"),
        (Boolean) data.get("is_printed"),
        (String) data.get("font"),
        (String) data.get("original_font_size"),
        (RadioCollection) data.get("radio"));
  }
}