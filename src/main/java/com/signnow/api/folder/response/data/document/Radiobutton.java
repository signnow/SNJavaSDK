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
 * This class represents a Radiobutton in the signNow API.
 */
public final class Radiobutton extends ApiData {

  /**
   * The id of the Radiobutton.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the Radiobutton.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email associated with the Radiobutton.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The page number where the Radiobutton is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The width of the Radiobutton.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the Radiobutton.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The x-coordinate of the Radiobutton.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the Radiobutton.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The creation timestamp of the Radiobutton.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * Constructor for the Radiobutton class.
   *
   * @param id The id of the Radiobutton.
   * @param userId The user id associated with the Radiobutton.
   * @param email The email associated with the Radiobutton.
   * @param pageNumber The page number where the Radiobutton is located.
   * @param width The width of the Radiobutton.
   * @param height The height of the Radiobutton.
   * @param x The x-coordinate of the Radiobutton.
   * @param y The y-coordinate of the Radiobutton.
   * @param created The creation timestamp of the Radiobutton.
   */
  @JsonCreator
  public Radiobutton(
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
   * @return The id of the Radiobutton.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The user id associated with the Radiobutton.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The email associated with the Radiobutton.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The page number where the Radiobutton is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The width of the Radiobutton.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the Radiobutton.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * @return The x-coordinate of the Radiobutton.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the Radiobutton.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The creation timestamp of the Radiobutton.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Converts the Radiobutton object to a Map.
   *
   * @return A Map representation of the Radiobutton object.
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
   * Creates a Radiobutton object from a Map.
   *
   * @param data The Map to convert to a Radiobutton object.
   * @return A new Radiobutton object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Radiobutton fromMap(@NotNull Map<String, Object> data) {
    return new Radiobutton(
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