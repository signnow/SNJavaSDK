/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request;

import com.signnow.api.documentgroupinvite.request.data.CcCollection;
import com.signnow.api.documentgroupinvite.request.data.CompletionEmailCollection;
import com.signnow.api.documentgroupinvite.request.data.emailgroup.EmailGroupCollection;
import com.signnow.api.documentgroupinvite.request.data.invitestep.InviteStepCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a request to invite a group to sign a document.
 * This class is used to generate the payload for the API endpoint.
 */
@ApiEndpoint(
    name = "inviteToSignDocumentGroup",
    url = "/documentgroup/{document_group_id}/groupinvite",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "groupInvite",
    type = "application/json")
public final class GroupInvitePostRequest implements RequestInterface<Object> {

  /**
   * Collection of invite steps.
   */
  private final InviteStepCollection inviteSteps;

  /**
   * Collection of CC recipients.
   */
  private final CcCollection cc;

  /**
   * Collection of email groups.
   */
  private final EmailGroupCollection emailGroups;

  /**
   * Collection of completion emails.
   */
  private final CompletionEmailCollection completionEmails;

  /**
   * Flag indicating whether to sign as merged.
   */
  private final boolean signAsMerged;

  /**
   * Client timestamp.
   */
  private final int clientTimestamp;

  /**
   * Subject of the CC email.
   */
  private final String ccSubject;

  /**
   * Message of the CC email.
   */
  private final String ccMessage;

  /**
   * Map of URI parameters.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new GroupInvitePostRequest with the specified parameters.
   */
  public GroupInvitePostRequest(
      InviteStepCollection inviteSteps,
      CcCollection cc,
      EmailGroupCollection emailGroups,
      CompletionEmailCollection completionEmails,
      boolean signAsMerged,
      int clientTimestamp,
      String ccSubject,
      String ccMessage) {
    this.inviteSteps = inviteSteps;
    this.cc = cc;
    this.emailGroups = emailGroups;
    this.completionEmails = completionEmails;
    this.signAsMerged = signAsMerged;
    this.clientTimestamp = clientTimestamp;
    this.ccSubject = ccSubject;
    this.ccMessage = ccMessage;
  }

  /**
   * Constructs a new GroupInvitePostRequest with the specified invite steps and CC collection.
   */
  public GroupInvitePostRequest(InviteStepCollection inviteSteps, CcCollection cc) {
    this.inviteSteps = inviteSteps;
    this.cc = cc;
    this.emailGroups = null;
    this.completionEmails = null;
    this.signAsMerged = false;
    this.clientTimestamp = 0;
    this.ccSubject = null;
    this.ccMessage = null;
  }

  /**
   * Returns the invite steps.
   */
  public InviteStepCollection getInviteSteps() {
    return this.inviteSteps;
  }

  /**
   * Returns the CC collection.
   */
  public CcCollection getCc() {
    return this.cc;
  }

  /**
   * Returns the email groups.
   */
  public EmailGroupCollection getEmailGroups() {
    return this.emailGroups;
  }

  /**
   * Returns the completion emails.
   */
  public CompletionEmailCollection getCompletionEmails() {
    return this.completionEmails;
  }

  /**
   * Returns whether to sign as merged.
   */
  public boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  /**
   * Returns the client timestamp.
   */
  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Returns the CC email subject.
   */
  public String getCcSubject() {
    return this.ccSubject;
  }

  /**
   * Returns the CC email message.
   */
  public String getCcMessage() {
    return this.ccMessage;
  }

  /**
   * Adds the document group ID to the URI parameters.
   */
  public GroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
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
   * Returns a map representing the payload of the request.
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("invite_steps", this.getInviteSteps());
    map.put("email_groups", this.getEmailGroups());
    map.put("completion_emails", this.getCompletionEmails());
    map.put("sign_as_merged", this.isSignAsMerged());
    map.put("client_timestamp", this.getClientTimestamp());
    map.put("cc", this.getCc());
    map.put("cc_subject", this.getCcSubject());
    map.put("cc_message", this.getCcMessage());
    return map;
  }
}
