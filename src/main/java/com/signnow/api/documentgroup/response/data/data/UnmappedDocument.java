/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Unmapped Document in the signNow API.
 */
public final class UnmappedDocument extends ApiData {

  /**
   * The ID of the Unmapped Document.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The role of the Unmapped Document.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The action of the Unmapped Document.
   */
  @JsonProperty("action")
  private final String action;

  /**
   * Constructor for UnmappedDocument.
   *
   * @param id     The ID of the Unmapped Document.
   * @param role   The role of the Unmapped Document.
   * @param action The action of the Unmapped Document.
   */
  @JsonCreator
  public UnmappedDocument(
      @JsonProperty("id") String id,
      @JsonProperty("role") String role,
      @JsonProperty("action") String action) {
    this.id = id;
    this.role = role;
    this.action = action;
  }

  /**
   * Returns the ID of the Unmapped Document.
   *
   * @return The ID of the Unmapped Document.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the role of the Unmapped Document.
   *
   * @return The role of the Unmapped Document.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the action of the Unmapped Document.
   *
   * @return The action of the Unmapped Document.
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Converts the Unmapped Document to a Map.
   *
   * @return A Map representation of the Unmapped Document.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("role", this.getRole());
    map.put("action", this.getAction());
    return map;
  }

  /**
   * Creates an Unmapped Document from a Map.
   *
   * @param data The Map to create the Unmapped Document from.
   * @return A new Unmapped Document created from the provided Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static UnmappedDocument fromMap(@NotNull Map<String, Object> data) {
    return new UnmappedDocument(
        (String) data.get("id"), (String) data.get("role"), (String) data.get("action"));
  }
}