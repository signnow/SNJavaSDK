/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.mock.faker;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.signnow.api.document.request.data.*;
import com.signnow.api.document.request.data.Signature;
import com.signnow.api.document.request.data.line.ControlPointCollection;
import com.signnow.api.document.request.data.line.Line;
import com.signnow.api.document.request.data.line.LineCollection;
import com.signnow.api.document.request.data.radiobutton.RadiobuttonCollection;
import com.signnow.api.document.request.data.tag.Tag;
import com.signnow.api.document.request.data.tag.TagCollection;
import com.signnow.api.documentfield.request.data.Field;
import com.signnow.api.documentfield.request.data.FieldCollection;
import com.signnow.api.documentgroup.request.data.DocumentOrderCollection;
import com.signnow.api.documentgroupinvite.request.data.CompletionEmail;
import com.signnow.api.documentgroupinvite.request.data.CompletionEmailCollection;
import com.signnow.api.documentgroupinvite.request.data.UpdateInviteActionAttribute;
import com.signnow.api.documentgroupinvite.request.data.UpdateInviteActionAttributeCollection;
import com.signnow.api.documentgroupinvite.request.data.invitestep.*;
import com.signnow.api.documentinvite.request.data.*;
import com.signnow.api.documentinvite.request.data.EmailGroup;
import com.signnow.api.documentinvite.request.data.emailgroup.Email;
import com.signnow.api.documentinvite.request.data.emailgroup.EmailCollection;
import com.signnow.api.documentinvite.request.data.emailgroup.EmailGroupCollection;
import com.signnow.api.embeddedinvite.request.data.Authentication;
import com.signnow.api.embeddedinvite.request.data.Invite;
import com.signnow.api.embeddedinvite.request.data.InviteCollection;
import com.signnow.api.template.request.data.*;
import com.signnow.api.template.request.data.routingdetail.RoutingDetail;
import com.signnow.api.webhook.request.data.Attribute;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import net.datafaker.Faker;

/**
 * This class generates fake values for commonly used data in signNow APIs.
 * These data are required to construct requests for testing purpose.
 */
public class SignNowFaker {
  private final Faker dataFaker;

  public SignNowFaker(Faker faker) {
    dataFaker = faker;
  }

  public String uid() {
    return dataFaker.regexify("[0-9a-f]{40}");
  }

  public String documentId() {
    return this.uid();
  }

  public String documentGroupId() {
    return this.uid();
  }

  public String folderId() {
    return this.uid();
  }

  public String templateId() {
    return this.uid();
  }

  public String eventSubscriptionId() {
    return this.uid();
  }

  public String callbackId() {
    return this.uid();
  }

  public String entityId() {
    return this.uid();
  }

  public String fieldInviteId() {
    return this.uid();
  }

  public String inviteId() {
    return this.uid();
  }

  public String stepId() {
    return this.uid();
  }

  public String embeddedInviteId() {
    return this.uid();
  }

  public String documentName() {
    return "document_" + this.name();
  }

  public String name() {
    return dataFaker.name().fullName();
  }

  public String event() {
    return "document.created";
  }

  public String email() {
    return dataFaker.internet().emailAddress();
  }

  public String url() {
    return dataFaker.internet().url();
  }

  public String redirectUri() {
    return this.url() + "/redirect";
  }

  public String closeRedirectUri() {
    return this.url() + "/close";
  }

  public String declineRedirectUri() {
    return this.url() + "/decline";
  }

  public String phone() {
    return this.dataFaker.phoneNumber().cellPhone();
  }

  public String from() {
    return this.email();
  }

  public String to() {
    return this.email();
  }

  public int order(int value) {
    return value;
  }

  public String userToUpdate() {
    return this.email();
  }

  public String replaceWithThisUser() {
    return this.email();
  }

  public String username() {
    return dataFaker.name().username();
  }

  public String password() {
    return dataFaker.internet().password();
  }

  public String oldPassword() {
    return "_" + this.password();
  }

  public String scope() {
    return "*";
  }

  public String grantType(String type) {
    return type;
  }

  public String code() {
    return this.string();
  }

  public String data() {
    return this.string();
  }

