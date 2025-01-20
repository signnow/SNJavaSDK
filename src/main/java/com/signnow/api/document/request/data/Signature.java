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
 * This class represents a Signature object with properties for a signature's position, size, page number, data, and other related information.
 */
public final class Signature extends ApiData {

  /**
   * The x-coordinate of the signature.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the signature.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The width of the signature.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the signature.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The page number where the signature is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The data of the signature.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The subtype of the signature.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The ID of the signature request.
   */
  @JsonProperty("signature_request_id")
  private final String signatureRequestId;

  /**
   * The ID of the field.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * The reason for signing.
   */
  @JsonProperty("signing_reason")
  private final String signingReason;

  /**
   * Indicates if the owner is also the recipient.
   */
  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  /**
   * Constructor for creating a Signature object with all properties.
   */
  @JsonCreator
  public Signature(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("signature_request_id") String signatureRequestId,
      @JsonProperty("field_id") String fieldId,
      @JsonProperty("signing_reason") String signingReason,
      @JsonProperty("owner_as_recipient") boolean ownerAsRecipient) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.data = data;
    this.subtype = subtype;
    this.signatureRequestId = signatureRequestId;
    this.fieldId = fieldId;
    this.signingReason = signingReason;
    this.ownerAsRecipient = ownerAsRecipient;
  }

  /**
   * Constructor for creating a Signature object with only position, size, page number, and data properties.
   */
  public Signature(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.data = data;
    this.subtype = "signature";
    this.signatureRequestId = null;
    this.fieldId = null;
    this.signingReason = null;
    this.ownerAsRecipient = false;
  }

  /**
   * Returns the x-coordinate of the signature.
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the signature.
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the width of the signature.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the signature.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Returns the page number where the signature is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the subtype of the signature.
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * Returns the ID of the signature request.
   */
  public String getSignatureRequestId() {
    return this.signatureRequestId;
  }

  /**
   * Returns the ID of the field.
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Returns the reason for signing.
   */
  public String getSigningReason() {
    return this.signingReason;
  }

  /**
   * Returns true if the owner is also the recipient, false otherwise.
   */
  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
  }

  /**
   * Returns the data of the signature.
   */
  public String getData() {
    return this.data;
  }

  /**
   * Converts the Signature object to a Map.
   * @return a Map with the properties of the Signature object as key-value pairs.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("page_number", this.getPageNumber());
    map.put("subtype", this.getSubtype());
    map.put("signature_request_id", this.getSignatureRequestId());
    map.put("field_id", this.getFieldId());
    map.put("signing_reason", this.getSigningReason());
    map.put("owner_as_recipient", this.isOwnerAsRecipient());
    map.put("data", this.getData());
    return map;
  }

  /**
   * Creates a Signature object from a Map.
   * @param data a Map containing the properties of a Signature object as key-value pairs.
   * @return a new Signature object with the properties set from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Signature fromMap(@NotNull Map<String, Object> data) {
    return new Signature(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("width"),
        (int) data.get("height"),
        (int) data.get("page_number"),
        (String) data.get("data"),
        (String) data.getOrDefault("subtype", ""),
        (String) data.getOrDefault("signature_request_id", ""),
        (String) data.getOrDefault("field_id", ""),
        (String) data.getOrDefault("signing_reason", ""),
        (boolean) data.getOrDefault("owner_as_recipient", false));
  }
}