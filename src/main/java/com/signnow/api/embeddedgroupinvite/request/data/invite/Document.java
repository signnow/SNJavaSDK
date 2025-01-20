/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.request.data.invite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Document in the signNow API.
 */
public final class Document extends ApiData {

  /**
   * The id of the document.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The action associated with the document.
   */
  @JsonProperty("action")
  private final String action;

  /**
   * The role associated with the document.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * Constructs a new Document with the specified id, action, and role.
   *
   * @param id the id of the document
   * @param action the action associated with the document
   * @param role the role associated with the document
   */
  @JsonCreator
  public Document(
      @JsonProperty("id") String id,
      @JsonProperty("action") String action,
      @JsonProperty("role") String role) {
    this.id = id;
    this.action = action;
    this.role = role;
  }

  /**
   * Returns the id of the document.
   *
   * @return the id of the document
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the role associated with the document.
   *
   * @return the role associated with the document
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the action associated with the document.
   *
   * @return the action associated with the document
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Converts this Document to a Map.
   *
   * @return a Map representation of this Document
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
   * Creates a new Document from the specified Map.
   *
   * @param data a Map containing the data for the Document
   * @return a new Document created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Document fromMap(@NotNull Map<String, Object> data) {
    return new Document(
        (String) data.get("id"), (String) data.get("action"), (String) data.get("role"));
  }
}