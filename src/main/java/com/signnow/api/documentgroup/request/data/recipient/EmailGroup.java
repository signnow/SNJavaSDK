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
 * Represents an EmailGroup with an ID.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailGroup extends ApiData {

    @JsonProperty("id")
    private final String id;

    /**
     * Constructs an EmailGroup with the specified ID.
     *
     * @param id the ID of the email group
     */
    @JsonCreator
    public EmailGroup(@JsonProperty("id") String id) {
        this.id = id;
    }

    /**
     * Returns the ID of the email group.
     *
     * @return the ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * Converts the EmailGroup to a map representation.
     *
     * @return a map containing the email group data
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", this.getId());
        return map;
    }

    /**
     * Creates an EmailGroup from a map representation.
     *
     * @param data the map containing the email group data
     * @return a new EmailGroup instance
     */
    @NotNull
    @Contract("_ -> new")
    public static EmailGroup fromMap(@NotNull Map<String, Object> data) {
        return new EmailGroup((String) data.getOrDefault("id", ""));
    }
}
