/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Attachment extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("line_height")
  private final float lineHeight;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  @JsonProperty("original_attachment_name")
  private final String originalAttachmentName;

  @JsonProperty("filename")
  private final String filename;

  @JsonProperty("file_type")
  private final String fileType;

  @JsonProperty("mime_type")
  private final String mimeType;

  @JsonProperty("file_size")
  private final String fileSize;

  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  @JsonCreator
  public Attachment(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("line_height") float lineHeight,
      @JsonProperty("created") String created,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("original_attachment_name") String originalAttachmentName,
      @JsonProperty("filename") String filename,
      @JsonProperty("file_type") String fileType,
      @JsonProperty("mime_type") String mimeType,
      @JsonProperty("file_size") String fileSize,
      @JsonProperty("allow_editing") boolean allowEditing) {
    this.id = id;
    this.userId = userId;
    this.pageNumber = pageNumber;
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
    this.lineHeight = lineHeight;
    this.created = created;
    this.jsonAttributes = jsonAttributes;
    this.originalAttachmentName = originalAttachmentName;
    this.filename = filename;
    this.fileType = fileType;
    this.mimeType = mimeType;
    this.fileSize = fileSize;
    this.allowEditing = allowEditing;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public float getLineHeight() {
    return this.lineHeight;
  }

  public String getCreated() {
    return this.created;
  }

  public String getOriginalAttachmentName() {
    return this.originalAttachmentName;
  }

  public String getFilename() {
    return this.filename;
  }

  public String getFileType() {
    return this.fileType;
  }

  public String getMimeType() {
    return this.mimeType;
  }

  public String getFileSize() {
    return this.fileSize;
  }

  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("page_number", this.getPageNumber());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("line_height", this.getLineHeight());
    map.put("created", this.getCreated());
    map.put("original_attachment_name", this.getOriginalAttachmentName());
    map.put("filename", this.getFilename());
    map.put("file_type", this.getFileType());
    map.put("mime_type", this.getMimeType());
    map.put("file_size", this.getFileSize());
    map.put("json_attributes", this.getJsonAttributes());
    map.put("allow_editing", this.isAllowEditing());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Attachment fromMap(@NotNull Map<String, Object> data) {
    return new Attachment(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("page_number"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("x"),
        (String) data.get("y"),
        (Float) data.get("line_height"),
        (String) data.get("created"),
        JsonAttribute.fromMap(
            Cast.safeToMap(data.get("json_attributes"), String.class, Object.class)),
        (String) data.get("original_attachment_name"),
        (String) data.get("filename"),
        (String) data.get("file_type"),
        (String) data.get("mime_type"),
        (String) data.get("file_size"),
        (Boolean) data.get("allow_editing"));
  }
}
