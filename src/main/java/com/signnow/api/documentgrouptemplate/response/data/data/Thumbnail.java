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
 * Represents a Thumbnail with different sizes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Thumbnail extends ApiData {

    @JsonProperty("small")
    private final String small;

    @JsonProperty("medium")
    private final String medium;

    @JsonProperty("large")
    private final String large;

    /**
     * Constructs a Thumbnail with specified sizes.
     *
     * @param small  the small size thumbnail
     * @param medium the medium size thumbnail
     * @param large  the large size thumbnail
     */
    @JsonCreator
    public Thumbnail(
        @JsonProperty("small") String small,
        @JsonProperty("medium") String medium,
        @JsonProperty("large") String large
    ) {
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    /**
     * Gets the small size thumbnail.
     *
     * @return the small size thumbnail
     */
    public String getSmall() {
        return this.small;
    }

    /**
     * Gets the medium size thumbnail.
     *
     * @return the medium size thumbnail
     */
    public String getMedium() {
        return this.medium;
    }

    /**
     * Gets the large size thumbnail.
     *
     * @return the large size thumbnail
     */
    public String getLarge() {
        return this.large;
    }

    /**
     * Converts the Thumbnail to a map representation.
     *
     * @return a map containing the thumbnail sizes
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("small", this.getSmall());
        map.put("medium", this.getMedium());
        map.put("large", this.getLarge());
        return map;
    }

    /**
     * Creates a Thumbnail from a map representation.
     *
     * @param data the map containing thumbnail sizes
     * @return a new Thumbnail instance
     */
    @NotNull
    @Contract("_ -> new")
    public static Thumbnail fromMap(@NotNull Map<String, Object> data) {
        return new Thumbnail(
            (String) data.get("small"),
            (String) data.get("medium"),
            (String) data.get("large")
        );
    }
}