  public int forceNewSignature(int value) {
    return value;
  }

  public int expirationDays() {
    return 30;
  }

  public String expirationTime() {
    return "129500";
  }

  public com.signnow.api.documentgroupinvite.request.data.invitestep.EmailGroup
      documentGroupEmailGroup() {
    return new com.signnow.api.documentgroupinvite.request.data.invitestep.EmailGroup(this.name());
  }

  public String firstName() {
    return this.dataFaker.name().firstName();
  }

  public String lastName() {
    return this.dataFaker.name().lastName();
  }

  public String token() {
    return dataFaker.regexify("[0-9a-f]{64}");
  }

  public String refreshToken() {
    return this.token();
  }

  public String verificationToken() {
    return this.token();
  }

  public int saveFields() {
    return 0;
  }

  public int makeTemplate() {
    return 0;
  }

  public String originTemplateId() {
    return this.uid();
  }

  public String role(String suffix) {
    return "Signer" + suffix;
  }

  public String role() {
    return this.role("1");
  }

  public String actionSign() {
    return "sign";
  }

  public String actionView() {
    return "view";
  }

  public String action() {
    return this.dataFaker.random().nextBoolean() ? this.actionSign() : actionView();
  }

  public String subject() {
    return "Please, sign the document";
  }

  public String ccSubject() {
    return "Invitation sent";
  }

  public String emailMessage() {
    return "I hope this message finds you well.";
  }

  public String smsMessage() {
    return "Signing invites might be fun.";
  }

  public String phoneMessage() {
    return "Signing invites with mobiles might be fun.";
  }

  public String message() {
    return "Please let me know if you need any further information.";
  }

  public String ccMessage() {
    return "I am glad to inform you all your company problems are solved.";
  }

  public String authMethod() {
    return dataFaker
        .options()
        .option(
            this.authMethodEmail(),
            this.authMethodMfa(),
            this.authMethodPassword(),
            this.authMethodSocial(),
            this.authMethodBiometric(),
            this.authMethodNone());
  }

  public String authType() {
    return "authy";
  }

  public String authMethodEmail() {
    return "email";
  }

  public String authMethodSms() {
    return "sms";
  }

  public String authMethodMfa() {
    return "mfa";
  }

  public String authMethodSocial() {
    return "social";
  }

  public String authMethodBiometric() {
    return "biometric";
  }

  public String authMethodPassword() {
    return "password";
  }

  public String authMethodNone() {
    return "none";
  }

  public String authSmsMessage() {
    return "Your authentication message";
  }

  public int reminder() {
    return 5;
  }

  public int disableDocumentAttachment() {
    return 0;
  }

  public int linkExpiration() {
    return 40;
  }

  public String nameFormula() {
    return this.string();
  }

  public String reason() {
    return this.dataFaker.lorem().sentence();
  }

  public String groupName() {
    return this.string();
  }

  public String templateGroupName() {
    return this.string();
  }

  public String logoutAll() {
    return this.string();
  }

  public String type() {
    return this.string();
  }

  public String parseType() {
    return this.string();
  }

  public String withHistory() {
    return this.dataFaker.random().nextBoolean() ? "yes" : "no";
  }

  public String string() {
    return dataFaker.lorem().word();
  }

  public String emptyString() {
    return "";
  }

  public String stringValue(String v) {
    return v;
  }

  public String number() {
    return dataFaker.number().toString();
  }

  public int checked(int n) {
    return n;
  }

  public String secretKey() {
    return this.dataFaker.hashing().md5();
  }

  public String language() {
    return dataFaker.options().option("en", "es", "fr");
  }

  public String redirectTarget() {
    return dataFaker.options().option("blank", "self");
  }

  public boolean booleanValue() {
    return dataFaker.bool().bool();
  }

  public String color() {
    return dataFaker.color().hex();
  }

  public String dataImageBase64() {
    InputStream imgStream = getClass().getClassLoader().getResourceAsStream("files/demo.png");
    String content;

    assertNotNull(imgStream, "Resource file 'files/demo.png' not found");

    try {
      content = java.util.Base64.getEncoder().encodeToString(imgStream.readAllBytes());
    } catch (IOException e) {
      content = "";
    }

    return "data:image/png;base64," + content;
  }

