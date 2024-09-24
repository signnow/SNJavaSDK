/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "createDocumentWithTemplate",
    url = "/template/{template_id}/copy",
    method = "post",
    auth = "bearer",
    namespace = "template",
    entity = "cloneTemplate",
    type = "application/json")
public final class CloneTemplatePostRequest implements RequestInterface<String> {

  private final String documentName;

  private final String clientTimestamp;

  private final String folderId;

  private final HashMap<String, String> uriParams = new HashMap<>();

  public CloneTemplatePostRequest(String documentName, String clientTimestamp, String folderId) {
    this.documentName = documentName;
    this.clientTimestamp = clientTimestamp;
    this.folderId = folderId;
  }

  public CloneTemplatePostRequest(String documentName) {
    this.documentName = documentName;
    this.clientTimestamp = null;
    this.folderId = null;
  }

  public CloneTemplatePostRequest() {
    this.documentName = null;
    this.clientTimestamp = null;
    this.folderId = null;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public String getClientTimestamp() {
    return this.clientTimestamp;
  }

  public String getFolderId() {
    return this.folderId;
  }

  public CloneTemplatePostRequest withTemplateId(String templateId) {
    this.uriParams.put("template_id", templateId);
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
    map.put("document_name", this.getDocumentName());
    map.put("client_timestamp", this.getClientTimestamp());
    map.put("folder_id", this.getFolderId());
    return map;
  }
}
