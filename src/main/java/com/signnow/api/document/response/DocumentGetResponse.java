/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.document.response.data.AttachmentCollection;
import com.signnow.api.document.response.data.CheckCollection;
import com.signnow.api.document.response.data.DocumentGroupInfo;
import com.signnow.api.document.response.data.DocumentGroupTemplateInfoCollection;
import com.signnow.api.document.response.data.EntityLabelCollection;
import com.signnow.api.document.response.data.EnumerationOptionCollection;
import com.signnow.api.document.response.data.FieldCollection;
import com.signnow.api.document.response.data.FieldValidatorCollection;
import com.signnow.api.document.response.data.FieldsDataCollection;
import com.signnow.api.document.response.data.HyperlinkCollection;
import com.signnow.api.document.response.data.InsertCollection;
import com.signnow.api.document.response.data.IntegrationCollection;
import com.signnow.api.document.response.data.IntegrationObjectCollection;
import com.signnow.api.document.response.data.OriginatorOrganizationSettingsCollection;
import com.signnow.api.document.response.data.PageCollection;
import com.signnow.api.document.response.data.PaymentCollection;
import com.signnow.api.document.response.data.RoleCollection;
import com.signnow.api.document.response.data.SealCollection;
import com.signnow.api.document.response.data.Settings;
import com.signnow.api.document.response.data.ShareInfo;
import com.signnow.api.document.response.data.SignatureCollection;
import com.signnow.api.document.response.data.SigningSessionSettings;
import com.signnow.api.document.response.data.TagCollection;
import com.signnow.api.document.response.data.TextCollection;
import com.signnow.api.document.response.data.Thumbnail;
import com.signnow.api.document.response.data.ViewerRoleCollection;
import com.signnow.api.document.response.data.exportedto.ExportedToCollection;
import com.signnow.api.document.response.data.fieldinvite.FieldInviteCollection;
import com.signnow.api.document.response.data.line.LineCollection;
import com.signnow.api.document.response.data.radiobutton.RadiobuttonCollection;
import com.signnow.api.document.response.data.request.RequestCollection;
import com.signnow.api.document.response.data.routingdetail.RoutingDetailCollection;
import com.signnow.api.document.response.data.viewerfieldinvite.ViewerFieldInviteCollection;