  public String callbackUrl() {
    return this.url();
  }

  public int clientTimestamp() {
    return (int) (System.currentTimeMillis() / 1000L);
  }

  public String clientTimestampString() {
    return Integer.toString(this.clientTimestamp());
  }

  public File file() {
    URL resourceUrl = getClass().getClassLoader().getResource("files/demo.pdf");
    if (resourceUrl == null) {
      throw new RuntimeException("Resource files/demo.pdf not found.");
    }
    return new File(resourceUrl.getPath());
  }

  public String fontArial() {
    return "Arial";
  }

  public String textFieldType() {
    return "text";
  }

  public String checkFieldType() {
    return "check";
  }

  public String textTagType() {
    return "text";
  }

  public String subTypeLine() {
    return "line";
  }

  public String subTypeRadioButton() {
    return "radiobutton";
  }

  public int x(int x) {
    return x;
  }

  public int y(int y) {
    return y;
  }

  public int width(int w) {
    return w;
  }

  public int height(int h) {
    return h;
  }

  public int size(int s) {
    return s;
  }

  public int pageNumber(int n) {
    return n;
  }

  public boolean required() {
    return true;
  }

  public TagCollection documentFieldExtractTags() {
    TagCollection tags = new TagCollection();
    tags.add(
        new Tag(
            this.textTagType(),
            this.x(100),
            this.y(100),
            this.pageNumber(0),
            this.role("Signer"),
            this.booleanValue(),
            this.width(100),
            this.height(16),
            this.name(),
            this.name(),
            this.name()));
    return tags;
  }

  public com.signnow.api.document.request.data.FieldCollection documentFields() {
    var fields = new com.signnow.api.document.request.data.FieldCollection();
    fields.add(
        new com.signnow.api.document.request.data.Field(
            this.x(100),
            this.y(150),
            this.width(10),
            this.height(15),
            this.textFieldType(),
            this.pageNumber(0),
            this.required(),
            this.role("Signer"),
            this.name(),
            this.name()));
    return fields;
  }

  public DocumentIdCollection documentDocumentMergeDocumentIds(int count) {
    DocumentIdCollection ids = new DocumentIdCollection();
    for (int i = 1; i <= count; i++) {
      ids.add(this.documentId());
    }
    return ids;
  }

  public DocumentIdCollection documentDocumentMergeDocumentIds() {
    return documentDocumentMergeDocumentIds(2);
  }

  public DeactivateElementCollection documentDeactivateElements() {
    DeactivateElementCollection toDeactivate = new DeactivateElementCollection();
    toDeactivate.add(new DeactivateElement(this.textFieldType(), this.uid()));
    toDeactivate.add(new DeactivateElement(this.checkFieldType(), this.uid()));
    return toDeactivate;
  }

  public LineCollection documentLines() {
    LineCollection lines = new LineCollection();
    ControlPointCollection controlPoints = new ControlPointCollection();
    controlPoints.add(10.0F);
    controlPoints.add(20.5F);
    lines.add(
        new Line(
            this.x(100),
            this.y(100),
            this.width(10),
            this.height(15),
            this.subTypeLine(),
            this.pageNumber(0),
            this.color(),
            this.width(2),
            controlPoints));
    return lines;
  }

  public CheckCollection documentChecks() {
    CheckCollection checks = new CheckCollection();
    checks.add(
        new Check(
            this.x(100),
            this.y(150),
            this.width(10),
            this.height(15),
            this.checkFieldType(),
            this.pageNumber(0)));
    return checks;
  }

  public RadiobuttonCollection documentRadiobuttons() {
    RadiobuttonCollection radiobuttons = new RadiobuttonCollection();
    var radios = new com.signnow.api.document.request.data.radiobutton.RadioCollection();
    radios.add(
        new com.signnow.api.document.request.data.radiobutton.Radio(
            this.x(100),
            this.y(150),
            this.width(10),
            this.height(15),
            this.stringValue("yes"),
            this.checked(0),
            this.pageNumber(0)));
    radiobuttons.add(
        new com.signnow.api.document.request.data.radiobutton.Radiobutton(
            this.pageNumber(0),
            this.x(100),
            this.y(150),
            this.height(3),
            0,
            0,
            this.size(10),
            this.subTypeRadioButton(),
            "radiobutton_1",
            this.fontArial(),
            radios,
            this.uid()));
    return radiobuttons;
  }

