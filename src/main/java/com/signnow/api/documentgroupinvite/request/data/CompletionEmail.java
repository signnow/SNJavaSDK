/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class CompletionEmail extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("disable_document_attachment")
  private final int disableDocumentAttachment;

  @JsonProperty("subject")
  private final String subject;

  @JsonProperty("message")
  private final String message;

  @JsonCreator
  public CompletionEmail(
      @JsonProperty("email") String email,
      @JsonProperty("disable_document_attachment") int disableDocumentAttachment,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message) {
    this.email = email;
    this.disableDocumentAttachment = disableDocumentAttachment;
    this.subject = subject;
    this.message = message;
  }

  public String getEmail() {
    return this.email;
  }

  public int getDisableDocumentAttachment() {
    return this.disableDocumentAttachment;
  }

  public String getSubject() {
    return this.subject;
  }

  public String getMessage() {
    return this.message;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("disable_document_attachment", this.getDisableDocumentAttachment());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static CompletionEmail fromMap(@NotNull Map<String, Object> data) {
    return new CompletionEmail(
        (String) data.getOrDefault("email", ""),
        (int) data.getOrDefault("disable_document_attachment", 0),
        (String) data.getOrDefault("subject", ""),
        (String) data.getOrDefault("message", ""));
  }
}