/**
 * This class represents the response of a document retrieval request.
 * It contains all the details of the document.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGetResponse {

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
   * The count of pages in the document.
   */
  @JsonProperty("page_count")
  private final String pageCount;

  /**
   * The timestamp when the document was created.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The timestamp when the document was last updated.
   */
  @JsonProperty("updated")
  private final int updated;

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
   * The name of the owner of the document.
   */
  @JsonProperty("owner_name")
  private final String ownerName;

  /**
   * A flag indicating if the document is a template.
   */
  @JsonProperty("template")
  private final boolean template;

  /**
   * The unique identifier of the parent document, if any.
   */
  @JsonProperty("parent_id")
  private final String parentId;

  /**
   * The logo of the originator of the document.
   */
  @JsonProperty("originator_logo")
  private final String originatorLogo;

  /**
   * The collection of pages in the document.
   */
  @JsonProperty("pages")
  private final PageCollection pages;

  /**
   * The timestamp of the version of the document.
   */
  @JsonProperty("version_time")
  private final int versionTime;

  /**
   * The collection of routing details of the document.
   */
  @JsonProperty("routing_details")
  private final RoutingDetailCollection routingDetails;

  /**
   * The thumbnail of the document.
   */
  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  /**
   * The collection of signatures in the document.
   */
  @JsonProperty("signatures")
  private final SignatureCollection signatures;

  /**
   * The collection of tags in the document.
   */
  @JsonProperty("tags")
  private final TagCollection tags;

  /**
   * The collection of fields in the document.
   */
  @JsonProperty("fields")
  private final FieldCollection fields;

  /**
   * The collection of roles in the document.
   */
  @JsonProperty("roles")
  private final RoleCollection roles;

  /**
   * The collection of viewer roles in the document.
   */
  @JsonProperty("viewer_roles")
  private final ViewerRoleCollection viewerRoles;

  /**
   * The settings of the signing session of the document.
   */
  @JsonProperty("signing_session_settings")
  private final SigningSessionSettings signingSessionSettings;

  /**
   * The collection of settings of the originator organization of the document.
   */
  @JsonProperty("originator_organization_settings")
  private final OriginatorOrganizationSettingsCollection originatorOrganizationSettings;

  /**
   * The information of the document group.
   */
  @JsonProperty("document_group_info")
  private final DocumentGroupInfo documentGroupInfo;

  /**
   * The settings of the document.
   */
  @JsonProperty("settings")
  private final Settings settings;

  /**
   * The information of the share of the document.
   */
  @JsonProperty("share_info")
  private final ShareInfo shareInfo;

  /**
   * The unique identifier of the origin user of the document.
   */
  @JsonProperty("origin_user_id")
  private final String originUserId;

  /**
   * The unique identifier of the origin document of the document.
   */
  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  /**
   * The recently used information of the document.
   */
  @JsonProperty("recently_used")
  private final String recentlyUsed;

  /**
   * The default folder of the document.
   */
  @JsonProperty("default_folder")
  private final String defaultFolder;

  /**
   * The collection of entity labels in the document.
   */
  @JsonProperty("entity_labels")
  private final EntityLabelCollection entityLabels;

  /**
   * The collection of field invites in the document.
   */
  @JsonProperty("field_invites")
  private final FieldInviteCollection fieldInvites;

  /**
   * The collection of viewer field invites in the document.
   */
  @JsonProperty("viewer_field_invites")
  private final ViewerFieldInviteCollection viewerFieldInvites;

  /**
   * The collection of enumeration options in the document.
   */
  @JsonProperty("enumeration_options")
  private final EnumerationOptionCollection enumerationOptions;

  /**
   * The collection of payments in the document.
   */
  @JsonProperty("payments")
  private final PaymentCollection payments;

  /**
   * The collection of integrations in the document.
   */
  @JsonProperty("integrations")
  private final IntegrationCollection integrations;

  /**
   * The collection of integration objects in the document.
   */
  @JsonProperty("integration_objects")
  private final IntegrationObjectCollection integrationObjects;

  /**
   * The collection of exported to information in the document.
   */
  @JsonProperty("exported_to")
  private final ExportedToCollection exportedTo;

  /**
   * The collection of radio buttons in the document.
   */
  @JsonProperty("radiobuttons")
  private final RadiobuttonCollection radiobuttons;

  /**
   * The collection of seals in the document.
   */
  @JsonProperty("seals")
  private final SealCollection seals;

  /**
   * The collection of checks in the document.
   */
  @JsonProperty("checks")
  private final CheckCollection checks;

  /**
   * The collection of texts in the document.
   */
  @JsonProperty("texts")
  private final TextCollection texts;

  /**
   * The collection of lines in the document.
   */
  @JsonProperty("lines")
  private final LineCollection lines;

  /**
   * The collection of attachments in the document.
   */
  @JsonProperty("attachments")
  private final AttachmentCollection attachments;

  /**
   * The collection of hyperlinks in the document.
   */
  @JsonProperty("hyperlinks")
  private final HyperlinkCollection hyperlinks;

  /**
   * The collection of requests in the document.
   */
  @JsonProperty("requests")
  private final RequestCollection requests;

  /**
   * The collection of inserts in the document.
   */
  @JsonProperty("inserts")
  private final InsertCollection inserts;

  /**
   * The collection of fields data in the document.
   */
  @JsonProperty("fields_data")
  private final FieldsDataCollection fieldsData;

  /**
   * The collection of field validators in the document.
   */
  @JsonProperty("field_validators")
  private final FieldValidatorCollection fieldValidators;

  /**
   * The collection of document group template info in the document.
   */
  @JsonProperty("document_group_template_info")
  private final DocumentGroupTemplateInfoCollection documentGroupTemplateInfo;

  /**
   * Constructs a new DocumentGetResponse with the specified details.
   *
   * @param id the unique identifier of the document
   * @param userId the unique identifier of the user who owns the document
   * @param documentName the name of the document
   * @param pageCount the count of pages in the document
   * @param created the timestamp when the document was created
   * @param updated the timestamp when the document was last updated
   * @param originalFilename the original filename of the document
   * @param owner the owner of the document
   * @param ownerName the name of the owner of the document
   * @param template a flag indicating if the document is a template
   * @param parentId the unique identifier of the parent document, if any
   * @param originatorLogo the logo of the originator of the document
   * @param pages the collection of pages in the document
   * @param versionTime the timestamp of the version of the document
   * @param routingDetails the collection of routing details of the document
   * @param thumbnail the thumbnail of the document
   * @param signatures the collection of signatures in the document
   * @param tags the collection of tags in the document
   * @param fields the collection of fields in the document
   * @param roles the collection of roles in the document
   * @param viewerRoles the collection of viewer roles in the document
   * @param signingSessionSettings the settings of the signing session of the document
   * @param originatorOrganizationSettings the collection of settings of the originator organization of the document
   * @param documentGroupInfo the information of the document group
   * @param settings the settings of the document
   * @param shareInfo the information of the share of the document
   * @param originUserId the unique identifier of the origin user of the document
   * @param originDocumentId the unique identifier of the origin document of the document
   * @param recentlyUsed the recently used information of the document
   * @param defaultFolder the default folder of the document
   * @param entityLabels the collection of entity labels in the document
   * @param fieldInvites the collection of field invites in the document
   * @param viewerFieldInvites the collection of viewer field invites in the document
   * @param enumerationOptions the collection of enumeration options in the document
   * @param payments the collection of payments in the document
   * @param integrations the collection of integrations in the document
   * @param integrationObjects the collection of integration objects in the document
   * @param exportedTo the collection of exported to information in the document
   * @param radiobuttons the collection of radio buttons in the document
   * @param seals the collection of seals in the document
   * @param checks the collection of checks in the document
   * @param texts the collection of texts in the document
   * @param lines the collection of lines in the document
   * @param attachments the collection of attachments in the document
   * @param hyperlinks the collection of hyperlinks in the document
   * @param requests the collection of requests in the document
   * @param inserts the collection of inserts in the document
   * @param fieldsData the collection of fields data in the document
   * @param fieldValidators the collection of field validators in the document
   * @param documentGroupTemplateInfo the collection of document group template info in the document
   */
  public DocumentGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("page_count") String pageCount,
      @JsonProperty("created") int created,
      @JsonProperty("updated") int updated,
      @JsonProperty("original_filename") String originalFilename,
      @JsonProperty("owner") String owner,
      @JsonProperty("owner_name") String ownerName,
      @JsonProperty("template") boolean template,
      @JsonProperty("parent_id") String parentId,
      @JsonProperty("originator_logo") String originatorLogo,
      @JsonProperty("pages") PageCollection pages,
      @JsonProperty("version_time") int versionTime,
      @JsonProperty("routing_details") RoutingDetailCollection routingDetails,
      @JsonProperty("thumbnail") Thumbnail thumbnail,
      @JsonProperty("signatures") SignatureCollection signatures,
      @JsonProperty("tags") TagCollection tags,
      @JsonProperty("fields") FieldCollection fields,
      @JsonProperty("roles") RoleCollection roles,
      @JsonProperty("viewer_roles") ViewerRoleCollection viewerRoles,
      @JsonProperty("signing_session_settings") SigningSessionSettings signingSessionSettings,
      @JsonProperty("originator_organization_settings")
          OriginatorOrganizationSettingsCollection originatorOrganizationSettings,
      @JsonProperty("document_group_info") DocumentGroupInfo documentGroupInfo,
      @JsonProperty("settings") Settings settings,
      @JsonProperty("share_info") ShareInfo shareInfo,
      @JsonProperty("origin_user_id") String originUserId,
      @JsonProperty("origin_document_id") String originDocumentId,
      @JsonProperty("recently_used") String recentlyUsed,
      @JsonProperty("default_folder") String defaultFolder,
      @JsonProperty("entity_labels") EntityLabelCollection entityLabels,
      @JsonProperty("field_invites") FieldInviteCollection fieldInvites,
      @JsonProperty("viewer_field_invites") ViewerFieldInviteCollection viewerFieldInvites,
      @JsonProperty("enumeration_options") EnumerationOptionCollection enumerationOptions,
      @JsonProperty("payments") PaymentCollection payments,
      @JsonProperty("integrations") IntegrationCollection integrations,
      @JsonProperty("integration_objects") IntegrationObjectCollection integrationObjects,
      @JsonProperty("exported_to") ExportedToCollection exportedTo,
      @JsonProperty("radiobuttons") RadiobuttonCollection radiobuttons,
      @JsonProperty("seals") SealCollection seals,
      @JsonProperty("checks") CheckCollection checks,
      @JsonProperty("texts") TextCollection texts,
      @JsonProperty("lines") LineCollection lines,
      @JsonProperty("attachments") AttachmentCollection attachments,
      @JsonProperty("hyperlinks") HyperlinkCollection hyperlinks,
      @JsonProperty("requests") RequestCollection requests,
      @JsonProperty("inserts") InsertCollection inserts,
      @JsonProperty("fields_data") FieldsDataCollection fieldsData,
      @JsonProperty("field_validators") FieldValidatorCollection fieldValidators,
      @JsonProperty("document_group_template_info")
          DocumentGroupTemplateInfoCollection documentGroupTemplateInfo) {
    this.id = id;
    this.userId = userId;
    this.documentName = documentName;
    this.pageCount = pageCount;
    this.created = created;
    this.updated = updated;
    this.originalFilename = originalFilename;
    this.owner = owner;
    this.ownerName = ownerName;
    this.template = template;
    this.parentId = parentId;
    this.originatorLogo = originatorLogo;
    this.pages = pages;
    this.versionTime = versionTime;
    this.routingDetails = routingDetails;
    this.thumbnail = thumbnail;
    this.signatures = signatures;
    this.tags = tags;
    this.fields = fields;
    this.roles = roles;
    this.viewerRoles = viewerRoles;
    this.signingSessionSettings = signingSessionSettings;
    this.originatorOrganizationSettings = originatorOrganizationSettings;
    this.documentGroupInfo = documentGroupInfo;
    this.settings = settings;
    this.shareInfo = shareInfo;
    this.originUserId = originUserId;
    this.originDocumentId = originDocumentId;
    this.recentlyUsed = recentlyUsed;
    this.defaultFolder = defaultFolder;
    this.entityLabels = entityLabels;
    this.fieldInvites = fieldInvites;
    this.viewerFieldInvites = viewerFieldInvites;
    this.enumerationOptions = enumerationOptions;
    this.payments = payments;
    this.integrations = integrations;
    this.integrationObjects = integrationObjects;
    this.exportedTo = exportedTo;
    this.radiobuttons = radiobuttons;
    this.seals = seals;
    this.checks = checks;
    this.texts = texts;
    this.lines = lines;
    this.attachments = attachments;
    this.hyperlinks = hyperlinks;
    this.requests = requests;
    this.inserts = inserts;
    this.fieldsData = fieldsData;
    this.fieldValidators = fieldValidators;
    this.documentGroupTemplateInfo = documentGroupTemplateInfo;
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
   * Returns the count of pages in the document.
   *
   * @return the count of pages in the document
   */
  public String getPageCount() {
    return this.pageCount;
  }

  /**
   * Returns the timestamp when the document was created.
   *
   * @return the timestamp when the document was created
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the timestamp when the document was last updated.
   *
   * @return the timestamp when the document was last updated
   */
  public int getUpdated() {
    return this.updated;
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
   * Returns the unique identifier of the origin user of the document.
   *
   * @return the unique identifier of the origin user of the document
   */
  public String getOriginUserId() {
    return this.originUserId;
  }

  /**
   * Returns the unique identifier of the origin document of the document.
   *
   * @return the unique identifier of the origin document of the document
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
   * Returns the name of the owner of the document.
   *
   * @return the name of the owner of the document
   */
  public String getOwnerName() {
    return this.ownerName;
  }

  /**
   * Returns a flag indicating if the document is a template.
   *
   * @return a flag indicating if the document is a template
   */
  public boolean isTemplate() {
    return this.template;
  }

  /**
   * Returns the unique identifier of the parent document, if any.
   *
   * @return the unique identifier of the parent document, if any
   */
  public String getParentId() {
    return this.parentId;
  }

  /**
   * Returns the recently used information of the document.
   *
   * @return the recently used information of the document
   */
  public String getRecentlyUsed() {
    return this.recentlyUsed;
  }

  /**
   * Returns the logo of the originator of the document.
   *
   * @return the logo of the originator of the document
   */
  public String getOriginatorLogo() {
    return this.originatorLogo;
  }

  /**
   * Returns the collection of pages in the document.
   *
   * @return the collection of pages in the document
   */
  public PageCollection getPages() {
    return this.pages;
  }

  /**
   * Returns the default folder of the document.
   *
   * @return the default folder of the document
   */
  public String getDefaultFolder() {
    return this.defaultFolder;
  }

  /**
   * Returns the collection of entity labels in the document.
   *
   * @return the collection of entity labels in the document
   */
  public EntityLabelCollection getEntityLabels() {
    return this.entityLabels;
  }

  /**
   * Returns the timestamp of the version of the document.
   *
   * @return the timestamp of the version of the document
   */
  public int getVersionTime() {
    return this.versionTime;
  }

  /**
   * Returns the collection of routing details of the document.
   *
   * @return the collection of routing details of the document
   */
  public RoutingDetailCollection getRoutingDetails() {
    return this.routingDetails;
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
   * Returns the collection of signatures in the document.
   *
   * @return the collection of signatures in the document
   */
  public SignatureCollection getSignatures() {
    return this.signatures;
  }

  /**
   * Returns the collection of tags in the document.
   *
   * @return the collection of tags in the document
   */
  public TagCollection getTags() {
    return this.tags;
  }

  /**
   * Returns the collection of fields in the document.
   *
   * @return the collection of fields in the document
   */
  public FieldCollection getFields() {
    return this.fields;
  }

  /**
   * Returns the collection of roles in the document.
   *
   * @return the collection of roles in the document
   */
  public RoleCollection getRoles() {
    return this.roles;
  }

  /**
   * Returns the collection of viewer roles in the document.
   *
   * @return the collection of viewer roles in the document
   */
  public ViewerRoleCollection getViewerRoles() {
    return this.viewerRoles;
  }

  /**
   * Returns the collection of field invites in the document.
   *
   * @return the collection of field invites in the document
   */
  public FieldInviteCollection getFieldInvites() {
    return this.fieldInvites;
  }

  /**
   * Returns the collection of viewer field invites in the document.
   *
   * @return the collection of viewer field invites in the document
   */
  public ViewerFieldInviteCollection getViewerFieldInvites() {
    return this.viewerFieldInvites;
  }

  /**
   * Returns the signing session settings.
   *
   * @return the signing session settings
   */
  public SigningSessionSettings getSigningSessionSettings() {
    return this.signingSessionSettings;
  }

  /**
   * Returns the collection of enumeration options in the document.
   *
   * @return the collection of enumeration options in the document
   */
  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  /**
   * Returns the collection of payments in the document.
   *
   * @return the collection of payments in the document
   */
  public PaymentCollection getPayments() {
    return this.payments;
  }

  /**
   * Returns the collection of integrations (smart objects) in the document.
   *
   * @return the collection of integrations (smart objects) in the document
   */
  public IntegrationCollection getIntegrations() {
    return this.integrations;
  }

  /**
   * Returns the collection of integration objects.
   *
   * @return the collection of integration objects
   */
  public IntegrationObjectCollection getIntegrationObjects() {
    return this.integrationObjects;
  }

  /**
   * Returns the collection of exported to information in the document.
   *
   * @return the collection of exported to information in the document
   */
  public ExportedToCollection getExportedTo() {
    return this.exportedTo;
  }

  /**
   * Returns the collection of radio buttons in the document.
   *
   * @return the collection of radio buttons in the document
   */
  public RadiobuttonCollection getRadiobuttons() {
    return this.radiobuttons;
  }

  /**
   * Returns the collection of seals.
   *
   * @return the collection of seals
   */
  public SealCollection getSeals() {
    return this.seals;
  }

  /**
   * Returns the collection of check buttons in the document.
   *
   * @return the collection of check buttons in the document
   */
  public CheckCollection getChecks() {
    return this.checks;
  }

  /**
   * Returns the collection of text fields in the document.
   *
   * @return the collection of text fields in the document
   */
  public TextCollection getTexts() {
    return this.texts;
  }

  /**
   * Returns the collection of lines in the document.
   *
   * @return the collection of lines in the document
   */
  public LineCollection getLines() {
    return this.lines;
  }

  /**
   * Returns the collection of attachments to the document.
   *
   * @return the collection of attachments to the document
   */
  public AttachmentCollection getAttachments() {
    return this.attachments;
  }

  /**
   * Returns the collection of hyperlinks in the document.
   *
   * @return the collection of hyperlinks  in the document
   */
  public HyperlinkCollection getHyperlinks() {
    return this.hyperlinks;
  }

  /**
   * Returns the collection of requests.
   *
   * @return the collection of requests
   */
  public RequestCollection getRequests() {
    return this.requests;
  }

  /**
   * Returns the collection of inserts.
   *
   * @return the collection of inserts
   */
  public InsertCollection getInserts() {
    return this.inserts;
  }

  /**
   * Returns the collection of fields data.
   *
   * @return the collection of fields data
   */
  public FieldsDataCollection getFieldsData() {
    return this.fieldsData;
  }

  /**
   * Returns the collection of fields validators.
   *
   * @return the collection of fields validators
   */
  public FieldValidatorCollection getFieldValidators() {
    return this.fieldValidators;
  }

  /**
   * Returns collection of settings of the originator organization of the document.
   *
   * @return collection of settings of the originator organization of the document
   */
  public OriginatorOrganizationSettingsCollection getOriginatorOrganizationSettings() {
    return this.originatorOrganizationSettings;
  }

  /**
   * Returns the document group information
   *
   * @return the document group information
   */
  public DocumentGroupInfo getDocumentGroupInfo() {
    return this.documentGroupInfo;
  }

  /**
   * Returns the collection of document group template information.
   *
   * @return the collection of document group template information
   */
  public DocumentGroupTemplateInfoCollection getDocumentGroupTemplateInfo() {
    return this.documentGroupTemplateInfo;
  }

  /**
   * Returns the document settings.
   *
   * @return the document settings
   */
  public Settings getSettings() {
    return this.settings;
  }

  /**
   * Returns the information of the share of the document.
   *
   * @return the information of the share of the document
   */
  public ShareInfo getShareInfo() {
    return this.shareInfo;
  }
}
