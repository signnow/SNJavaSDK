/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.api.document.request.data.DocumentIdCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "mergeDocuments",
    url = "/document/merge",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "documentMerge",
    type = "application/json")
public final class DocumentMergePostRequest implements RequestInterface<Object> {

  private final String name;

  private final DocumentIdCollection documentIds;

  private final boolean uploadDocument;

  public DocumentMergePostRequest(
      String name, DocumentIdCollection documentIds, boolean uploadDocument) {
    this.name = name;
    this.documentIds = documentIds;
    this.uploadDocument = uploadDocument;
  }

  public String getName() {
    return this.name;
  }

  public DocumentIdCollection getDocumentIds() {
    return this.documentIds;
  }

  public boolean isUploadDocument() {
    return this.uploadDocument;
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
    map.put("name", this.getName());
    map.put("document_ids", this.getDocumentIds());
    map.put("upload_document", this.isUploadDocument());
    return map;
  }
}
