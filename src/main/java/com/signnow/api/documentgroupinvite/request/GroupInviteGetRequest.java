/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "getDocumentGroupInvite",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}",
    method = "get",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "groupInvite",
    type = "application/json")
public final class GroupInviteGetRequest implements RequestInterface<String> {

  private final HashMap<String, String> uriParams = new HashMap<>();

  public GroupInviteGetRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  public GroupInviteGetRequest withInviteId(String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public HashMap<String, String> payload() {
    return new HashMap<>();
  }
}