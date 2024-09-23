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

public final class Seal extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("unique_id")
  private final String uniqueId;

  @JsonProperty("customer_user_id")
  private final String customerUserId;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("transaction_id")
  private final String transactionId;

  @JsonProperty("data")
  private final String data;

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

  public String getId() {
    return this.id;
  }

  public String getUniqueId() {
    return this.uniqueId;
  }

  public String getCustomerUserId() {
    return this.customerUserId;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public String getCreated() {
    return this.created;
  }

  public String getTransactionId() {
    return this.transactionId;
  }

  public String getData() {
    return this.data;
  }

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
