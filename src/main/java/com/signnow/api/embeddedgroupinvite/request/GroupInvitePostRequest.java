/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.request;

import com.signnow.api.embeddedgroupinvite.request.data.invite.InviteCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create an embedded invite for a document group.
 */
@ApiEndpoint(
    name = "createEmbeddedInviteForDocumentGroup",
    url = "/v2/document-groups/{document_group_id}/embedded-invites",
    method = "post",
    auth = "bearer",
    namespace = "embeddedGroupInvite",
    entity = "groupInvite",
    type = "application/json")
public final class GroupInvitePostRequest implements RequestInterface<Object> {

  /**
   * Collection of invites.
   */
  private final InviteCollection invites;

  /**
   * Flag to indicate if the document should be signed as merged.
   */
  private final boolean signAsMerged;

  /**
   * Map to hold URI parameters.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructor to initialize invites and signAsMerged flag.
   *
   * @param invites Collection of invites.
   * @param signAsMerged Flag to indicate if the document should be signed as merged.
   */
  public GroupInvitePostRequest(InviteCollection invites, boolean signAsMerged) {
    this.invites = invites;
    this.signAsMerged = signAsMerged;
  }

  /**
   * Getter for invites.
   *
   * @return Collection of invites.
   */
  public InviteCollection getInvites() {
    return this.invites;
  }

  /**
   * Getter for signAsMerged flag.
   *
   * @return True if the document should be signed as merged, false otherwise.
   */
  public boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  /**
   * Method to set document group id in URI parameters.
   *
   * @param documentGroupId Document group id.
   * @return Current instance of GroupInvitePostRequest.
   */
  public GroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Method to get URI parameters.
   *
   * @return Map of URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Method to get payload for the request.
   *
   * @return Map of payload data.
   */
  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("invites", this.getInvites());
    map.put("sign_as_merged", this.isSignAsMerged());
    return map;
  }
}