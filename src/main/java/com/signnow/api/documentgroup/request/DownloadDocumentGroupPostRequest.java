/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request;

import com.signnow.api.documentgroup.request.data.DocumentOrderCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "downloadDocumentGroup",
    url = "/documentgroup/{document_group_id}/downloadall",
    method = "post",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "downloadDocumentGroup",
    type = "application/json")
public final class DownloadDocumentGroupPostRequest implements RequestInterface<Object> {

  private final String type;

  private final String withHistory;

  private final DocumentOrderCollection documentOrder;

  private final HashMap<String, String> uriParams = new HashMap<>();

  public DownloadDocumentGroupPostRequest(
      String type, String withHistory, DocumentOrderCollection documentOrder) {
    this.type = type;
    this.withHistory = withHistory;
    this.documentOrder = documentOrder;
  }

  public String getType() {
    return this.type;
  }

  public String getWithHistory() {
    return this.withHistory;
  }

  public DocumentOrderCollection getDocumentOrder() {
    return this.documentOrder;
  }

  public DownloadDocumentGroupPostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
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
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("with_history", this.getWithHistory());
    map.put("document_order", this.getDocumentOrder());
    return map;
  }
}
