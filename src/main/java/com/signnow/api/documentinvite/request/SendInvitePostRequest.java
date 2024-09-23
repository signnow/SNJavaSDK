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
import com.signnow.api.documentinvite.request.data.CcStepCollection;
import com.signnow.api.documentinvite.request.data.ToCollection;
import com.signnow.api.documentinvite.request.data.ViewerCollection;
import com.signnow.api.documentinvite.request.data.emailgroup.EmailGroupCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "sendFieldInvite",
    url = "/document/{document_id}/invite",
    method = "post",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "sendInvite",
    type = "application/json")
public final class SendInvitePostRequest implements RequestInterface<Object> {

  private final String documentId;

  private final ToCollection to;

  private final String from;

  private final String subject;

  private final String message;

  private final EmailGroupCollection emailGroups;

  private final CcCollection cc;

  private final CcStepCollection ccStep;

  private final ViewerCollection viewers;

  private final String ccSubject;

  private final String ccMessage;

  private final Map<String, String> uriParams = new HashMap<>();

  public SendInvitePostRequest(
      String documentId, ToCollection to, String from, String subject, String message) {
    this.documentId = documentId;
    this.to = to;
    this.from = from;
    this.subject = subject;
    this.message = message;
    this.emailGroups = new EmailGroupCollection();
    this.cc = new CcCollection();
    this.ccStep = new CcStepCollection();
    this.viewers = new ViewerCollection();
    this.ccSubject = null;
    this.ccMessage = null;
  }

  public SendInvitePostRequest(
      String documentId,
      ToCollection to,
      String from,
      String subject,
      String message,
      EmailGroupCollection emailGroups,
      CcCollection cc,
      CcStepCollection ccStep,
      ViewerCollection viewers,
      String ccSubject,
      String ccMessage) {
    this.documentId = documentId;
    this.to = to;
    this.from = from;
    this.subject = subject;
    this.message = message;
    this.emailGroups = emailGroups;
    this.cc = cc;
    this.ccStep = ccStep;
    this.viewers = viewers;
    this.ccSubject = ccSubject;
    this.ccMessage = ccMessage;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public ToCollection getTo() {
    return this.to;
  }

  public String getFrom() {
    return this.from;
  }

  public String getSubject() {
    return this.subject;
  }

  public String getMessage() {
    return this.message;
  }

  public EmailGroupCollection getEmailGroups() {
    return this.emailGroups;
  }

  public CcCollection getCc() {
    return this.cc;
  }

  public CcStepCollection getCcStep() {
    return this.ccStep;
  }

  public ViewerCollection getViewers() {
    return this.viewers;
  }

  public String getCcSubject() {
    return this.ccSubject;
  }

  public String getCcMessage() {
    return this.ccMessage;
  }

  @NotNull
  @Contract(value = "_ -> this", pure = true)
  public SendInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(uriParams);
  }

  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("to", this.getTo());
    map.put("from", this.getFrom());
    map.put("email_groups", this.getEmailGroups());
    map.put("cc", this.getCc());
    map.put("cc_step", this.getCcStep());
    map.put("viewers", this.getViewers());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    map.put("cc_subject", this.getCcSubject());
    map.put("cc_message", this.getCcMessage());
    return map;
  }
}
