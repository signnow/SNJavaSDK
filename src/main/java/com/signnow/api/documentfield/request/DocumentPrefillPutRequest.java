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

/**
 * Represents the API endpoint for prefilling text fields in a document.
 */
@ApiEndpoint(
    name = "prefillTextFields",
    url = "/v2/documents/{document_id}/prefill-texts",
    method = "put",
    auth = "bearer",
    namespace = "documentField",
    entity = "documentPrefill",
    type = "application/json")
public final class DocumentPrefillPutRequest implements RequestInterface<Object> {

  /**
   * Collection of fields to be prefilled in the document.
   */
  private final FieldCollection fields;

  /**
   * Map of URI parameters.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructor for DocumentPrefillPutRequest.
   *
   * @param fields Collection of fields to be prefilled in the document.
   */
  public DocumentPrefillPutRequest(FieldCollection fields) {
    this.fields = fields;
  }

  /**
   * Getter for fields.
   *
   * @return FieldCollection object representing the fields to be prefilled in the document.
   */
  public FieldCollection getFields() {
    return this.fields;
  }

  /**
   * Method to add document ID to the URI parameters.
   *
   * @param documentId ID of the document.
   * @return DocumentPrefillPutRequest object with updated URI parameters.
   */
  public DocumentPrefillPutRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Method to get URI parameters.
   *
   * @return HashMap of URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Method to get payload for the request.
   *
   * @return Map of payload parameters.
   */
  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("fields", this.getFields());
    return map;
  }
}
