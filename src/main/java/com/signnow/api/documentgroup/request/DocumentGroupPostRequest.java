/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request;

import com.signnow.api.documentgroup.request.data.DocumentIdCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "createDocumentGroup",
    url = "/documentgroup",
    method = "post",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "documentGroup",
    type = "application/json")
public final class DocumentGroupPostRequest implements RequestInterface<Object> {

  private final DocumentIdCollection documentIds;

  private final String groupName;

  public DocumentGroupPostRequest(DocumentIdCollection documentIds, String groupName) {
    this.documentIds = documentIds;
    this.groupName = groupName;
  }

  public DocumentIdCollection getDocumentIds() {
    return this.documentIds;
  }

  public String getGroupName() {
    return this.groupName;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("document_ids", this.getDocumentIds());
    map.put("group_name", this.getGroupName());
    return map;
  }
}
