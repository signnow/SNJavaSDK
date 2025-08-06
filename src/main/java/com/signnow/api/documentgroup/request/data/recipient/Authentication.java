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
 * Represents the authentication data for a recipient.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Authentication extends ApiData {

    @JsonProperty("type")
    private final String type;

    @JsonProperty("value")
    private final String value;

    @JsonProperty("phone")
    private final String phone;

    @JsonProperty("method")
    private final String method;

    /**
     * Constructs an Authentication instance with the specified parameters.
     *
     * @param type   the type of authentication
     * @param value  the value of the authentication
     * @param phone  the phone number associated with the authentication
     * @param method the method of authentication
     */
    @JsonCreator
    public Authentication(
        @JsonProperty("type") String type,
        @JsonProperty("value") String value,
        @JsonProperty("phone") String phone,
        @JsonProperty("method") String method
    ) {
        this.type = type;
        this.value = value;
        this.phone = phone;
        this.method = method;
    }

    /**
     * Gets the type of authentication.
     *
     * @return the type of authentication
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the value of the authentication.
     *
     * @return the value of the authentication
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Gets the phone number associated with the authentication.
     *
     * @return the phone number
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Gets the method of authentication.
     *
     * @return the method of authentication
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * Converts the authentication data to a map.
     *
     * @return a map representation of the authentication data
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", this.getType());
        map.put("value", this.getValue());
        map.put("phone", this.getPhone());
        map.put("method", this.getMethod());
        return map;
    }

    /**
     * Creates an Authentication instance from a map.
     *
     * @param data the map containing authentication data
     * @return a new Authentication instance
     */
    @NotNull
    @Contract("_ -> new")
    public static Authentication fromMap(@NotNull Map<String, Object> data) {
        return new Authentication(
            (String) data.get("type"),
            (String) data.get("value"),
            (String) data.getOrDefault("phone", ""),
            (String) data.getOrDefault("method", "")
        );
    }
}
