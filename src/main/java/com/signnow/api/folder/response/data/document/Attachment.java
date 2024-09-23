/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
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

  @JsonProperty("created")
  private final String created;

  @JsonProperty("line_height")
  private final String lineHeight;

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

  @JsonCreator
  public Attachment(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("created") String created,
      @JsonProperty("line_height") String lineHeight,
      @JsonProperty("original_attachment_name") String originalAttachmentName,
      @JsonProperty("filename") String filename,
      @JsonProperty("file_type") String fileType,
      @JsonProperty("mime_type") String mimeType,
      @JsonProperty("file_size") String fileSize) {
    this.id = id;
    this.userId = userId;
    this.pageNumber = pageNumber;
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
    this.created = created;
    this.lineHeight = lineHeight;
    this.originalAttachmentName = originalAttachmentName;
    this.filename = filename;
    this.fileType = fileType;
    this.mimeType = mimeType;
    this.fileSize = fileSize;
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

  public String getLineHeight() {
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
        (String) data.get("created"),
        (String) data.getOrDefault("line_height", null),
        (String) data.getOrDefault("original_attachment_name", null),
        (String) data.getOrDefault("filename", null),
        (String) data.getOrDefault("file_type", null),
        (String) data.getOrDefault("mime_type", null),
        (String) data.getOrDefault("file_size", null));
  }
}
