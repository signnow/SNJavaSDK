/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgrouptemplate.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents a Document with associated roles, name, ID, thumbnail, origin document ID,
 * and flags for unassigned fields and credit card numbers.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Document extends ApiData {

    @JsonProperty("roles")
    private final RoleCollection roles;

    @JsonProperty("document_name")
    private final String documentName;

    @JsonProperty("id")
    private final String id;

    @JsonProperty("thumbnail")
    private final Thumbnail thumbnail;

    @JsonProperty("origin_document_id")
    private final String originDocumentId;

    @JsonProperty("has_unassigned_field")
    private final boolean hasUnassignedField;

    @JsonProperty("has_credit_card_number")
    private final boolean hasCreditCardNumber;

    /**
     * Constructs a new Document instance.
     *
     * @param roles               the roles associated with the document
     * @param documentName        the name of the document
     * @param id                  the unique identifier of the document
     * @param thumbnail           the thumbnail of the document
     * @param originDocumentId    the origin document ID
     * @param hasUnassignedField  flag indicating if there are unassigned fields
     * @param hasCreditCardNumber flag indicating if there is a credit card number
     */
    @JsonCreator
    public Document(
        @JsonProperty("roles") RoleCollection roles,
        @JsonProperty("document_name") String documentName,
        @JsonProperty("id") String id,
        @JsonProperty("thumbnail") Thumbnail thumbnail,
        @JsonProperty("origin_document_id") String originDocumentId,
        @JsonProperty("has_unassigned_field") boolean hasUnassignedField,
        @JsonProperty("has_credit_card_number") boolean hasCreditCardNumber
    ) {
        this.roles = roles;
        this.documentName = documentName;
        this.id = id;
        this.thumbnail = thumbnail;
        this.originDocumentId = originDocumentId;
        this.hasUnassignedField = hasUnassignedField;
        this.hasCreditCardNumber = hasCreditCardNumber;
    }

    /**
     * Gets the roles associated with the document.
     *
     * @return the roles
     */
    public RoleCollection getRoles() {
        return this.roles;
    }

    /**
     * Gets the name of the document.
     *
     * @return the document name
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * Gets the unique identifier of the document.
     *
     * @return the document ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gets the thumbnail of the document.
     *
     * @return the thumbnail
     */
    public Thumbnail getThumbnail() {
        return this.thumbnail;
    }

    /**
     * Gets the origin document ID.
     *
     * @return the origin document ID
     */
    public String getOriginDocumentId() {
        return this.originDocumentId;
    }

    /**
     * Checks if there are unassigned fields in the document.
     *
     * @return true if there are unassigned fields, false otherwise
     */
    public boolean hasUnassignedField() {
        return this.hasUnassignedField;
    }

    /**
     * Checks if there is a credit card number in the document.
     *
     * @return true if there is a credit card number, false otherwise
     */
    public boolean hasCreditCardNumber() {
        return this.hasCreditCardNumber;
    }

    /**
     * Converts the Document object to a map representation.
     *
     * @return a map containing the document data
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("roles", this.getRoles());
        map.put("document_name", this.getDocumentName());
        map.put("id", this.getId());
        map.put("thumbnail", this.getThumbnail());
        map.put("origin_document_id", this.getOriginDocumentId());
        map.put("has_unassigned_field", this.hasUnassignedField());
        map.put("has_credit_card_number", this.hasCreditCardNumber());
        return map;
    }

    /**
     * Creates a Document instance from a map representation.
     *
     * @param data the map containing the document data
     * @return a new Document instance
     */
    @NotNull
    @Contract("_ -> new")
    public static Document fromMap(@NotNull Map<String, Object> data) {
        return new Document(
            (RoleCollection) data.get("roles"),
            (String) data.get("document_name"),
            (String) data.get("id"),
            Thumbnail.fromMap(Cast.safeToMap(data.get("thumbnail"), String.class, Object.class)),
            (String) data.get("origin_document_id"),
            (Boolean) data.get("has_unassigned_field"),
            (Boolean) data.get("has_credit_card_number")
        );
    }
}
