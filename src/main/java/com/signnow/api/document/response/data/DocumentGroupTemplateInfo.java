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
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class DocumentGroupTemplateInfo extends ApiData {

  @JsonProperty("document_group_template_id")
  private final String documentGroupTemplateId;

  @JsonProperty("document_group_template_name")
  private final String documentGroupTemplateName;

  @JsonProperty("shared")
  private final int shared;

  @JsonCreator
  public DocumentGroupTemplateInfo(
      @JsonProperty("document_group_template_id") String documentGroupTemplateId,
      @JsonProperty("document_group_template_name") String documentGroupTemplateName,
      @JsonProperty("shared") int shared) {
    this.documentGroupTemplateId = documentGroupTemplateId;
    this.documentGroupTemplateName = documentGroupTemplateName;
    this.shared = shared;
  }

  public String getDocumentGroupTemplateId() {
    return this.documentGroupTemplateId;
  }

  public String getDocumentGroupTemplateName() {
    return this.documentGroupTemplateName;
  }

  public int getShared() {
    return this.shared;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("document_group_template_id", this.getDocumentGroupTemplateId());
    map.put("document_group_template_name", this.getDocumentGroupTemplateName());
    map.put("shared", this.getShared());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static DocumentGroupTemplateInfo fromMap(@NotNull Map<String, Object> data) {
    return new DocumentGroupTemplateInfo(
        (String) data.get("document_group_template_id"),
        (String) data.get("document_group_template_name"),
        (int) data.get("shared"));
  }
}
