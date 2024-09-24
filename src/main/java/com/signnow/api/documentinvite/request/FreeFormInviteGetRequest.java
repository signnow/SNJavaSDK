/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "getDocumentFreeFormInvites",
    url = "/v2/documents/{document_id}/free-form-invites",
    method = "get",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "freeFormInvite",
    type = "application/json")
public final class FreeFormInviteGetRequest implements RequestInterface<String> {

  private final HashMap<String, String> uriParams = new HashMap<>();

  @NotNull
  @Contract("_ -> this")
  public FreeFormInviteGetRequest withDocumentId(@NotNull String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return this.uriParams;
  }

  @NotNull
  @Override
  public HashMap<String, String> payload() {
    return new HashMap<>();
  }
}
