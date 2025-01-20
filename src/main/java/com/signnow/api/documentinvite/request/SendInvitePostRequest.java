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

/**
 * This class represents a request to send an invite post.
 * It implements the RequestInterface with a generic type of Object.
 */
@ApiEndpoint(
    name = "sendFieldInvite",
    url = "/document/{document_id}/invite",
    method = "post",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "sendInvite",
    type = "application/json")
public final class SendInvitePostRequest implements RequestInterface<Object> {

  /**
   * The ID of the document.
   */
  private final String documentId;

  /**
   * The collection of recipients.
   */
  private final ToCollection to;

  /**
   * The sender of the invite.
   */
  private final String from;

  /**
   * The subject of the invite.
   */
  private final String subject;

  /**
   * The message of the invite.
   */
  private final String message;

  /**
   * The collection of email groups.
   */
  private final EmailGroupCollection emailGroups;

  /**
   * The collection of CC recipients.
   */
  private final CcCollection cc;

  /**
   * The collection of CC steps.
   */
  private final CcStepCollection ccStep;

  /**
   * The collection of viewers.
   */
  private final ViewerCollection viewers;

  /**
   * The subject of the CC invite.
   */
  private final String ccSubject;

  /**
   * The message of the CC invite.
   */
  private final String ccMessage;

  /**
   * The map of URI parameters.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructor with basic parameters.
   */
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

  /**
   * Constructor with all parameters.
   */
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

  /**
   * Returns the document ID.
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the collection of recipients.
   */
  public ToCollection getTo() {
    return this.to;
  }

  /**
   * Returns the sender of the invite.
   */
  public String getFrom() {
    return this.from;
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
   * Returns the collection of email groups.
   */
  public EmailGroupCollection getEmailGroups() {
    return this.emailGroups;
  }

  /**
   * Returns the collection of CC recipients.
   */
  public CcCollection getCc() {
    return this.cc;
  }

  /**
   * Returns the collection of CC steps.
   */
  public CcStepCollection getCcStep() {
    return this.ccStep;
  }

  /**
   * Returns the collection of viewers.
   */
  public ViewerCollection getViewers() {
    return this.viewers;
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
   * Sets the document ID and returns the updated request.
   */
  @NotNull
  @Contract(value = "_ -> this", pure = true)
  public SendInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns a copy of the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(uriParams);
  }

  /**
   * Returns the payload of the request as a map.
   */
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
