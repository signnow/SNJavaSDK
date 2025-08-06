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
 * Represents a document with an ID, role, and action.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Document extends ApiData {

    @JsonProperty("id")
    private final String id;

    @JsonProperty("role")
    private final String role;

    @JsonProperty("action")
    private final String action;

    /**
     * Constructs a new Document instance.
     *
     * @param id     the document ID
     * @param role   the role associated with the document
     * @param action the action associated with the document
     */
    @JsonCreator
    public Document(
        @JsonProperty("id") String id,
        @JsonProperty("role") String role,
        @JsonProperty("action") String action
    ) {
        this.id = id;
        this.role = role;
        this.action = action;
    }

    /**
     * Gets the document ID.
     *
     * @return the document ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gets the role associated with the document.
     *
     * @return the role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Gets the action associated with the document.
     *
     * @return the action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Converts the document to a map representation.
     *
     * @return a map containing the document's properties
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", this.getId());
        map.put("role", this.getRole());
        map.put("action", this.getAction());
        return map;
    }

    /**
     * Creates a Document instance from a map.
     *
     * @param data the map containing document properties
     * @return a new Document instance
     */
    @NotNull
    @Contract("_ -> new")
    public static Document fromMap(@NotNull Map<String, Object> data) {
        return new Document(
            (String) data.get("id"),
            (String) data.get("role"),
            (String) data.get("action")
        );
    }
}
