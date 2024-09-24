/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request;

import com.signnow.api.embeddedinvite.request.data.InviteCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "createEmbeddedInvite",
    url = "/v2/documents/{document_id}/embedded-invites",
    method = "post",
    auth = "bearer",
    namespace = "embeddedInvite",
    entity = "documentInvite",
    type = "application/json")
public final class DocumentInvitePostRequest implements RequestInterface<Object> {

  private final InviteCollection invites;

  private final String nameFormula;

  private final Map<String, String> uriParams = new HashMap<>();

  public DocumentInvitePostRequest(InviteCollection invites, String nameFormula) {
    this.invites = invites;
    this.nameFormula = nameFormula;
  }

  public String getNameFormula() {
    return this.nameFormula;
  }

  public InviteCollection getInvites() {
    return this.invites;
  }

  public DocumentInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
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
    map.put("name_formula", this.getNameFormula());
    map.put("invites", this.getInvites());
    return map;
  }
}
