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
    name = "createTemplate",
    url = "/template",
    method = "post",
    auth = "bearer",
    namespace = "template",
    entity = "template",
    type = "application/json")
public final class TemplatePostRequest implements RequestInterface<String> {

  private final String documentId;

  private final String documentName;

  public TemplatePostRequest(String documentId, String documentName) {
    this.documentId = documentId;
    this.documentName = documentName;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("document_name", this.getDocumentName());
    return map;
  }
}
