/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.viewerfieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a ViewerFieldInvite object.
 */
public final class ViewerFieldInvite extends ApiData {

  /**
   * The id of the ViewerFieldInvite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The status of the ViewerFieldInvite.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The creation date of the ViewerFieldInvite.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The last updated date of the ViewerFieldInvite.
   */
  @JsonProperty("updated")
  private final String updated;

  /**
   * The email associated with the ViewerFieldInvite.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The redirect target of the ViewerFieldInvite.
   */
  @JsonProperty("redirect_target")
  private final String redirectTarget;

  /**
   * The email group of the ViewerFieldInvite.
   */
  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  /**
   * The email statuses of the ViewerFieldInvite.
   */
  @JsonProperty("email_statuses")
  private final EmailStatusCollection emailStatuses;

  /**
   * The signer user id of the ViewerFieldInvite.
   */
  @JsonProperty("signer_user_id")
  private final String signerUserId;

  /**
   * The role of the ViewerFieldInvite.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The role id of the ViewerFieldInvite.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The close redirect URI of the ViewerFieldInvite.
   */
  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  /**
   * Constructor for ViewerFieldInvite.
   *
   * @param id The id of the ViewerFieldInvite.
   * @param status The status of the ViewerFieldInvite.
   * @param created The creation date of the ViewerFieldInvite.
   * @param updated The last updated date of the ViewerFieldInvite.
   * @param email The email associated with the ViewerFieldInvite.
   * @param redirectTarget The redirect target of the ViewerFieldInvite.
   * @param emailGroup The email group of the ViewerFieldInvite.
   * @param emailStatuses The email statuses of the ViewerFieldInvite.
   * @param signerUserId The signer user id of the ViewerFieldInvite.
   * @param role The role of the ViewerFieldInvite.
   * @param roleId The role id of the ViewerFieldInvite.
   * @param closeRedirectUri The close redirect URI of the ViewerFieldInvite.
   */
  @JsonCreator
  public ViewerFieldInvite(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("email") String email,
      @JsonProperty("redirect_target") String redirectTarget,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("email_statuses") EmailStatusCollection emailStatuses,
      @JsonProperty("signer_user_id") String signerUserId,
      @JsonProperty("role") String role,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("close_redirect_uri") String closeRedirectUri) {
    this.id = id;
    this.status = status;
    this.created = created;
    this.updated = updated;
    this.email = email;
    this.redirectTarget = redirectTarget;
    this.emailGroup = emailGroup;
    this.emailStatuses = emailStatuses;
    this.signerUserId = signerUserId;
    this.role = role;
    this.roleId = roleId;
    this.closeRedirectUri = closeRedirectUri;
  }

  /**
   * Returns the id of the ViewerFieldInvite.
   *
   * @return The id of the ViewerFieldInvite.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the signer user id of the ViewerFieldInvite.
   *
   * @return The signer user id of the ViewerFieldInvite.
   */
  public String getSignerUserId() {
    return this.signerUserId;
  }

  /**
   * Returns the status of the ViewerFieldInvite.
   *
   * @return The status of the ViewerFieldInvite.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the creation date of the ViewerFieldInvite.
   *
   * @return The creation date of the ViewerFieldInvite.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the last updated date of the ViewerFieldInvite.
   *
   * @return The last updated date of the ViewerFieldInvite.
   */
  public String getUpdated() {
    return this.updated;
  }

  /**
   * Returns the role of the ViewerFieldInvite.
   *
   * @return The role of the ViewerFieldInvite.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the email associated with the ViewerFieldInvite.
   *
   * @return The email associated with the ViewerFieldInvite.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the role id of the ViewerFieldInvite.
   *
   * @return The role id of the ViewerFieldInvite.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the close redirect URI of the ViewerFieldInvite.
   *
   * @return The close redirect URI of the ViewerFieldInvite.
   */
  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  /**
   * Returns the redirect target of the ViewerFieldInvite.
   *
   * @return The redirect target of the ViewerFieldInvite.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Returns the email group of the ViewerFieldInvite.
   *
   * @return The email group of the ViewerFieldInvite.
   */
  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  /**
   * Returns the email statuses of the ViewerFieldInvite.
   *
   * @return The email statuses of the ViewerFieldInvite.
   */
  public EmailStatusCollection getEmailStatuses() {
    return this.emailStatuses;
  }

  /**
   * Converts the ViewerFieldInvite to a Map.
   *
   * @return A Map representation of the ViewerFieldInvite.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("signer_user_id", this.getSignerUserId());
    map.put("status", this.getStatus());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    map.put("role", this.getRole());
    map.put("email", this.getEmail());
    map.put("role_id", this.getRoleId());
    map.put("close_redirect_uri", this.getCloseRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    map.put("email_group", this.getEmailGroup());
    map.put("email_statuses", this.getEmailStatuses());
    return map;
  }

  /**
   * Creates a ViewerFieldInvite from a Map.
   *
   * @param data The Map to convert to a ViewerFieldInvite.
   * @return A ViewerFieldInvite created from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static ViewerFieldInvite fromMap(@NotNull Map<String, Object> data) {
    return new ViewerFieldInvite(
        (String) data.get("id"),
        (String) data.get("status"),
        (String) data.get("created"),
        (String) data.get("updated"),
        (String) data.get("email"),
        (String) data.get("redirect_target"),
        EmailGroup.fromMap(Cast.safeToMap(data.get("email_group"), String.class, Object.class)),
        (EmailStatusCollection) data.get("email_statuses"),
        (String) data.getOrDefault("signer_user_id", null),
        (String) data.getOrDefault("role", null),
        (String) data.getOrDefault("role_id", null),
        (String) data.getOrDefault("close_redirect_uri", null));
  }
}