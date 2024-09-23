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

@ApiEndpoint(
    name = "inviteToSignDocumentGroup",
    url = "/documentgroup/{document_group_id}/groupinvite",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "groupInvite",
    type = "application/json")
public final class GroupInvitePostRequest implements RequestInterface<Object> {

  private final InviteStepCollection inviteSteps;

  private final CcCollection cc;

  private final EmailGroupCollection emailGroups;

  private final CompletionEmailCollection completionEmails;

  private final boolean signAsMerged;

  private final int clientTimestamp;

  private final String ccSubject;

  private final String ccMessage;

  private final Map<String, String> uriParams = new HashMap<>();

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

  public InviteStepCollection getInviteSteps() {
    return this.inviteSteps;
  }

  public CcCollection getCc() {
    return this.cc;
  }

  public EmailGroupCollection getEmailGroups() {
    return this.emailGroups;
  }

  public CompletionEmailCollection getCompletionEmails() {
    return this.completionEmails;
  }

  public boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  public String getCcSubject() {
    return this.ccSubject;
  }

  public String getCcMessage() {
    return this.ccMessage;
  }

  public GroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(uriParams);
  }

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
