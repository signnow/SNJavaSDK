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

public final class Attachment extends ApiData {

  @JsonProperty("attachment_unique_id")
  private final String attachmentUniqueId;

  @JsonProperty("field_id")
  private final String fieldId;

  @JsonCreator
  public Attachment(
      @JsonProperty("attachment_unique_id") String attachmentUniqueId,
      @JsonProperty("field_id") String fieldId) {
    this.attachmentUniqueId = attachmentUniqueId;
    this.fieldId = fieldId;
  }

  public String getAttachmentUniqueId() {
    return this.attachmentUniqueId;
  }

  public String getFieldId() {
    return this.fieldId;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("attachment_unique_id", this.getAttachmentUniqueId());
    map.put("field_id", this.getFieldId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Attachment fromMap(@NotNull Map<String, Object> data) {
    return new Attachment(
        (String) data.getOrDefault("attachment_unique_id", ""),
        (String) data.getOrDefault("field_id", ""));
  }
}
