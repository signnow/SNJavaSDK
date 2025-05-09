/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data.template;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/** Represents a Template with roles, name, id, owner email, thumbnail, and readability status. */
public final class Template extends ApiData {

  /**
   * Collection of roles defined in the template.
   */
  @JsonProperty("roles")
  private final RoleCollection roles;

  /**
   * Name of the template.
   */
  @JsonProperty("template_name")
  private final String templateName;

  /**
   * Unique identifier of the template.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Email address of the template owner.
   */
  @JsonProperty("owner_email")
  private final String ownerEmail;

  /**
   * Thumbnail image representing the template.
   */
  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  /**
   * Indicates whether the current user has read access to the template.
   */
  @JsonProperty("readable")
  private final Boolean readable;

  /**
   * Constructs a new Template instance.
   *
   * @param roles the collection of roles associated with the template
   * @param templateName the name of the template
   * @param id the unique identifier of the template
   * @param ownerEmail the email of the template owner
   * @param thumbnail the thumbnail associated with the template
   * @param readable the readability status of the template
   */
  @JsonCreator
  public Template(
      @JsonProperty("roles") RoleCollection roles,
      @JsonProperty("template_name") String templateName,
      @JsonProperty("id") String id,
      @JsonProperty("owner_email") String ownerEmail,
      @JsonProperty("thumbnail") Thumbnail thumbnail,
      @JsonProperty("readable") @Nullable Boolean readable) {
    this.roles = roles;
    this.templateName = templateName;
    this.id = id;
    this.ownerEmail = ownerEmail;
    this.thumbnail = thumbnail;
    this.readable = readable;
  }

  /**
   * Gets the roles associated with the template.
   *
   * @return the roles
   */
  public RoleCollection getRoles() {
    return this.roles;
  }

  /**
   * Gets the name of the template.
   *
   * @return the template name
   */
  public String getTemplateName() {
    return this.templateName;
  }

  /**
   * Gets the unique identifier of the template.
   *
   * @return the template id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the email of the template owner.
   *
   * @return the owner email
   */
  public String getOwnerEmail() {
    return this.ownerEmail;
  }

  /**
   * Gets the thumbnail associated with the template.
   *
   * @return the thumbnail
   */
  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Checks if the template is readable.
   *
   * @return the readability status
   */
  @Nullable
  public Boolean isReadable() {
    return this.readable;
  }

  /**
   * Converts the template to a map representation.
   *
   * @return a map containing the template data
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("roles", this.getRoles());
    map.put("template_name", this.getTemplateName());
    map.put("id", this.getId());
    map.put("owner_email", this.getOwnerEmail());
    map.put("thumbnail", this.getThumbnail().toMap());
    map.put("readable", this.isReadable());
    return map;
  }

  /**
   * Creates a Template instance from a map representation.
   *
   * @param data the map containing the template data
   * @return a new Template instance
   */
  @NotNull
  public static Template fromMap(@NotNull Map<String, Object> data) {
    return new Template(
        (RoleCollection) data.get("roles"),
        (String) data.get("template_name"),
        (String) data.get("id"),
        (String) data.get("owner_email"),
        Thumbnail.fromMap(Cast.safeToMap(data.get("thumbnail"), String.class, Object.class)),
        (Boolean) data.getOrDefault("readable", null));
  }
}
