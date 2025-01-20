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

/**
 * This class represents an Attachment in the signNow API.
 */
public final class Attachment extends ApiData {

  /**
   * The id of the attachment.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the attachment.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The page number of the attachment.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The width of the attachment.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the attachment.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The x-coordinate of the attachment.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the attachment.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The line height of the attachment.
   */
  @JsonProperty("line_height")
  private final float lineHeight;

  /**
   * The creation date of the attachment.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The JSON attributes of the attachment.
   */
  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  /**
   * The original name of the attachment.
   */
  @JsonProperty("original_attachment_name")
  private final String originalAttachmentName;

  /**
   * The filename of the attachment.
   */
  @JsonProperty("filename")
  private final String filename;

  /**
   * The file type of the attachment.
   */
  @JsonProperty("file_type")
  private final String fileType;

  /**
   * The MIME type of the attachment.
   */
  @JsonProperty("mime_type")
  private final String mimeType;

  /**
   * The file size of the attachment.
   */
  @JsonProperty("file_size")
  private final String fileSize;

  /**
   * The flag indicating if editing is allowed for the attachment.
   */
  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  /**
   * Constructor for the Attachment class.
   *
   * @param id The id of the attachment.
   * @param userId The user id associated with the attachment.
   * @param pageNumber The page number of the attachment.
   * @param width The width of the attachment.
   * @param height The height of the attachment.
   * @param x The x-coordinate of the attachment.
   * @param y The y-coordinate of the attachment.
   * @param lineHeight The line height of the attachment.
   * @param created The creation date of the attachment.
   * @param jsonAttributes The JSON attributes of the attachment.
   * @param originalAttachmentName The original name of the attachment.
   * @param filename The filename of the attachment.
   * @param fileType The file type of the attachment.
   * @param mimeType The MIME type of the attachment.
   * @param fileSize The file size of the attachment.
   * @param allowEditing The flag indicating if editing is allowed for the attachment.
   */
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

  /**
   * Returns the id of the attachment.
   *
   * @return The id of the attachment.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id associated with the attachment.
   *
   * @return The user id associated with the attachment.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the page number of the attachment.
   *
   * @return The page number of the attachment.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the width of the attachment.
   *
   * @return The width of the attachment.
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the attachment.
   *
   * @return The height of the attachment.
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * Returns the x-coordinate of the attachment.
   *
   * @return The x-coordinate of the attachment.
   */
  public String getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the attachment.
   *
   * @return The y-coordinate of the attachment.
   */
  public String getY() {
    return this.y;
  }

  /**
   * Returns the line height of the attachment.
   *
   * @return The line height of the attachment.
   */
  public float getLineHeight() {
    return this.lineHeight;
  }

  /**
   * Returns the creation date of the attachment.
   *
   * @return The creation date of the attachment.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the original name of the attachment.
   *
   * @return The original name of the attachment.
   */
  public String getOriginalAttachmentName() {
    return this.originalAttachmentName;
  }

  /**
   * Returns the filename of the attachment.
   *
   * @return The filename of the attachment.
   */
  public String getFilename() {
    return this.filename;
  }

  /**
   * Returns the file type of the attachment.
   *
   * @return The file type of the attachment.
   */
  public String getFileType() {
    return this.fileType;
  }

  /**
   * Returns the MIME type of the attachment.
   *
   * @return The MIME type of the attachment.
   */
  public String getMimeType() {
    return this.mimeType;
  }

  /**
   * Returns the file size of the attachment.
   *
   * @return The file size of the attachment.
   */
  public String getFileSize() {
    return this.fileSize;
  }

  /**
   * Returns the JSON attributes of the attachment.
   *
   * @return The JSON attributes of the attachment.
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * Returns the flag indicating if editing is allowed for the attachment.
   *
   * @return The flag indicating if editing is allowed for the attachment.
   */
  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  /**
   * Converts the Attachment object to a Map.
   *
   * @return A Map representing the Attachment object.
   */
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

  /**
   * Creates an Attachment object from a Map.
   *
   * @param data A Map representing an Attachment object.
   * @return An Attachment object.
   */
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