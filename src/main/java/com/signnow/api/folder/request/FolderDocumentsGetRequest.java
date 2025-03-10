/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to get documents from a folder.
 * It is annotated with @ApiEndpoint to provide metadata for the API endpoint.
 */
@ApiEndpoint(
    name = "getFolderDocuments",
    url = "/folder/{folder_id}",
    method = "get",
    auth = "bearer",
    namespace = "folder",
    entity = "folderDocuments",
    type = "application/json")
public final class FolderDocumentsGetRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Method to add a folder ID to the URI parameters.
   *
   * @param folderId The ID of the folder.
   * @return The current FolderDocumentsGetRequest instance.
   */
  public FolderDocumentsGetRequest withFolderId(String folderId) {
    this.uriParams.put("folder_id", folderId);
    return this;
  }

  /**
   * Method to get the URI parameters for the request.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Method to get the payload for the request.
   *
   * @return A new HashMap (empty in this case as there is no payload).
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}