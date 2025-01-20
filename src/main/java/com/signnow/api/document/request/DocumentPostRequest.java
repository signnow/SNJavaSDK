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

/**
 * Represents a request to upload a document to the server.
 * This class is used to build the request payload and parameters.
 */
@ApiEndpoint(
    name = "uploadDocument",
    url = "/document",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "document",
    type = "multipart/form-data")
public final class DocumentPostRequest implements RequestInterface<Object> {

  /**
   * The file to be uploaded.
   */
  private final File file;

  /**
   * The name of the file.
   */
  private final String name;

  /**
   * Flag to check fields.
   */
  private final boolean checkFields;

  /**
   * Flag to save fields.
   */
  private final int saveFields;

  /**
   * Flag to make template.
   */
  private final int makeTemplate;

  /**
   * The password for the document.
   */
  private final String password;

  /**
   * The ID of the folder where the document will be stored.
   */
  private final String folderId;

  /**
   * The ID of the original template.
   */
  private final String originTemplateId;

  /**
   * The client timestamp.
   */
  private final int clientTimestamp;

  /**
   * Constructs a new DocumentPostRequest with the specified parameters.
   *
   * @param file the file to be uploaded
   * @param name the name of the file
   * @param checkFields flag to check fields
   * @param saveFields flag to save fields
   * @param makeTemplate flag to make template
   * @param password the password for the document
   * @param folderId the ID of the folder where the document will be stored
   * @param originTemplateId the ID of the original template
   * @param clientTimestamp the client timestamp
   */
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

  /**
   * Constructs a new DocumentPostRequest with the specified file.
   *
   * @param file the file to be uploaded
   */
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

  /**
   * Constructs a new DocumentPostRequest with the specified file and name.
   *
   * @param file the file to be uploaded
   * @param name the name of the file
   */
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

  /**
   * Returns the file to be uploaded.
   *
   * @return the file to be uploaded
   */
  public File getFile() {
    return this.file;
  }

  /**
   * Returns the name of the file.
   *
   * @return the name of the file
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the flag to check fields.
   *
   * @return the flag to check fields
   */
  public boolean isCheckFields() {
    return this.checkFields;
  }

  /**
   * Returns the flag to save fields.
   *
   * @return the flag to save fields
   */
  public int getSaveFields() {
    return this.saveFields;
  }

  /**
   * Returns the flag to make template.
   *
   * @return the flag to make template
   */
  public int getMakeTemplate() {
    return this.makeTemplate;
  }

  /**
   * Returns the password for the document.
   *
   * @return the password for the document
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Returns the ID of the folder where the document will be stored.
   *
   * @return the ID of the folder where the document will be stored
   */
  public String getFolderId() {
    return this.folderId;
  }

  /**
   * Returns the ID of the original template.
   *
   * @return the ID of the original template
   */
  public String getOriginTemplateId() {
    return this.originTemplateId;
  }

  /**
   * Returns the client timestamp.
   *
   * @return the client timestamp
   */
  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Returns the URI parameters for the request.
   *
   * @return the URI parameters for the request
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns the payload for the request.
   *
   * @return the payload for the request
   */
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