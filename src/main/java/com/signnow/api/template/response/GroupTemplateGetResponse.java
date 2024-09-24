/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupTemplateGetResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("filename")
  private final String filename;

  @JsonProperty("page_count")
  private final int pageCount;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("updated")
  private final int updated;

  @JsonProperty("editor_link")
  private final String editorLink;

  public GroupTemplateGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("filename") String filename,
      @JsonProperty("page_count") int pageCount,
      @JsonProperty("created") int created,
      @JsonProperty("updated") int updated,
      @JsonProperty("editor_link") String editorLink) {
    this.id = id;
    this.name = name;
    this.filename = filename;
    this.pageCount = pageCount;
    this.created = created;
    this.updated = updated;
    this.editorLink = editorLink;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getFilename() {
    return this.filename;
  }

  public int getPageCount() {
    return this.pageCount;
  }

  public int getCreated() {
    return this.created;
  }

  public int getUpdated() {
    return this.updated;
  }

  public String getEditorLink() {
    return this.editorLink;
  }
}
