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
 * This class represents a Signature object with its properties and methods.
 */
public final class Signature extends ApiData {

  /**
   * The id of the signature.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the signature.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email associated with the signature.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The page number where the signature is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The width of the signature.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the signature.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The x-coordinate of the signature.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the signature.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The creation timestamp of the signature.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * Constructor for the Signature class.
   *
   * @param id The id of the signature.
   * @param userId The user id associated with the signature.
   * @param email The email associated with the signature.
   * @param pageNumber The page number where the signature is located.
   * @param width The width of the signature.
   * @param height The height of the signature.
   * @param x The x-coordinate of the signature.
   * @param y The y-coordinate of the signature.
   * @param created The creation timestamp of the signature.
   */
  @JsonCreator
  public Signature(
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
   * @return The id of the signature.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The user id associated with the signature.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The email associated with the signature.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The page number where the signature is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The width of the signature.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the signature.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * @return The x-coordinate of the signature.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the signature.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The creation timestamp of the signature.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Converts the Signature object to a Map.
   *
   * @return A Map representation of the Signature object.
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
   * Creates a Signature object from a Map.
   *
   * @param data The Map containing the data for the Signature object.
   * @return A new Signature object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Signature fromMap(@NotNull Map<String, Object> data) {
    return new Signature(
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