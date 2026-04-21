/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request.data.recipient;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents the attributes of a recipient in a document group request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Attribute extends ApiData {

    @JsonProperty("allow_forwarding")
    private final Boolean allowForwarding;

    @JsonProperty("show_decline_button")
    private final Boolean showDeclineButton;

    @JsonProperty("i_am_recipient")
    private final Boolean iAmRecipient;

    @JsonProperty("message")
    private final String message;

    @JsonProperty("subject")
    private final String subject;

    @JsonProperty("expiration_days")
    private final Integer expirationDays;

    @JsonProperty("reminder")
    private final Reminder reminder;

    @JsonProperty("authentication")
    private final Authentication authentication;

    @JsonProperty("cfr")
    private final Boolean cfr;

    @JsonProperty("contact_id")
    private final String contactId;

    @JsonProperty("phone_invite_country_code")
    private final String phoneInviteCountryCode;

    @JsonProperty("sms_message")
    private final String smsMessage;

    /**
     * Constructs signer attributes (full set of properties).
     *
     * @param allowForwarding  whether forwarding is allowed
     * @param showDeclineButton whether the decline button is shown
     * @param iAmRecipient     whether the recipient is the current user
     * @param message          the message for the recipient
     * @param subject          the subject for the recipient
     * @param expirationDays   the expiration days for the recipient
     * @param reminder         the reminder for the recipient
     * @param authentication   the authentication for the recipient
     */
    public Attribute(
            boolean allowForwarding,
            boolean showDeclineButton,
            boolean iAmRecipient,
            String message,
            String subject,
            Integer expirationDays,
            Reminder reminder,
            Authentication authentication) {
        this.allowForwarding = allowForwarding;
        this.showDeclineButton = showDeclineButton;
        this.iAmRecipient = iAmRecipient;
        this.message = message;
        this.subject = subject;
        this.expirationDays = expirationDays;
        this.reminder = reminder;
        this.authentication = authentication;
        this.cfr = null;
        this.contactId = null;
        this.phoneInviteCountryCode = null;
        this.smsMessage = null;
    }

    /**
     * Creates signer attributes (full set of properties).
     *
     * @param allowForwarding  whether forwarding is allowed
     * @param showDeclineButton whether the decline button is shown
     * @param iAmRecipient     whether the recipient is the current user
     * @param message          the message for the recipient
     * @param subject          the subject for the recipient
     * @param expirationDays   the expiration days for the recipient
     * @param reminder         the reminder for the recipient
     * @param authentication   the authentication for the recipient
     * @return signer Attribute instance
     */
    public static Attribute signer(
            boolean allowForwarding,
            boolean showDeclineButton,
            boolean iAmRecipient,
            String message,
            String subject,
            Integer expirationDays,
            Reminder reminder,
            Authentication authentication) {
        return new Attribute(allowForwarding, showDeclineButton, iAmRecipient,
                message, subject, expirationDays, reminder, authentication);
    }

    /**
     * Creates viewer attributes (restricted set of properties).
     * Only allowed fields: message, subject, iAmRecipient, cfr, contactId,
     * phoneInviteCountryCode, smsMessage.
     *
     * @param message                the message for the viewer
     * @param subject                the subject for the viewer
     * @param iAmRecipient           whether the viewer is the current user
     * @param cfr                    whether CFR is enabled
     * @param contactId              the contact ID
     * @param phoneInviteCountryCode the phone invite country code
     * @param smsMessage             the SMS message
     * @return viewer Attribute instance
     */
    public static Attribute viewer(
            String message,
            String subject,
            boolean iAmRecipient,
            Boolean cfr,
            String contactId,
            String phoneInviteCountryCode,
            String smsMessage) {
        return new Attribute(
                null, null, iAmRecipient, message, subject, null, null, null,
                cfr, contactId, phoneInviteCountryCode, smsMessage);
    }

    /**
     * Full constructor used for JSON deserialization.
     */
    @JsonCreator
    public Attribute(
            @JsonProperty("allow_forwarding") Boolean allowForwarding,
            @JsonProperty("show_decline_button") Boolean showDeclineButton,
            @JsonProperty("i_am_recipient") Boolean iAmRecipient,
            @JsonProperty("message") String message,
            @JsonProperty("subject") String subject,
            @JsonProperty("expiration_days") Integer expirationDays,
            @JsonProperty("reminder") Reminder reminder,
            @JsonProperty("authentication") Authentication authentication,
            @JsonProperty("cfr") Boolean cfr,
            @JsonProperty("contact_id") String contactId,
            @JsonProperty("phone_invite_country_code") String phoneInviteCountryCode,
            @JsonProperty("sms_message") String smsMessage) {
        this.allowForwarding = allowForwarding;
        this.showDeclineButton = showDeclineButton;
        this.iAmRecipient = iAmRecipient;
        this.message = message;
        this.subject = subject;
        this.expirationDays = expirationDays;
        this.reminder = reminder;
        this.authentication = authentication;
        this.cfr = cfr;
        this.contactId = contactId;
        this.phoneInviteCountryCode = phoneInviteCountryCode;
        this.smsMessage = smsMessage;
    }

    public String getMessage() {
        return this.message;
    }

    public String getSubject() {
        return this.subject;
    }

    public Integer getExpirationDays() {
        return this.expirationDays;
    }

    public Reminder getReminder() {
        return this.reminder;
    }

    @JsonIgnore
    public boolean isAllowForwarding() {
        return this.allowForwarding != null && this.allowForwarding;
    }

    @JsonIgnore
    public boolean isShowDeclineButton() {
        return this.showDeclineButton != null && this.showDeclineButton;
    }

    @JsonIgnore
    public boolean isIAmRecipient() {
        return this.iAmRecipient != null && this.iAmRecipient;
    }

    public Authentication getAuthentication() {
        return this.authentication;
    }

    public Boolean getCfr() {
        return this.cfr;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getPhoneInviteCountryCode() {
        return this.phoneInviteCountryCode;
    }

    public String getSmsMessage() {
        return this.smsMessage;
    }

    /**
     * Converts the attributes to a map, omitting null values.
     *
     * @return a map representation of the attributes with only non-null values
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        if (this.message != null) map.put("message", this.message);
        if (this.subject != null) map.put("subject", this.subject);
        if (this.iAmRecipient != null) map.put("i_am_recipient", this.iAmRecipient);
        if (this.allowForwarding != null) map.put("allow_forwarding", this.allowForwarding);
        if (this.showDeclineButton != null) map.put("show_decline_button", this.showDeclineButton);
        if (this.expirationDays != null) map.put("expiration_days", this.expirationDays);
        if (this.reminder != null) map.put("reminder", this.reminder);
        if (this.authentication != null) map.put("authentication", this.authentication);
        if (this.cfr != null) map.put("cfr", this.cfr);
        if (this.contactId != null) map.put("contact_id", this.contactId);
        if (this.phoneInviteCountryCode != null) map.put("phone_invite_country_code", this.phoneInviteCountryCode);
        if (this.smsMessage != null) map.put("sms_message", this.smsMessage);
        return map;
    }

    /**
     * Creates an instance of Attribute from a map.
     *
     * @param data the map containing attribute data
     * @return an instance of Attribute
     */
    @NotNull
    @Contract("_ -> new")
    public static Attribute fromMap(@NotNull Map<String, Object> data) {
        return new Attribute(
                (Boolean) data.getOrDefault("allow_forwarding", null),
                (Boolean) data.getOrDefault("show_decline_button", null),
                (Boolean) data.getOrDefault("i_am_recipient", null),
                (String) data.getOrDefault("message", null),
                (String) data.getOrDefault("subject", null),
                (Integer) data.get("expiration_days"),
                (Reminder) data.get("reminder"),
                (Authentication) data.get("authentication"),
                (Boolean) data.get("cfr"),
                (String) data.get("contact_id"),
                (String) data.get("phone_invite_country_code"),
                (String) data.get("sms_message")
        );
    }
}
