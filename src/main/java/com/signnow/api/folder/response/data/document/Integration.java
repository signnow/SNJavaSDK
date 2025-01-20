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
 * This class represents an Integration object with various properties.
 */
public final class Integration extends ApiData {

  /**
   * The id of the Integration.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the Integration.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email associated with the Integration.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The page number associated with the Integration.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The width of the Integration.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the Integration.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The x-coordinate of the Integration.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the Integration.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The creation timestamp of the Integration.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * Constructs an Integration object with the provided parameters.
   *
   * @param id The id of the Integration.
   * @param userId The user id associated with the Integration.
   * @param email The email associated with the Integration.
   * @param pageNumber The page number associated with the Integration.
   * @param width The width of the Integration.
   * @param height The height of the Integration.
   * @param x The x-coordinate of the Integration.
   * @param y The y-coordinate of the Integration.
   * @param created The creation timestamp of the Integration.
   */
  @JsonCreator
  public Integration(
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
   * Returns the id of the Integration.
   *
   * @return The id of the Integration.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id associated with the Integration.
   *
   * @return The user id associated with the Integration.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the email associated with the Integration.
   *
   * @return The email associated with the Integration.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the page number associated with the Integration.
   *
   * @return The page number associated with the Integration.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the width of the Integration.
   *
   * @return The width of the Integration.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the Integration.
   *
   * @return The height of the Integration.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * Returns the x-coordinate of the Integration.
   *
   * @return The x-coordinate of the Integration.
   */
  public String getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the Integration.
   *
   * @return The y-coordinate of the Integration.
   */
  public String getY() {
    return this.y;
  }

  /**
   * Returns the creation timestamp of the Integration.
   *
   * @return The creation timestamp of the Integration.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Converts the Integration object to a Map.
   *
   * @return A Map representation of the Integration object.
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
   * Creates an Integration object from a Map.
   *
   * @param data The Map containing the Integration data.
   * @return A new Integration object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Integration fromMap(@NotNull Map<String, Object> data) {
    return new Integration(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("email"),
        (String) data.get("page_number"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("x"),
        (String) data.get("y"),
        (Integer) data.get("created"));
  }
}