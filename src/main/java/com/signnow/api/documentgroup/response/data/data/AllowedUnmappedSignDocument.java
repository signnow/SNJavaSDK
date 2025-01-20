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
 * This class represents an allowed unmapped sign document.
 */
public final class AllowedUnmappedSignDocument extends ApiData {

  /**
   * The id of the document.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The role associated with the document.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The recipient of the document.
   */
  @JsonProperty("recipient")
  private final String recipient;

  /**
   * Constructs a new AllowedUnmappedSignDocument with the specified id, role, and recipient.
   *
   * @param id the id of the document
   * @param role the role associated with the document
   * @param recipient the recipient of the document
   */
  @JsonCreator
  public AllowedUnmappedSignDocument(
      @JsonProperty("id") String id,
      @JsonProperty("role") String role,
      @JsonProperty("recipient") String recipient) {
    this.id = id;
    this.role = role;
    this.recipient = recipient;
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
   * Returns the recipient of the document.
   *
   * @return the recipient of the document
   */
  public String getRecipient() {
    return this.recipient;
  }

  /**
   * Returns a map representation of this AllowedUnmappedSignDocument.
   *
   * @return a map representation of this AllowedUnmappedSignDocument
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("role", this.getRole());
    map.put("recipient", this.getRecipient());
    return map;
  }

  /**
   * Returns a new AllowedUnmappedSignDocument created from the specified map.
   *
   * @param data the map containing the data to create the AllowedUnmappedSignDocument from
   * @return a new AllowedUnmappedSignDocument created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static AllowedUnmappedSignDocument fromMap(@NotNull Map<String, Object> data) {
    return new AllowedUnmappedSignDocument(
        (String) data.get("id"), (String) data.get("role"), (String) data.get("recipient"));
  }
}