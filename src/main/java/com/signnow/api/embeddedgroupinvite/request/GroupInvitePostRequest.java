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

@ApiEndpoint(
    name = "createEmbeddedInviteForDocumentGroup",
    url = "/v2/document-groups/{document_group_id}/embedded-invites",
    method = "post",
    auth = "bearer",
    namespace = "embeddedGroupInvite",
    entity = "groupInvite",
    type = "application/json")
public final class GroupInvitePostRequest implements RequestInterface<Object> {

  private final InviteCollection invites;

  private final boolean signAsMerged;

  private final Map<String, String> uriParams = new HashMap<>();

  public GroupInvitePostRequest(InviteCollection invites, boolean signAsMerged) {
    this.invites = invites;
    this.signAsMerged = signAsMerged;
  }

  public InviteCollection getInvites() {
    return this.invites;
  }

  public boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  public GroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("invites", this.getInvites());
    map.put("sign_as_merged", this.isSignAsMerged());
    return map;
  }
}
