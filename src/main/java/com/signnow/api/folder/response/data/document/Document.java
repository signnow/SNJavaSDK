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
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Document extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("document_name")
  private final String documentName;

  @JsonProperty("page_count")
  private final String pageCount;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("updated")
  private final String updated;

  @JsonProperty("version_time")
  private final String versionTime;

  @JsonProperty("original_filename")
  private final String originalFilename;

  @JsonProperty("owner")
  private final String owner;

  @JsonProperty("origin_user_id")
  private final String originUserId;

  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  @JsonProperty("template")
  private final boolean template;

  @JsonProperty("roles")
  private final RoleCollection roles;

  @JsonProperty("routing_details")
  private final RoutingDetailCollection routingDetails;

  @JsonProperty("field_invites")
  private final FieldInviteCollection fieldInvites;

  @JsonProperty("signatures")
  private final SignatureCollection signatures;

  @JsonProperty("seals")
  private final SealCollection seals;

  @JsonProperty("texts")
  private final TextCollection texts;

  @JsonProperty("checks")
  private final CheckCollection checks;

  @JsonProperty("radiobuttons")
  private final RadiobuttonCollection radiobuttons;

  @JsonProperty("integrations")
  private final IntegrationCollection integrations;

  @JsonProperty("inserts")
  private final InsertCollection inserts;

  @JsonProperty("tags")
  private final TagCollection tags;

  @JsonProperty("fields")
  private final FieldDocumentCollection fields;

  @JsonProperty("requests")
  private final RequestCollection requests;

  @JsonProperty("enumeration_options")
  private final EnumerationOptionCollection enumerationOptions;

  @JsonProperty("attachments")
  private final AttachmentCollection attachments;

  @JsonProperty("document_group_info")
  private final DocumentGroupInfo documentGroupInfo;

  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  @JsonProperty("project_id")
  private final String projectId;

  @JsonProperty("is_favorite")
  private final Boolean isFavorite;

  @JsonProperty("recently_used")
  private final String recentlyUsed;

  @JsonCreator
  public Document(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("page_count") String pageCount,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("version_time") String versionTime,
      @JsonProperty("original_filename") String originalFilename,
      @JsonProperty("owner") String owner,
      @JsonProperty("origin_user_id") String originUserId,
      @JsonProperty("thumbnail") Thumbnail thumbnail,
      @JsonProperty("template") boolean template,
      @JsonProperty("roles") RoleCollection roles,
      @JsonProperty("routing_details") RoutingDetailCollection routingDetails,
      @JsonProperty("field_invites") FieldInviteCollection fieldInvites,
      @JsonProperty("signatures") SignatureCollection signatures,
      @JsonProperty("seals") SealCollection seals,
      @JsonProperty("texts") TextCollection texts,
      @JsonProperty("checks") CheckCollection checks,
      @JsonProperty("radiobuttons") RadiobuttonCollection radiobuttons,
      @JsonProperty("integrations") IntegrationCollection integrations,
      @JsonProperty("inserts") InsertCollection inserts,
      @JsonProperty("tags") TagCollection tags,
      @JsonProperty("fields") FieldDocumentCollection fields,
      @JsonProperty("requests") RequestCollection requests,
      @JsonProperty("enumeration_options") EnumerationOptionCollection enumerationOptions,
      @JsonProperty("attachments") AttachmentCollection attachments,
      @JsonProperty("document_group_info") DocumentGroupInfo documentGroupInfo,
      @JsonProperty("origin_document_id") String originDocumentId,
      @JsonProperty("project_id") String projectId,
      @JsonProperty("is_favorite") Boolean isFavorite,
      @JsonProperty("recently_used") String recentlyUsed) {
    this.id = id;
    this.userId = userId;
    this.documentName = documentName;
    this.pageCount = pageCount;
    this.created = created;
    this.updated = updated;
    this.versionTime = versionTime;
    this.originalFilename = originalFilename;
    this.owner = owner;
    this.originUserId = originUserId;
    this.thumbnail = thumbnail;
    this.template = template;
    this.roles = roles;
    this.routingDetails = routingDetails;
    this.fieldInvites = fieldInvites;
    this.signatures = signatures;
    this.seals = seals;
    this.texts = texts;
    this.checks = checks;
    this.radiobuttons = radiobuttons;
    this.integrations = integrations;
    this.inserts = inserts;
    this.tags = tags;
    this.fields = fields;
    this.requests = requests;
    this.enumerationOptions = enumerationOptions;
    this.attachments = attachments;
    this.documentGroupInfo = documentGroupInfo;
    this.originDocumentId = originDocumentId;
    this.projectId = projectId;
    this.isFavorite = isFavorite;
    this.recentlyUsed = recentlyUsed;
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

  public String getCreated() {
    return this.created;
  }

  public String getUpdated() {
    return this.updated;
  }

  public String getVersionTime() {
    return this.versionTime;
  }

  public String getOriginalFilename() {
    return this.originalFilename;
  }

  public String getOriginDocumentId() {
    return this.originDocumentId;
  }

  public String getOwner() {
    return this.owner;
  }

  public String getOriginUserId() {
    return this.originUserId;
  }

  public String getProjectId() {
    return this.projectId;
  }

  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  public boolean isTemplate() {
    return this.template;
  }

  public Boolean isFavorite() {
    return this.isFavorite;
  }

  public RoleCollection getRoles() {
    return this.roles;
  }

  public RoutingDetailCollection getRoutingDetails() {
    return this.routingDetails;
  }

  public FieldInviteCollection getFieldInvites() {
    return this.fieldInvites;
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

  public RadiobuttonCollection getRadiobuttons() {
    return this.radiobuttons;
  }

  public IntegrationCollection getIntegrations() {
    return this.integrations;
  }

  public InsertCollection getInserts() {
    return this.inserts;
  }

  public TagCollection getTags() {
    return this.tags;
  }

  public FieldDocumentCollection getFields() {
    return this.fields;
  }

  public RequestCollection getRequests() {
    return this.requests;
  }

  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  public AttachmentCollection getAttachments() {
    return this.attachments;
  }

  public DocumentGroupInfo getDocumentGroupInfo() {
    return this.documentGroupInfo;
  }

  public String getRecentlyUsed() {
    return this.recentlyUsed;
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
    map.put("version_time", this.getVersionTime());
    map.put("original_filename", this.getOriginalFilename());
    map.put("origin_document_id", this.getOriginDocumentId());
    map.put("owner", this.getOwner());
    map.put("origin_user_id", this.getOriginUserId());
    map.put("project_id", this.getProjectId());
    map.put("thumbnail", this.getThumbnail());
    map.put("template", this.isTemplate());
    map.put("is_favorite", this.isFavorite());
    map.put("roles", this.getRoles());
    map.put("routing_details", this.getRoutingDetails());
    map.put("field_invites", this.getFieldInvites());
    map.put("signatures", this.getSignatures());
    map.put("seals", this.getSeals());
    map.put("texts", this.getTexts());
    map.put("checks", this.getChecks());
    map.put("radiobuttons", this.getRadiobuttons());
    map.put("integrations", this.getIntegrations());
    map.put("inserts", this.getInserts());
    map.put("tags", this.getTags());
    map.put("fields", this.getFields());
    map.put("requests", this.getRequests());
    map.put("enumeration_options", this.getEnumerationOptions());
    map.put("attachments", this.getAttachments());
    map.put("document_group_info", this.getDocumentGroupInfo());
    map.put("recently_used", this.getRecentlyUsed());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Document fromMap(@NotNull Map<String, Object> data) {
    return new Document(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("document_name"),
        (String) data.get("page_count"),
        (String) data.get("created"),
        (String) data.get("updated"),
        (String) data.get("version_time"),
        (String) data.get("original_filename"),
        (String) data.get("owner"),
        (String) data.get("origin_user_id"),
        Thumbnail.fromMap(Cast.safeToMap(data.get("thumbnail"), String.class, Object.class)),
        (Boolean) data.get("template"),
        (RoleCollection) data.get("roles"),
        (RoutingDetailCollection) data.get("routing_details"),
        (FieldInviteCollection) data.get("field_invites"),
        (SignatureCollection) data.get("signatures"),
        (SealCollection) data.get("seals"),
        (TextCollection) data.get("texts"),
        (CheckCollection) data.get("checks"),
        (RadiobuttonCollection) data.get("radiobuttons"),
        (IntegrationCollection) data.get("integrations"),
        (InsertCollection) data.get("inserts"),
        (TagCollection) data.get("tags"),
        (FieldDocumentCollection) data.get("fields"),
        (RequestCollection) data.get("requests"),
        (EnumerationOptionCollection) data.get("enumeration_options"),
        (AttachmentCollection) data.get("attachments"),
        DocumentGroupInfo.fromMap(
            Cast.safeToMap(data.get("document_group_info"), String.class, Object.class)),
        (String) data.get("origin_document_id"),
        (String) data.get("project_id"),
        (Boolean) data.get("is_favorite"),
        (String) data.get("recently_used"));
  }
}
