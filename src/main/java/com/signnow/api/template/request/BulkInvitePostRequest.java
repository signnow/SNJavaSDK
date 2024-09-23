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
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "bulkInvite",
    url = "/template/{document_id}/bulkinvite",
    method = "post",
    auth = "bearer",
    namespace = "template",
    entity = "bulkInvite",
    type = "multipart/form-data")
public final class BulkInvitePostRequest implements RequestInterface<Object> {

  private final File file;

  private final String folderId;

  private final int clientTimestamp;

  private final String documentName;

  private final String subject;

  private final String emailMessage;

  private final HashMap<String, String> uriParams = new HashMap<>();

  public BulkInvitePostRequest(
      File file,
      String folderId,
      int clientTimestamp,
      String documentName,
      String subject,
      String emailMessage) {
    this.file = file;
    this.folderId = folderId;
    this.clientTimestamp = clientTimestamp;
    this.documentName = documentName;
    this.subject = subject;
    this.emailMessage = emailMessage;
  }

  public File getFile() {
    return this.file;
  }

  public String getFolderId() {
    return this.folderId;
  }

  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public String getSubject() {
    return this.subject;
  }

  public String getEmailMessage() {
    return this.emailMessage;
  }

  public BulkInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("file", this.getFile());
    map.put("folder_id", this.getFolderId());
    map.put("client_timestamp", this.getClientTimestamp());
    map.put("document_name", this.getDocumentName());
    map.put("subject", this.getSubject());
    map.put("email_message", this.getEmailMessage());
    return map;
  }
}
