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

/**
 * This class represents a request to create a template.
 * It implements the RequestInterface with a String type.
 */
@ApiEndpoint(
    name = "createTemplate",
    url = "/template",
    method = "post",
    auth = "bearer",
    namespace = "template",
    entity = "template",
    type = "application/json")
public final class TemplatePostRequest implements RequestInterface<String> {

  /**
   * The ID of the document to be used as a template.
   */
  private final String documentId;

  /**
   * The name of the document to be used as a template.
   */
  private final String documentName;

  /**
   * Constructs a new TemplatePostRequest with the specified document ID and name.
   *
   * @param documentId the ID of the document
   * @param documentName the name of the document
   */
  public TemplatePostRequest(String documentId, String documentName) {
    this.documentId = documentId;
    this.documentName = documentName;
  }

  /**
   * Returns the ID of the document.
   *
   * @return the document ID
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the name of the document.
   *
   * @return the document name
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Returns an empty HashMap for URI parameters.
   *
   * @return an empty HashMap
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a Map with the document ID and name as the payload.
   *
   * @return a Map with the document ID and name
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("document_name", this.getDocumentName());
    return map;
  }
}