  public SignatureCollection documentSignatures() {
    SignatureCollection signatures = new SignatureCollection();
    signatures.add(
        new Signature(
            this.x(100),
            this.y(150),
            this.width(10),
            this.height(15),
            this.pageNumber(0),
            this.dataImageBase64()));
    return signatures;
  }

  public TextCollection documentTexts() {
    TextCollection texts = new TextCollection();
    texts.add(
        new Text(
            this.x(100),
            this.y(150),
            this.size(20),
            this.width(10),
            this.height(15),
            this.textFieldType(),
            this.pageNumber(0),
            "Text",
            this.fontArial(),
            this.height(3),
            this.uid()));
    return texts;
  }

  public AttachmentCollection documentAttachments() {
    AttachmentCollection attachments = new AttachmentCollection();
    attachments.add(new Attachment(this.uid(), this.uid()));
    return attachments;
  }

  public HyperlinkCollection documentHyperlinks() {
    HyperlinkCollection hyperlinks = new HyperlinkCollection();
    hyperlinks.add(
        new Hyperlink(
            this.x(100),
            this.y(150),
            this.size(3),
            this.width(10),
            this.height(15),
            this.pageNumber(0),
            this.fontArial(),
            this.height(3),
            this.uid()));
    return hyperlinks;
  }

  public IntegrationObjectCollection documentIntegrationObjects() {
    IntegrationObjectCollection integrationObjects = new IntegrationObjectCollection();
    integrationObjects.add(
        new IntegrationObject(
            this.x(100),
            this.y(150),
            this.size(20),
            this.width(10),
            this.height(15),
            this.pageNumber(0),
            this.fontArial(),
            "Integration Object",
            1,
            this.color(),
            this.clientTimestamp(),
            true,
            this.height(3)));
    return integrationObjects;
  }

  public com.signnow.api.smartfields.request.data.DataCollection
      smartFieldsDocumentPrefillSmartFieldData() {
    var data = new com.signnow.api.smartfields.request.data.DataCollection();
    data.add(new com.signnow.api.smartfields.request.data.Data("to be inserted into smart field"));
    return data;
  }

  public FieldCollection documentFieldDocumentPrefillFields() {
    var data = new FieldCollection();

    data.add(new Field("field_1", "prefilled text"));

    return data;
  }

  public ToCollection documentInviteSendInviteTo() {
    ToCollection to = new ToCollection();
    to.add(
        new To(
            this.email(),
            this.uid(),
            this.role(),
            this.order(1),
            this.subject(),
            this.emailMessage(),
            new EmailGroup(this.name()),
            this.name(),
            this.name(),
            this.forceNewSignature(1),
            this.string(),
            this.string(),
            this.reminder(),
            this.expirationDays(),
            this.authType(),
            this.password(),
            this.phone(),
            this.smsMessage(),
            this.authMethodSms(),
            this.authSmsMessage(),
            this.redirectUri(),
            this.declineRedirectUri(),
            this.closeRedirectUri(),
            this.redirectTarget(),
            this.language(),
            new com.signnow.api.documentinvite.request.data.Signature(this.name())));
    return to;
  }

  public EmailGroupCollection documentInviteSendInviteEmailGroups() {
    EmailGroupCollection emailGroups = new EmailGroupCollection();

    EmailCollection emails = new EmailCollection();
    emails.add(new Email(this.email()));
    emails.add(new Email(this.email()));

    emailGroups.add(
        new com.signnow.api.documentinvite.request.data.emailgroup.EmailGroup(
            this.uid(), this.name(), emails));

    return emailGroups;
  }

  public CcStepCollection documentInviteSendInviteCcStep() {
    CcStepCollection ccSteps = new CcStepCollection();
    ccSteps.add(new CcStep(this.name(), this.email(), 1));
    ccSteps.add(new CcStep(this.name(), this.email(), 2));
    return ccSteps;
  }

