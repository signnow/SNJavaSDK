/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.fieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents the CFR data for field invites.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Cfr extends ApiData {

    @JsonProperty("cfr_title_21_part_11")
    private final int cfrTitle21Part11;

    @JsonProperty("front_end_session_length")
    private final String frontEndSessionLength;

    @JsonProperty("require_authentication_for_invites")
    private final String requireAuthenticationForInvites;

    @JsonProperty("auto_apply_signatures_and_initials_to_document_fields")
    private final String autoApplySignaturesAndInitialsToDocumentFields;

    @JsonProperty("every_signature_and_initials_field_requires_user_authentication")
    private final String everySignatureAndInitialsFieldRequiresUserAuthentication;

    @JsonProperty("emailed_docs_include_history")
    private final String emailedDocsIncludeHistory;

    @JsonProperty("cloud_export_with_history")
    private final String cloudExportWithHistory;

    @JsonProperty("require_login_for_signing")
    private final String requireLoginForSigning;

    @JsonProperty("logout_on_signing")
    private final String logoutOnSigning;

    @JsonProperty("add_signature_stamp_with_name")
    private final String addSignatureStampWithName;

    /**
     * Constructs a new Cfr instance.
     *
     * @param cfrTitle21Part11 The CFR Title 21 Part 11 value.
     * @param frontEndSessionLength The front-end session length.
     * @param requireAuthenticationForInvites Whether authentication is required for invites.
     * @param autoApplySignaturesAndInitialsToDocumentFields Whether to auto-apply signatures and initials to document fields.
     * @param everySignatureAndInitialsFieldRequiresUserAuthentication Whether every signature and initials field requires user authentication.
     * @param emailedDocsIncludeHistory Whether emailed documents include history.
     * @param cloudExportWithHistory Whether cloud export includes history.
     * @param requireLoginForSigning Whether login is required for signing.
     * @param logoutOnSigning Whether to logout on signing.
     * @param addSignatureStampWithName Whether to add a signature stamp with name.
     */
    @JsonCreator
    public Cfr(
        @JsonProperty("cfr_title_21_part_11") int cfrTitle21Part11,
        @JsonProperty("front_end_session_length") String frontEndSessionLength,
        @JsonProperty("require_authentication_for_invites") String requireAuthenticationForInvites,
        @JsonProperty("auto_apply_signatures_and_initials_to_document_fields") String autoApplySignaturesAndInitialsToDocumentFields,
        @JsonProperty("every_signature_and_initials_field_requires_user_authentication") String everySignatureAndInitialsFieldRequiresUserAuthentication,
        @JsonProperty("emailed_docs_include_history") String emailedDocsIncludeHistory,
        @JsonProperty("cloud_export_with_history") String cloudExportWithHistory,
        @JsonProperty("require_login_for_signing") String requireLoginForSigning,
        @JsonProperty("logout_on_signing") String logoutOnSigning,
        @JsonProperty("add_signature_stamp_with_name") String addSignatureStampWithName
    ) {
        this.cfrTitle21Part11 = cfrTitle21Part11;
        this.frontEndSessionLength = frontEndSessionLength;
        this.requireAuthenticationForInvites = requireAuthenticationForInvites;
        this.autoApplySignaturesAndInitialsToDocumentFields = autoApplySignaturesAndInitialsToDocumentFields;
        this.everySignatureAndInitialsFieldRequiresUserAuthentication = everySignatureAndInitialsFieldRequiresUserAuthentication;
        this.emailedDocsIncludeHistory = emailedDocsIncludeHistory;
        this.cloudExportWithHistory = cloudExportWithHistory;
        this.requireLoginForSigning = requireLoginForSigning;
        this.logoutOnSigning = logoutOnSigning;
        this.addSignatureStampWithName = addSignatureStampWithName;
    }

    /**
     * Gets the CFR Title 21 Part 11 value.
     *
     * @return The CFR Title 21 Part 11 value.
     */
    public int getCfrTitle21Part11() {
        return this.cfrTitle21Part11;
    }

    /**
     * Gets the front-end session length.
     *
     * @return The front-end session length.
     */
    public String getFrontEndSessionLength() {
        return this.frontEndSessionLength;
    }

    /**
     * Gets whether authentication is required for invites.
     *
     * @return Whether authentication is required for invites.
     */
    public String getRequireAuthenticationForInvites() {
        return this.requireAuthenticationForInvites;
    }

    /**
     * Gets whether to auto-apply signatures and initials to document fields.
     *
     * @return Whether to auto-apply signatures and initials to document fields.
     */
    public String getAutoApplySignaturesAndInitialsToDocumentFields() {
        return this.autoApplySignaturesAndInitialsToDocumentFields;
    }

    /**
     * Gets whether every signature and initials field requires user authentication.
     *
     * @return Whether every signature and initials field requires user authentication.
     */
    public String getEverySignatureAndInitialsFieldRequiresUserAuthentication() {
        return this.everySignatureAndInitialsFieldRequiresUserAuthentication;
    }

    /**
     * Gets whether emailed documents include history.
     *
     * @return Whether emailed documents include history.
     */
    public String getEmailedDocsIncludeHistory() {
        return this.emailedDocsIncludeHistory;
    }

    /**
     * Gets whether cloud export includes history.
     *
     * @return Whether cloud export includes history.
     */
    public String getCloudExportWithHistory() {
        return this.cloudExportWithHistory;
    }

    /**
     * Gets whether login is required for signing.
     *
     * @return Whether login is required for signing.
     */
    public String getRequireLoginForSigning() {
        return this.requireLoginForSigning;
    }

    /**
     * Gets whether to logout on signing.
     *
     * @return Whether to logout on signing.
     */
    public String getLogoutOnSigning() {
        return this.logoutOnSigning;
    }

    /**
     * Gets whether to add a signature stamp with name.
     *
     * @return Whether to add a signature stamp with name.
     */
    public String getAddSignatureStampWithName() {
        return this.addSignatureStampWithName;
    }

    /**
     * Converts the Cfr object to a map.
     *
     * @return A map representation of the Cfr object.
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("cfr_title_21_part_11", this.getCfrTitle21Part11());
        map.put("front_end_session_length", this.getFrontEndSessionLength());
        map.put("require_authentication_for_invites", this.getRequireAuthenticationForInvites());
        map.put("auto_apply_signatures_and_initials_to_document_fields", this.getAutoApplySignaturesAndInitialsToDocumentFields());
        map.put("every_signature_and_initials_field_requires_user_authentication", this.getEverySignatureAndInitialsFieldRequiresUserAuthentication());
        map.put("emailed_docs_include_history", this.getEmailedDocsIncludeHistory());
        map.put("cloud_export_with_history", this.getCloudExportWithHistory());
        map.put("require_login_for_signing", this.getRequireLoginForSigning());
        map.put("logout_on_signing", this.getLogoutOnSigning());
        map.put("add_signature_stamp_with_name", this.getAddSignatureStampWithName());
        return map;
    }

    /**
     * Creates a Cfr object from a map.
     *
     * @param data The map containing the data.
     * @return A new Cfr object.
     */
    @NotNull
    @Contract("_ -> new")
    public static Cfr fromMap(@NotNull Map<String, Object> data) {
        return new Cfr(
            (int) data.getOrDefault("cfr_title_21_part_11", 0),
            (String) data.getOrDefault("front_end_session_length", null),
            (String) data.getOrDefault("require_authentication_for_invites", null),
            (String) data.getOrDefault("auto_apply_signatures_and_initials_to_document_fields", null),
            (String) data.getOrDefault("every_signature_and_initials_field_requires_user_authentication", null),
            (String) data.getOrDefault("emailed_docs_include_history", null),
            (String) data.getOrDefault("cloud_export_with_history", null),
            (String) data.getOrDefault("require_login_for_signing", null),
            (String) data.getOrDefault("logout_on_signing", null),
            (String) data.getOrDefault("add_signature_stamp_with_name", null)
        );
    }
}
