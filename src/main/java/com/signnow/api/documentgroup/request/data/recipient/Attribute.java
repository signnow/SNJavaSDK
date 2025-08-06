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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public final class Attribute extends ApiData {

    @JsonProperty("allow_forwarding")
    private final boolean allowForwarding;

    @JsonProperty("show_decline_button")
    private final boolean showDeclineButton;

    @JsonProperty("i_am_recipient")
    private final boolean iAmRecipient;

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

    /**
     * Constructs an instance of Attribute.
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
    @JsonCreator
    public Attribute(
            @JsonProperty("allow_forwarding") boolean allowForwarding,
            @JsonProperty("show_decline_button") boolean showDeclineButton,
            @JsonProperty("i_am_recipient") boolean iAmRecipient,
            @JsonProperty("message") String message,
            @JsonProperty("subject") String subject,
            @JsonProperty("expiration_days") Integer expirationDays,
            @JsonProperty("reminder") Reminder reminder,
            @JsonProperty("authentication") Authentication authentication) {
        this.allowForwarding = allowForwarding;
        this.showDeclineButton = showDeclineButton;
        this.iAmRecipient = iAmRecipient;
        this.message = message;
        this.subject = subject;
        this.expirationDays = expirationDays;
        this.reminder = reminder;
        this.authentication = authentication;
    }

    /**
     * Gets the message for the recipient.
     *
     * @return the message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Gets the subject for the recipient.
     *
     * @return the subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Gets the expiration days for the recipient.
     *
     * @return the expiration days
     */
    public Integer getExpirationDays() {
        return this.expirationDays;
    }

    /**
     * Gets the reminder for the recipient.
     *
     * @return the reminder
     */
    public Reminder getReminder() {
        return this.reminder;
    }

    /**
     * Checks if forwarding is allowed.
     *
     * @return true if forwarding is allowed, false otherwise
     */
    public boolean isAllowForwarding() {
        return this.allowForwarding;
    }

    /**
     * Checks if the decline button is shown.
     *
     * @return true if the decline button is shown, false otherwise
     */
    public boolean isShowDeclineButton() {
        return this.showDeclineButton;
    }

    /**
     * Checks if the recipient is the current user.
     *
     * @return true if the recipient is the current user, false otherwise
     */
    public boolean isIAmRecipient() {
        return this.iAmRecipient;
    }

    /**
     * Gets the authentication for the recipient.
     *
     * @return the authentication
     */
    public Authentication getAuthentication() {
        return this.authentication;
    }

    /**
     * Converts the attributes to a map.
     *
     * @return a map representation of the attributes
     */
    @NotNull
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("message", this.getMessage());
        map.put("subject", this.getSubject());
        map.put("expiration_days", this.getExpirationDays());
        map.put("reminder", this.getReminder());
        map.put("allow_forwarding", this.isAllowForwarding());
        map.put("show_decline_button", this.isShowDeclineButton());
        map.put("i_am_recipient", this.isIAmRecipient());
        map.put("authentication", this.getAuthentication());
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
                (boolean) data.getOrDefault("allow_forwarding", false),
                (boolean) data.getOrDefault("show_decline_button", false),
                (boolean) data.getOrDefault("i_am_recipient", false),
                (String) data.getOrDefault("message", ""),
                (String) data.getOrDefault("subject", ""),
                (Integer) data.get("expiration_days"),
                (Reminder) data.get("reminder"),
                (Authentication) data.get("authentication")
        );
    }
}