  public CcCollection documentInviteSendInviteCc() {
    CcCollection cc = new CcCollection();
    cc.add(this.email());
    cc.add(this.email());
    return cc;
  }

  public ViewerCollection documentInviteSendInviteViewers() {
    ViewerCollection viewers = new ViewerCollection();
    viewers.add(
        new Viewer(
            this.email(),
            this.role(),
            this.order(1),
            this.subject(),
            this.message(),
            this.closeRedirectUri(),
            this.redirectTarget()));
    return viewers;
  }

  public CcCollection documentInviteFreeFormInviteCc() {
    return this.documentInviteSendInviteCc();
  }

  public InviteCollection embeddedInviteDocumentInviteInvites() {
    InviteCollection invites = new InviteCollection();
    invites.add(
        new Invite(
            this.email(),
            this.uid(),
            this.order(1),
            this.authMethod(),
            this.language(),
            this.firstName(),
            this.lastName(),
            this.string(),
            this.emptyString(),
            this.forceNewSignature(0),
            this.redirectUri(),
            this.declineRedirectUri(),
            this.redirectTarget(),
            new Authentication(
                this.authType(),
                this.password(),
                this.authMethod(),
                this.phone(),
                this.phoneMessage())));
    return invites;
  }

  public com.signnow.api.documentgroup.request.data.DocumentIdCollection
      documentGroupDocumentIds() {
    var ids = new com.signnow.api.documentgroup.request.data.DocumentIdCollection();
    ids.add(this.documentId());
    ids.add(this.documentId());
    return ids;
  }

  public DocumentOrderCollection documentGroupDownloadDocumentGroupDocumentOrder() {
    var groupOrder = new DocumentOrderCollection();
    groupOrder.add(this.documentId());
    groupOrder.add(this.documentId());
    return groupOrder;
  }

  public InviteStepCollection documentGroupInviteGroupInviteInviteSteps() {
    InviteActionCollection actions = new InviteActionCollection();
    actions.add(new InviteAction(this.email(), this.role(), this.actionSign(), this.documentId()));

    InviteEmailCollection emails = new InviteEmailCollection();
    emails.add(
        new InviteEmail(
            this.email(),
            this.subject(),
            this.message(),
            this.documentGroupEmailGroup(),
            this.expirationDays(),
            this.reminder()));

    InviteStepCollection steps = new InviteStepCollection();
    steps.add(new InviteStep(this.order(1), actions, emails));
    return steps;
  }

  public com.signnow.api.documentgroupinvite.request.data.CcCollection
      documentGroupInviteGroupInviteCc() {
    var cc = new com.signnow.api.documentgroupinvite.request.data.CcCollection();
    cc.add(this.email());
    return cc;
  }

  public com.signnow.api.documentgroupinvite.request.data.emailgroup.EmailGroupCollection
      documentGroupInviteGroupInviteEmailGroups() {
    var emails = new com.signnow.api.documentgroupinvite.request.data.emailgroup.EmailCollection();
    emails.add(new com.signnow.api.documentgroupinvite.request.data.emailgroup.Email(this.email()));

    var emailGroups =
        new com.signnow.api.documentgroupinvite.request.data.emailgroup.EmailGroupCollection();
    emailGroups.add(
        new com.signnow.api.documentgroupinvite.request.data.emailgroup.EmailGroup(
            this.uid(), this.name(), emails));
    return emailGroups;
  }

  public CompletionEmailCollection documentGroupInviteGroupInviteCompletionEmails() {
    CompletionEmailCollection completions = new CompletionEmailCollection();
    completions.add(
        new CompletionEmail(
            this.email(), this.disableDocumentAttachment(), this.subject(), this.message()));
    return completions;
  }

  public com.signnow.api.documentgroupinvite.request.data.InviteEmail
      documentGroupInviteReassignSignerInviteEmail() {
    return new com.signnow.api.documentgroupinvite.request.data.InviteEmail(
        this.email(), this.expirationDays(), this.reminder());
  }

  public UpdateInviteActionAttributeCollection
      documentGroupInviteReassignSignerUpdateInviteActionAttributes() {
    UpdateInviteActionAttributeCollection attributes = new UpdateInviteActionAttributeCollection();
    attributes.add(new UpdateInviteActionAttribute(this.documentId()));
    return attributes;
  }

