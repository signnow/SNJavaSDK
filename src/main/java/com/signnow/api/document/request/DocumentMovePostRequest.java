/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "moveDocument",
    url = "/document/{document_id}/move",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "documentMove",
    type = "application/json")
public final class DocumentMovePostRequest implements RequestInterface<String> {

  private final String folderId;

  private final HashMap<String, String> uriParams = new HashMap<>();

  public DocumentMovePostRequest(String folderId) {
    this.folderId = folderId;
  }

  public String getFolderId() {
    return this.folderId;
  }

  public DocumentMovePostRequest withDocumentId(String documentId) {
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
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("folder_id", this.getFolderId());
    return map;
  }
}
