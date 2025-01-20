/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Check class extends ApiData.
 * Represents a check object in a document.
 */
public final class Check extends ApiData {

  /**
   * The x-coordinate of the check.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the check.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The width of the check.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the check.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The subtype of the check.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The page number where the check is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * Constructor for Check class.
   *
   * @param x The x-coordinate of the check.
   * @param y The y-coordinate of the check.
   * @param width The width of the check.
   * @param height The height of the check.
   * @param subtype The subtype of the check.
   * @param pageNumber The page number where the check is located.
   */
  @JsonCreator
  public Check(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("page_number") int pageNumber) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.subtype = subtype;
    this.pageNumber = pageNumber;
  }

  /**
   * Overloaded constructor for Check class with default subtype as "check".
   *
   * @param x The x-coordinate of the check.
   * @param y The y-coordinate of the check.
   * @param width The width of the check.
   * @param height The height of the check.
   * @param pageNumber The page number where the check is located.
   */
  public Check(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.subtype = "check";
    this.pageNumber = pageNumber;
  }

  /**
   * @return The x-coordinate of the check.
   */
  public int getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the check.
   */
  public int getY() {
    return this.y;
  }

  /**
   * @return The width of the check.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * @return The height of the check.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * @return The subtype of the check.
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * @return The page number where the check is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Converts the Check object to a Map.
   *
   * @return A Map representation of the Check object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("subtype", this.getSubtype());
    map.put("page_number", this.getPageNumber());
    return map;
  }

  /**
   * Creates a Check object from a Map.
   *
   * @param data A Map containing the data for a Check object.
   * @return A new Check object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Check fromMap(@NotNull Map<String, Object> data) {
    return new Check(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("width"),
        (int) data.get("height"),
        (String) data.get("subtype"),
        (int) data.get("page_number"));
  }
}