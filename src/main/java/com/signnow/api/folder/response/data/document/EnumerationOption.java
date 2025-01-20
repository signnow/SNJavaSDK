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
 * This class represents an EnumerationOption which extends ApiData.
 */
public final class EnumerationOption extends ApiData {

  /**
   * The id of the EnumerationOption.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The page number of the EnumerationOption.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The width of the EnumerationOption.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the EnumerationOption.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The created timestamp of the EnumerationOption.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The enumeration id of the EnumerationOption.
   */
  @JsonProperty("enumeration_id")
  private final String enumerationId;

  /**
   * The user id of the EnumerationOption.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The data of the EnumerationOption.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The email of the EnumerationOption.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The x-coordinate of the EnumerationOption.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the EnumerationOption.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * Constructor for the EnumerationOption class.
   *
   * @param id The id of the EnumerationOption.
   * @param pageNumber The page number of the EnumerationOption.
   * @param width The width of the EnumerationOption.
   * @param height The height of the EnumerationOption.
   * @param created The created timestamp of the EnumerationOption.
   * @param enumerationId The enumeration id of the EnumerationOption.
   * @param userId The user id of the EnumerationOption.
   * @param data The data of the EnumerationOption.
   * @param email The email of the EnumerationOption.
   * @param x The x-coordinate of the EnumerationOption.
   * @param y The y-coordinate of the EnumerationOption.
   */
  @JsonCreator
  public EnumerationOption(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("created") int created,
      @JsonProperty("enumeration_id") String enumerationId,
      @JsonProperty("user_id") String userId,
      @JsonProperty("data") String data,
      @JsonProperty("email") String email,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.width = width;
    this.height = height;
    this.created = created;
    this.enumerationId = enumerationId;
    this.userId = userId;
    this.data = data;
    this.email = email;
    this.x = x;
    this.y = y;
  }

  /**
   * @return The id of the EnumerationOption.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The enumeration id of the EnumerationOption.
   */
  public String getEnumerationId() {
    return this.enumerationId;
  }

  /**
   * @return The user id of the EnumerationOption.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The data of the EnumerationOption.
   */
  public String getData() {
    return this.data;
  }

  /**
   * @return The email of the EnumerationOption.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The page number of the EnumerationOption.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The width of the EnumerationOption.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the EnumerationOption.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * @return The x-coordinate of the EnumerationOption.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the EnumerationOption.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The created timestamp of the EnumerationOption.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Converts the EnumerationOption to a Map.
   *
   * @return A Map representation of the EnumerationOption.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("enumeration_id", this.getEnumerationId());
    map.put("user_id", this.getUserId());
    map.put("data", this.getData());
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
   * Creates an EnumerationOption from a Map.
   *
   * @param data The Map to create the EnumerationOption from.
   * @return A new EnumerationOption created from the provided Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static EnumerationOption fromMap(@NotNull Map<String, Object> data) {
    return new EnumerationOption(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("width"),
        (String) data.get("height"),
        (int) data.get("created"),
        (String) data.getOrDefault("enumeration_id", null),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("data", null),
        (String) data.getOrDefault("email", null),
        (String) data.getOrDefault("x", null),
        (String) data.getOrDefault("y", null));
  }
}
