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
 * This class represents a Seal object in the signNow API.
 */
public final class Seal extends ApiData {

  /**
   * The id of the Seal.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the Seal.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email associated with the Seal.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The page number where the Seal is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The width of the Seal.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the Seal.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The x-coordinate of the Seal.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the Seal.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The creation timestamp of the Seal.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * Constructor for the Seal class.
   *
   * @param id The id of the Seal.
   * @param userId The user id associated with the Seal.
   * @param email The email associated with the Seal.
   * @param pageNumber The page number where the Seal is located.
   * @param width The width of the Seal.
   * @param height The height of the Seal.
   * @param x The x-coordinate of the Seal.
   * @param y The y-coordinate of the Seal.
   * @param created The creation timestamp of the Seal.
   */
  @JsonCreator
  public Seal(
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
   * @return The id of the Seal.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The user id associated with the Seal.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The email associated with the Seal.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The page number where the Seal is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The width of the Seal.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the Seal.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * @return The x-coordinate of the Seal.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the Seal.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The creation timestamp of the Seal.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Converts the Seal object to a Map.
   *
   * @return A Map representation of the Seal object.
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
   * Creates a Seal object from a Map.
   *
   * @param data The Map containing the Seal data.
   * @return A new Seal object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Seal fromMap(@NotNull Map<String, Object> data) {
    return new Seal(
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