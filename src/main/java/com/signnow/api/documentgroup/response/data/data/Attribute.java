/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the attributes of a document group.
 */
public final class Attribute extends ApiData {

  /**
   * This property indicates whether forwarding is allowed.
   */
  @JsonProperty("allow_forwarding")
  private final boolean allowForwarding;

  /**
   * This property indicates whether the decline button is shown.
   */
  @JsonProperty("show_decline_button")
  private final boolean showDeclineButton;

  /**
   * This property indicates whether the user is a recipient.
   */
  @JsonProperty("i_am_recipient")
  private final boolean iAmRecipient;

  /**
   * This property holds the invite email message for signing document group.
   */
  @JsonProperty("message")
  private final String message;

  /**
   * This property holds the invite email subject for signing document group.
   */
  @JsonProperty("subject")
  private final String subject;

  /**
   * This property holds the number of expiration days of the document group signing invite.
   */
  @JsonProperty("expiration_days")
  private final int expirationDays;

  /**
   * This property holds the reminder of the document group signing invite.
   */
  @JsonProperty("reminder")
  private final Reminder reminder;

  /**
   * This property holds the authentication method that will be applied to the signer of the document group.
   */
  @JsonProperty("authentication")
  private final Authentication authentication;

  /**
   * This constructor initializes all properties of the document group.
   *
   * @param allowForwarding forwarding is allowed or not
   * @param showDeclineButton hide/show the decline button
   * @param iAmRecipient indicates whether th user is recipient
   * @param message the invite email message is going to be sent for signing the document group
   * @param subject the invite email subject is going to be sent for signing the document group
   * @param expirationDays the number of expiration days for signing invite
   * @param reminder configuration to remind the signer that the invitation has not been signed yet
   * @param authentication the authentication method to be applied to the signer of the document group
   */
  @JsonCreator
  public Attribute(
      @JsonProperty("allow_forwarding") boolean allowForwarding,
      @JsonProperty("show_decline_button") boolean showDeclineButton,
      @JsonProperty("i_am_recipient") boolean iAmRecipient,
      @JsonProperty("message") String message,
      @JsonProperty("subject") String subject,
      @JsonProperty("expiration_days") int expirationDays,
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
   * This method returns whether forwarding is allowed.
   *
   * @return forwarding is allowed or not
   */
  public boolean isAllowForwarding() {
    return this.allowForwarding;
  }

  /**
   * This method returns whether the decline button is shown.
   *
   * @return showing the decline button is allowed or not
   */
  public boolean isShowDeclineButton() {
    return this.showDeclineButton;
  }

  /**
   * This method returns whether the user is a recipient.
   *
   * @return whether the user is a recipient
   */
  public boolean isIAmRecipient() {
    return this.iAmRecipient;
  }

  /**
   * This method returns the message of the document group.
   *
   * @return invite email message
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * This method returns the subject of the document group.
   *
   * @return invite email subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * This method returns the number of expiration days of the document group.
   *
   * @return the number of expiration days of the document group
   */
  public int getExpirationDays() {
    return this.expirationDays;
  }

  /**
   * This method returns the reminder of the document group.
   *
   * @return invite reminder configuration
   */
  public Reminder getReminder() {
    return this.reminder;
  }

  /**
   * This method returns the authentication of the document group.
   *
   * @return authentication settings and method to the signer
   */
  public Authentication getAuthentication() {
    return this.authentication;
  }

  /**
   * This method converts the properties of the document group to a map.
   * @return a map of the properties of the document group.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("allow_forwarding", this.isAllowForwarding());
    map.put("show_decline_button", this.isShowDeclineButton());
    map.put("i_am_recipient", this.isIAmRecipient());
    map.put("message", this.getMessage());
    map.put("subject", this.getSubject());
    map.put("expiration_days", this.getExpirationDays());
    map.put("reminder", this.getReminder());
    map.put("authentication", this.getAuthentication());
    return map;
  }

  /**
   * This method creates an Attribute object from a map.
   * @param data a map of the properties of the document group.
   * @return an Attribute object.
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
        (int) data.getOrDefault("expiration_days", 0),
        data.containsKey("reminder")
            ? Reminder.fromMap((Map<String, Object>) data.get("reminder"))
            : null,
        data.containsKey("authentication")
            ? Authentication.fromMap((Map<String, Object>) data.get("authentication"))
            : null);
  }
}
