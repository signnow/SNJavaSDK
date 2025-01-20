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

/**
 * This class represents a completion email.
 */
public final class CompletionEmail extends ApiData {

  /**
   * The email address to which the completion email will be sent.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Flag to disable document attachment in the email.
   */
  @JsonProperty("disable_document_attachment")
  private final int disableDocumentAttachment;

  /**
   * The subject of the completion email.
   */
  @JsonProperty("subject")
  private final String subject;

  /**
   * The message body of the completion email.
   */
  @JsonProperty("message")
  private final String message;

  /**
   * Constructor for CompletionEmail class.
   *
   * @param email The email address to which the completion email will be sent.
   * @param disableDocumentAttachment Flag to disable document attachment in the email.
   * @param subject The subject of the completion email.
   * @param message The message body of the completion email.
   */
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

  /**
   * Returns the email address.
   *
   * @return The email address.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the flag for disabling document attachment.
   *
   * @return The flag for disabling document attachment.
   */
  public int getDisableDocumentAttachment() {
    return this.disableDocumentAttachment;
  }

  /**
   * Returns the subject of the email.
   *
   * @return The subject of the email.
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Returns the message body of the email.
   *
   * @return The message body of the email.
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Converts the CompletionEmail object to a Map.
   *
   * @return A Map representation of the CompletionEmail object.
   */
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

  /**
   * Creates a CompletionEmail object from a Map.
   *
   * @param data The Map from which the CompletionEmail object will be created.
   * @return A new CompletionEmail object.
   */
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