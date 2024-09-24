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

@ApiEndpoint(
    name = "createFreeFormInvite",
    url = "/document/{document_id}/invite",
    method = "post",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "freeFormInvite",
    type = "application/json")
public final class FreeFormInvitePostRequest implements RequestInterface<Object> {

  private final String to;

  private final String from;

  private final CcCollection cc;

  private final String subject;

  private final String message;

  private final String ccSubject;

  private final String ccMessage;

  private final String language;

  private final Integer clientTimestamp;

  private final String callbackUrl;

  private final Boolean isFirstInviteInSequence;

  private final String redirectUri;

  private final String closeRedirectUri;

  private final String redirectTarget;

  private final Map<String, String> uriParams = new HashMap<>();

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

  public String getTo() {
    return this.to;
  }

  public String getFrom() {
    return this.from;
  }

  public CcCollection getCc() {
    return this.cc;
  }

  public String getSubject() {
    return this.subject;
  }

  public String getMessage() {
    return this.message;
  }

  public String getCcSubject() {
    return this.ccSubject;
  }

  public String getCcMessage() {
    return this.ccMessage;
  }

  public String getLanguage() {
    return this.language;
  }

  public Integer getClientTimestamp() {
    return this.clientTimestamp;
  }

  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  public Boolean getIsFirstInviteInSequence() {
    return this.isFirstInviteInSequence;
  }

  public String getRedirectUri() {
    return this.redirectUri;
  }

  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  public FreeFormInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(uriParams);
  }

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
