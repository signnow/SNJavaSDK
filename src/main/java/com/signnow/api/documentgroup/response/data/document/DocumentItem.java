/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a document item in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DocumentItem extends ApiData {

  /**
   * The ID of the document.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The roles associated with the document.
   */
  @JsonProperty("roles")
  private final RoleCollection roles;

  /**
   * The name of the document.
   */
  @JsonProperty("document_name")
  private final String documentName;

  /**
   * The thumbnail of the document.
   */
  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  /**
   * The ID of the original document.
   */
  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  /**
   * Indicates if the document has unassigned fields.
   */
  @JsonProperty("has_unassigned_field")
  private final boolean hasUnassignedField;

  /**
   * Indicates if the document has a credit card number.
   */
  @JsonProperty("has_credit_card_number")
  private final boolean hasCreditCardNumber;

  /**
   * Indicates if the document is allowed to be removed.
   */
  @JsonProperty("allowed_to_remove")
  private final boolean allowedToRemove;

  /**
   * Constructs a new DocumentItem with the specified properties.
   *
   * @param id the ID of the document
   * @param roles the roles associated with the document
   * @param documentName the name of the document
   * @param thumbnail the thumbnail of the document
   * @param originDocumentId the ID of the original document
   * @param hasUnassignedField whether the document has unassigned fields
   * @param hasCreditCardNumber whether the document has a credit card number
   * @param allowedToRemove whether the document is allowed to be removed
   */
  @JsonCreator
  public DocumentItem(
      @JsonProperty("id") String id,
      @JsonProperty("roles") RoleCollection roles,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("thumbnail") Thumbnail thumbnail,
      @JsonProperty("origin_document_id") String originDocumentId,
      @JsonProperty("has_unassigned_field") boolean hasUnassignedField,
      @JsonProperty("has_credit_card_number") boolean hasCreditCardNumber,
      @JsonProperty("allowed_to_remove") boolean allowedToRemove) {
    this.id = id;
    this.roles = roles;
    this.documentName = documentName;
    this.thumbnail = thumbnail;
    this.originDocumentId = originDocumentId;
    this.hasUnassignedField = hasUnassignedField;
    this.hasCreditCardNumber = hasCreditCardNumber;
    this.allowedToRemove = allowedToRemove;
  }

  /**
   * Returns the ID of the document.
   *
   * @return the ID of the document
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the roles associated with the document.
   *
   * @return the roles associated with the document
   */
  public RoleCollection getRoles() {
    return this.roles;
  }

  /**
   * Returns the name of the document.
   *
   * @return the name of the document
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Returns the thumbnail of the document.
   *
   * @return the thumbnail of the document
   */
  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Returns the ID of the original document.
   *
   * @return the ID of the original document
   */
  public String getOriginDocumentId() {
    return this.originDocumentId;
  }

  /**
   * Returns whether the document has unassigned fields.
   *
   * @return true if the document has unassigned fields, false otherwise
   */
  public boolean hasUnassignedField() {
    return this.hasUnassignedField;
  }

  /**
   * Returns whether the document has a credit card number.
   *
   * @return true if the document has a credit card number, false otherwise
   */
  public boolean hasCreditCardNumber() {
    return this.hasCreditCardNumber;
  }

  /**
   * Returns whether the document is allowed to be removed.
   *
   * @return true if the document is allowed to be removed, false otherwise
   */
  public boolean isAllowedToRemove() {
    return allowedToRemove;
  }

  /**
   * Converts this DocumentItem to a Map.
   *
   * @return a Map representation of this DocumentItem
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("roles", this.getRoles());
    map.put("document_name", this.getDocumentName());
    map.put("thumbnail", this.getThumbnail());
    map.put("origin_document_id", this.getOriginDocumentId());
    map.put("has_unassigned_field", this.hasUnassignedField());
    map.put("has_credit_card_number", this.hasCreditCardNumber());
    map.put("allowed_to_remove", this.isAllowedToRemove());
    return map;
  }

  /**
   * Creates a new DocumentItem from the specified Map.
   *
   * @param data a Map containing the data to create the DocumentItem from
   * @return a new DocumentItem created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static DocumentItem fromMap(@NotNull Map<String, Object> data) {
    return new DocumentItem(
        (String) data.get("id"),
        (RoleCollection) data.get("roles"),
        (String) data.get("document_name"),
        Thumbnail.fromMap(Cast.safeToMap(data.get("thumbnail"), String.class, Object.class)),
        (String) data.getOrDefault("origin_document_id", null),
        (boolean) data.getOrDefault("has_unassigned_field", false),
        (boolean) data.getOrDefault("has_credit_card_number", false),
        (boolean) data.getOrDefault("allowed_to_remove", false));
  }
}