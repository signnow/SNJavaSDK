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
 * This class represents a request to clone a template.
 * It implements the RequestInterface with a String type.
 */
@ApiEndpoint(
    name = "createDocumentWithTemplate",
    url = "/template/{template_id}/copy",
    method = "post",
    auth = "bearer",
    namespace = "template",
    entity = "cloneTemplate",
    type = "application/json")
public final class CloneTemplatePostRequest implements RequestInterface<String> {

  /**
   * The name of the document.
   */
  private final String documentName;

  /**
   * The client timestamp.
   */
  private final String clientTimestamp;

  /**
   * The ID of the folder.
   */
  private final String folderId;

  /**
   * The URI parameters.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructor with all parameters.
   *
   * @param documentName The name of the document.
   * @param clientTimestamp The client timestamp.
   * @param folderId The ID of the folder.
   */
  public CloneTemplatePostRequest(String documentName, String clientTimestamp, String folderId) {
    this.documentName = documentName;
    this.clientTimestamp = clientTimestamp;
    this.folderId = folderId;
  }

  /**
   * Constructor with only document name.
   *
   * @param documentName The name of the document.
   */
  public CloneTemplatePostRequest(String documentName) {
    this.documentName = documentName;
    this.clientTimestamp = null;
    this.folderId = null;
  }

  /**
   * Default constructor.
   */
  public CloneTemplatePostRequest() {
    this.documentName = null;
    this.clientTimestamp = null;
    this.folderId = null;
  }

  /**
   * Getter for document name.
   *
   * @return The name of the document.
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Getter for client timestamp.
   *
   * @return The client timestamp.
   */
  public String getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Getter for folder ID.
   *
   * @return The ID of the folder.
   */
  public String getFolderId() {
    return this.folderId;
  }

  /**
   * Method to add template ID to URI parameters.
   *
   * @param templateId The ID of the template.
   * @return The current instance of this class.
   */
  public CloneTemplatePostRequest withTemplateId(String templateId) {
    this.uriParams.put("template_id", templateId);
    return this;
  }

  /**
   * Method to get URI parameters.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Method to get the payload.
   *
   * @return A Map containing the payload.
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("document_name", this.getDocumentName());
    map.put("client_timestamp", this.getClientTimestamp());
    map.put("folder_id", this.getFolderId());
    return map;
  }
}
