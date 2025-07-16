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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents an organization with an optional ID.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Organization extends ApiData {

    @JsonProperty("id")
    private final String id;

    /**
     * Constructs an Organization instance.
     *
     * @param id the ID of the organization, can be null.
     */
    @JsonCreator
    public Organization(@JsonProperty("id") String id) {
        this.id = id;
    }

    /**
     * Gets the ID of the organization.
     *
     * @return the ID of the organization, can be null.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Converts the organization data to a map.
     *
     * @return a map representation of the organization data.
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", this.getId());
        return map;
    }

    /**
     * Creates an Organization instance from a map.
     *
     * @param data the map containing organization data.
     * @return a new Organization instance.
     */
    @NotNull
    @Contract("_ -> new")
    public static Organization fromMap(@NotNull Map<String, Object> data) {
        return new Organization((String) data.get("id"));
    }
}
