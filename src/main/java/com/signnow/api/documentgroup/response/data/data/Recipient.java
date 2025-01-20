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
 * Recipient class extends ApiData.
 * Represents a recipient of a document group.
 */
public final class Recipient extends ApiData {

  /**
   * Name of the recipient.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Email of the recipient.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Order of the recipient.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * Collection of documents associated with the recipient.
   */
  @JsonProperty("documents")
  private final DocumentCollection documents;

  /**
   * Email group associated with the recipient.
   */
  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  /**
   * Attributes of the recipient.
   */
  @JsonProperty("attributes")
  private final Attribute attributes;

  /**
   * Constructor for Recipient class.
   *
   * @param name Name of the recipient.
   * @param email Email of the recipient.
   * @param order Order of the recipient.
   * @param documents Collection of documents associated with the recipient.
   * @param emailGroup Email group associated with the recipient.
   * @param attributes Attributes of the recipient.
   */
  @JsonCreator
  public Recipient(
      @JsonProperty("name") String name,
      @JsonProperty("email") String email,
      @JsonProperty("order") int order,
      @JsonProperty("documents") DocumentCollection documents,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("attributes") Attribute attributes) {
    this.name = name;
    this.email = email;
    this.order = order;
    this.documents = documents;
    this.emailGroup = emailGroup;
    this.attributes = attributes;
  }

  /**
   * @return Name of the recipient.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @return Email of the recipient.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return Email group associated with the recipient.
   */
  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  /**
   * @return Order of the recipient.
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * @return Attributes of the recipient.
   */
  public Attribute getAttributes() {
    return this.attributes;
  }

  /**
   * @return Collection of documents associated with the recipient.
   */
  public DocumentCollection getDocuments() {
    return this.documents;
  }

  /**
   * Converts the Recipient object to a Map.
   *
   * @return Map representation of the Recipient object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("email", this.getEmail());
    map.put("email_group", this.getEmailGroup());
    map.put("order", this.getOrder());
    map.put("attributes", this.getAttributes());
    map.put("documents", this.getDocuments());
    return map;
  }

  /**
   * Creates a Recipient object from a Map.
   *
   * @param data Map containing the data for the Recipient object.
   * @return New Recipient object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Recipient fromMap(@NotNull Map<String, Object> data) {
    return new Recipient(
        (String) data.get("name"),
        (String) data.get("email"),
        (Integer) data.get("order"),
        (DocumentCollection) data.get("documents"),
        (EmailGroup) data.get("email_group"),
        (Attribute) data.get("attributes"));
  }
}
