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

@JsonIgnoreProperties(ignoreUnknown = true)
public final class DocumentItem extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("roles")
  private final RoleCollection roles;

  @JsonProperty("document_name")
  private final String documentName;

  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  @JsonProperty("has_unassigned_field")
  private final boolean hasUnassignedField;

  @JsonProperty("has_credit_card_number")
  private final boolean hasCreditCardNumber;

  @JsonProperty("allowed_to_remove")
  private final boolean allowedToRemove;

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

  public String getId() {
    return this.id;
  }

  public RoleCollection getRoles() {
    return this.roles;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  public String getOriginDocumentId() {
    return this.originDocumentId;
  }

  public boolean hasUnassignedField() {
    return this.hasUnassignedField;
  }

  public boolean hasCreditCardNumber() {
    return this.hasCreditCardNumber;
  }

  public boolean isAllowedToRemove() {
    return allowedToRemove;
  }

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
