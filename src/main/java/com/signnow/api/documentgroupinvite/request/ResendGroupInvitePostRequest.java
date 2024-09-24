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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "resendDocumentGroupInvite",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}/resendinvites",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "resendGroupInvite",
    type = "application/json")
public final class ResendGroupInvitePostRequest implements RequestInterface<String> {

  private final String email;

  private final Map<String, String> uriParams = new HashMap<>();

  public ResendGroupInvitePostRequest(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  public ResendGroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  public ResendGroupInvitePostRequest withInviteId(String inviteId) {
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
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("email", this.getEmail());
    return map;
  }
}
