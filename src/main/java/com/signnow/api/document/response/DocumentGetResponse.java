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

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGetResponse {

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

  @JsonProperty("owner_name")
  private final String ownerName;

  @JsonProperty("template")
  private final boolean template;

  @JsonProperty("parent_id")
  private final String parentId;

  @JsonProperty("originator_logo")
  private final String originatorLogo;

  @JsonProperty("pages")
  private final PageCollection pages;

  @JsonProperty("version_time")
  private final int versionTime;

  @JsonProperty("routing_details")
  private final RoutingDetailCollection routingDetails;

  @JsonProperty("thumbnail")
  private final Thumbnail thumbnail;

  @JsonProperty("signatures")
  private final SignatureCollection signatures;

  @JsonProperty("tags")
  private final TagCollection tags;

  @JsonProperty("fields")
  private final FieldCollection fields;

  @JsonProperty("roles")
  private final RoleCollection roles;

  @JsonProperty("viewer_roles")
  private final ViewerRoleCollection viewerRoles;

  @JsonProperty("signing_session_settings")
  private final SigningSessionSettings signingSessionSettings;

  @JsonProperty("originator_organization_settings")
  private final OriginatorOrganizationSettingsCollection originatorOrganizationSettings;

  @JsonProperty("document_group_info")
  private final DocumentGroupInfo documentGroupInfo;

  @JsonProperty("settings")
  private final Settings settings;

  @JsonProperty("share_info")
  private final ShareInfo shareInfo;

  @JsonProperty("origin_user_id")
  private final String originUserId;

  @JsonProperty("origin_document_id")
  private final String originDocumentId;

  @JsonProperty("recently_used")
  private final String recentlyUsed;

  @JsonProperty("default_folder")
  private final String defaultFolder;

  @JsonProperty("entity_labels")
  private final EntityLabelCollection entityLabels;

  @JsonProperty("field_invites")
  private final FieldInviteCollection fieldInvites;

  @JsonProperty("viewer_field_invites")
  private final ViewerFieldInviteCollection viewerFieldInvites;

  @JsonProperty("enumeration_options")
  private final EnumerationOptionCollection enumerationOptions;

  @JsonProperty("payments")
  private final PaymentCollection payments;

  @JsonProperty("integrations")
  private final IntegrationCollection integrations;

  @JsonProperty("integration_objects")
  private final IntegrationObjectCollection integrationObjects;

  @JsonProperty("exported_to")
  private final ExportedToCollection exportedTo;

  @JsonProperty("radiobuttons")
  private final RadiobuttonCollection radiobuttons;

  @JsonProperty("seals")
  private final SealCollection seals;

  @JsonProperty("checks")
  private final CheckCollection checks;

  @JsonProperty("texts")
  private final TextCollection texts;

  @JsonProperty("lines")
  private final LineCollection lines;

  @JsonProperty("attachments")
  private final AttachmentCollection attachments;

  @JsonProperty("hyperlinks")
  private final HyperlinkCollection hyperlinks;

  @JsonProperty("requests")
  private final RequestCollection requests;

  @JsonProperty("inserts")
  private final InsertCollection inserts;

  @JsonProperty("fields_data")
  private final FieldsDataCollection fieldsData;

  @JsonProperty("field_validators")
  private final FieldValidatorCollection fieldValidators;

  @JsonProperty("document_group_template_info")
  private final DocumentGroupTemplateInfoCollection documentGroupTemplateInfo;

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

  public String getOriginUserId() {
    return this.originUserId;
  }

  public String getOriginDocumentId() {
    return this.originDocumentId;
  }

  public String getOwner() {
    return this.owner;
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  public boolean isTemplate() {
    return this.template;
  }

  public String getParentId() {
    return this.parentId;
  }

  public String getRecentlyUsed() {
    return this.recentlyUsed;
  }

  public String getOriginatorLogo() {
    return this.originatorLogo;
  }

  public PageCollection getPages() {
    return this.pages;
  }

  public String getDefaultFolder() {
    return this.defaultFolder;
  }

  public EntityLabelCollection getEntityLabels() {
    return this.entityLabels;
  }

  public int getVersionTime() {
    return this.versionTime;
  }

  public RoutingDetailCollection getRoutingDetails() {
    return this.routingDetails;
  }

  public Thumbnail getThumbnail() {
    return this.thumbnail;
  }

  public SignatureCollection getSignatures() {
    return this.signatures;
  }

  public TagCollection getTags() {
    return this.tags;
  }

  public FieldCollection getFields() {
    return this.fields;
  }

  public RoleCollection getRoles() {
    return this.roles;
  }

  public ViewerRoleCollection getViewerRoles() {
    return this.viewerRoles;
  }

  public FieldInviteCollection getFieldInvites() {
    return this.fieldInvites;
  }

  public ViewerFieldInviteCollection getViewerFieldInvites() {
    return this.viewerFieldInvites;
  }

  public SigningSessionSettings getSigningSessionSettings() {
    return this.signingSessionSettings;
  }

  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  public PaymentCollection getPayments() {
    return this.payments;
  }

  public IntegrationCollection getIntegrations() {
    return this.integrations;
  }

  public IntegrationObjectCollection getIntegrationObjects() {
    return this.integrationObjects;
  }

  public ExportedToCollection getExportedTo() {
    return this.exportedTo;
  }

  public RadiobuttonCollection getRadiobuttons() {
    return this.radiobuttons;
  }

  public SealCollection getSeals() {
    return this.seals;
  }

  public CheckCollection getChecks() {
    return this.checks;
  }

  public TextCollection getTexts() {
    return this.texts;
  }

  public LineCollection getLines() {
    return this.lines;
  }

  public AttachmentCollection getAttachments() {
    return this.attachments;
  }

  public HyperlinkCollection getHyperlinks() {
    return this.hyperlinks;
  }

  public RequestCollection getRequests() {
    return this.requests;
  }

  public InsertCollection getInserts() {
    return this.inserts;
  }

  public FieldsDataCollection getFieldsData() {
    return this.fieldsData;
  }

  public FieldValidatorCollection getFieldValidators() {
    return this.fieldValidators;
  }

  public OriginatorOrganizationSettingsCollection getOriginatorOrganizationSettings() {
    return this.originatorOrganizationSettings;
  }

  public DocumentGroupInfo getDocumentGroupInfo() {
    return this.documentGroupInfo;
  }

  public DocumentGroupTemplateInfoCollection getDocumentGroupTemplateInfo() {
    return this.documentGroupTemplateInfo;
  }

  public Settings getSettings() {
    return this.settings;
  }

  public ShareInfo getShareInfo() {
    return this.shareInfo;
  }
}
