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
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Check class extends ApiData.
 * Represents a check in the document.
 */
public final class Check extends ApiData {

  /**
   * The id of the check.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The page number where the check is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The x-coordinate of the check.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the check.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The width of the check.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the check.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The creation date of the check.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The flag indicating if editing is allowed.
   */
  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  /**
   * The flag indicating if the owner is the recipient.
   */
  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  /**
   * The user id of the check owner.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email of the check owner.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Constructor for Check class.
   *
   * @param id The id of the check.
   * @param pageNumber The page number where the check is located.
   * @param x The x-coordinate of the check.
   * @param y The y-coordinate of the check.
   * @param width The width of the check.
   * @param height The height of the check.
   * @param created The creation date of the check.
   * @param allowEditing The flag indicating if editing is allowed.
   * @param ownerAsRecipient The flag indicating if the owner is the recipient.
   * @param userId The user id of the check owner.
   * @param email The email of the check owner.
   */
  @JsonCreator
  public Check(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("created") String created,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("owner_as_recipient") boolean ownerAsRecipient,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.created = created;
    this.allowEditing = allowEditing;
    this.ownerAsRecipient = ownerAsRecipient;
    this.userId = userId;
    this.email = email;
  }

  /**
   * @return The id of the check.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The user id of the check owner.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The email of the check owner.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The page number where the check is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The x-coordinate of the check.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the check.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The width of the check.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the check.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * @return The creation date of the check.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * @return The flag indicating if editing is allowed.
   */
  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  /**
   * @return The flag indicating if the owner is the recipient.
   */
  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
  }

  /**
   * Converts the Check object to a Map.
   *
   * @return A map representation of the Check object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("created", this.getCreated());
    map.put("allow_editing", this.isAllowEditing());
    map.put("owner_as_recipient", this.isOwnerAsRecipient());
    return map;
  }

  /**
   * Creates a Check object from a Map.
   *
   * @param data The map containing the data.
   * @return A new Check object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Check fromMap(@NotNull Map<String, Object> data) {
    return new Check(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("created"),
        (Boolean) data.get("allow_editing"),
        (Boolean) data.get("owner_as_recipient"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", ""));
  }
}