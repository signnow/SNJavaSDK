/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request;

import com.signnow.api.documentinvite.request.data.CcCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a free form invite.
 * It implements the RequestInterface with Object as the type parameter.
 */
@ApiEndpoint(
    name = "createFreeFormInvite",
    url = "/document/{document_id}/invite",
    method = "post",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "freeFormInvite",
    type = "application/json")
public final class FreeFormInvitePostRequest implements RequestInterface<Object> {

  /**
   * The recipient of the invite.
   */
  private final String to;

  /**
   * The sender of the invite.
   */
  private final String from;

  /**
   * The collection of CC recipients.
   */
  private final CcCollection cc;

  /**
   * The subject of the invite.
   */
  private final String subject;

  /**
   * The message of the invite.
   */
  private final String message;

  /**
   * The subject of the CC invite.
   */
  private final String ccSubject;

  /**
   * The message of the CC invite.
   */
  private final String ccMessage;

  /**
   * The language of the invite.
   */
  private final String language;

  /**
   * The client timestamp of the invite.
   */
  private final Integer clientTimestamp;

  /**
   * The callback URL of the invite.
   */
  private final String callbackUrl;

  /**
   * A flag indicating if this is the first invite in the sequence.
   */
  private final Boolean isFirstInviteInSequence;

  /**
   * The redirect URI of the invite.
   */
  private final String redirectUri;

  /**
   * The close redirect URI of the invite.
   */
  private final String closeRedirectUri;

  /**
   * The redirect target of the invite.
   */
  private final String redirectTarget;

  /**
   * The URI parameters of the invite.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructor with all parameters.
   */
  public FreeFormInvitePostRequest(
      String to,
      String from,
      CcCollection cc,
      String subject,
      String message,
      String ccSubject,
      String ccMessage,
      String language,
      Integer clientTimestamp,
      String callbackUrl,
      Boolean isFirstInviteInSequence,
      String redirectUri,
      String closeRedirectUri,
      String redirectTarget) {
    this.to = to;
    this.from = from;
    this.cc = cc;
    this.subject = subject;
    this.message = message;
    this.ccSubject = ccSubject;
    this.ccMessage = ccMessage;
    this.language = language;
    this.clientTimestamp = clientTimestamp;
    this.callbackUrl = callbackUrl;
    this.isFirstInviteInSequence = isFirstInviteInSequence;
    this.redirectUri = redirectUri;
    this.closeRedirectUri = closeRedirectUri;
    this.redirectTarget = redirectTarget;
  }

  /**
   * Constructor with minimal parameters.
   */
  public FreeFormInvitePostRequest(String to, String from, String subject, String message) {
    this.to = to;
    this.from = from;
    this.cc = null;
    this.subject = subject;
    this.message = message;
    this.ccSubject = null;
    this.ccMessage = null;
    this.language = null;
    this.clientTimestamp = 0;
    this.callbackUrl = null;
    this.isFirstInviteInSequence = false;
    this.redirectUri = null;
    this.closeRedirectUri = null;
    this.redirectTarget = null;
  }

  /**
   * Constructor with only to and from parameters.
   */
  public FreeFormInvitePostRequest(String to, String from) {
    this.to = to;
    this.from = from;
    this.cc = null;
    this.subject = null;
    this.message = null;
    this.ccSubject = null;
    this.ccMessage = null;
    this.language = null;
    this.clientTimestamp = 0;
    this.callbackUrl = null;
    this.isFirstInviteInSequence = false;
    this.redirectUri = null;
    this.closeRedirectUri = null;
    this.redirectTarget = null;
  }

  /**
   * Returns the recipient of the invite.
   */
  public String getTo() {
    return this.to;
  }

  /**
   * Returns the sender of the invite.
   */
  public String getFrom() {
    return this.from;
  }

  /**
   * Returns the collection of CC recipients.
   */
  public CcCollection getCc() {
    return this.cc;
  }

  /**
   * Returns the subject of the invite.
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Returns the message of the invite.
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Returns the subject of the CC invite.
   */
  public String getCcSubject() {
    return this.ccSubject;
  }

  /**
   * Returns the message of the CC invite.
   */
  public String getCcMessage() {
    return this.ccMessage;
  }

  /**
   * Returns the language of the invite.
   */
  public String getLanguage() {
    return this.language;
  }

  /**
   * Returns the client timestamp of the invite.
   */
  public Integer getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Returns the callback URL of the invite.
   */
  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  /**
   * Returns the flag indicating if this is the first invite in the sequence.
   */
  public Boolean getIsFirstInviteInSequence() {
    return this.isFirstInviteInSequence;
  }

  /**
   * Returns the redirect URI of the invite.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the close redirect URI of the invite.
   */
  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  /**
   * Returns the redirect target of the invite.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Adds a document ID to the URI parameters.
   */
  public FreeFormInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(uriParams);
  }

  /**
   * Returns a Map containing the payload of the request.
   */
  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("to", this.getTo());
    map.put("from", this.getFrom());
    map.put("cc", this.getCc());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    map.put("cc_subject", this.getCcSubject());
    map.put("cc_message", this.getCcMessage());
    map.put("language", this.getLanguage());
    map.put("client_timestamp", this.getClientTimestamp());
    map.put("callback_url", this.getCallbackUrl());
    map.put("is_first_invite_in_sequence", this.getIsFirstInviteInSequence());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("close_redirect_uri", this.getCloseRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    return map;
  }
}
