/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Request extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("unique_id")
  private final String uniqueId;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("originator_email")
  private final String originatorEmail;

  @JsonProperty("signer_email")
  private final String signerEmail;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonProperty("signature_id")
  private final String signatureId;

  @JsonProperty("signer_user_id")
  private final String signerUserId;

  @JsonProperty("canceled")
  private final Boolean canceled;

  @JsonProperty("redirect_uri")
  private final String redirectUri;

  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  @JsonProperty("language")
  private final String language;

  @JsonProperty("email_statuses")
  private final EmailStatusCollection emailStatuses;

  @JsonCreator
  public Request(
      @JsonProperty("id") String id,
      @JsonProperty("unique_id") String uniqueId,
      @JsonProperty("user_id") String userId,
      @JsonProperty("created") String created,
      @JsonProperty("originator_email") String originatorEmail,
      @JsonProperty("signer_email") String signerEmail,
      @JsonProperty("redirect_target") String redirectTarget,
      @JsonProperty("signature_id") String signatureId,
      @JsonProperty("signer_user_id") String signerUserId,
      @JsonProperty("canceled") Boolean canceled,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("close_redirect_uri") String closeRedirectUri,
      @JsonProperty("language") String language,
      @JsonProperty("email_statuses") EmailStatusCollection emailStatuses) {
    this.id = id;
    this.uniqueId = uniqueId;
    this.userId = userId;
    this.created = created;
    this.originatorEmail = originatorEmail;
    this.signerEmail = signerEmail;
    this.redirectTarget = redirectTarget;
    this.signatureId = signatureId;
    this.signerUserId = signerUserId;
    this.canceled = canceled;
    this.redirectUri = redirectUri;
    this.closeRedirectUri = closeRedirectUri;
    this.language = language;
    this.emailStatuses = emailStatuses;
  }

  public String getId() {
    return this.id;
  }

  public String getUniqueId() {
    return this.uniqueId;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getCreated() {
    return this.created;
  }

  public String getOriginatorEmail() {
    return this.originatorEmail;
  }

  public String getSignerEmail() {
    return this.signerEmail;
  }

  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  public String getSignatureId() {
    return this.signatureId;
  }

  public String getSignerUserId() {
    return this.signerUserId;
  }

  public Boolean getCanceled() {
    return this.canceled;
  }

  public String getRedirectUri() {
    return this.redirectUri;
  }

  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  public String getLanguage() {
    return this.language;
  }

  public EmailStatusCollection getEmailStatuses() {
    return this.emailStatuses;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("unique_id", this.getUniqueId());
    map.put("user_id", this.getUserId());
    map.put("created", this.getCreated());
    map.put("originator_email", this.getOriginatorEmail());
    map.put("signer_email", this.getSignerEmail());
    map.put("redirect_target", this.getRedirectTarget());
    map.put("signature_id", this.getSignatureId());
    map.put("signer_user_id", this.getSignerUserId());
    map.put("canceled", this.getCanceled());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("close_redirect_uri", this.getCloseRedirectUri());
    map.put("language", this.getLanguage());
    map.put("email_statuses", this.getEmailStatuses());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Request fromMap(@NotNull Map<String, Object> data) {
    return new Request(
        (String) data.get("id"),
        (String) data.get("unique_id"),
        (String) data.get("user_id"),
        (String) data.get("created"),
        (String) data.get("originator_email"),
        (String) data.get("signer_email"),
        (String) data.get("redirect_target"),
        (String) data.getOrDefault("signature_id", null),
        (String) data.getOrDefault("signer_user_id", null),
        (Boolean) data.getOrDefault("canceled", null),
        (String) data.getOrDefault("redirect_uri", null),
        (String) data.getOrDefault("close_redirect_uri", null),
        (String) data.getOrDefault("language", null),
        (EmailStatusCollection) data.get("email_statuses"));
  }
}
