/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request;

import com.signnow.api.documentgroupinvite.request.data.InviteEmail;
import com.signnow.api.documentgroupinvite.request.data.UpdateInviteActionAttributeCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "reassignSignerForDocumentGroupInvite",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}/invitestep/{step_id}/update",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "reassignSigner",
    type = "application/json")
public final class ReassignSignerPostRequest implements RequestInterface<Object> {

  private final String userToUpdate;

  private final String replaceWithThisUser;

  private final InviteEmail inviteEmail;

  private final UpdateInviteActionAttributeCollection updateInviteActionAttributes;

  private final Map<String, String> uriParams = new HashMap<>();

  public ReassignSignerPostRequest(
      String userToUpdate,
      String replaceWithThisUser,
      InviteEmail inviteEmail,
      UpdateInviteActionAttributeCollection updateInviteActionAttributes) {
    this.userToUpdate = userToUpdate;
    this.replaceWithThisUser = replaceWithThisUser;
    this.inviteEmail = inviteEmail;
    this.updateInviteActionAttributes = updateInviteActionAttributes;
  }

  public String getUserToUpdate() {
    return this.userToUpdate;
  }

  public String getReplaceWithThisUser() {
    return this.replaceWithThisUser;
  }

  public InviteEmail getInviteEmail() {
    return this.inviteEmail;
  }

  public UpdateInviteActionAttributeCollection getUpdateInviteActionAttributes() {
    return this.updateInviteActionAttributes;
  }

  public ReassignSignerPostRequest withDocumentGroupId(String documentGroupId) {
    uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  public ReassignSignerPostRequest withInviteId(String inviteId) {
    uriParams.put("invite_id", inviteId);
    return this;
  }

  public ReassignSignerPostRequest withStepId(String stepId) {
    uriParams.put("step_id", stepId);
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
    map.put("user_to_update", this.getUserToUpdate());
    map.put("replace_with_this_user", this.getReplaceWithThisUser());
    map.put("invite_email", this.getInviteEmail());
    map.put("update_invite_action_attributes", this.getUpdateInviteActionAttributes());
    return map;
  }
}
