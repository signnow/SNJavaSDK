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

@JsonIgnoreProperties(ignoreUnknown = true)
public final class DocumentFolder extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("document_name")
  private final String documentName;

  @JsonProperty("page_count")
  private final String pageCount;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("updated")
  private final int updated;

  @JsonProperty("original_filename")
  private final String originalFilename;

  @JsonProperty("owner")
  private final String owner;

  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  @JsonProperty("template")
  private final boolean template;

  @JsonProperty("is_favorite")
  private final boolean isFavorite;

  @JsonProperty("signatures")
  private final SignatureCollection signatures;

  @JsonProperty("seals")
  private final SealCollection seals;

  @JsonProperty("texts")
  private final TextCollection texts;

  @JsonProperty("checks")
  private final CheckCollection checks;

  @JsonProperty("inserts")
  private final InsertCollection inserts;

  @JsonProperty("tags")
  private final TagCollection tags;

  @JsonProperty("fields")
  private final FieldCollection fields;

  @JsonProperty("requests")
  private final RequestCollection requests;

  @JsonProperty("roles")
  private final RoleCollection roles;

  @JsonProperty("field_invites")
  private final FieldInviteFolderCollection fieldInvites;

  @JsonProperty("version_time")
  private final int versionTime;

  @JsonProperty("enumeration_options")
  private final EnumerationOptionCollection enumerationOptions;

  @JsonProperty("attachments")
  private final AttachmentCollection attachments;

  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  @JsonProperty("origin_user_id")
  private final String originUserId;

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

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public String getPageCount() {
    return this.pageCount;
  }

  public int getCreated() {
    return this.created;
  }

  public int getUpdated() {
    return this.updated;
  }

  public String getOriginalFilename() {
    return this.originalFilename;
  }

  public String getOwner() {
    return this.owner;
  }

  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  public boolean isTemplate() {
    return this.template;
  }

  public boolean isFavorite() {
    return this.isFavorite;
  }

  public SignatureCollection getSignatures() {
    return this.signatures;
  }

  public SealCollection getSeals() {
    return this.seals;
  }

  public TextCollection getTexts() {
    return this.texts;
  }

  public CheckCollection getChecks() {
    return this.checks;
  }

  public InsertCollection getInserts() {
    return this.inserts;
  }

  public TagCollection getTags() {
    return this.tags;
  }

  public FieldCollection getFields() {
    return this.fields;
  }

  public RequestCollection getRequests() {
    return this.requests;
  }

  public RoleCollection getRoles() {
    return this.roles;
  }

  public FieldInviteFolderCollection getFieldInvites() {
    return this.fieldInvites;
  }

  public int getVersionTime() {
    return this.versionTime;
  }

  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  public AttachmentCollection getAttachments() {
    return this.attachments;
  }

  public String getOriginDocumentId() {
    return this.originDocumentId;
  }

  public String getOriginUserId() {
    return this.originUserId;
  }

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
