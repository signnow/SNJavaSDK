/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentfield.request;

import com.signnow.api.documentfield.request.data.FieldCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "prefillTextFields",
    url = "/v2/documents/{document_id}/prefill-texts",
    method = "put",
    auth = "bearer",
    namespace = "documentField",
    entity = "documentPrefill",
    type = "application/json")
public final class DocumentPrefillPutRequest implements RequestInterface<String> {

  private final FieldCollection fields;

  private final Map<String, String> uriParams = new HashMap<>();

  public DocumentPrefillPutRequest(FieldCollection fields) {
    this.fields = fields;
  }

  public FieldCollection getFields() {
    return this.fields;
  }

  public DocumentPrefillPutRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("fields", this.fields.toString());
    return map;
  }
}
