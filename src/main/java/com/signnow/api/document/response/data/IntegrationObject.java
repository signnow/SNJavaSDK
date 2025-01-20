/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an IntegrationObject which extends ApiData.
 */
public final class IntegrationObject extends ApiData {

  /**
   * The id of the IntegrationObject.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The page number of the IntegrationObject.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The font of the IntegrationObject.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The size of the IntegrationObject.
   */
  @JsonProperty("size")
  private final String size;

  /**
   * The data of the IntegrationObject.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The x-coordinate of the IntegrationObject.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the IntegrationObject.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The json attributes of the IntegrationObject.
   */
  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  /**
   * The line height of the IntegrationObject.
   */
  @JsonProperty("line_height")
  private final float lineHeight;

  /**
   * The user id of the IntegrationObject.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email of the IntegrationObject.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The api integration id of the IntegrationObject.
   */
  @JsonProperty("api_integration_id")
  private final String apiIntegrationId;

  /**
   * The created timestamp of the IntegrationObject.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The allow editing flag of the IntegrationObject.
   */
  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  /**
   * The width of the IntegrationObject.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the IntegrationObject.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * Constructor for IntegrationObject.
   *
   * @param id The id of the IntegrationObject.
   * @param pageNumber The page number of the IntegrationObject.
   * @param font The font of the IntegrationObject.
   * @param size The size of the IntegrationObject.
   * @param data The data of the IntegrationObject.
   * @param x The x-coordinate of the IntegrationObject.
   * @param y The y-coordinate of the IntegrationObject.
   * @param jsonAttributes The json attributes of the IntegrationObject.
   * @param lineHeight The line height of the IntegrationObject.
   * @param userId The user id of the IntegrationObject.
   * @param email The email of the IntegrationObject.
   * @param apiIntegrationId The api integration id of the IntegrationObject.
   * @param created The created timestamp of the IntegrationObject.
   * @param allowEditing The allow editing flag of the IntegrationObject.
   * @param width The width of the IntegrationObject.
   * @param height The height of the IntegrationObject.
   */
  @JsonCreator
  public IntegrationObject(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("font") String font,
      @JsonProperty("size") String size,
      @JsonProperty("data") String data,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("line_height") float lineHeight,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email,
      @JsonProperty("api_integration_id") String apiIntegrationId,
      @JsonProperty("created") String created,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.font = font;
    this.size = size;
    this.data = data;
    this.x = x;
    this.y = y;
    this.jsonAttributes = jsonAttributes;
    this.lineHeight = lineHeight;
    this.userId = userId;
    this.email = email;
    this.apiIntegrationId = apiIntegrationId;
    this.created = created;
    this.allowEditing = allowEditing;
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the id of the IntegrationObject.
   *
   * @return The id of the IntegrationObject.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id of the IntegrationObject.
   *
   * @return The user id of the IntegrationObject.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the page number of the IntegrationObject.
   *
   * @return The page number of the IntegrationObject.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the email of the IntegrationObject.
   *
   * @return The email of the IntegrationObject.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the font of the IntegrationObject.
   *
   * @return The font of the IntegrationObject.
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns the size of the IntegrationObject.
   *
   * @return The size of the IntegrationObject.
   */
  public String getSize() {
    return this.size;
  }

  /**
   * Returns the data of the IntegrationObject.
   *
   * @return The data of the IntegrationObject.
   */
  public String getData() {
    return this.data;
  }

  /**
   * Returns the api integration id of the IntegrationObject.
   *
   * @return The api integration id of the IntegrationObject.
   */
  public String getApiIntegrationId() {
    return this.apiIntegrationId;
  }

  /**
   * Returns the x-coordinate of the IntegrationObject.
   *
   * @return The x-coordinate of the IntegrationObject.
   */
  public String getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the IntegrationObject.
   *
   * @return The y-coordinate of the IntegrationObject.
   */
  public String getY() {
    return this.y;
  }

  /**
   * Returns the json attributes of the IntegrationObject.
   *
   * @return The json attributes of the IntegrationObject.
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * Returns the created timestamp of the IntegrationObject.
   *
   * @return The created timestamp of the IntegrationObject.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the line height of the IntegrationObject.
   *
   * @return The line height of the IntegrationObject.
   */
  public float getLineHeight() {
    return this.lineHeight;
  }

  /**
   * Returns the allow editing flag of the IntegrationObject.
   *
   * @return The allow editing flag of the IntegrationObject.
   */
  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  /**
   * Returns the width of the IntegrationObject.
   *
   * @return The width of the IntegrationObject.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the IntegrationObject.
   *
   * @return The height of the IntegrationObject.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * Converts the IntegrationObject to a Map.
   *
   * @return A Map representation of the IntegrationObject.
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
    map.put("api_integration_id", this.getApiIntegrationId());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("json_attributes", this.getJsonAttributes());
    map.put("created", this.getCreated());
    map.put("line_height", this.getLineHeight());
    map.put("allow_editing", this.isAllowEditing());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    return map;
  }

  /**
   * Creates an IntegrationObject from a Map.
   *
   * @param data The Map to create the IntegrationObject from.
   * @return The created IntegrationObject.
   */
  @NotNull
  @Contract("_ -> new")
  public static IntegrationObject fromMap(@NotNull Map<String, Object> data) {
    return new IntegrationObject(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("font"),
        (String) data.get("size"),
        (String) data.get("data"),
        (String) data.get("x"),
        (String) data.get("y"),
        JsonAttribute.fromMap(
            Cast.safeToMap(data.get("json_attributes"), String.class, Object.class)),
        (Float) data.get("line_height"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", null),
        (String) data.getOrDefault("api_integration_id", null),
        (String) data.getOrDefault("created", ""),
        (Boolean) data.getOrDefault("allow_editing", false),
        (String) data.getOrDefault("width", ""),
        (String) data.getOrDefault("height", ""));
  }
}