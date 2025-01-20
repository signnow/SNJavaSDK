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

/**
 * Represents an Organization in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Organization extends ApiData {

  /**
   * Indicates if the user is an admin.
   */
  @JsonProperty("is_admin")
  private final boolean isAdmin;

  /**
   * Indicates if the user is a super admin.
   */
  @JsonProperty("is_superadmin")
  private final boolean isSuperadmin;

  /**
   * Indicates if the user is a workspace.
   */
  @JsonProperty("is_workspace")
  private final boolean isWorkspace;

  /**
   * The ID of the organization.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the organization.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The deleted status of the organization.
   */
  @JsonProperty("deleted")
  private final String deleted;

  /**
   * The creation date of the organization.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The updated date of the organization.
   */
  @JsonProperty("updated")
  private final String updated;

  /**
   * The domains of the organization.
   */
  @JsonProperty("domains")
  private final DomainCollection domains;

  /**
   * The logos of the organization.
   */
  @JsonProperty("logos")
  private final LogoCollection logos;

  /**
   * The active logo of the organization.
   */
  @JsonProperty("active_logo")
  private final ActiveLogoCollection activeLogo;

  /**
   * The teams of the organization.
   */
  @JsonProperty("teams")
  private final TeamCollection teams;

  /**
   * The active status of the organization.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * Constructs an Organization object.
   *
   * @param isAdmin       Indicates if the user is an admin.
   * @param isSuperadmin  Indicates if the user is a super admin.
   * @param isWorkspace   Indicates if the user is a workspace.
   * @param id            The ID of the organization.
   * @param name          The name of the organization.
   * @param deleted       The deleted status of the organization.
   * @param created       The creation date of the organization.
   * @param updated       The updated date of the organization.
   * @param domains       The domains of the organization.
   * @param logos         The logos of the organization.
   * @param activeLogo    The active logo of the organization.
   * @param teams         The teams of the organization.
   * @param active        The active status of the organization.
   */
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

  /**
   * Checks if the user is an admin.
   *
   * @return true if the user is an admin, false otherwise.
   */
  public boolean isAdmin() {
    return this.isAdmin;
  }

  /**
   * Checks if the user is a super admin.
   *
   * @return true if the user is a super admin, false otherwise.
   */
  public boolean isSuperadmin() {
    return this.isSuperadmin;
  }

  /**
   * Checks if the user is a workspace.
   *
   * @return true if the user is a workspace, false otherwise.
   */
  public boolean isWorkspace() {
    return this.isWorkspace;
  }

  /**
   * Returns the ID of the organization.
   *
   * @return the ID of the organization.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the organization.
   *
   * @return the name of the organization.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the deleted status of the organization.
   *
   * @return the deleted status of the organization.
   */
  public String getDeleted() {
    return this.deleted;
  }

  /**
   * Returns the creation date of the organization.
   *
   * @return the creation date of the organization.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the updated date of the organization.
   *
   * @return the updated date of the organization.
   */
  public String getUpdated() {
    return this.updated;
  }

  /**
   * Returns the domains of the organization.
   *
   * @return the domains of the organization.
   */
  public DomainCollection getDomains() {
    return this.domains;
  }

  /**
   * Returns the logos of the organization.
   *
   * @return the logos of the organization.
   */
  public LogoCollection getLogos() {
    return this.logos;
  }

  /**
   * Returns the active logo of the organization.
   *
   * @return the active logo of the organization.
   */
  public ActiveLogoCollection getActiveLogo() {
    return this.activeLogo;
  }

  /**
   * Returns the teams of the organization.
   *
   * @return the teams of the organization.
   */
  public TeamCollection getTeams() {
    return this.teams;
  }

  /**
   * Checks if the organization is active.
   *
   * @return true if the organization is active, false otherwise.
   */
  public boolean isActive() {
    return active;
  }

  /**
   * Converts the organization object to a map.
   *
   * @return a map representation of the organization object.
   */
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

  /**
   * Creates an organization object from a map.
   *
   * @param data the map containing the organization data.
   * @return a new organization object.
   */
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