  public com.signnow.api.embeddedgroupinvite.request.data.invite.InviteCollection
      embeddedGroupInviteGroupInviteInvites() {
    var documents =
        new com.signnow.api.embeddedgroupinvite.request.data.invite.DocumentCollection();
    documents.add(
        new com.signnow.api.embeddedgroupinvite.request.data.invite.Document(
            this.documentId(), this.role(), this.actionSign()));

    var signers = new com.signnow.api.embeddedgroupinvite.request.data.invite.SignerCollection();
    signers.add(
        new com.signnow.api.embeddedgroupinvite.request.data.invite.Signer(
            this.email(), this.authMethod(), documents, this.firstName(), this.lastName(),
            this.language(), this.string(), this.redirectUri(), this.declineRedirectUri(),
            this.redirectTarget(), this.string()));

    var embeddedGroupInvites =
        new com.signnow.api.embeddedgroupinvite.request.data.invite.InviteCollection();
    embeddedGroupInvites.add(
        new com.signnow.api.embeddedgroupinvite.request.data.invite.Invite(this.order(1), signers));
    return embeddedGroupInvites;
  }

  public RoutingDetail templateGroupTemplateRoutingDetails() {
    var actions = new com.signnow.api.template.request.data.routingdetail.InviteActionCollection();
    actions.add(
        new com.signnow.api.template.request.data.routingdetail.InviteAction(
            this.email(), this.role(), this.actionSign(), this.documentId(), this.documentName()));
    var steps = new com.signnow.api.template.request.data.routingdetail.InviteStepCollection();
    steps.add(
        new com.signnow.api.template.request.data.routingdetail.InviteStep(this.order(1), actions));
    return new RoutingDetail(steps);
  }

  public TemplateIdsToAddCollection templateGroupTemplateTemplateIdsToAdd() {
    TemplateIdsToAddCollection ids = new TemplateIdsToAddCollection();
    ids.add(this.documentId());
    return ids;
  }

  public TemplateIdsToRemoveCollection templateGroupTemplateTemplateIdsToRemove() {
    return new TemplateIdsToRemoveCollection();
  }

  public TemplateDataPut templateRoutingDetailsTemplateData() {
    return new TemplateDataPut(this.booleanValue(), this.name(), this.uid(), this.order(1));
  }

  public TemplateDataObjectPutCollection templateRoutingDetailsTemplateDataObject() {
    TemplateDataObjectPutCollection data = new TemplateDataObjectPutCollection();
    data.add(new TemplateDataObjectPut(this.name(), this.uid()));
    return data;
  }

  public CcPutCollection templateRoutingDetailsCc() {
    CcPutCollection cc = new CcPutCollection();
    cc.add(this.email());
    return cc;
  }

  public CcStepPutCollection templateRoutingDetailsCcStep() {
    CcStepPutCollection ccSteps = new CcStepPutCollection();
    ccSteps.add(new CcStepPut(this.name(), this.email(), this.order(1)));
    return ccSteps;
  }

  public ViewerPutCollection templateRoutingDetailsViewers() {
    ViewerPutCollection viewers = new ViewerPutCollection();
    viewers.add(new ViewerPut(this.name(), this.order(1), this.email(), this.booleanValue()));
    return viewers;
  }

  public ApproverPutCollection templateRoutingDetailsApprovers() {
    ApproverPutCollection approvers = new ApproverPutCollection();
    approvers.add(new ApproverPut(this.name(), this.order(1)));
    return approvers;
  }

  public InviteLinkInstructionPutCollection templateRoutingDetailsInviteLinkInstructions() {
    InviteLinkInstructionPutCollection instructions = new InviteLinkInstructionPutCollection();
    instructions.add(this.string());
    instructions.add(this.string());
    return instructions;
  }

  public Attribute webhookSubscriptionAttributes() {
    return new Attribute(this.url());
  }

  public com.signnow.api.webhookv2.request.data.Attribute webhookV2EventSubscriptionAttributes() {
    return new com.signnow.api.webhookv2.request.data.Attribute(this.url());
  }
}
