/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Attachment which extends ApiData.
 */
public final class Attachment extends ApiData {

  /**
   * Unique identifier for the attachment.
   */
  @JsonProperty("attachment_unique_id")
  private final String attachmentUniqueId;

  /**
   * Identifier for the field.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * Constructor for the Attachment class.
   *
   * @param attachmentUniqueId Unique identifier for the attachment.
   * @param fieldId Identifier for the field.
   */
  @JsonCreator
  public Attachment(
      @JsonProperty("attachment_unique_id") String attachmentUniqueId,
      @JsonProperty("field_id") String fieldId) {
    this.attachmentUniqueId = attachmentUniqueId;
    this.fieldId = fieldId;
  }

  /**
   * Getter for the attachment unique id.
   *
   * @return String The unique identifier for the attachment.
   */
  public String getAttachmentUniqueId() {
    return this.attachmentUniqueId;
  }

  /**
   * Getter for the field id.
   *
   * @return String The identifier for the field.
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Converts the Attachment object to a Map.
   *
   * @return Maplt;String, Object&gt; The map representation of the Attachment object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("attachment_unique_id", this.getAttachmentUniqueId());
    map.put("field_id", this.getFieldId());
    return map;
  }

  /**
   * Static method to create an Attachment object from a Map.
   *
   * @param data The map containing the data for the Attachment object.
   * @return Attachment The created Attachment object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Attachment fromMap(@NotNull Map<String, Object> data) {
    return new Attachment(
        (String) data.getOrDefault("attachment_unique_id", ""),
        (String) data.getOrDefault("field_id", ""));
  }
}