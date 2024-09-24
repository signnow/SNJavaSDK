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

@ApiEndpoint(
    name = "getFolderDocuments",
    url = "/folder/{folder_id}",
    method = "get",
    auth = "bearer",
    namespace = "folder",
    entity = "folderDocuments",
    type = "application/json")
public final class FolderDocumentsGetRequest implements RequestInterface<String> {

  private final Map<String, String> uriParams = new HashMap<>();

  public FolderDocumentsGetRequest withFolderId(String folderId) {
    this.uriParams.put("folder_id", folderId);
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
    return new HashMap<>();
  }
}
