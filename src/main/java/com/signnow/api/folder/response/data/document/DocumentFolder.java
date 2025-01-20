/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a document folder.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DocumentFolder extends ApiData {

  /**
   * The id of the document folder.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id associated with the document folder.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The name of the document.
   */
  @JsonProperty("document_name")
  private final String documentName;

  /**
   * The page count of the document.
   */
  @JsonProperty("page_count")
  private final String pageCount;

  /**
   * The creation timestamp of the document folder.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The updated timestamp of the document folder.
   */
  @JsonProperty("updated")
  private final int updated;

  /**
   * The original filename of the document.
   */
  @JsonProperty("original_filename")
  private final String originalFilename;

  /**
   * The owner of the document folder.
   */
  @JsonProperty("owner")
  private final String owner;

  /**
   * The thumbnail of the document.
   */
  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  /**
   * The template status of the document folder.
   */
  @JsonProperty("template")
  private final boolean template;

  /**
   * The favorite status of the document folder.
   */
  @JsonProperty("is_favorite")
  private final boolean isFavorite;

  /**
   * The signatures of the document.
   */
  @JsonProperty("signatures")
  private final SignatureCollection signatures;

  /**
   * The seals of the document.
   */
  @JsonProperty("seals")
  private final SealCollection seals;

  /**
   * The texts of the document.
   */
  @JsonProperty("texts")
  private final TextCollection texts;

  /**
   * The checks of the document.
   */
  @JsonProperty("checks")
  private final CheckCollection checks;

  /**
   * The inserts of the document.
   */
  @JsonProperty("inserts")
  private final InsertCollection inserts;

  /**
   * The tags of the document.
   */
  @JsonProperty("tags")
  private final TagCollection tags;

  /**
   * The fields of the document.
   */
  @JsonProperty("fields")
  private final FieldCollection fields;

  /**
   * The requests of the document.
   */
  @JsonProperty("requests")
  private final RequestCollection requests;

  /**
   * The roles of the document.
   */
  @JsonProperty("roles")
  private final RoleCollection roles;

  /**
   * The field invites of the document.
   */
  @JsonProperty("field_invites")
  private final FieldInviteFolderCollection fieldInvites;

  /**
   * The version time of the document.
   */
  @JsonProperty("version_time")
  private final int versionTime;

  /**
   * The enumeration options of the document.
   */
  @JsonProperty("enumeration_options")
  private final EnumerationOptionCollection enumerationOptions;

  /**
   * The attachments of the document.
   */
  @JsonProperty("attachments")
  private final AttachmentCollection attachments;

  /**
   * The origin document id of the document.
   */
  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  /**
   * The origin user id of the document.
   */
  @JsonProperty("origin_user_id")
  private final String originUserId;

  /**
   * Constructor for DocumentFolder class.
   *
   * @param id The id of the document folder.
   * @param userId The user id associated with the document folder.
   * @param documentName The name of the document.
   * @param pageCount The page count of the document.
   * @param created The creation timestamp of the document folder.
   * @param updated The updated timestamp of the document folder.
   * @param originalFilename The original filename of the document.
   * @param owner The owner of the document folder.
   * @param thumbnail The thumbnail of the document.
   * @param template The template status of the document folder.
   * @param isFavorite The favorite status of the document folder.
   * @param signatures The signatures of the document.
   * @param seals The seals of the document.
   * @param texts The texts of the document.
   * @param checks The checks of the document.
   * @param inserts The inserts of the document.
   * @param tags The tags of the document.
   * @param fields The fields of the document.
   * @param requests The requests of the document.
   * @param roles The roles of the document.
   * @param fieldInvites The field invites of the document.
   * @param versionTime The version time of the document.
   * @param enumerationOptions The enumeration options of the document.
   * @param attachments The attachments of the document.
   * @param originDocumentId The origin document id of the document.
   * @param originUserId The origin user id of the document.
   */
  @JsonCreator
  public DocumentFolder(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("page_count") String pageCount,
      @JsonProperty("created") int created,
      @JsonProperty("updated") int updated,
      @JsonProperty("original_filename") String originalFilename,
      @JsonProperty("owner") String owner,
      @JsonProperty("thumbnail") Thumbnail thumbnail,
      @JsonProperty("template") boolean template,
      @JsonProperty("is_favorite") boolean isFavorite,
      @JsonProperty("signatures") SignatureCollection signatures,
      @JsonProperty("seals") SealCollection seals,
      @JsonProperty("texts") TextCollection texts,
      @JsonProperty("checks") CheckCollection checks,
      @JsonProperty("inserts") InsertCollection inserts,
      @JsonProperty("tags") TagCollection tags,
      @JsonProperty("fields") FieldCollection fields,
      @JsonProperty("requests") RequestCollection requests,
      @JsonProperty("roles") RoleCollection roles,
      @JsonProperty("field_invites") FieldInviteFolderCollection fieldInvites,
      @JsonProperty("version_time") int versionTime,
      @JsonProperty("enumeration_options") EnumerationOptionCollection enumerationOptions,
      @JsonProperty("attachments") AttachmentCollection attachments,
      @JsonProperty("origin_document_id") String originDocumentId,
      @JsonProperty("origin_user_id") String originUserId) {
    this.id = id;
    this.userId = userId;
    this.documentName = documentName;
    this.pageCount = pageCount;
    this.created = created;
    this.updated = updated;
    this.originalFilename = originalFilename;
    this.owner = owner;
    this.thumbnail = thumbnail;
    this.template = template;
    this.isFavorite = isFavorite;
    this.signatures = signatures;
    this.seals = seals;
    this.texts = texts;
    this.checks = checks;
    this.inserts = inserts;
    this.tags = tags;
    this.fields = fields;
    this.requests = requests;
    this.roles = roles;
    this.fieldInvites = fieldInvites;
    this.versionTime = versionTime;
    this.enumerationOptions = enumerationOptions;
    this.attachments = attachments;
    this.originDocumentId = originDocumentId;
    this.originUserId = originUserId;
  }

  /**
   * Returns the id of the document folder.
   *
   * @return the id of the document folder.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id associated with the document folder.
   *
   * @return the user id associated with the document folder.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the name of the document.
   *
   * @return the name of the document.
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Returns the page count of the document.
   *
   * @return the page count of the document.
   */
  public String getPageCount() {
    return this.pageCount;
  }

  /**
   * Returns the creation timestamp of the document folder.
   *
   * @return the creation timestamp of the document folder.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the updated timestamp of the document folder.
   *
   * @return the updated timestamp of the document folder.
   */
  public int getUpdated() {
    return this.updated;
  }

  /**
   * Returns the original filename of the document.
   *
   * @return the original filename of the document.
   */
  public String getOriginalFilename() {
    return this.originalFilename;
  }

  /**
   * Returns the owner of the document folder.
   *
   * @return the owner of the document folder.
   */
  public String getOwner() {
    return this.owner;
  }

  /**
   * Returns the thumbnail of the document.
   *
   * @return the thumbnail of the document.
   */
  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Returns the template status of the document folder.
   *
   * @return the template status of the document folder.
   */
  public boolean isTemplate() {
    return this.template;
  }

  /**
   * Returns the favorite status of the document folder.
   *
   * @return the favorite status of the document folder.
   */
  public boolean isFavorite() {
    return this.isFavorite;
  }

  /**
   * Returns the signatures of the document.
   *
   * @return the signatures of the document.
   */
  public SignatureCollection getSignatures() {
    return this.signatures;
  }

  /**
   * Returns the seals of the document.
   *
   * @return the seals of the document.
   */
  public SealCollection getSeals() {
    return this.seals;
  }

  /**
   * Returns the texts of the document.
   *
   * @return the texts of the document.
   */
  public TextCollection getTexts() {
    return this.texts;
  }

  /**
   * Returns the checks of the document.
   *
   * @return the checks of the document.
   */
  public CheckCollection getChecks() {
    return this.checks;
  }

  /**
   * Returns the inserts of the document.
   *
   * @return the inserts of the document.
   */
  public InsertCollection getInserts() {
    return this.inserts;
  }

  /**
   * Returns the tags of the document.
   *
   * @return the tags of the document.
   */
  public TagCollection getTags() {
    return this.tags;
  }

  /**
   * Returns the fields of the document.
   *
   * @return the fields of the document.
   */
  public FieldCollection getFields() {
    return this.fields;
  }

  /**
   * Returns the requests of the document.
   *
   * @return the requests of the document.
   */
  public RequestCollection getRequests() {
    return this.requests;
  }

  /**
   * Returns the roles of the document.
   *
   * @return the roles of the document.
   */
  public RoleCollection getRoles() {
    return this.roles;
  }

  /**
   * Returns the field invites of the document.
   *
   * @return the field invites of the document.
   */
  public FieldInviteFolderCollection getFieldInvites() {
    return this.fieldInvites;
  }

  /**
   * Returns the version time of the document.
   *
   * @return the version time of the document.
   */
  public int getVersionTime() {
    return this.versionTime;
  }

  /**
   * Returns the enumeration options of the document.
   *
   * @return the enumeration options of the document.
   */
  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  /**
   * Returns the attachments of the document.
   *
   * @return the attachments of the document.
   */
  public AttachmentCollection getAttachments() {
    return this.attachments;
  }

  /**
   * Returns the origin document id of the document.
   *
   * @return the origin document id of the document.
   */
  public String getOriginDocumentId() {
    return this.originDocumentId;
  }

  /**
   * Returns the origin user id of the document.
   *
   * @return the origin user id of the document.
   */
  public String getOriginUserId() {
    return this.originUserId;
  }

  /**
   * Converts the document folder to a map.
   *
   * @return a map representation of the document folder.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("document_name", this.getDocumentName());
    map.put("page_count", this.getPageCount());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    map.put("original_filename", this.getOriginalFilename());
    map.put("origin_document_id", this.getOriginDocumentId());
    map.put("owner", this.getOwner());
    map.put("origin_user_id", this.getOriginUserId());
    map.put("thumbnail", this.getThumbnail());
    map.put("template", this.isTemplate());
    map.put("is_favorite", this.isFavorite());
    map.put("signatures", this.getSignatures());
    map.put("seals", this.getSeals());
    map.put("texts", this.getTexts());
    map.put("checks", this.getChecks());
    map.put("inserts", this.getInserts());
    map.put("tags", this.getTags());
    map.put("fields", this.getFields());
    map.put("requests", this.getRequests());
    map.put("roles", this.getRoles());
    map.put("field_invites", this.getFieldInvites());
    map.put("version_time", this.getVersionTime());
    map.put("enumeration_options", this.getEnumerationOptions());
    map.put("attachments", this.getAttachments());
    return map;
  }

  /**
   * Creates a new DocumentFolder object from a map.
   *
   * @param data a map containing the data for the DocumentFolder.
   * @return a new DocumentFolder object.
   */
  @NotNull
  @Contract("_ -> new")
  public static DocumentFolder fromMap(@NotNull Map<String, Object> data) {
    return new DocumentFolder(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("document_name"),
        (String) data.get("page_count"),
        (int) data.get("created"),
        (int) data.get("updated"),
        (String) data.get("original_filename"),
        (String) data.get("owner"),
        (Thumbnail) data.get("thumbnail"),
        (boolean) data.get("template"),
        (boolean) data.get("is_favorite"),
        (SignatureCollection) data.get("signatures"),
        (SealCollection) data.get("seals"),
        (TextCollection) data.get("texts"),
        (CheckCollection) data.get("checks"),
        (InsertCollection) data.get("inserts"),
        (TagCollection) data.get("tags"),
        (FieldCollection) data.get("fields"),
        (RequestCollection) data.get("requests"),
        (RoleCollection) data.get("roles"),
        (FieldInviteFolderCollection) data.get("field_invites"),
        (int) data.get("version_time"),
        (EnumerationOptionCollection) data.get("enumeration_options"),
        (AttachmentCollection) data.get("attachments"),
        (String) data.get("origin_document_id"),
        (String) data.get("origin_user_id"));
  }
}