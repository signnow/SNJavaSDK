/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgrouptemplate.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a document group from a template.
 * It implements the RequestInterface with an Object type.
 */
@ApiEndpoint(
    name = "createDocumentGroupFromTemplate",
    url = "/v2/document-group-templates/{template_group_id}/document-group",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupTemplate",
    entity = "documentGroupTemplate",
    type = "application/json")
public final class DocumentGroupTemplatePostRequest implements RequestInterface<Object> {

  /**
   * The name of the group.
   */
  private final String groupName;

  /**
   * The client timestamp.
   */
  private final String clientTimestamp;

  /**
   * The folder ID.
   */
  private final String folderId;

  /**
   * URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentGroupTemplatePostRequest with the specified group name,
   * client timestamp, and folder ID.
   *
   * @param groupName the name of the group
   * @param clientTimestamp the client timestamp
   * @param folderId the folder ID
   */
  public DocumentGroupTemplatePostRequest(String groupName, String clientTimestamp, String folderId) {
    this.groupName = groupName;
    this.clientTimestamp = clientTimestamp;
    this.folderId = folderId;
  }

  /**
   * Returns the name of the group.
   *
   * @return the name of the group
   */
  public String getGroupName() {
    return this.groupName;
  }

  /**
   * Returns the client timestamp.
   *
   * @return the client timestamp
   */
  public String getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Returns the folder ID.
   *
   * @return the folder ID
   */
  public String getFolderId() {
    return this.folderId;
  }

  /**
   * Sets the template group ID in the URI parameters.
   *
   * @param templateGroupId the template group ID
   * @return the current instance of DocumentGroupTemplatePostRequest
   */
  public DocumentGroupTemplatePostRequest withTemplateGroupId(String templateGroupId) {
    this.uriParams.put("template_group_id", templateGroupId);
    return this;
  }

  /**
   * Returns the URI parameters for the request.
   *
   * @return a HashMap containing the URI parameters as key-value pairs
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map with the payload of the request.
   *
   * @return a Map with the payload of the request
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("group_name", this.getGroupName());
    map.put("client_timestamp", this.getClientTimestamp());
    map.put("folder_id", this.getFolderId());
    return map;
  }
}
