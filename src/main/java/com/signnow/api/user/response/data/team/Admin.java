/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.team;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Admin extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("is_secondary")
  private final String isSecondary;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("billing")
  private final int billing;

  @JsonProperty("document_access")
  private final int documentAccess;

  @JsonProperty("primary")
  private final boolean primary;

  @JsonCreator
  public Admin(
      @JsonProperty("id") String id,
      @JsonProperty("is_secondary") String isSecondary,
      @JsonProperty("email") String email,
      @JsonProperty("billing") int billing,
      @JsonProperty("document_access") int documentAccess,
      @JsonProperty("primary") boolean primary) {
    this.id = id;
    this.isSecondary = isSecondary;
    this.email = email;
    this.billing = billing;
    this.documentAccess = documentAccess;
    this.primary = primary;
  }

  public String getId() {
    return this.id;
  }

  public String getIsSecondary() {
    return this.isSecondary;
  }

  public String getEmail() {
    return this.email;
  }

  public int getBilling() {
    return this.billing;
  }

  public int getDocumentAccess() {
    return this.documentAccess;
  }

  public boolean isPrimary() {
    return this.primary;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("is_secondary", this.getIsSecondary());
    map.put("email", this.getEmail());
    map.put("billing", this.getBilling());
    map.put("document_access", this.getDocumentAccess());
    map.put("primary", this.isPrimary());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Admin fromMap(@NotNull Map<String, Object> data) {
    return new Admin(
        (String) data.get("id"),
        (String) data.get("is_secondary"),
        (String) data.get("email"),
        (Integer) data.get("billing"),
        (Integer) data.get("document_access"),
        (Boolean) data.get("primary"));
  }
}
