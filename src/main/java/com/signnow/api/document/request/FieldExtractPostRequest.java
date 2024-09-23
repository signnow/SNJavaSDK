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

@ApiEndpoint(
    name = "uploadDocumentWithTagsExtract",
    url = "/document/fieldextract",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "fieldExtract",
    type = "multipart/form-data")
public final class FieldExtractPostRequest implements RequestInterface<Object> {

  private final File file;

  private final TagCollection tags;

  private final String parseType;

  private final String password;

  private final int clientTimestamp;

  public FieldExtractPostRequest(
      File file, TagCollection tags, String parseType, String password, int clientTimestamp) {
    this.file = file;
    this.tags = tags;
    this.parseType = parseType;
    this.password = password;
    this.clientTimestamp = clientTimestamp;
  }

  public File getFile() {
    return this.file;
  }

  public TagCollection getTags() {
    return this.tags;
  }

  public String getParseType() {
    return this.parseType;
  }

  public String getPassword() {
    return this.password;
  }

  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

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
