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
 * This class represents an Insert object with properties id, location, email, and transactionId.
 */
public final class Insert extends ApiData {

  /**
   * The id of the Insert.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The location of the Insert.
   */
  @JsonProperty("location")
  private final String location;

  /**
   * The email associated with the Insert.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The transaction id associated with the Insert.
   */
  @JsonProperty("transaction_id")
  private final String transactionId;

  /**
   * Constructs an Insert object with the specified id, location, email, and transactionId.
   *
   * @param id the id of the Insert
   * @param location the location of the Insert
   * @param email the email associated with the Insert
   * @param transactionId the transaction id associated with the Insert
   */
  @JsonCreator
  public Insert(
      @JsonProperty("id") String id,
      @JsonProperty("location") String location,
      @JsonProperty("email") String email,
      @JsonProperty("transaction_id") String transactionId) {
    this.id = id;
    this.location = location;
    this.email = email;
    this.transactionId = transactionId;
  }

  /**
   * Returns the id of this Insert.
   *
   * @return the id of this Insert
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the location of this Insert.
   *
   * @return the location of this Insert
   */
  public String getLocation() {
    return this.location;
  }

  /**
   * Returns the email associated with this Insert.
   *
   * @return the email associated with this Insert
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the transaction id associated with this Insert.
   *
   * @return the transaction id associated with this Insert
   */
  public String getTransactionId() {
    return this.transactionId;
  }

  /**
   * Returns a Map representation of this Insert.
   *
   * @return a Map representation of this Insert
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("location", this.getLocation());
    map.put("email", this.getEmail());
    map.put("transaction_id", this.getTransactionId());
    return map;
  }

  /**
   * Returns a new Insert object created from the specified Map.
   *
   * @param data the Map to create the Insert from
   * @return a new Insert object created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Insert fromMap(@NotNull Map<String, Object> data) {
    return new Insert(
        (String) data.get("id"),
        (String) data.get("location"),
        (String) data.getOrDefault("email", ""),
        (String) data.getOrDefault("transaction_id", null));
  }
}