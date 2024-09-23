/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Organization extends ApiData {

  @JsonProperty("is_admin")
  private final boolean isAdmin;

  @JsonProperty("is_superadmin")
  private final boolean isSuperadmin;

  @JsonProperty("is_workspace")
  private final boolean isWorkspace;

  @JsonProperty("id")
  private final String id;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("deleted")
  private final String deleted;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("updated")
  private final String updated;

  @JsonProperty("domains")
  private final DomainCollection domains;

  @JsonProperty("logos")
  private final LogoCollection logos;

  @JsonProperty("active_logo")
  private final ActiveLogoCollection activeLogo;

  @JsonProperty("teams")
  private final TeamCollection teams;

  @JsonProperty("active")
  private final boolean active;

  @JsonCreator
  public Organization(
      @JsonProperty("is_admin") boolean isAdmin,
      @JsonProperty("is_superadmin") boolean isSuperadmin,
      @JsonProperty("is_workspace") boolean isWorkspace,
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("deleted") String deleted,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("domains") DomainCollection domains,
      @JsonProperty("logos") LogoCollection logos,
      @JsonProperty("active_logo") ActiveLogoCollection activeLogo,
      @JsonProperty("teams") TeamCollection teams,
      @JsonProperty("active") boolean active) {
    this.isAdmin = isAdmin;
    this.isSuperadmin = isSuperadmin;
    this.isWorkspace = isWorkspace;
    this.id = id;
    this.name = name;
    this.deleted = deleted;
    this.created = created;
    this.updated = updated;
    this.domains = domains;
    this.logos = logos;
    this.activeLogo = activeLogo;
    this.teams = teams;
    this.active = active;
  }

  public boolean isAdmin() {
    return this.isAdmin;
  }

  public boolean isSuperadmin() {
    return this.isSuperadmin;
  }

  public boolean isWorkspace() {
    return this.isWorkspace;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getDeleted() {
    return this.deleted;
  }

  public String getCreated() {
    return this.created;
  }

  public String getUpdated() {
    return this.updated;
  }

  public DomainCollection getDomains() {
    return this.domains;
  }

  public LogoCollection getLogos() {
    return this.logos;
  }

  public ActiveLogoCollection getActiveLogo() {
    return this.activeLogo;
  }

  public TeamCollection getTeams() {
    return this.teams;
  }

  public boolean isActive() {
    return active;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    map.put("deleted", this.getDeleted());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    map.put("domains", this.getDomains());
    map.put("logos", this.getLogos());
    map.put("active_logo", this.getActiveLogo());
    map.put("teams", this.getTeams());
    map.put("is_admin", this.isAdmin());
    map.put("is_superadmin", this.isSuperadmin());
    map.put("is_workspace", this.isWorkspace());
    map.put("active", this.isActive());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Organization fromMap(@NotNull Map<String, Object> data) {
    return new Organization(
        (boolean) data.getOrDefault("is_admin", false),
        (boolean) data.getOrDefault("is_superadmin", false),
        (boolean) data.getOrDefault("is_workspace", false),
        (String) data.getOrDefault("id", ""),
        (String) data.getOrDefault("name", ""),
        (String) data.getOrDefault("deleted", ""),
        (String) data.getOrDefault("created", ""),
        (String) data.getOrDefault("updated", ""),
        (DomainCollection) data.get("domains"),
        (LogoCollection) data.get("logos"),
        (ActiveLogoCollection) data.get("active_logo"),
        (TeamCollection) data.get("teams"),
        (boolean) data.get("active"));
  }
}
