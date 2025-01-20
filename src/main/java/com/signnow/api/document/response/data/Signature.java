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
 * This class represents a Signature object with all its properties and methods.
 */
public final class Signature extends ApiData {

  /**
   * The unique identifier of the signature.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The unique identifier of the user.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The unique identifier of the signature request.
   */
  @JsonProperty("signature_request_id")
  private final String signatureRequestId;

  /**
   * The email of the user.
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
   * The subtype of the signature.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The flag indicating if editing is allowed.
   */
  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  /**
   * The timestamp when the signature was created.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The flag indicating if the owner is also the recipient.
   */
  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  /**
   * The data of the signature.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * Constructor for the Signature class.
   *
   * @param id The unique identifier of the signature.
   * @param userId The unique identifier of the user.
   * @param signatureRequestId The unique identifier of the signature request.
   * @param email The email of the user.
   * @param pageNumber The page number where the signature is located.
   * @param width The width of the signature.
   * @param height The height of the signature.
   * @param x The x-coordinate of the signature.
   * @param y The y-coordinate of the signature.
   * @param subtype The subtype of the signature.
   * @param allowEditing The flag indicating if editing is allowed.
   * @param created The timestamp when the signature was created.
   * @param ownerAsRecipient The flag indicating if the owner is also the recipient.
   * @param data The data of the signature.
   */
  @JsonCreator
  public Signature(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("signature_request_id") String signatureRequestId,
      @JsonProperty("email") String email,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("created") int created,
      @JsonProperty("owner_as_recipient") boolean ownerAsRecipient,
      @JsonProperty("data") String data) {
    this.id = id;
    this.userId = userId;
    this.signatureRequestId = signatureRequestId;
    this.email = email;
    this.pageNumber = pageNumber;
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
    this.subtype = subtype;
    this.allowEditing = allowEditing;
    this.created = created;
    this.ownerAsRecipient = ownerAsRecipient;
    this.data = data;
  }

  /**
   * @return The unique identifier of the signature.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The unique identifier of the user.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return The unique identifier of the signature request.
   */
  public String getSignatureRequestId() {
    return this.signatureRequestId;
  }

  /**
   * @return The email of the user.
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
   * @return The subtype of the signature.
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * @return The flag indicating if editing is allowed.
   */
  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  /**
   * @return The flag indicating if the owner is also the recipient.
   */
  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
  }

  /**
   * @return The timestamp when the signature was created.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * @return The data of the signature.
   */
  public String getData() {
    return this.data;
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
    map.put("signature_request_id", this.getSignatureRequestId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("subtype", this.getSubtype());
    map.put("allow_editing", this.isAllowEditing());
    map.put("owner_as_recipient", this.isOwnerAsRecipient());
    map.put("created", this.getCreated());
    map.put("data", this.getData());
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
        (String) data.get("signature_request_id"),
        (String) data.get("email"),
        (String) data.get("page_number"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("subtype"),
        (Boolean) data.get("allow_editing"),
        (Integer) data.get("created"),
        (Boolean) data.getOrDefault("owner_as_recipient", false),
        (String) data.getOrDefault("data", ""));
  }
}