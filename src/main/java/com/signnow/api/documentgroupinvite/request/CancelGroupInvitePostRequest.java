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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "cancelDocumentGroupInvite",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}/cancelinvite",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "cancelGroupInvite",
    type = "application/json")
public final class CancelGroupInvitePostRequest implements RequestInterface<String> {

  private final Map<String, String> uriParams = new HashMap<>();

  public CancelGroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  public CancelGroupInvitePostRequest withInviteId(String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
