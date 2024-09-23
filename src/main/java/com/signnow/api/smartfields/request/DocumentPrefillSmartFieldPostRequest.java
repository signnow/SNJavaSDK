/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.smartfields.request;

import com.signnow.api.smartfields.request.data.DataCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "prefillSmartFields",
    url = "/document/{document_id}/integration/object/smartfields",
    method = "post",
    auth = "bearer",
    namespace = "smartFields",
    entity = "documentPrefillSmartField",
    type = "application/json")
public final class DocumentPrefillSmartFieldPostRequest implements RequestInterface<Object> {

  private final DataCollection data;

  private final String clientTimestamp;

  private final HashMap<String, String> uriParams = new HashMap<>();

  public DocumentPrefillSmartFieldPostRequest(DataCollection data, String clientTimestamp) {
    this.data = data;
    this.clientTimestamp = clientTimestamp;
  }

  public DataCollection getData() {
    return this.data;
  }

  public String getClientTimestamp() {
    return this.clientTimestamp;
  }

  public DocumentPrefillSmartFieldPostRequest withDocumentId(String documentId) {
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
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("data", this.getData());
    map.put("client_timestamp", this.getClientTimestamp());
    return map;
  }
}
