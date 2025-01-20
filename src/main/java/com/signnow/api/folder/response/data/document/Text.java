/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Text class extends ApiData.
 * Represents a text object in the signNow API.
 */
public final class Text extends ApiData {

  /**
   * The id of the text object.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the text object.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The page number where the text object is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The email associated with the text object.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The font of the text object.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The size of the text object.
   */
  @JsonProperty("size")
  private final String size;

  /**
   * The data of the text object.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The x-coordinate of the text object.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the text object.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The line height of the text object.
   */
  @JsonProperty("line_height")
  private final String lineHeight;

  /**
   * The creation timestamp of the text object.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * Constructor for Text class.
   *
   * @param id The id of the text object.
   * @param userId The user id associated with the text object.
   * @param pageNumber The page number where the text object is located.
   * @param email The email associated with the text object.
   * @param font The font of the text object.
   * @param size The size of the text object.
   * @param data The data of the text object.
   * @param x The x-coordinate of the text object.
   * @param y The y-coordinate of the text object.
   * @param lineHeight The line height of the text object.
   * @param created The creation timestamp of the text object.
   */
  @JsonCreator
  public Text(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("email") String email,
      @JsonProperty("font") String font,
      @JsonProperty("size") String size,
      @JsonProperty("data") String data,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("line_height") String lineHeight,
      @JsonProperty("created") int created) {
    this.id = id;
    this.userId = userId;
    this.pageNumber = pageNumber;
    this.email = email;
    this.font = font;
    this.size = size;
    this.data = data;
    this.x = x;
    this.y = y;
    this.lineHeight = lineHeight;
    this.created = created;
  }

  /**
   * @return The id of the text object.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The user id associated with the text object.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The page number where the text object is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The email associated with the text object.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The font of the text object.
   */
  public String getFont() {
    return this.font;
  }

  /**
   * @return The size of the text object.
   */
  public String getSize() {
    return this.size;
  }

  /**
   * @return The data of the text object.
   */
  public String getData() {
    return this.data;
  }

  /**
   * @return The x-coordinate of the text object.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the text object.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The line height of the text object.
   */
  public String getLineHeight() {
    return this.lineHeight;
  }

  /**
   * @return The creation timestamp of the text object.
   */
  public int getCreated() {
    return this.created;
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
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("page_number", this.getPageNumber());
    map.put("email", this.getEmail());
    map.put("font", this.getFont());
    map.put("size", this.getSize());
    map.put("data", this.getData());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("line_height", this.getLineHeight());
    map.put("created", this.getCreated());
    return map;
  }

  /**
   * Creates a Text object from a Map.
   *
   * @param data The Map to convert to a Text object.
   * @return A new Text object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Text fromMap(@NotNull Map<String, Object> data) {
    return new Text(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("page_number"),
        (String) data.get("email"),
        (String) data.get("font"),
        (String) data.get("size"),
        (String) data.get("data"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("line_height"),
        (Integer) data.get("created"));
  }
}