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

public final class Data extends ApiData {

  @JsonProperty("recipients")
  private final RecipientCollection recipients;

  @JsonProperty("unmapped_documents")
  private final UnmappedDocumentCollection unmappedDocuments;

  @JsonProperty("allowed_unmapped_sign_documents")
  private final AllowedUnmappedSignDocumentCollection allowedUnmappedSignDocuments;

  @JsonProperty("cc")
  private final CcCollection cc;

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

  public RecipientCollection getRecipients() {
    return this.recipients;
  }

  public UnmappedDocumentCollection getUnmappedDocuments() {
    return this.unmappedDocuments;
  }

  public AllowedUnmappedSignDocumentCollection getAllowedUnmappedSignDocuments() {
    return this.allowedUnmappedSignDocuments;
  }

  public CcCollection getCc() {
    return this.cc;
  }

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
