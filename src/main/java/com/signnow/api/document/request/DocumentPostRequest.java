/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "uploadDocument",
    url = "/document",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "document",
    type = "multipart/form-data")
public final class DocumentPostRequest implements RequestInterface<Object> {

  private final File file;

  private final String name;

  private final boolean checkFields;

  private final int saveFields;

  private final int makeTemplate;

  private final String password;

  private final String folderId;

  private final String originTemplateId;

  private final int clientTimestamp;

  public DocumentPostRequest(
      File file,
      String name,
      boolean checkFields,
      int saveFields,
      int makeTemplate,
      String password,
      String folderId,
      String originTemplateId,
      int clientTimestamp) {
    this.file = file;
    this.name = name;
    this.checkFields = checkFields;
    this.saveFields = saveFields;
    this.makeTemplate = makeTemplate;
    this.password = password;
    this.folderId = folderId;
    this.originTemplateId = originTemplateId;
    this.clientTimestamp = clientTimestamp;
  }

  public DocumentPostRequest(File file) {
    this.file = file;
    this.name = null;
    this.checkFields = false;
    this.saveFields = 0;
    this.makeTemplate = 0;
    this.password = null;
    this.folderId = null;
    this.originTemplateId = null;
    this.clientTimestamp = 0;
  }

  public DocumentPostRequest(File file, String name) {
    this.file = file;
    this.name = name;
    this.checkFields = false;
    this.saveFields = 0;
    this.makeTemplate = 0;
    this.password = null;
    this.folderId = null;
    this.originTemplateId = null;
    this.clientTimestamp = 0;
  }

  public File getFile() {
    return this.file;
  }

  public String getName() {
    return this.name;
  }

  public boolean isCheckFields() {
    return this.checkFields;
  }

  public int getSaveFields() {
    return this.saveFields;
  }

  public int getMakeTemplate() {
    return this.makeTemplate;
  }

  public String getPassword() {
    return this.password;
  }

  public String getFolderId() {
    return this.folderId;
  }

  public String getOriginTemplateId() {
    return this.originTemplateId;
  }

  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("file", this.getFile());
    map.put("name", this.getName());
    map.put("check_fields", this.isCheckFields());
    map.put("save_fields", this.getSaveFields());
    map.put("make_template", this.getMakeTemplate());
    map.put("password", this.getPassword());
    map.put("folder_id", this.getFolderId());
    map.put("origin_template_id", this.getOriginTemplateId());
    map.put("client_timestamp", this.getClientTimestamp());
    return map;
  }
}
