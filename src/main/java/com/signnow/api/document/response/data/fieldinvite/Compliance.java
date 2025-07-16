/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.fieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Compliance {

    private final Cfr cfr;

    /**
     * Constructs a new Compliance instance.
     *
     * @param cfr the Cfr object, can be null.
     */
    @JsonCreator
    public Compliance(@JsonProperty("cfr") Cfr cfr) {
        this.cfr = cfr;
    }

    /**
     * Gets the Cfr object.
     *
     * @return the Cfr object, can be null.
     */
    public Cfr getCfr() {
        return this.cfr;
    }

    /**
     * Converts the Compliance object to a Map.
     *
     * @return a Map representation of the Compliance object.
     */
    @NotNull
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("cfr", this.cfr != null ? this.cfr.toMap() : null);
        return map;
    }

    /**
     * Creates a Compliance object from a Map.
     *
     * @param data the Map containing the data.
     * @return a new Compliance object.
     */
    @NotNull
    @Contract("_ -> new")
    public static Compliance fromMap(@NotNull Map<String, Object> data) {
        return new Compliance(
            data.containsKey("cfr") ? Cfr.fromMap((Map<String, Object>) data.get("cfr")) : null
        );
    }
}
