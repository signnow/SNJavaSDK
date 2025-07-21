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

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Data extends ApiData {

    @JsonProperty("unique_id")
    private final String uniqueId;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("created")
    private final int created;

    @JsonProperty("state")
    private final String state;

    @JsonProperty("owner_email")
    private final String ownerEmail;

    @JsonProperty("documents")
    private final DocumentCollection documents;

    @JsonProperty("owner")
    private final Owner owner;

    @JsonProperty("invite_id")
    private final String inviteId;

    @JsonProperty("last_invite_id")
    private final String lastInviteId;

    @JsonCreator
    public Data(
        @JsonProperty("unique_id") String uniqueId,
        @JsonProperty("name") String name,
        @JsonProperty("created") int created,
        @JsonProperty("state") String state,
        @JsonProperty("owner_email") String ownerEmail,
        @JsonProperty("documents") DocumentCollection documents,
        @JsonProperty("owner") Owner owner,
        @JsonProperty("invite_id") String inviteId,
        @JsonProperty("last_invite_id") String lastInviteId
    ) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.created = created;
        this.state = state;
        this.ownerEmail = ownerEmail;
        this.documents = documents;
        this.owner = owner;
        this.inviteId = inviteId;
        this.lastInviteId = lastInviteId;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public String getName() {
        return this.name;
    }

    public int getCreated() {
        return this.created;
    }

    public String getInviteId() {
        return this.inviteId;
    }

    public String getState() {
        return this.state;
    }

    public String getLastInviteId() {
        return this.lastInviteId;
    }

    public String getOwnerEmail() {
        return this.ownerEmail;
    }

    public DocumentCollection getDocuments() {
        return this.documents;
    }

    public Owner getOwner() {
        return this.owner;
    }

    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("unique_id", this.getUniqueId());
        map.put("name", this.getName());
        map.put("created", this.getCreated());
        map.put("invite_id", this.getInviteId());
        map.put("state", this.getState());
        map.put("last_invite_id", this.getLastInviteId());
        map.put("owner_email", this.getOwnerEmail());
        map.put("documents", this.getDocuments());
        map.put("owner", this.getOwner());
        return map;
    }

    @NotNull
    @Contract("_ -> new")
    public static Data fromMap(@NotNull Map<String, Object> data) {
        return new Data(
            (String) data.get("unique_id"),
            (String) data.get("name"),
            (int) data.get("created"),
            (String) data.get("state"),
            (String) data.get("owner_email"),
            (DocumentCollection) data.get("documents"),
            Owner.fromMap((Map<String, Object>) data.get("owner")),
            (String) data.getOrDefault("invite_id", null),
            (String) data.getOrDefault("last_invite_id", null)
        );
    }
}
