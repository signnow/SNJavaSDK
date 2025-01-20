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

/**
 * Represents a bulk invite post request.
 * This class is used to send a bulk invite request to the API.
 */
@ApiEndpoint(
    name = "bulkInvite",
    url = "/template/{document_id}/bulkinvite",
    method = "post",
    auth = "bearer",
    namespace = "template",
    entity = "bulkInvite",
    type = "multipart/form-data")
public final class BulkInvitePostRequest implements RequestInterface<Object> {

  /**
   * The file to be sent in the request.
   */
  private final File file;

  /**
   * The ID of the folder where the document is located.
   */
  private final String folderId;

  /**
   * The client timestamp when the request is made.
   */
  private final int clientTimestamp;

  /**
   * The name of the document.
   */
  private final String documentName;

  /**
   * The subject of the email.
   */
  private final String subject;

  /**
   * The message of the email.
   */
  private final String emailMessage;

  /**
   * The URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new BulkInvitePostRequest.
   *
   * @param file the file to be sent in the request
   * @param folderId the ID of the folder where the document is located
   * @param clientTimestamp the client timestamp when the request is made
   * @param documentName the name of the document
   * @param subject the subject of the email
   * @param emailMessage the message of the email
   */
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

  /**
   * Returns the file to be sent in the request.
   *
   * @return the file to be sent in the request
   */
  public File getFile() {
    return this.file;
  }

  /**
   * Returns the ID of the folder where the document is located.
   *
   * @return the ID of the folder where the document is located
   */
  public String getFolderId() {
    return this.folderId;
  }

  /**
   * Returns the client timestamp when the request is made.
   *
   * @return the client timestamp when the request is made
   */
  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Returns the name of the document.
   *
   * @return the name of the document
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Returns the subject of the email.
   *
   * @return the subject of the email
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Returns the message of the email.
   *
   * @return the message of the email
   */
  public String getEmailMessage() {
    return this.emailMessage;
  }

  /**
   * Adds the document ID to the URI parameters.
   *
   * @param documentId the ID of the document
   * @return this BulkInvitePostRequest
   */
  public BulkInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters for the request.
   *
   * @return a new HashMap containing the URI parameters for the request
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map containing the payload for the request.
   *
   * @return a Map containing the payload for the request
   */
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
