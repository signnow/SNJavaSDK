/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "createLinkForEmbeddedInvite",
    url = "/v2/documents/{document_id}/embedded-invites/{field_invite_id}/link",
    method = "post",
    auth = "bearer",
    namespace = "embeddedInvite",
    entity = "documentInviteLink",
    type = "application/json")
public final class DocumentInviteLinkPostRequest implements RequestInterface<Object> {

  private final String authMethod;

  private final int linkExpiration;

  private final Map<String, String> uriParams = new HashMap<>();

  public DocumentInviteLinkPostRequest(String authMethod, int linkExpiration) {
    this.authMethod = authMethod;
    this.linkExpiration = linkExpiration;
  }

  public String getAuthMethod() {
    return this.authMethod;
  }

  public int getLinkExpiration() {
    return this.linkExpiration;
  }

  public DocumentInviteLinkPostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  public DocumentInviteLinkPostRequest withFieldInviteId(String fieldInviteId) {
    this.uriParams.put("field_invite_id", fieldInviteId);
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
    map.put("auth_method", this.getAuthMethod());
    map.put("link_expiration", this.getLinkExpiration());
    return map;
  }
}
