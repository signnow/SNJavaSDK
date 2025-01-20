/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.api.document.request.data.tag.TagCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a request to extract fields from a document.
 * This request is sent as a POST request to the /document/fieldextract endpoint.
 */
@ApiEndpoint(
    name = "uploadDocumentWithTagsExtract",
    url = "/document/fieldextract",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "fieldExtract",
    type = "multipart/form-data")
public final class FieldExtractPostRequest implements RequestInterface<Object> {

  /**
   * The file to be processed.
   */
  private final File file;

  /**
   * The collection of tags to be extracted from the document.
   */
  private final TagCollection tags;

  /**
   * The type of parsing to be performed on the document.
   */
  private final String parseType;

  /**
   * The password for the document, if it is password-protected.
   */
  private final String password;

  /**
   * The timestamp from the client.
   */
  private final int clientTimestamp;

  /**
   * Constructs a new FieldExtractPostRequest with the specified parameters.
   *
   * @param file the file to be processed
   * @param tags the collection of tags to be extracted from the document
   * @param parseType the type of parsing to be performed on the document
   * @param password the password for the document, if it is password-protected
   * @param clientTimestamp the timestamp from the client
   */
  public FieldExtractPostRequest(
      File file, TagCollection tags, String parseType, String password, int clientTimestamp) {
    this.file = file;
    this.tags = tags;
    this.parseType = parseType;
    this.password = password;
    this.clientTimestamp = clientTimestamp;
  }

  /**
   * Returns the file to be processed.
   *
   * @return the file to be processed
   */
  public File getFile() {
    return this.file;
  }

  /**
   * Returns the collection of tags to be extracted from the document.
   *
   * @return the collection of tags to be extracted from the document
   */
  public TagCollection getTags() {
    return this.tags;
  }

  /**
   * Returns the type of parsing to be performed on the document.
   *
   * @return the type of parsing to be performed on the document
   */
  public String getParseType() {
    return this.parseType;
  }

  /**
   * Returns the password for the document, if it is password-protected.
   *
   * @return the password for the document, if it is password-protected
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Returns the timestamp from the client.
   *
   * @return the timestamp from the client
   */
  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Returns a new HashMap with no mappings.
   *
   * @return a new HashMap with no mappings
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a Map containing the payload for the request.
   *
   * @return a Map containing the payload for the request
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("file", this.getFile());
    map.put("Tags", this.getTags().toJson());
    map.put("parse_type", this.getParseType());
    map.put("password", this.getPassword());
    map.put("client_timestamp", this.getClientTimestamp());
    return map;
  }
}
