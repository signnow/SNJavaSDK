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
 * This class represents an Insert object with properties and methods to manipulate it.
 */
public final class Insert extends ApiData {

  /**
   * The id of the Insert.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the Insert.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email associated with the Insert.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The page number of the Insert.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The width of the Insert.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the Insert.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The x-coordinate of the Insert.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the Insert.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The creation timestamp of the Insert.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * Constructor for the Insert class.
   *
   * @param id The id of the Insert.
   * @param userId The user id associated with the Insert.
   * @param email The email associated with the Insert.
   * @param pageNumber The page number of the Insert.
   * @param width The width of the Insert.
   * @param height The height of the Insert.
   * @param x The x-coordinate of the Insert.
   * @param y The y-coordinate of the Insert.
   * @param created The creation timestamp of the Insert.
   */
  @JsonCreator
  public Insert(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("created") int created) {
    this.id = id;
    this.userId = userId;
    this.email = email;
    this.pageNumber = pageNumber;
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
    this.created = created;
  }

  /**
   * Returns the id of the Insert.
   *
   * @return The id of the Insert.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id associated with the Insert.
   *
   * @return The user id associated with the Insert.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the email associated with the Insert.
   *
   * @return The email associated with the Insert.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the page number of the Insert.
   *
   * @return The page number of the Insert.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the width of the Insert.
   *
   * @return The width of the Insert.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the Insert.
   *
   * @return The height of the Insert.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * Returns the x-coordinate of the Insert.
   *
   * @return The x-coordinate of the Insert.
   */
  public String getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the Insert.
   *
   * @return The y-coordinate of the Insert.
   */
  public String getY() {
    return this.y;
  }

  /**
   * Returns the creation timestamp of the Insert.
   *
   * @return The creation timestamp of the Insert.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Converts the Insert object to a Map.
   *
   * @return A Map representation of the Insert object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("created", this.getCreated());
    return map;
  }

  /**
   * Creates an Insert object from a Map.
   *
   * @param data The Map to convert to an Insert object.
   * @return An Insert object created from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Insert fromMap(@NotNull Map<String, Object> data) {
    return new Insert(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("email"),
        (String) data.get("page_number"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("x"),
        (String) data.get("y"),
        (int) data.get("created"));
  }
}