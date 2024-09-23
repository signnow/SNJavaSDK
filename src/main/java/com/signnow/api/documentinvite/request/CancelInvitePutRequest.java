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
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "cancelInvite",
    url = "/document/{document_id}/fieldinvitecancel",
    method = "put",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "cancelInvite",
    type = "application/json")
public final class CancelInvitePutRequest implements RequestInterface<String> {

  private final String reason;

  private final Map<String, String> uriParams = new HashMap<>();

  public CancelInvitePutRequest(String reason) {
    this.reason = reason;
  }

  public String getReason() {
    return this.reason;
  }

  public CancelInvitePutRequest withDocumentId(String documentId) {
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
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("reason", this.getReason());
    return map;
  }
}
