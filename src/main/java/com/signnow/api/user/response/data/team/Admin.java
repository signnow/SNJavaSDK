/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.team;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Admin user in the system.
 */
public final class Admin extends ApiData {

  /**
   * The unique identifier of the Admin.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The secondary status of the Admin.
   */
  @JsonProperty("is_secondary")
  private final String isSecondary;

  /**
   * The email address of the Admin.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The billing status of the Admin.
   */
  @JsonProperty("billing")
  private final int billing;

  /**
   * The document access level of the Admin.
   */
  @JsonProperty("document_access")
  private final int documentAccess;

  /**
   * The primary status of the Admin.
   */
  @JsonProperty("primary")
  private final boolean primary;

  /**
   * Constructor for the Admin class.
   *
   * @param id The unique identifier of the Admin.
   * @param isSecondary The secondary status of the Admin.
   * @param email The email address of the Admin.
   * @param billing The billing status of the Admin.
   * @param documentAccess The document access level of the Admin.
   * @param primary The primary status of the Admin.
   */
  @JsonCreator
  public Admin(
      @JsonProperty("id") String id,
      @JsonProperty("is_secondary") String isSecondary,
      @JsonProperty("email") String email,
      @JsonProperty("billing") int billing,
      @JsonProperty("document_access") int documentAccess,
      @JsonProperty("primary") boolean primary) {
    this.id = id;
    this.isSecondary = isSecondary;
    this.email = email;
    this.billing = billing;
    this.documentAccess = documentAccess;
    this.primary = primary;
  }

  /**
   * Returns the unique identifier of the Admin.
   *
   * @return The unique identifier of the Admin.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the secondary status of the Admin.
   *
   * @return The secondary status of the Admin.
   */
  public String getIsSecondary() {
    return this.isSecondary;
  }

  /**
   * Returns the email address of the Admin.
   *
   * @return The email address of the Admin.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the billing status of the Admin.
   *
   * @return The billing status of the Admin.
   */
  public int getBilling() {
    return this.billing;
  }

  /**
   * Returns the document access level of the Admin.
   *
   * @return The document access level of the Admin.
   */
  public int getDocumentAccess() {
    return this.documentAccess;
  }

  /**
   * Returns the primary status of the Admin.
   *
   * @return The primary status of the Admin.
   */
  public boolean isPrimary() {
    return this.primary;
  }

  /**
   * Converts the Admin object to a Map.
   *
   * @return A Map representation of the Admin object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("is_secondary", this.getIsSecondary());
    map.put("email", this.getEmail());
    map.put("billing", this.getBilling());
    map.put("document_access", this.getDocumentAccess());
    map.put("primary", this.isPrimary());
    return map;
  }

  /**
   * Creates an Admin object from a Map.
   *
   * @param data A Map containing the data for the Admin object.
   * @return A new Admin object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Admin fromMap(@NotNull Map<String, Object> data) {
    return new Admin(
        (String) data.get("id"),
        (String) data.get("is_secondary"),
        (String) data.get("email"),
        (Integer) data.get("billing"),
        (Integer) data.get("document_access"),
        (Boolean) data.get("primary"));
  }
}