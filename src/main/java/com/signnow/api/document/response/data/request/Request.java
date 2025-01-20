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

/**
 * This class represents a Request object with various properties.
 */
public final class Request extends ApiData {

  /**
   * The id of the request.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The unique id of the request.
   */
  @JsonProperty("unique_id")
  private final String uniqueId;

  /**
   * The user id associated with the request.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The creation time of the request.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The email of the originator of the request.
   */
  @JsonProperty("originator_email")
  private final String originatorEmail;

  /**
   * The email of the signer of the request.
   */
  @JsonProperty("signer_email")
  private final String signerEmail;

  /**
   * The target of the redirect.
   */
  @JsonProperty("redirect_target")
  private final String redirectTarget;

  /**
   * The id of the signature.
   */
  @JsonProperty("signature_id")
  private final String signatureId;

  /**
   * The user id of the signer.
   */
  @JsonProperty("signer_user_id")
  private final String signerUserId;

  /**
   * The status of the request, whether it is canceled or not.
   */
  @JsonProperty("canceled")
  private final Boolean canceled;

  /**
   * The URI to redirect to.
   */
  @JsonProperty("redirect_uri")
  private final String redirectUri;

  /**
   * The URI to redirect to when closing.
   */
  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  /**
   * The language of the request.
   */
  @JsonProperty("language")
  private final String language;

  /**
   * The collection of email statuses.
   */
  @JsonProperty("email_statuses")
  private final EmailStatusCollection emailStatuses;

  /**
   * Constructor for the Request class.
   *
   * @param id The id of the request.
   * @param uniqueId The unique id of the request.
   * @param userId The user id associated with the request.
   * @param created The creation time of the request.
   * @param originatorEmail The email of the originator of the request.
   * @param signerEmail The email of the signer of the request.
   * @param redirectTarget The target of the redirect.
   * @param signatureId The id of the signature.
   * @param signerUserId The user id of the signer.
   * @param canceled The status of the request, whether it is canceled or not.
   * @param redirectUri The URI to redirect to.
   * @param closeRedirectUri The URI to redirect to when closing.
   * @param language The language of the request.
   * @param emailStatuses The collection of email statuses.
   */
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

  /**
   * Returns the id of the request.
   *
   * @return The id of the request.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the unique id of the request.
   *
   * @return The unique id of the request.
   */
  public String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * Returns the user id associated with the request.
   *
   * @return The user id associated with the request.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the creation time of the request.
   *
   * @return The creation time of the request.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the email of the originator of the request.
   *
   * @return The email of the originator of the request.
   */
  public String getOriginatorEmail() {
    return this.originatorEmail;
  }

  /**
   * Returns the email of the signer of the request.
   *
   * @return The email of the signer of the request.
   */
  public String getSignerEmail() {
    return this.signerEmail;
  }

  /**
   * Returns the target of the redirect.
   *
   * @return The target of the redirect.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Returns the id of the signature.
   *
   * @return The id of the signature.
   */
  public String getSignatureId() {
    return this.signatureId;
  }

  /**
   * Returns the user id of the signer.
   *
   * @return The user id of the signer.
   */
  public String getSignerUserId() {
    return this.signerUserId;
  }

  /**
   * Returns the status of the request, whether it is canceled or not.
   *
   * @return The status of the request, whether it is canceled or not.
   */
  public Boolean getCanceled() {
    return this.canceled;
  }

  /**
   * Returns the URI to redirect to.
   *
   * @return The URI to redirect to.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the URI to redirect to when closing.
   *
   * @return The URI to redirect to when closing.
   */
  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  /**
   * Returns the language of the request.
   *
   * @return The language of the request.
   */
  public String getLanguage() {
    return this.language;
  }

  /**
   * Returns the collection of email statuses.
   *
   * @return The collection of email statuses.
   */
  public EmailStatusCollection getEmailStatuses() {
    return this.emailStatuses;
  }

  /**
   * Converts the Request object to a Map.
   *
   * @return A Map representing the Request object.
   */
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

  /**
   * Creates a Request object from a Map.
   *
   * @param data The Map to create the Request object from.
   * @return A new Request object.
   */
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