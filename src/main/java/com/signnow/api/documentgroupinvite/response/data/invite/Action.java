/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response.data.invite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Action in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Action extends ApiData {

  /**
   * The action to be performed.
   */
  @JsonProperty("action")
  private final String action;

  /**
   * The ID of the document associated with the action.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * The status of the action.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The role name associated with the action.
   */
  @JsonProperty("role_name")
  private final String roleName;

  /**
   * The email associated with the action.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Constructor for the Action class.
   *
   * @param action The action to be performed.
   * @param documentId The ID of the document associated with the action.
   * @param status The status of the action.
   * @param roleName The role name associated with the action.
   * @param email The email associated with the action.
   */
  @JsonCreator
  public Action(
      @JsonProperty("action") String action,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("status") String status,
      @JsonProperty("role_name") String roleName,
      @JsonProperty("email") String email) {
    this.action = action;
    this.documentId = documentId;
    this.status = status;
    this.roleName = roleName;
    this.email = email;
  }

  /**
   * Returns the action.
   *
   * @return The action.
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Returns the email.
   *
   * @return The email.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the document ID.
   *
   * @return The document ID.
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the status.
   *
   * @return The status.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the role name.
   *
   * @return The role name.
   */
  public String getRoleName() {
    return this.roleName;
  }

  /**
   * Converts the Action object to a Map.
   *
   * @return A Map representation of the Action object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("action", this.getAction());
    map.put("email", this.getEmail());
    map.put("document_id", this.getDocumentId());
    map.put("status", this.getStatus());
    map.put("role_name", this.getRoleName());
    return map;
  }

  /**
   * Creates an Action object from a Map.
   *
   * @param data The Map to convert to an Action object.
   * @return The created Action object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Action fromMap(@NotNull Map<String, Object> data) {
    return new Action(
        (String) data.get("action"),
        (String) data.get("document_id"),
        (String) data.get("status"),
        (String) data.get("role_name"),
        (String) data.getOrDefault("email", ""));
  }
}