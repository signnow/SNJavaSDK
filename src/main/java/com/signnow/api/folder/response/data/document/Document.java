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

/**
 * This class represents a Document in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Document extends ApiData {

  /**
   * The unique identifier of the document.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The unique identifier of the user who owns the document.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The name of the document.
   */
  @JsonProperty("document_name")
  private final String documentName;

  /**
   * The number of pages in the document.
   */
  @JsonProperty("page_count")
  private final String pageCount;

  /**
   * The creation timestamp of the document.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The last updated timestamp of the document.
   */
  @JsonProperty("updated")
  private final String updated;

  /**
   * The version timestamp of the document.
   */
  @JsonProperty("version_time")
  private final String versionTime;

  /**
   * The original filename of the document.
   */
  @JsonProperty("original_filename")
  private final String originalFilename;

  /**
   * The owner of the document.
   */
  @JsonProperty("owner")
  private final String owner;

  /**
   * The unique identifier of the original user who created the document.
   */
  @JsonProperty("origin_user_id")
  private final String originUserId;

  /**
   * The thumbnail of the document.
   */
  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  /**
   * The template status of the document.
   */
  @JsonProperty("template")
  private final boolean template;

  /**
   * The roles associated with the document.
   */
  @JsonProperty("roles")
  private final RoleCollection roles;

  /**
   * The routing details of the document.
   */
  @JsonProperty("routing_details")
  private final RoutingDetailCollection routingDetails;

  /**
   * The field invites of the document.
   */
  @JsonProperty("field_invites")
  private final FieldInviteCollection fieldInvites;

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
   * The radio buttons of the document.
   */
  @JsonProperty("radiobuttons")
  private final RadiobuttonCollection radiobuttons;

  /**
   * The integrations of the document.
   */
  @JsonProperty("integrations")
  private final IntegrationCollection integrations;

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
  private final FieldDocumentCollection fields;

  /**
   * The requests of the document.
   */
  @JsonProperty("requests")
  private final RequestCollection requests;

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
   * The document group info of the document.
   */
  @JsonProperty("document_group_info")
  private final DocumentGroupInfo documentGroupInfo;

  /**
   * The unique identifier of the original document.
   */
  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  /**
   * The unique identifier of the project associated with the document.
   */
  @JsonProperty("project_id")
  private final String projectId;

  /**
   * The favorite status of the document.
   */
  @JsonProperty("is_favorite")
  private final Boolean isFavorite;

  /**
   * The recently used timestamp of the document.
   */
  @JsonProperty("recently_used")
  private final String recentlyUsed;

  /**
   * Constructs a new Document with the specified details.
   *
   * @param id the unique identifier of the document
   * @param userId the unique identifier of the user who owns the document
   * @param documentName the name of the document
   * @param pageCount the number of pages in the document
   * @param created the creation timestamp of the document
   * @param updated the last updated timestamp of the document
   * @param versionTime the version timestamp of the document
   * @param originalFilename the original filename of the document
   * @param owner the owner of the document
   * @param originUserId the unique identifier of the original user who created the document
   * @param thumbnail the thumbnail of the document
   * @param template the template status of the document
   * @param roles the roles associated with the document
   * @param routingDetails the routing details of the document
   * @param fieldInvites the field invites of the document
   * @param signatures the signatures of the document
   * @param seals the seals of the document
   * @param texts the texts of the document
   * @param checks the checks of the document
   * @param radiobuttons the radio buttons of the document
   * @param integrations the integrations of the document
   * @param inserts the inserts of the document
   * @param tags the tags of the document
   * @param fields the fields of the document
   * @param requests the requests of the document
   * @param enumerationOptions the enumeration options of the document
   * @param attachments the attachments of the document
   * @param documentGroupInfo the document group info of the document
   * @param originDocumentId the unique identifier of the original document
   * @param projectId the unique identifier of the project associated with the document
   * @param isFavorite the favorite status of the document
   * @param recentlyUsed the recently used timestamp of the document
   */
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

  /**
   * Returns the unique identifier of the document.
   *
   * @return the unique identifier of the document
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the unique identifier of the user who owns the document.
   *
   * @return the unique identifier of the user who owns the document
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the name of the document.
   *
   * @return the name of the document
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Returns the number of pages in the document.
   *
   * @return the number of pages in the document
   */
  public String getPageCount() {
    return this.pageCount;
  }

  /**
   * Returns the creation timestamp of the document.
   *
   * @return the creation timestamp of the document
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the last updated timestamp of the document.
   *
   * @return the last updated timestamp of the document
   */
  public String getUpdated() {
    return this.updated;
  }

  /**
   * Returns the version timestamp of the document.
   *
   * @return the version timestamp of the document
   */
  public String getVersionTime() {
    return this.versionTime;
  }

  /**
   * Returns the original filename of the document.
   *
   * @return the original filename of the document
   */
  public String getOriginalFilename() {
    return this.originalFilename;
  }

  /**
   * Returns the unique identifier of the original document.
   *
   * @return the unique identifier of the original document
   */
  public String getOriginDocumentId() {
    return this.originDocumentId;
  }

  /**
   * Returns the owner of the document.
   *
   * @return the owner of the document
   */
  public String getOwner() {
    return this.owner;
  }

  /**
   * Returns the unique identifier of the original user who created the document.
   *
   * @return the unique identifier of the original user who created the document
   */
  public String getOriginUserId() {
    return this.originUserId;
  }

  /**
   * Returns the unique identifier of the project associated with the document.
   *
   * @return the unique identifier of the project associated with the document
   */
  public String getProjectId() {
    return this.projectId;
  }

  /**
   * Returns the thumbnail of the document.
   *
   * @return the thumbnail of the document
   */
  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Returns the template status of the document.
   *
   * @return the template status of the document
   */
  public boolean isTemplate() {
    return this.template;
  }

  /**
   * Returns the favorite status of the document.
   *
   * @return the favorite status of the document
   */
  public Boolean isFavorite() {
    return this.isFavorite;
  }

  /**
   * Returns the roles associated with the document.
   *
   * @return the roles associated with the document
   */
  public RoleCollection getRoles() {
    return this.roles;
  }

  /**
   * Returns the routing details of the document.
   *
   * @return the routing details of the document
   */
  public RoutingDetailCollection getRoutingDetails() {
    return this.routingDetails;
  }

  /**
   * Returns the field invites of the document.
   *
   * @return the field invites of the document
   */
  public FieldInviteCollection getFieldInvites() {
    return this.fieldInvites;
  }

  /**
   * Returns the signatures of the document.
   *
   * @return the signatures of the document
   */
  public SignatureCollection getSignatures() {
    return this.signatures;
  }

  /**
   * Returns the seals of the document.
   *
   * @return the seals of the document
   */
  public SealCollection getSeals() {
    return this.seals;
  }

  /**
   * Returns the texts of the document.
   *
   * @return the texts of the document
   */
  public TextCollection getTexts() {
    return this.texts;
  }

  /**
   * Returns the checks of the document.
   *
   * @return the checks of the document
   */
  public CheckCollection getChecks() {
    return this.checks;
  }

  /**
   * Returns the radio buttons of the document.
   *
   * @return the radio buttons of the document
   */
  public RadiobuttonCollection getRadiobuttons() {
    return this.radiobuttons;
  }

  /**
   * Returns the integrations of the document.
   *
   * @return the integrations of the document
   */
  public IntegrationCollection getIntegrations() {
    return this.integrations;
  }

  /**
   * Returns the inserts of the document.
   *
   * @return the inserts of the document
   */
  public InsertCollection getInserts() {
    return this.inserts;
  }

  /**
   * Returns the tags of the document.
   *
   * @return the tags of the document
   */
  public TagCollection getTags() {
    return this.tags;
  }

  /**
   * Returns the fields of the document.
   *
   * @return the fields of the document
   */
  public FieldDocumentCollection getFields() {
    return this.fields;
  }

  /**
   * Returns the requests of the document.
   *
   * @return the requests of the document
   */
  public RequestCollection getRequests() {
    return this.requests;
  }

  /**
   * Returns the enumeration options of the document.
   *
   * @return the enumeration options of the document
   */
  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  /**
   * Returns the attachments of the document.
   *
   * @return the attachments of the document
   */
  public AttachmentCollection getAttachments() {
    return this.attachments;
  }

  /**
   * Returns the document group info of the document.
   *
   * @return the document group info of the document
   */
  public DocumentGroupInfo getDocumentGroupInfo() {
    return this.documentGroupInfo;
  }

  /**
   * Returns the recently used timestamp of the document.
   *
   * @return the recently used timestamp of the document
   */
  public String getRecentlyUsed() {
    return this.recentlyUsed;
  }

  /**
   * Converts the document to a map.
   *
   * @return a map representation of the document
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

  /**
   * Creates a new Document from the specified map.
   *
   * @param data the map containing the document details
   * @return a new Document created from the specified map
   */
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