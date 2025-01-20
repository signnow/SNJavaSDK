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

/**
 * This class represents the response from the GroupTemplateGet API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupTemplateGetResponse {

  /**
   * The unique identifier of the group template.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the group template.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The filename of the group template.
   */
  @JsonProperty("filename")
  private final String filename;

  /**
   * The page count of the group template.
   */
  @JsonProperty("page_count")
  private final int pageCount;

  /**
   * The creation timestamp of the group template.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The last updated timestamp of the group template.
   */
  @JsonProperty("updated")
  private final int updated;

  /**
   * The editor link of the group template.
   */
  @JsonProperty("editor_link")
  private final String editorLink;

  /**
   * Constructs a new GroupTemplateGetResponse with the specified values.
   *
   * @param id the unique identifier of the group template
   * @param name the name of the group template
   * @param filename the filename of the group template
   * @param pageCount the page count of the group template
   * @param created the creation timestamp of the group template
   * @param updated the last updated timestamp of the group template
   * @param editorLink the editor link of the group template
   */
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

  /**
   * Returns the unique identifier of the group template.
   *
   * @return the unique identifier of the group template
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the group template.
   *
   * @return the name of the group template
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the filename of the group template.
   *
   * @return the filename of the group template
   */
  public String getFilename() {
    return this.filename;
  }

  /**
   * Returns the page count of the group template.
   *
   * @return the page count of the group template
   */
  public int getPageCount() {
    return this.pageCount;
  }

  /**
   * Returns the creation timestamp of the group template.
   *
   * @return the creation timestamp of the group template
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the last updated timestamp of the group template.
   *
   * @return the last updated timestamp of the group template
   */
  public int getUpdated() {
    return this.updated;
  }

  /**
   * Returns the editor link of the group template.
   *
   * @return the editor link of the group template
   */
  public String getEditorLink() {
    return this.editorLink;
  }
}