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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "deleteEmbeddedInvite",
    url = "/v2/documents/{document_id}/embedded-invites",
    method = "delete",
    auth = "bearer",
    namespace = "embeddedInvite",
    entity = "documentInvite",
    type = "application/json")
public final class DocumentInviteDeleteRequest implements RequestInterface<String> {

  private final HashMap<String, String> uriParams = new HashMap<>();

  public DocumentInviteDeleteRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
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
