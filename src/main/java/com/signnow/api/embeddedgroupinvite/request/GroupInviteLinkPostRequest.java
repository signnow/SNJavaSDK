/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "createLinkForEmbeddedInviteDocumentGroup",
    url = "/v2/document-groups/{document_group_id}/embedded-invites/{embedded_invite_id}/link",
    method = "post",
    auth = "bearer",
    namespace = "embeddedGroupInvite",
    entity = "groupInviteLink",
    type = "application/json")
public final class GroupInviteLinkPostRequest implements RequestInterface<Object> {

  private final String email;

  private final String authMethod;

  private final int linkExpiration;

  private final Map<String, String> uriParams = new HashMap<>();

  public GroupInviteLinkPostRequest(String email, String authMethod, int linkExpiration) {
    this.email = email;
    this.authMethod = authMethod;
    this.linkExpiration = linkExpiration;
  }

  public String getEmail() {
    return this.email;
  }

  public String getAuthMethod() {
    return this.authMethod;
  }

  public int getLinkExpiration() {
    return this.linkExpiration;
  }

  public GroupInviteLinkPostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  public GroupInviteLinkPostRequest withEmbeddedInviteId(String embeddedInviteId) {
    this.uriParams.put("embedded_invite_id", embeddedInviteId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("email", this.getEmail());
    map.put("auth_method", this.getAuthMethod());
    map.put("link_expiration", this.getLinkExpiration());
    return map;
  }
}
