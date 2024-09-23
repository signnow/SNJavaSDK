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

public final class ViewerFieldInvite extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("updated")
  private final String updated;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  @JsonProperty("email_statuses")
  private final EmailStatusCollection emailStatuses;

  @JsonProperty("signer_user_id")
  private final String signerUserId;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

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

  public String getId() {
    return this.id;
  }

  public String getSignerUserId() {
    return this.signerUserId;
  }

  public String getStatus() {
    return this.status;
  }

  public String getCreated() {
    return this.created;
  }

  public String getUpdated() {
    return this.updated;
  }

  public String getRole() {
    return this.role;
  }

  public String getEmail() {
    return this.email;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  public EmailStatusCollection getEmailStatuses() {
    return this.emailStatuses;
  }

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
