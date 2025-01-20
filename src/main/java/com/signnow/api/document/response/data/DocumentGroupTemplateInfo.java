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

/**
 * This class represents the document group template information.
 */
public final class DocumentGroupTemplateInfo extends ApiData {

  /**
   * The ID of the document group template.
   */
  @JsonProperty("document_group_template_id")
  private final String documentGroupTemplateId;

  /**
   * The name of the document group template.
   */
  @JsonProperty("document_group_template_name")
  private final String documentGroupTemplateName;

  /**
   * The shared status of the document group template.
   */
  @JsonProperty("shared")
  private final int shared;

  /**
   * Constructs a new DocumentGroupTemplateInfo with the specified details.
   *
   * @param documentGroupTemplateId the ID of the document group template
   * @param documentGroupTemplateName the name of the document group template
   * @param shared the shared status of the document group template
   */
  @JsonCreator
  public DocumentGroupTemplateInfo(
      @JsonProperty("document_group_template_id") String documentGroupTemplateId,
      @JsonProperty("document_group_template_name") String documentGroupTemplateName,
      @JsonProperty("shared") int shared) {
    this.documentGroupTemplateId = documentGroupTemplateId;
    this.documentGroupTemplateName = documentGroupTemplateName;
    this.shared = shared;
  }

  /**
   * Returns the ID of the document group template.
   *
   * @return the ID of the document group template
   */
  public String getDocumentGroupTemplateId() {
    return this.documentGroupTemplateId;
  }

  /**
   * Returns the name of the document group template.
   *
   * @return the name of the document group template
   */
  public String getDocumentGroupTemplateName() {
    return this.documentGroupTemplateName;
  }

  /**
   * Returns the shared status of the document group template.
   *
   * @return the shared status of the document group template
   */
  public int getShared() {
    return this.shared;
  }

  /**
   * Converts this DocumentGroupTemplateInfo to a Map.
   *
   * @return a Map representing this DocumentGroupTemplateInfo
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("document_group_template_id", this.getDocumentGroupTemplateId());
    map.put("document_group_template_name", this.getDocumentGroupTemplateName());
    map.put("shared", this.getShared());
    return map;
  }

  /**
   * Creates a new DocumentGroupTemplateInfo from the specified Map.
   *
   * @param data a Map containing the details of the DocumentGroupTemplateInfo
   * @return a new DocumentGroupTemplateInfo created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static DocumentGroupTemplateInfo fromMap(@NotNull Map<String, Object> data) {
    return new DocumentGroupTemplateInfo(
        (String) data.get("document_group_template_id"),
        (String) data.get("document_group_template_name"),
        (int) data.get("shared"));
  }
}