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

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Owner extends ApiData {

    @JsonProperty("id")
    private final String id;

    @JsonProperty("email")
    private final String email;

    @JsonProperty("organization")
    private final Organization organization;

    /**
     * Constructs an Owner instance.
     *
     * @param id            the unique identifier of the owner
     * @param email         the email address of the owner
     * @param organization  the organization associated with the owner
     */
    @JsonCreator
    public Owner(
        @JsonProperty("id") String id,
        @JsonProperty("email") String email,
        @JsonProperty("organization") Organization organization
    ) {
        this.id = id;
        this.email = email;
        this.organization = organization;
    }

    /**
     * Gets the unique identifier of the owner.
     *
     * @return the owner's ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gets the email address of the owner.
     *
     * @return the owner's email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Gets the organization associated with the owner.
     *
     * @return the owner's organization
     */
    public Organization getOrganization() {
        return this.organization;
    }

    /**
     * Converts the Owner object to a map representation.
     *
     * @return a map containing the owner's data
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", this.getId());
        map.put("email", this.getEmail());
        map.put("organization", this.getOrganization());
        return map;
    }

    /**
     * Creates an Owner instance from a map representation.
     *
     * @param data a map containing the owner's data
     * @return a new Owner instance
     */
    @NotNull
    @Contract("_ -> new")
    public static Owner fromMap(@NotNull Map<String, Object> data) {
        return new Owner(
            (String) data.get("id"),
            (String) data.get("email"),
            Organization.fromMap(Cast.safeToMap(data.get("organization"), String.class, Object.class))
        );
    }
}
