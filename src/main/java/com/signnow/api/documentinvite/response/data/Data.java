/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data class extends ApiData.
 * Represents the data response from the document invite API.
 */
public final class Data extends ApiData {

  /**
   * The id of the document invite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The status of the document invite.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The creation timestamp of the document invite.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The email associated with the document invite.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Constructor for Data class.
   *
   * @param id      The id of the document invite.
   * @param status  The status of the document invite.
   * @param created The creation timestamp of the document invite.
   * @param email   The email associated with the document invite.
   */
  @JsonCreator
  public Data(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("created") int created,
      @JsonProperty("email") String email) {
    this.id = id;
    this.status = status;
    this.created = created;
    this.email = email;
  }

  /**
   * Returns the id of the document invite.
   *
   * @return id of the document invite.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the status of the document invite.
   *
   * @return status of the document invite.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the creation timestamp of the document invite.
   *
   * @return creation timestamp of the document invite.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the email associated with the document invite.
   *
   * @return email associated with the document invite.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Converts the Data object to a Map.
   *
   * @return a Map representation of the Data object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("status", this.getStatus());
    map.put("created", this.getCreated());
    map.put("email", this.getEmail());
    return map;
  }

  /**
   * Creates a Data object from a Map.
   *
   * @param data a Map containing the data for the Data object.
   * @return a new Data object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data(
        (String) data.get("id"),
        (String) data.get("status"),
        (Integer) data.get("created"),
        (String) data.get("email"));
  }
}