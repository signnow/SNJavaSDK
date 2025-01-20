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
 * This class represents a Seal object in the signNow API.
 */
public final class Seal extends ApiData {

  /**
   * The id of the seal.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The page number where the seal is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The x-coordinate of the seal.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the seal.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The width of the seal.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the seal.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The creation date of the seal.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The unique id of the seal.
   */
  @JsonProperty("unique_id")
  private final String uniqueId;

  /**
   * The customer user id associated with the seal.
   */
  @JsonProperty("customer_user_id")
  private final String customerUserId;

  /**
   * The email associated with the seal.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The transaction id associated with the seal.
   */
  @JsonProperty("transaction_id")
  private final String transactionId;

  /**
   * The data of the seal.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * Constructor for the Seal class.
   *
   * @param id The id of the seal.
   * @param pageNumber The page number where the seal is located.
   * @param x The x-coordinate of the seal.
   * @param y The y-coordinate of the seal.
   * @param width The width of the seal.
   * @param height The height of the seal.
   * @param created The creation date of the seal.
   * @param uniqueId The unique id of the seal.
   * @param customerUserId The customer user id associated with the seal.
   * @param email The email associated with the seal.
   * @param transactionId The transaction id associated with the seal.
   * @param data The data of the seal.
   */
  @JsonCreator
  public Seal(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("created") String created,
      @JsonProperty("unique_id") String uniqueId,
      @JsonProperty("customer_user_id") String customerUserId,
      @JsonProperty("email") String email,
      @JsonProperty("transaction_id") String transactionId,
      @JsonProperty("data") String data) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.created = created;
    this.uniqueId = uniqueId;
    this.customerUserId = customerUserId;
    this.email = email;
    this.transactionId = transactionId;
    this.data = data;
  }

  /**
   * @return The id of the seal.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The unique id of the seal.
   */
  public String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * @return The customer user id associated with the seal.
   */
  public String getCustomerUserId() {
    return this.customerUserId;
  }

  /**
   * @return The email associated with the seal.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The page number where the seal is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * @return The x-coordinate of the seal.
   */
  public String getX() {
    return this.x;
  }

  /**
   * @return The y-coordinate of the seal.
   */
  public String getY() {
    return this.y;
  }

  /**
   * @return The width of the seal.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * @return The height of the seal.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * @return The creation date of the seal.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * @return The transaction id associated with the seal.
   */
  public String getTransactionId() {
    return this.transactionId;
  }

  /**
   * @return The data of the seal.
   */
  public String getData() {
    return this.data;
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
    map.put("unique_id", this.getUniqueId());
    map.put("customer_user_id", this.getCustomerUserId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("created", this.getCreated());
    map.put("transaction_id", this.getTransactionId());
    map.put("data", this.getData());
    return map;
  }

  /**
   * Creates a Seal object from a Map.
   *
   * @param data The Map to convert to a Seal object.
   * @return A new Seal object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Seal fromMap(@NotNull Map<String, Object> data) {
    return new Seal(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("created"),
        (String) data.get("unique_id"),
        (String) data.get("customer_user_id"),
        (String) data.get("email"),
        (String) data.get("transaction_id"),
        (String) data.get("data"));
  }
}