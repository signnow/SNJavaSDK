/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data class extends ApiData.
 * It represents the data structure for the document group response.
 */
public final class Data extends ApiData {

  /**
   * Collection of recipients.
   */
  @JsonProperty("recipients")
  private final RecipientCollection recipients;

  /**
   * Collection of unmapped documents.
   */
  @JsonProperty("unmapped_documents")
  private final UnmappedDocumentCollection unmappedDocuments;

  /**
   * Collection of allowed unmapped sign documents.
   */
  @JsonProperty("allowed_unmapped_sign_documents")
  private final AllowedUnmappedSignDocumentCollection allowedUnmappedSignDocuments;

  /**
   * Collection of cc.
   */
  @JsonProperty("cc")
  private final CcCollection cc;

  /**
   * Constructor for Data class.
   *
   * @param recipients Collection of recipients.
   * @param unmappedDocuments Collection of unmapped documents.
   * @param allowedUnmappedSignDocuments Collection of allowed unmapped sign documents.
   * @param cc Collection of cc.
   */
  @JsonCreator
  public Data(
      @JsonProperty("recipients") RecipientCollection recipients,
      @JsonProperty("unmapped_documents") UnmappedDocumentCollection unmappedDocuments,
      @JsonProperty("allowed_unmapped_sign_documents")
          AllowedUnmappedSignDocumentCollection allowedUnmappedSignDocuments,
      @JsonProperty("cc") CcCollection cc) {
    this.recipients = recipients;
    this.unmappedDocuments = unmappedDocuments;
    this.allowedUnmappedSignDocuments = allowedUnmappedSignDocuments;
    this.cc = cc;
  }

  /**
   * Getter for recipients.
   *
   * @return RecipientCollection of recipients.
   */
  public RecipientCollection getRecipients() {
    return this.recipients;
  }

  /**
   * Getter for unmapped documents.
   *
   * @return UnmappedDocumentCollection of unmapped documents.
   */
  public UnmappedDocumentCollection getUnmappedDocuments() {
    return this.unmappedDocuments;
  }

  /**
   * Getter for allowed unmapped sign documents.
   *
   * @return AllowedUnmappedSignDocumentCollection of allowed unmapped sign documents.
   */
  public AllowedUnmappedSignDocumentCollection getAllowedUnmappedSignDocuments() {
    return this.allowedUnmappedSignDocuments;
  }

  /**
   * Getter for cc.
   *
   * @return CcCollection of cc.
   */
  public CcCollection getCc() {
    return this.cc;
  }

  /**
   * Converts the Data object to a Map.
   *
   * @return Map representation of the Data object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("recipients", this.getRecipients());
    map.put("unmapped_documents", this.getUnmappedDocuments());
    map.put("allowed_unmapped_sign_documents", this.getAllowedUnmappedSignDocuments());
    map.put("cc", this.getCc());
    return map;
  }

  /**
   * Creates a Data object from a Map.
   *
   * @param data Map representation of a Data object.
   * @return New Data object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data(
        (RecipientCollection) data.get("recipients"),
        (UnmappedDocumentCollection) data.get("unmapped_documents"),
        (AllowedUnmappedSignDocumentCollection) data.get("allowed_unmapped_sign_documents"),
        (CcCollection) data.get("cc"));
  }
}