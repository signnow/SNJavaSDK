/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request.data.recipient;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents a recipient in the document group request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Recipient extends ApiData {

    @JsonProperty("name")
    private final String name;

    @JsonProperty("email")
    private final String email;

    @JsonProperty("order")
    private final int order;

    @JsonProperty("documents")
    private final DocumentCollection documents;

    @JsonProperty("email_group")
    private final EmailGroup emailGroup;

    @JsonProperty("attributes")
    private final Attribute attributes;

    /**
     * Constructs a new Recipient instance.
     *
     * @param name       the name of the recipient
     * @param email      the email of the recipient
     * @param order      the order of the recipient
     * @param documents  the document collection associated with the recipient
     * @param emailGroup the email group associated with the recipient
     * @param attributes the attributes associated with the recipient
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
     * Gets the name of the recipient.
     *
     * @return the name of the recipient
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the email of the recipient.
     *
     * @return the email of the recipient
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Gets the email group associated with the recipient.
     *
     * @return the email group associated with the recipient
     */
    public EmailGroup getEmailGroup() {
        return this.emailGroup;
    }

    /**
     * Gets the order of the recipient.
     *
     * @return the order of the recipient
     */
    public int getOrder() {
        return this.order;
    }

    /**
     * Gets the attributes associated with the recipient.
     *
     * @return the attributes associated with the recipient
     */
    public Attribute getAttributes() {
        return this.attributes;
    }

    /**
     * Gets the document collection associated with the recipient.
     *
     * @return the document collection associated with the recipient
     */
    public DocumentCollection getDocuments() {
        return this.documents;
    }

    /**
     * Converts the recipient data to a map.
     *
     * @return a map representation of the recipient data
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", this.getName());
        map.put("email", this.getEmail());
        map.put("email_group", this.getEmailGroup() != null ? this.getEmailGroup().toMap() : null);
        map.put("order", this.getOrder());
        map.put("attributes", this.getAttributes() != null ? this.getAttributes().toMap() : null);
        map.put("documents", this.getDocuments());
        return map;
    }

    /**
     * Creates a Recipient instance from a map.
     *
     * @param data the map containing recipient data
     * @return a new Recipient instance
     */
    @NotNull
    @Contract("_ -> new")
    public static Recipient fromMap(@NotNull Map<String, Object> data) {
        return new Recipient(
                (String) data.get("name"),
                (String) data.get("email"),
                (int) data.get("order"),
                (DocumentCollection) data.get("documents"),
                data.containsKey("email_group") ? EmailGroup.fromMap((Map<String, Object>) data.get("email_group")) : null,
                data.containsKey("attributes") ? Attribute.fromMap((Map<String, Object>) data.get("attributes")) : null
        );
    }

    
}
