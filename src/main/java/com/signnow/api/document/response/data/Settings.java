/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Settings extends ApiData {

  @JsonProperty("no_document_attachment")
  private final boolean noDocumentAttachment;

  @JsonProperty("copy_export")
  private final boolean copyExport;

  @JsonProperty("no_document_file_attachments")
  private final boolean noDocumentFileAttachments;

  @JsonProperty("no_user_signature_return")
  private final boolean noUserSignatureReturn;

  @JsonProperty("mobileweb_option")
  private final boolean mobilewebOption;

  @JsonProperty("require_drawn_signatures")
  private final boolean requireDrawnSignatures;

  @JsonProperty("org_allowed_team_admins")
  private final boolean orgAllowedTeamAdmins;

  @JsonProperty("cloud_auto_export")
  private final boolean cloudAutoExport;

  @JsonProperty("digitally_sign_dowloaded_docs")
  private final boolean digitallySignDownloadedDocs;

  @JsonProperty("invite_completion_redirect_url")
  private final boolean inviteCompletionRedirectUrl;

  @JsonProperty("invite_decline_redirect_url")
  private final boolean inviteDeclineRedirectUrl;

  @JsonProperty("add_signature_stamp")
  private final boolean addSignatureStamp;

  @JsonProperty("pending_invite_document_view_notification")
  private final boolean pendingInviteDocumentViewNotification;

  @JsonProperty("signing_link_document_download")
  private final boolean signingLinkDocumentDownload;

  @JsonProperty("required_preset_signature_name")
  private final boolean requiredPresetSignatureName;

  @JsonProperty("cloud_export_with_history")
  private final boolean cloudExportWithHistory;

  @JsonProperty("emailed_docs_include_history")
  private final boolean emailedDocsIncludeHistory;

  @JsonProperty("require_email_subject")
  private final boolean requireEmailSubject;

  @JsonProperty("document_completion_retention_days")
  private final boolean documentCompletionRetentionDays;

  @JsonProperty("enable_hyperlink_protection")
  private final boolean enableHyperlinkProtection;

  @JsonProperty("enable_advanced_threat_protection")
  private final boolean enableAdvancedThreatProtection;

  @JsonProperty("require_login_for_signing")
  private final boolean requireLoginForSigning;

  @JsonProperty("logout_on_signing")
  private final boolean logoutOnSigning;

  @JsonProperty("audit_trail_completion_retention_days")
  private final boolean auditTrailCompletionRetentionDays;

  @JsonProperty("front_end_session_length")
  private final boolean frontEndSessionLength;

  @JsonProperty("email_admin_on_banned_login")
  private final boolean emailAdminOnBannedLogin;

  @JsonProperty("add_signature_stamp_with_name")
  private final boolean addSignatureStampWithName;

  @JsonProperty("cfr_title_21_part_11")
  private final boolean cfrTitle21Part11;

  @JsonProperty("unsuccessful_logout_attempts_allowed")
  private final boolean unsuccessfulLogoutAttemptsAllowed;

  @JsonProperty("require_authentication_for_invites")
  private final boolean requireAuthenticationForInvites;

  @JsonProperty("electronic_consent_required")
  private final boolean electronicConsentRequired;

  @JsonProperty("electronic_consent_text")
  private final boolean electronicConsentText;

  @JsonProperty("document_guide")
  private final boolean documentGuide;

  @JsonProperty("watermark_downloaded_document")
  private final boolean watermarkDownloadedDocument;

  @JsonProperty("restrict_download")
  private final boolean restrictDownload;

  @JsonProperty("disable_email_notifications")
  private final boolean disableEmailNotifications;

  @JsonProperty("upload_limit")
  private final boolean uploadLimit;

  @JsonProperty("document_schema_extended")
  private final boolean documentSchemaExtended;

  @JsonProperty("invite_update_notifications_for_all_invites_at_invite_create")
  private final boolean inviteUpdateNotificationsForAllInvitesAtInviteCreate;

  @JsonProperty("enable_full_story_tracker")
  private final boolean enableFullStoryTracker;

  @JsonProperty("document_attachment_only_for_signer")
  private final boolean documentAttachmentOnlyForSigner;

  @JsonProperty("sso-only-login")
  private final boolean ssoOnlyLogin;

  @JsonProperty("block_export_options_when_credit_card_validation_is_used")
  private final boolean blockExportOptionsWhenCreditCardValidationIsUsed;

  @JsonProperty("only_administrator_is_able_to_invite_to_the_team")
  private final boolean onlyAdministratorIsAbleToInviteToTheTeam;

  @JsonProperty("block_login_via_social_networks")
  private final boolean blockLoginViaSocialNetworks;

  @JsonProperty("redirect_to_registration_when_fields_saved")
  private boolean redirectToRegistrationWhenFieldsSaved;

  @JsonProperty("common_experiments")
  private final boolean commonExperiments;

  @JsonProperty("hide_decline_to_sign_option_in_signing_session")
  private final boolean hideDeclineToSignOptionInSigningSession;

  @JsonProperty("hide_upgrade_subscription_button")
  private final boolean hideUpgradeSubscriptionButton;

  @JsonProperty("do_no_consent_redirect_url")
  private final boolean doNoConsentRedirectUrl;

  @JsonProperty("lock_signing_date_by_default")
  private final boolean lockSigningDateByDefault;

  @JsonProperty("allow_download_certificate")
  private final boolean allowDownloadCertificate;

  @JsonProperty("have_merged_document_group_option")
  private final boolean haveMergedDocumentGroupOption;

  @JsonProperty("enable_eu_date_format")
  private final boolean enableEuDateFormat;

  @JsonProperty("guide_signers_only_through_required_fields")
  private final boolean guideSignersOnlyThroughRequiredFields;

  @JsonProperty("allow_document_copying_to_other_accounts")
  private final boolean allowDocumentCopyingToOtherAccounts;

  @JsonProperty("email_custom_subject")
  private final boolean emailCustomSubject;

  @JsonProperty("email_custom_message")
  private final boolean emailCustomMessage;

  @JsonProperty("invite_expiration_days")
  private final boolean inviteExpirationDays;

  @JsonProperty("enable_mfa")
  private final boolean enableMfa;

  @JsonProperty("enable_document_download_link_for_invite_completion_mails")
  private final boolean enableDocumentDownloadLinkForInviteCompletionMails;

  @JsonProperty("allow_big_attachment_file")
  private final boolean allowBigAttachmentFile;

  @JsonProperty("allow_big_count_of_attachment_fields_per_document")
  private final boolean allowBigCountOfAttachmentFieldsPerDocument;

  @JsonProperty("enable_hyperlink_field")
  private final boolean enableHyperlinkField;

  @JsonProperty("disable_download_action_in_editor")
  private final boolean disableDownloadActionInEditor;

  @JsonProperty("signature_stamp_position")
  private final boolean signatureStampPosition;

  @JsonProperty("enable_pki")
  private final boolean enablePki;

  @JsonProperty("enable_document_comments")
  private final boolean enableDocumentComments;

  @JsonProperty("cc_completion_email_contain_only_downloading_document_link")
  private final boolean ccCompletionEmailContainOnlyDownloadingDocumentLink;

  @JsonProperty("save_signer_signature_and_initials")
  private final boolean saveSignerSignatureAndInitials;

  @JsonProperty("auto_apply_signatures_and_initials_to_document_fields")
  private final boolean autoApplySignaturesAndInitialsToDocumentFields;

  @JsonProperty("block_organization_selfleave_by_member")
  private final boolean blockOrganizationSelfleaveByMember;

  @JsonProperty("receive_signer_email_after_sent_field_invite_to_yourself")
  private final boolean receiveSignerEmailAfterSentFieldInviteToYourself;

  @JsonProperty("date_format")
  private final boolean dateFormat;

  @JsonProperty("completed_document_name_formula")
  private final boolean completedDocumentNameFormula;

  @JsonProperty("agreement_to_test_new_functionality_in_organization")
  private final boolean agreementToTestNewFunctionalityInOrganization;

  @JsonProperty("agree_to_be_beta_tester")
  private final boolean agreeToBeBetaTester;

  @JsonProperty("default_field_invite_remind_before")
  private final boolean defaultFieldInviteRemindBefore;

  @JsonProperty("default_field_invite_remind_after")
  private final boolean defaultFieldInviteRemindAfter;

  @JsonProperty("default_field_invite_remind_repeat")
  private final boolean defaultFieldInviteRemindRepeat;

  @JsonProperty("default_field_invite_expiration_time")
  private final boolean defaultFieldInviteExpirationTime;

  @JsonProperty("email_logo_position")
  private final boolean emailLogoPosition;

  @JsonProperty("email_btn_bkgd_color")
  private final boolean emailBtnBkgdColor;

  @JsonProperty("email_btn_text_color")
  private final boolean emailBtnTextColor;

  @JsonProperty("allow_edit_document_after_signing")
  private final boolean allowEditDocumentAfterSigning;

  @JsonProperty("allow_embedded_extended_token_expiration")
  private final boolean allowEmbeddedExtendedTokenExpiration;

  @JsonProperty("every_signature_and_initials_field_requires_user_authentication")
  private final boolean everySignatureAndInitialsFieldRequiresUserAuthentication;

  @JsonProperty("enable_render_pages_in_editor_as_images")
  private final boolean enableRenderPagesInEditorAsImages;

  @JsonProperty("enable_team_admin_move_docs")
  private final boolean enableTeamAdminMoveDocs;

  @JsonProperty("disable_email_recipients")
  private final boolean disableEmailRecipients;

  @JsonProperty("allow_team_admin_rename_docs")
  private final boolean allowTeamAdminRenameDocs;

  @JsonProperty("email_footer_enabled")
  private final boolean emailFooterEnabled;

  @JsonProperty("parse_only_signature_fields")
  private final boolean parseOnlySignatureFields;

  @JsonProperty("flatten_before_aspose")
  private final boolean flattenBeforeAspose;

  @JsonProperty("run_experiments")
  private final boolean runExperiments;

  @JsonProperty("disable_form_search")
  private final boolean disableFormSearch;

  @JsonProperty("allow_team_admin_create_csv_report_for_shared_template")
  private final boolean allowTeamAdminCreateCsvReportForSharedTemplate;

  @JsonProperty("enable_team_generic_email")
  private final boolean enableTeamGenericEmail;

  @JsonProperty("use_team_generic_data")
  private final boolean useTeamGenericData;

  @JsonProperty("signing_reason")
  private final boolean signingReason;

  @JsonProperty("allow_qes")
  private final boolean allowQes;

  @JsonProperty("enable_qes")
  private final boolean enableQes;

  @JsonProperty("advanced_signing_flow")
  private final boolean advancedSigningFlow;

  @JsonProperty("document_prefill_disable_fields_existing_validation")
  private final boolean documentPrefillDisableFieldsExistingValidation;

  @JsonProperty("disable_problem_invite_email_notifications")
  private final boolean disableProblemInviteEmailNotifications;

  @JsonProperty("default_workspace_assigned")
  private final boolean defaultWorkspaceAssigned;

  @JsonProperty("workspace_organization")
  private final boolean workspaceOrganization;

  @JsonProperty("default_workspace")
  private final boolean defaultWorkspace;

  @JsonProperty("workspace_subscription_admin")
  private final boolean workspaceSubscriptionAdmin;

  @JsonProperty("dashboard_tips_enabled")
  private final boolean dashboardTipsEnabled;

  @JsonProperty("dashboard_onboarding_enabled")
  private final boolean dashboardOnboardingEnabled;

  @JsonProperty("dashboard_onboarding_current_step")
  private final boolean dashboardOnboardingCurrentStep;

  @JsonCreator
  public Settings(
      @JsonProperty("no_document_attachment") boolean noDocumentAttachment,
      @JsonProperty("copy_export") boolean copyExport,
      @JsonProperty("no_document_file_attachments") boolean noDocumentFileAttachments,
      @JsonProperty("no_user_signature_return") boolean noUserSignatureReturn,
      @JsonProperty("mobileweb_option") boolean mobilewebOption,
      @JsonProperty("require_drawn_signatures") boolean requireDrawnSignatures,
      @JsonProperty("org_allowed_team_admins") boolean orgAllowedTeamAdmins,
      @JsonProperty("cloud_auto_export") boolean cloudAutoExport,
      @JsonProperty("digitally_sign_dowloaded_docs") boolean digitallySignDownloadedDocs,
      @JsonProperty("invite_completion_redirect_url") boolean inviteCompletionRedirectUrl,
      @JsonProperty("invite_decline_redirect_url") boolean inviteDeclineRedirectUrl,
      @JsonProperty("add_signature_stamp") boolean addSignatureStamp,
      @JsonProperty("pending_invite_document_view_notification")
          boolean pendingInviteDocumentViewNotification,
      @JsonProperty("signing_link_document_download") boolean signingLinkDocumentDownload,
      @JsonProperty("required_preset_signature_name") boolean requiredPresetSignatureName,
      @JsonProperty("cloud_export_with_history") boolean cloudExportWithHistory,
      @JsonProperty("emailed_docs_include_history") boolean emailedDocsIncludeHistory,
      @JsonProperty("require_email_subject") boolean requireEmailSubject,
      @JsonProperty("document_completion_retention_days") boolean documentCompletionRetentionDays,
      @JsonProperty("enable_hyperlink_protection") boolean enableHyperlinkProtection,
      @JsonProperty("enable_advanced_threat_protection") boolean enableAdvancedThreatProtection,
      @JsonProperty("require_login_for_signing") boolean requireLoginForSigning,
      @JsonProperty("logout_on_signing") boolean logoutOnSigning,
      @JsonProperty("audit_trail_completion_retention_days")
          boolean auditTrailCompletionRetentionDays,
      @JsonProperty("front_end_session_length") boolean frontEndSessionLength,
      @JsonProperty("email_admin_on_banned_login") boolean emailAdminOnBannedLogin,
      @JsonProperty("add_signature_stamp_with_name") boolean addSignatureStampWithName,
      @JsonProperty("cfr_title_21_part_11") boolean cfrTitle21Part11,
      @JsonProperty("unsuccessful_logout_attempts_allowed")
          boolean unsuccessfulLogoutAttemptsAllowed,
      @JsonProperty("require_authentication_for_invites") boolean requireAuthenticationForInvites,
      @JsonProperty("electronic_consent_required") boolean electronicConsentRequired,
      @JsonProperty("electronic_consent_text") boolean electronicConsentText,
      @JsonProperty("document_guide") boolean documentGuide,
      @JsonProperty("watermark_downloaded_document") boolean watermarkDownloadedDocument,
      @JsonProperty("restrict_download") boolean restrictDownload,
      @JsonProperty("disable_email_notifications") boolean disableEmailNotifications,
      @JsonProperty("upload_limit") boolean uploadLimit,
      @JsonProperty("document_schema_extended") boolean documentSchemaExtended,
      @JsonProperty("invite_update_notifications_for_all_invites_at_invite_create")
          boolean inviteUpdateNotificationsForAllInvitesAtInviteCreate,
      @JsonProperty("enable_full_story_tracker") boolean enableFullStoryTracker,
      @JsonProperty("document_attachment_only_for_signer") boolean documentAttachmentOnlyForSigner,
      @JsonProperty("sso-only-login") boolean ssoOnlyLogin,
      @JsonProperty("block_export_options_when_credit_card_validation_is_used")
          boolean blockExportOptionsWhenCreditCardValidationIsUsed,
      @JsonProperty("only_administrator_is_able_to_invite_to_the_team")
          boolean onlyAdministratorIsAbleToInviteToTheTeam,
      @JsonProperty("block_login_via_social_networks") boolean blockLoginViaSocialNetworks,
      @JsonProperty("redirect_to_registration_when_fields_saved")
          boolean redirectToRegistrationWhenFieldsSaved,
      @JsonProperty("common_experiments") boolean commonExperiments,
      @JsonProperty("hide_decline_to_sign_option_in_signing_session")
          boolean hideDeclineToSignOptionInSigningSession,
      @JsonProperty("hide_upgrade_subscription_button") boolean hideUpgradeSubscriptionButton,
      @JsonProperty("do_no_consent_redirect_url") boolean doNoConsentRedirectUrl,
      @JsonProperty("lock_signing_date_by_default") boolean lockSigningDateByDefault,
      @JsonProperty("allow_download_certificate") boolean allowDownloadCertificate,
      @JsonProperty("have_merged_document_group_option") boolean haveMergedDocumentGroupOption,
      @JsonProperty("enable_eu_date_format") boolean enableEuDateFormat,
      @JsonProperty("guide_signers_only_through_required_fields")
          boolean guideSignersOnlyThroughRequiredFields,
      @JsonProperty("allow_document_copying_to_other_accounts")
          boolean allowDocumentCopyingToOtherAccounts,
      @JsonProperty("email_custom_subject") boolean emailCustomSubject,
      @JsonProperty("email_custom_message") boolean emailCustomMessage,
      @JsonProperty("invite_expiration_days") boolean inviteExpirationDays,
      @JsonProperty("enable_mfa") boolean enableMfa,
      @JsonProperty("enable_document_download_link_for_invite_completion_mails")
          boolean enableDocumentDownloadLinkForInviteCompletionMails,
      @JsonProperty("allow_big_attachment_file") boolean allowBigAttachmentFile,
      @JsonProperty("allow_big_count_of_attachment_fields_per_document")
          boolean allowBigCountOfAttachmentFieldsPerDocument,
      @JsonProperty("enable_hyperlink_field") boolean enableHyperlinkField,
      @JsonProperty("disable_download_action_in_editor") boolean disableDownloadActionInEditor,
      @JsonProperty("signature_stamp_position") boolean signatureStampPosition,
      @JsonProperty("enable_pki") boolean enablePki,
      @JsonProperty("enable_document_comments") boolean enableDocumentComments,
      @JsonProperty("cc_completion_email_contain_only_downloading_document_link")
          boolean ccCompletionEmailContainOnlyDownloadingDocumentLink,
      @JsonProperty("save_signer_signature_and_initials") boolean saveSignerSignatureAndInitials,
      @JsonProperty("auto_apply_signatures_and_initials_to_document_fields")
          boolean autoApplySignaturesAndInitialsToDocumentFields,
      @JsonProperty("block_organization_selfleave_by_member")
          boolean blockOrganizationSelfleaveByMember,
      @JsonProperty("receive_signer_email_after_sent_field_invite_to_yourself")
          boolean receiveSignerEmailAfterSentFieldInviteToYourself,
      @JsonProperty("date_format") boolean dateFormat,
      @JsonProperty("completed_document_name_formula") boolean completedDocumentNameFormula,
      @JsonProperty("agreement_to_test_new_functionality_in_organization")
          boolean agreementToTestNewFunctionalityInOrganization,
      @JsonProperty("agree_to_be_beta_tester") boolean agreeToBeBetaTester,
      @JsonProperty("default_field_invite_remind_before") boolean defaultFieldInviteRemindBefore,
      @JsonProperty("default_field_invite_remind_after") boolean defaultFieldInviteRemindAfter,
      @JsonProperty("default_field_invite_remind_repeat") boolean defaultFieldInviteRemindRepeat,
      @JsonProperty("default_field_invite_expiration_time")
          boolean defaultFieldInviteExpirationTime,
      @JsonProperty("email_logo_position") boolean emailLogoPosition,
      @JsonProperty("email_btn_bkgd_color") boolean emailBtnBkgdColor,
      @JsonProperty("email_btn_text_color") boolean emailBtnTextColor,
      @JsonProperty("allow_edit_document_after_signing") boolean allowEditDocumentAfterSigning,
      @JsonProperty("allow_embedded_extended_token_expiration")
          boolean allowEmbeddedExtendedTokenExpiration,
      @JsonProperty("every_signature_and_initials_field_requires_user_authentication")
          boolean everySignatureAndInitialsFieldRequiresUserAuthentication,
      @JsonProperty("enable_render_pages_in_editor_as_images")
          boolean enableRenderPagesInEditorAsImages,
      @JsonProperty("enable_team_admin_move_docs") boolean enableTeamAdminMoveDocs,
      @JsonProperty("disable_email_recipients") boolean disableEmailRecipients,
      @JsonProperty("allow_team_admin_rename_docs") boolean allowTeamAdminRenameDocs,
      @JsonProperty("email_footer_enabled") boolean emailFooterEnabled,
      @JsonProperty("parse_only_signature_fields") boolean parseOnlySignatureFields,
      @JsonProperty("flatten_before_aspose") boolean flattenBeforeAspose,
      @JsonProperty("run_experiments") boolean runExperiments,
      @JsonProperty("disable_form_search") boolean disableFormSearch,
      @JsonProperty("allow_team_admin_create_csv_report_for_shared_template")
          boolean allowTeamAdminCreateCsvReportForSharedTemplate,
      @JsonProperty("enable_team_generic_email") boolean enableTeamGenericEmail,
      @JsonProperty("use_team_generic_data") boolean useTeamGenericData,
      @JsonProperty("signing_reason") boolean signingReason,
      @JsonProperty("allow_qes") boolean allowQes,
      @JsonProperty("enable_qes") boolean enableQes,
      @JsonProperty("advanced_signing_flow") boolean advancedSigningFlow,
      @JsonProperty("document_prefill_disable_fields_existing_validation")
          boolean documentPrefillDisableFieldsExistingValidation,
      @JsonProperty("disable_problem_invite_email_notifications")
          boolean disableProblemInviteEmailNotifications,
      @JsonProperty("default_workspace_assigned") boolean defaultWorkspaceAssigned,
      @JsonProperty("workspace_organization") boolean workspaceOrganization,
      @JsonProperty("default_workspace") boolean defaultWorkspace,
      @JsonProperty("workspace_subscription_admin") boolean workspaceSubscriptionAdmin,
      @JsonProperty("dashboard_tips_enabled") boolean dashboardTipsEnabled,
      @JsonProperty("dashboard_onboarding_enabled") boolean dashboardOnboardingEnabled,
      @JsonProperty("dashboard_onboarding_current_step") boolean dashboardOnboardingCurrentStep) {
    this.noDocumentAttachment = noDocumentAttachment;
    this.copyExport = copyExport;
    this.noDocumentFileAttachments = noDocumentFileAttachments;
    this.noUserSignatureReturn = noUserSignatureReturn;
    this.mobilewebOption = mobilewebOption;
    this.requireDrawnSignatures = requireDrawnSignatures;
    this.orgAllowedTeamAdmins = orgAllowedTeamAdmins;
    this.cloudAutoExport = cloudAutoExport;
    this.digitallySignDownloadedDocs = digitallySignDownloadedDocs;
    this.inviteCompletionRedirectUrl = inviteCompletionRedirectUrl;
    this.inviteDeclineRedirectUrl = inviteDeclineRedirectUrl;
    this.addSignatureStamp = addSignatureStamp;
    this.pendingInviteDocumentViewNotification = pendingInviteDocumentViewNotification;
    this.signingLinkDocumentDownload = signingLinkDocumentDownload;
    this.requiredPresetSignatureName = requiredPresetSignatureName;
    this.cloudExportWithHistory = cloudExportWithHistory;
    this.emailedDocsIncludeHistory = emailedDocsIncludeHistory;
    this.requireEmailSubject = requireEmailSubject;
    this.documentCompletionRetentionDays = documentCompletionRetentionDays;
    this.enableHyperlinkProtection = enableHyperlinkProtection;
    this.enableAdvancedThreatProtection = enableAdvancedThreatProtection;
    this.requireLoginForSigning = requireLoginForSigning;
    this.logoutOnSigning = logoutOnSigning;
    this.auditTrailCompletionRetentionDays = auditTrailCompletionRetentionDays;
    this.frontEndSessionLength = frontEndSessionLength;
    this.emailAdminOnBannedLogin = emailAdminOnBannedLogin;
    this.addSignatureStampWithName = addSignatureStampWithName;
    this.cfrTitle21Part11 = cfrTitle21Part11;
    this.unsuccessfulLogoutAttemptsAllowed = unsuccessfulLogoutAttemptsAllowed;
    this.requireAuthenticationForInvites = requireAuthenticationForInvites;
    this.electronicConsentRequired = electronicConsentRequired;
    this.electronicConsentText = electronicConsentText;
    this.documentGuide = documentGuide;
    this.watermarkDownloadedDocument = watermarkDownloadedDocument;
    this.restrictDownload = restrictDownload;
    this.disableEmailNotifications = disableEmailNotifications;
    this.uploadLimit = uploadLimit;
    this.documentSchemaExtended = documentSchemaExtended;
    this.inviteUpdateNotificationsForAllInvitesAtInviteCreate =
        inviteUpdateNotificationsForAllInvitesAtInviteCreate;
    this.enableFullStoryTracker = enableFullStoryTracker;
    this.documentAttachmentOnlyForSigner = documentAttachmentOnlyForSigner;
    this.ssoOnlyLogin = ssoOnlyLogin;
    this.blockExportOptionsWhenCreditCardValidationIsUsed =
        blockExportOptionsWhenCreditCardValidationIsUsed;
    this.onlyAdministratorIsAbleToInviteToTheTeam = onlyAdministratorIsAbleToInviteToTheTeam;
    this.blockLoginViaSocialNetworks = blockLoginViaSocialNetworks;
    this.redirectToRegistrationWhenFieldsSaved = redirectToRegistrationWhenFieldsSaved;
    this.commonExperiments = commonExperiments;
    this.hideDeclineToSignOptionInSigningSession = hideDeclineToSignOptionInSigningSession;
    this.hideUpgradeSubscriptionButton = hideUpgradeSubscriptionButton;
    this.doNoConsentRedirectUrl = doNoConsentRedirectUrl;
    this.lockSigningDateByDefault = lockSigningDateByDefault;
    this.allowDownloadCertificate = allowDownloadCertificate;
    this.haveMergedDocumentGroupOption = haveMergedDocumentGroupOption;
    this.enableEuDateFormat = enableEuDateFormat;
    this.guideSignersOnlyThroughRequiredFields = guideSignersOnlyThroughRequiredFields;
    this.allowDocumentCopyingToOtherAccounts = allowDocumentCopyingToOtherAccounts;
    this.emailCustomSubject = emailCustomSubject;
    this.emailCustomMessage = emailCustomMessage;
    this.inviteExpirationDays = inviteExpirationDays;
    this.enableMfa = enableMfa;
    this.enableDocumentDownloadLinkForInviteCompletionMails =
        enableDocumentDownloadLinkForInviteCompletionMails;
    this.allowBigAttachmentFile = allowBigAttachmentFile;
    this.allowBigCountOfAttachmentFieldsPerDocument = allowBigCountOfAttachmentFieldsPerDocument;
    this.enableHyperlinkField = enableHyperlinkField;
    this.disableDownloadActionInEditor = disableDownloadActionInEditor;
    this.signatureStampPosition = signatureStampPosition;
    this.enablePki = enablePki;
    this.enableDocumentComments = enableDocumentComments;
    this.ccCompletionEmailContainOnlyDownloadingDocumentLink =
        ccCompletionEmailContainOnlyDownloadingDocumentLink;
    this.saveSignerSignatureAndInitials = saveSignerSignatureAndInitials;
    this.autoApplySignaturesAndInitialsToDocumentFields =
        autoApplySignaturesAndInitialsToDocumentFields;
    this.blockOrganizationSelfleaveByMember = blockOrganizationSelfleaveByMember;
    this.receiveSignerEmailAfterSentFieldInviteToYourself =
        receiveSignerEmailAfterSentFieldInviteToYourself;
    this.dateFormat = dateFormat;
    this.completedDocumentNameFormula = completedDocumentNameFormula;
    this.agreementToTestNewFunctionalityInOrganization =
        agreementToTestNewFunctionalityInOrganization;
    this.agreeToBeBetaTester = agreeToBeBetaTester;
    this.defaultFieldInviteRemindBefore = defaultFieldInviteRemindBefore;
    this.defaultFieldInviteRemindAfter = defaultFieldInviteRemindAfter;
    this.defaultFieldInviteRemindRepeat = defaultFieldInviteRemindRepeat;
    this.defaultFieldInviteExpirationTime = defaultFieldInviteExpirationTime;
    this.emailLogoPosition = emailLogoPosition;
    this.emailBtnBkgdColor = emailBtnBkgdColor;
    this.emailBtnTextColor = emailBtnTextColor;
    this.allowEditDocumentAfterSigning = allowEditDocumentAfterSigning;
    this.allowEmbeddedExtendedTokenExpiration = allowEmbeddedExtendedTokenExpiration;
    this.everySignatureAndInitialsFieldRequiresUserAuthentication =
        everySignatureAndInitialsFieldRequiresUserAuthentication;
    this.enableRenderPagesInEditorAsImages = enableRenderPagesInEditorAsImages;
    this.enableTeamAdminMoveDocs = enableTeamAdminMoveDocs;
    this.disableEmailRecipients = disableEmailRecipients;
    this.allowTeamAdminRenameDocs = allowTeamAdminRenameDocs;
    this.emailFooterEnabled = emailFooterEnabled;
    this.parseOnlySignatureFields = parseOnlySignatureFields;
    this.flattenBeforeAspose = flattenBeforeAspose;
    this.runExperiments = runExperiments;
    this.disableFormSearch = disableFormSearch;
    this.allowTeamAdminCreateCsvReportForSharedTemplate =
        allowTeamAdminCreateCsvReportForSharedTemplate;
    this.enableTeamGenericEmail = enableTeamGenericEmail;
    this.useTeamGenericData = useTeamGenericData;
    this.signingReason = signingReason;
    this.allowQes = allowQes;
    this.enableQes = enableQes;
    this.advancedSigningFlow = advancedSigningFlow;
    this.documentPrefillDisableFieldsExistingValidation =
        documentPrefillDisableFieldsExistingValidation;
    this.disableProblemInviteEmailNotifications = disableProblemInviteEmailNotifications;
    this.defaultWorkspaceAssigned = defaultWorkspaceAssigned;
    this.workspaceOrganization = workspaceOrganization;
    this.defaultWorkspace = defaultWorkspace;
    this.workspaceSubscriptionAdmin = workspaceSubscriptionAdmin;
    this.dashboardTipsEnabled = dashboardTipsEnabled;
    this.dashboardOnboardingEnabled = dashboardOnboardingEnabled;
    this.dashboardOnboardingCurrentStep = dashboardOnboardingCurrentStep;
  }

  public boolean isNoDocumentAttachment() {
    return this.noDocumentAttachment;
  }

  public boolean isCopyExport() {
    return this.copyExport;
  }

  public boolean isNoDocumentFileAttachments() {
    return this.noDocumentFileAttachments;
  }

  public boolean isNoUserSignatureReturn() {
    return this.noUserSignatureReturn;
  }

  public boolean isMobilewebOption() {
    return this.mobilewebOption;
  }

  public boolean isRequireDrawnSignatures() {
    return this.requireDrawnSignatures;
  }

  public boolean isOrgAllowedTeamAdmins() {
    return this.orgAllowedTeamAdmins;
  }

  public boolean isCloudAutoExport() {
    return this.cloudAutoExport;
  }

  public boolean isDigitallySignDownloadedDocs() {
    return this.digitallySignDownloadedDocs;
  }

  public boolean isInviteCompletionRedirectUrl() {
    return this.inviteCompletionRedirectUrl;
  }

  public boolean isInviteDeclineRedirectUrl() {
    return this.inviteDeclineRedirectUrl;
  }

  public boolean isAddSignatureStamp() {
    return this.addSignatureStamp;
  }

  public boolean isPendingInviteDocumentViewNotification() {
    return this.pendingInviteDocumentViewNotification;
  }

  public boolean isSigningLinkDocumentDownload() {
    return this.signingLinkDocumentDownload;
  }

  public boolean isRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  public boolean isCloudExportWithHistory() {
    return this.cloudExportWithHistory;
  }

  public boolean isEmailedDocsIncludeHistory() {
    return this.emailedDocsIncludeHistory;
  }

  public boolean isRequireEmailSubject() {
    return this.requireEmailSubject;
  }

  public boolean isDocumentCompletionRetentionDays() {
    return this.documentCompletionRetentionDays;
  }

  public boolean isEnableHyperlinkProtection() {
    return this.enableHyperlinkProtection;
  }

  public boolean isEnableAdvancedThreatProtection() {
    return this.enableAdvancedThreatProtection;
  }

  public boolean isRequireLoginForSigning() {
    return this.requireLoginForSigning;
  }

  public boolean isLogoutOnSigning() {
    return this.logoutOnSigning;
  }

  public boolean isAuditTrailCompletionRetentionDays() {
    return this.auditTrailCompletionRetentionDays;
  }

  public boolean isFrontEndSessionLength() {
    return this.frontEndSessionLength;
  }

  public boolean isEmailAdminOnBannedLogin() {
    return this.emailAdminOnBannedLogin;
  }

  public boolean isAddSignatureStampWithName() {
    return this.addSignatureStampWithName;
  }

  public boolean isCfrTitle21Part11() {
    return this.cfrTitle21Part11;
  }

  public boolean isUnsuccessfulLogoutAttemptsAllowed() {
    return this.unsuccessfulLogoutAttemptsAllowed;
  }

  public boolean isRequireAuthenticationForInvites() {
    return this.requireAuthenticationForInvites;
  }

  public boolean isElectronicConsentRequired() {
    return this.electronicConsentRequired;
  }

  public boolean isElectronicConsentText() {
    return this.electronicConsentText;
  }

  public boolean isDocumentGuide() {
    return this.documentGuide;
  }

  public boolean isWatermarkDownloadedDocument() {
    return this.watermarkDownloadedDocument;
  }

  public boolean isRestrictDownload() {
    return this.restrictDownload;
  }

  public boolean isDisableEmailNotifications() {
    return this.disableEmailNotifications;
  }

  public boolean isUploadLimit() {
    return this.uploadLimit;
  }

  public boolean isDocumentSchemaExtended() {
    return this.documentSchemaExtended;
  }

  public boolean isInviteUpdateNotificationsForAllInvitesAtInviteCreate() {
    return this.inviteUpdateNotificationsForAllInvitesAtInviteCreate;
  }

  public boolean isEnableFullStoryTracker() {
    return this.enableFullStoryTracker;
  }

  public boolean isDocumentAttachmentOnlyForSigner() {
    return this.documentAttachmentOnlyForSigner;
  }

  public boolean isSsoOnlyLogin() {
    return this.ssoOnlyLogin;
  }

  public boolean isBlockExportOptionsWhenCreditCardValidationIsUsed() {
    return this.blockExportOptionsWhenCreditCardValidationIsUsed;
  }

  public boolean isOnlyAdministratorIsAbleToInviteToTheTeam() {
    return this.onlyAdministratorIsAbleToInviteToTheTeam;
  }

  public boolean isBlockLoginViaSocialNetworks() {
    return this.blockLoginViaSocialNetworks;
  }

  public boolean isRedirectToRegistrationWhenFieldsSaved() {
    return this.redirectToRegistrationWhenFieldsSaved;
  }

  public boolean isCommonExperiments() {
    return this.commonExperiments;
  }

  public boolean isHideDeclineToSignOptionInSigningSession() {
    return this.hideDeclineToSignOptionInSigningSession;
  }

  public boolean isHideUpgradeSubscriptionButton() {
    return this.hideUpgradeSubscriptionButton;
  }

  public boolean isDoNoConsentRedirectUrl() {
    return this.doNoConsentRedirectUrl;
  }

  public boolean isLockSigningDateByDefault() {
    return this.lockSigningDateByDefault;
  }

  public boolean isAllowDownloadCertificate() {
    return this.allowDownloadCertificate;
  }

  public boolean isHaveMergedDocumentGroupOption() {
    return this.haveMergedDocumentGroupOption;
  }

  public boolean isEnableEuDateFormat() {
    return this.enableEuDateFormat;
  }

  public boolean isGuideSignersOnlyThroughRequiredFields() {
    return this.guideSignersOnlyThroughRequiredFields;
  }

  public boolean isAllowDocumentCopyingToOtherAccounts() {
    return this.allowDocumentCopyingToOtherAccounts;
  }

  public boolean isEmailCustomSubject() {
    return this.emailCustomSubject;
  }

  public boolean isEmailCustomMessage() {
    return this.emailCustomMessage;
  }

  public boolean isInviteExpirationDays() {
    return this.inviteExpirationDays;
  }

  public boolean isEnableMfa() {
    return this.enableMfa;
  }

  public boolean isEnableDocumentDownloadLinkForInviteCompletionMails() {
    return this.enableDocumentDownloadLinkForInviteCompletionMails;
  }

  public boolean isAllowBigAttachmentFile() {
    return this.allowBigAttachmentFile;
  }

  public boolean isAllowBigCountOfAttachmentFieldsPerDocument() {
    return this.allowBigCountOfAttachmentFieldsPerDocument;
  }

  public boolean isEnableHyperlinkField() {
    return this.enableHyperlinkField;
  }

  public boolean isDisableDownloadActionInEditor() {
    return this.disableDownloadActionInEditor;
  }

  public boolean isSignatureStampPosition() {
    return this.signatureStampPosition;
  }

  public boolean isEnablePki() {
    return this.enablePki;
  }

  public boolean isEnableDocumentComments() {
    return this.enableDocumentComments;
  }

  public boolean isCcCompletionEmailContainOnlyDownloadingDocumentLink() {
    return this.ccCompletionEmailContainOnlyDownloadingDocumentLink;
  }

  public boolean isSaveSignerSignatureAndInitials() {
    return this.saveSignerSignatureAndInitials;
  }

  public boolean isAutoApplySignaturesAndInitialsToDocumentFields() {
    return this.autoApplySignaturesAndInitialsToDocumentFields;
  }

  public boolean isBlockOrganizationSelfleaveByMember() {
    return this.blockOrganizationSelfleaveByMember;
  }

  public boolean isReceiveSignerEmailAfterSentFieldInviteToYourself() {
    return this.receiveSignerEmailAfterSentFieldInviteToYourself;
  }

  public boolean isDateFormat() {
    return this.dateFormat;
  }

  public boolean isCompletedDocumentNameFormula() {
    return this.completedDocumentNameFormula;
  }

  public boolean isAgreementToTestNewFunctionalityInOrganization() {
    return this.agreementToTestNewFunctionalityInOrganization;
  }

  public boolean isAgreeToBeBetaTester() {
    return this.agreeToBeBetaTester;
  }

  public boolean isDefaultFieldInviteRemindBefore() {
    return this.defaultFieldInviteRemindBefore;
  }

  public boolean isDefaultFieldInviteRemindAfter() {
    return this.defaultFieldInviteRemindAfter;
  }

  public boolean isDefaultFieldInviteRemindRepeat() {
    return this.defaultFieldInviteRemindRepeat;
  }

  public boolean isDefaultFieldInviteExpirationTime() {
    return this.defaultFieldInviteExpirationTime;
  }

  public boolean isEmailLogoPosition() {
    return this.emailLogoPosition;
  }

  public boolean isEmailBtnBkgdColor() {
    return this.emailBtnBkgdColor;
  }

  public boolean isEmailBtnTextColor() {
    return this.emailBtnTextColor;
  }

  public boolean isAllowEditDocumentAfterSigning() {
    return this.allowEditDocumentAfterSigning;
  }

  public boolean isAllowEmbeddedExtendedTokenExpiration() {
    return this.allowEmbeddedExtendedTokenExpiration;
  }

  public boolean isEverySignatureAndInitialsFieldRequiresUserAuthentication() {
    return this.everySignatureAndInitialsFieldRequiresUserAuthentication;
  }

  public boolean isEnableRenderPagesInEditorAsImages() {
    return this.enableRenderPagesInEditorAsImages;
  }

  public boolean isEnableTeamAdminMoveDocs() {
    return this.enableTeamAdminMoveDocs;
  }

  public boolean isDisableEmailRecipients() {
    return this.disableEmailRecipients;
  }

  public boolean isAllowTeamAdminRenameDocs() {
    return this.allowTeamAdminRenameDocs;
  }

  public boolean isEmailFooterEnabled() {
    return this.emailFooterEnabled;
  }

  public boolean isParseOnlySignatureFields() {
    return this.parseOnlySignatureFields;
  }

  public boolean isFlattenBeforeAspose() {
    return this.flattenBeforeAspose;
  }

  public boolean isRunExperiments() {
    return this.runExperiments;
  }

  public boolean isDisableFormSearch() {
    return this.disableFormSearch;
  }

  public boolean isAllowTeamAdminCreateCsvReportForSharedTemplate() {
    return this.allowTeamAdminCreateCsvReportForSharedTemplate;
  }

  public boolean isEnableTeamGenericEmail() {
    return this.enableTeamGenericEmail;
  }

  public boolean isUseTeamGenericData() {
    return this.useTeamGenericData;
  }

  public boolean isSigningReason() {
    return this.signingReason;
  }

  public boolean isAllowQes() {
    return this.allowQes;
  }

  public boolean isEnableQes() {
    return this.enableQes;
  }

  public boolean isAdvancedSigningFlow() {
    return this.advancedSigningFlow;
  }

  public boolean isDocumentPrefillDisableFieldsExistingValidation() {
    return this.documentPrefillDisableFieldsExistingValidation;
  }

  public boolean isDisableProblemInviteEmailNotifications() {
    return this.disableProblemInviteEmailNotifications;
  }

  public boolean isDefaultWorkspaceAssigned() {
    return this.defaultWorkspaceAssigned;
  }

  public boolean isWorkspaceOrganization() {
    return this.workspaceOrganization;
  }

  public boolean isDefaultWorkspace() {
    return this.defaultWorkspace;
  }

  public boolean isWorkspaceSubscriptionAdmin() {
    return this.workspaceSubscriptionAdmin;
  }

  public boolean isDashboardTipsEnabled() {
    return this.dashboardTipsEnabled;
  }

  public boolean isDashboardOnboardingEnabled() {
    return this.dashboardOnboardingEnabled;
  }

  public boolean isDashboardOnboardingCurrentStep() {
    return this.dashboardOnboardingCurrentStep;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("no_document_attachment", this.isNoDocumentAttachment());
    map.put("copy_export", this.isCopyExport());
    map.put("no_document_file_attachments", this.isNoDocumentFileAttachments());
    map.put("no_user_signature_return", this.isNoUserSignatureReturn());
    map.put("mobileweb_option", this.isMobilewebOption());
    map.put("require_drawn_signatures", this.isRequireDrawnSignatures());
    map.put("org_allowed_team_admins", this.isOrgAllowedTeamAdmins());
    map.put("cloud_auto_export", this.isCloudAutoExport());
    map.put("digitally_sign_dowloaded_docs", this.isDigitallySignDownloadedDocs());
    map.put("invite_completion_redirect_url", this.isInviteCompletionRedirectUrl());
    map.put("invite_decline_redirect_url", this.isInviteDeclineRedirectUrl());
    map.put("add_signature_stamp", this.isAddSignatureStamp());
    map.put(
        "pending_invite_document_view_notification",
        this.isPendingInviteDocumentViewNotification());
    map.put("signing_link_document_download", this.isSigningLinkDocumentDownload());
    map.put("required_preset_signature_name", this.isRequiredPresetSignatureName());
    map.put("cloud_export_with_history", this.isCloudExportWithHistory());
    map.put("emailed_docs_include_history", this.isEmailedDocsIncludeHistory());
    map.put("require_email_subject", this.isRequireEmailSubject());
    map.put("document_completion_retention_days", this.isDocumentCompletionRetentionDays());
    map.put("enable_hyperlink_protection", this.isEnableHyperlinkProtection());
    map.put("enable_advanced_threat_protection", this.isEnableAdvancedThreatProtection());
    map.put("require_login_for_signing", this.isRequireLoginForSigning());
    map.put("logout_on_signing", this.isLogoutOnSigning());
    map.put("audit_trail_completion_retention_days", this.isAuditTrailCompletionRetentionDays());
    map.put("front_end_session_length", this.isFrontEndSessionLength());
    map.put("email_admin_on_banned_login", this.isEmailAdminOnBannedLogin());
    map.put("add_signature_stamp_with_name", this.isAddSignatureStampWithName());
    map.put("cfr_title_21_part_11", this.isCfrTitle21Part11());
    map.put("unsuccessful_logout_attempts_allowed", this.isUnsuccessfulLogoutAttemptsAllowed());
    map.put("require_authentication_for_invites", this.isRequireAuthenticationForInvites());
    map.put("electronic_consent_required", this.isElectronicConsentRequired());
    map.put("electronic_consent_text", this.isElectronicConsentText());
    map.put("document_guide", this.isDocumentGuide());
    map.put("watermark_downloaded_document", this.isWatermarkDownloadedDocument());
    map.put("restrict_download", this.isRestrictDownload());
    map.put("disable_email_notifications", this.isDisableEmailNotifications());
    map.put("upload_limit", this.isUploadLimit());
    map.put("document_schema_extended", this.isDocumentSchemaExtended());
    map.put(
        "invite_update_notifications_for_all_invites_at_invite_create",
        this.isInviteUpdateNotificationsForAllInvitesAtInviteCreate());
    map.put("enable_full_story_tracker", this.isEnableFullStoryTracker());
    map.put("document_attachment_only_for_signer", this.isDocumentAttachmentOnlyForSigner());
    map.put("sso-only-login", this.isSsoOnlyLogin());
    map.put(
        "block_export_options_when_credit_card_validation_is_used",
        this.isBlockExportOptionsWhenCreditCardValidationIsUsed());
    map.put(
        "only_administrator_is_able_to_invite_to_the_team",
        this.isOnlyAdministratorIsAbleToInviteToTheTeam());
    map.put("block_login_via_social_networks", this.isBlockLoginViaSocialNetworks());
    map.put(
        "redirect_to_registration_when_fields_saved",
        this.isRedirectToRegistrationWhenFieldsSaved());
    map.put("common_experiments", this.isCommonExperiments());
    map.put(
        "hide_decline_to_sign_option_in_signing_session",
        this.isHideDeclineToSignOptionInSigningSession());
    map.put("hide_upgrade_subscription_button", this.isHideUpgradeSubscriptionButton());
    map.put("do_no_consent_redirect_url", this.isDoNoConsentRedirectUrl());
    map.put("lock_signing_date_by_default", this.isLockSigningDateByDefault());
    map.put("allow_download_certificate", this.isAllowDownloadCertificate());
    map.put("have_merged_document_group_option", this.isHaveMergedDocumentGroupOption());
    map.put("enable_eu_date_format", this.isEnableEuDateFormat());
    map.put(
        "guide_signers_only_through_required_fields",
        this.isGuideSignersOnlyThroughRequiredFields());
    map.put(
        "allow_document_copying_to_other_accounts", this.isAllowDocumentCopyingToOtherAccounts());
    map.put("email_custom_subject", this.isEmailCustomSubject());
    map.put("email_custom_message", this.isEmailCustomMessage());
    map.put("invite_expiration_days", this.isInviteExpirationDays());
    map.put("enable_mfa", this.isEnableMfa());
    map.put(
        "enable_document_download_link_for_invite_completion_mails",
        this.isEnableDocumentDownloadLinkForInviteCompletionMails());
    map.put("allow_big_attachment_file", this.isAllowBigAttachmentFile());
    map.put(
        "allow_big_count_of_attachment_fields_per_document",
        this.isAllowBigCountOfAttachmentFieldsPerDocument());
    map.put("enable_hyperlink_field", this.isEnableHyperlinkField());
    map.put("disable_download_action_in_editor", this.isDisableDownloadActionInEditor());
    map.put("signature_stamp_position", this.isSignatureStampPosition());
    map.put("enable_pki", this.isEnablePki());
    map.put("enable_document_comments", this.isEnableDocumentComments());
    map.put(
        "cc_completion_email_contain_only_downloading_document_link",
        this.isCcCompletionEmailContainOnlyDownloadingDocumentLink());
    map.put("save_signer_signature_and_initials", this.isSaveSignerSignatureAndInitials());
    map.put(
        "auto_apply_signatures_and_initials_to_document_fields",
        this.isAutoApplySignaturesAndInitialsToDocumentFields());
    map.put("block_organization_selfleave_by_member", this.isBlockOrganizationSelfleaveByMember());
    map.put(
        "receive_signer_email_after_sent_field_invite_to_yourself",
        this.isReceiveSignerEmailAfterSentFieldInviteToYourself());
    map.put("date_format", this.isDateFormat());
    map.put("completed_document_name_formula", this.isCompletedDocumentNameFormula());
    map.put(
        "agreement_to_test_new_functionality_in_organization",
        this.isAgreementToTestNewFunctionalityInOrganization());
    map.put("agree_to_be_beta_tester", this.isAgreeToBeBetaTester());
    map.put("default_field_invite_remind_before", this.isDefaultFieldInviteRemindBefore());
    map.put("default_field_invite_remind_after", this.isDefaultFieldInviteRemindAfter());
    map.put("default_field_invite_remind_repeat", this.isDefaultFieldInviteRemindRepeat());
    map.put("default_field_invite_expiration_time", this.isDefaultFieldInviteExpirationTime());
    map.put("email_logo_position", this.isEmailLogoPosition());
    map.put("email_btn_bkgd_color", this.isEmailBtnBkgdColor());
    map.put("email_btn_text_color", this.isEmailBtnTextColor());
    map.put("allow_edit_document_after_signing", this.isAllowEditDocumentAfterSigning());
    map.put(
        "allow_embedded_extended_token_expiration", this.isAllowEmbeddedExtendedTokenExpiration());
    map.put(
        "every_signature_and_initials_field_requires_user_authentication",
        this.isEverySignatureAndInitialsFieldRequiresUserAuthentication());
    map.put("enable_render_pages_in_editor_as_images", this.isEnableRenderPagesInEditorAsImages());
    map.put("enable_team_admin_move_docs", this.isEnableTeamAdminMoveDocs());
    map.put("disable_email_recipients", this.isDisableEmailRecipients());
    map.put("allow_team_admin_rename_docs", this.isAllowTeamAdminRenameDocs());
    map.put("email_footer_enabled", this.isEmailFooterEnabled());
    map.put("parse_only_signature_fields", this.isParseOnlySignatureFields());
    map.put("flatten_before_aspose", this.isFlattenBeforeAspose());
    map.put("run_experiments", this.isRunExperiments());
    map.put("disable_form_search", this.isDisableFormSearch());
    map.put(
        "allow_team_admin_create_csv_report_for_shared_template",
        this.isAllowTeamAdminCreateCsvReportForSharedTemplate());
    map.put("enable_team_generic_email", this.isEnableTeamGenericEmail());
    map.put("use_team_generic_data", this.isUseTeamGenericData());
    map.put("signing_reason", this.isSigningReason());
    map.put("allow_qes", this.isAllowQes());
    map.put("enable_qes", this.isEnableQes());
    map.put("advanced_signing_flow", this.isAdvancedSigningFlow());
    map.put(
        "document_prefill_disable_fields_existing_validation",
        this.isDocumentPrefillDisableFieldsExistingValidation());
    map.put(
        "disable_problem_invite_email_notifications",
        this.isDisableProblemInviteEmailNotifications());
    map.put("default_workspace_assigned", this.isDefaultWorkspaceAssigned());
    map.put("workspace_organization", this.isWorkspaceOrganization());
    map.put("default_workspace", this.isDefaultWorkspace());
    map.put("workspace_subscription_admin", this.isWorkspaceSubscriptionAdmin());
    map.put("dashboard_tips_enabled", this.isDashboardTipsEnabled());
    map.put("dashboard_onboarding_enabled", this.isDashboardOnboardingEnabled());
    map.put("dashboard_onboarding_current_step", this.isDashboardOnboardingCurrentStep());
    return map;
  }
}
