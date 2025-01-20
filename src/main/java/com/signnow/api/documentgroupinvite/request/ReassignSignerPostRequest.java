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

/**
 * This class represents a request to reassign a signer for a document group invite.
 * It implements the RequestInterface with a payload of type Object.
 */
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

  /**
   * Constructor for ReassignSignerPostRequest.
   *
   * @param userToUpdate the user to be updated
   * @param replaceWithThisUser the user to replace the current user with
   * @param inviteEmail the invite email
   * @param updateInviteActionAttributes the update invite action attributes
   */
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

  /**
   * @return the user to update
   */
  public String getUserToUpdate() {
    return this.userToUpdate;
  }

  /**
   * @return the user to replace with
   */
  public String getReplaceWithThisUser() {
    return this.replaceWithThisUser;
  }

  /**
   * @return the invite email
   */
  public InviteEmail getInviteEmail() {
    return this.inviteEmail;
  }

  /**
   * @return the update invite action attributes
   */
  public UpdateInviteActionAttributeCollection getUpdateInviteActionAttributes() {
    return this.updateInviteActionAttributes;
  }

  /**
   * Sets the document group id in the URI parameters.
   *
   * @param documentGroupId the document group id
   * @return the current ReassignSignerPostRequest instance
   */
  public ReassignSignerPostRequest withDocumentGroupId(String documentGroupId) {
    uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Sets the invite id in the URI parameters.
   *
   * @param inviteId the invite id
   * @return the current ReassignSignerPostRequest instance
   */
  public ReassignSignerPostRequest withInviteId(String inviteId) {
    uriParams.put("invite_id", inviteId);
    return this;
  }

  /**
   * Sets the step id in the URI parameters.
   *
   * @param stepId the step id
   * @return the current ReassignSignerPostRequest instance
   */
  public ReassignSignerPostRequest withStepId(String stepId) {
    uriParams.put("step_id", stepId);
    return this;
  }

  /**
   * @return a new HashMap containing the URI parameters
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(uriParams);
  }

  /**
   * Constructs the payload for the request.
   *
   * @return a Map containing the payload data
   */
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