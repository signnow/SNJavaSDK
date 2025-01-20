/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.user.response.data.BillingPeriod;
import com.signnow.api.user.response.data.CloudExportAccountDetail;
import com.signnow.api.user.response.data.CompanyCollection;
import com.signnow.api.user.response.data.EmailCollection;
import com.signnow.api.user.response.data.IssueNotificationCollection;
import com.signnow.api.user.response.data.Organization;
import com.signnow.api.user.response.data.OrganizationSettingsCollection;
import com.signnow.api.user.response.data.Settings;
import com.signnow.api.user.response.data.Status;
import com.signnow.api.user.response.data.SubscriptionCollection;
import com.signnow.api.user.response.data.merchantaccount.MerchantAccountCollection;
import com.signnow.api.user.response.data.premiumaccess.PremiumAccess;
import com.signnow.api.user.response.data.team.TeamCollection;

/**
 * This class represents the response from the User GET API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserGetResponse {

  /**
   * The unique identifier of the user.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The first name of the user.
   */
  @JsonProperty("first_name")
  private final String firstName;

  /**
   * The last name of the user.
   */
  @JsonProperty("last_name")
  private final String lastName;

  /**
   * The active status of the user.
   */
  @JsonProperty("active")
  private final String active;

  /**
   * The verification status of the user.
   */
  @JsonProperty("verified")
  private final String verified;

  /**
   * The type of the user.
   */
  @JsonProperty("type")
  private final int type;

  /**
   * The pro status of the user.
   */
  @JsonProperty("pro")
  private final int pro;

  /**
   * The creation date of the user.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The email collection of the user.
   */
  @JsonProperty("emails")
  private final EmailCollection emails;

  /**
   * The primary email of the user.
   */
  @JsonProperty("primary_email")
  private final String primaryEmail;

  /**
   * The subscription collection of the user.
   */
  @JsonProperty("subscriptions")
  private final SubscriptionCollection subscriptions;

  /**
   * The credits of the user.
   */
  @JsonProperty("credits")
  private final int credits;

  /**
   * The atticus access status of the user.
   */
  @JsonProperty("has_atticus_access")
  private final boolean hasAtticusAccess;

  /**
   * The login status of the user.
   */
  @JsonProperty("is_logged_in")
  private final boolean isLoggedIn;

  /**
   * The billing period of the user.
   */
  @JsonProperty("billing_period")
  private final BillingPeriod billingPeriod;

  /**
   * The premium access of the user.
   */
  @JsonProperty("premium_access")
  private final PremiumAccess premiumAccess;

  /**
   * The company collection of the user.
   */
  @JsonProperty("companies")
  private final CompanyCollection companies;

  /**
   * The document count of the user.
   */
  @JsonProperty("document_count")
  private final int documentCount;

  /**
   * The monthly document count of the user.
   */
  @JsonProperty("monthly_document_count")
  private final int monthlyDocumentCount;

  /**
   * The lifetime document count of the user.
   */
  @JsonProperty("lifetime_document_count")
  private final int lifetimeDocumentCount;

  /**
   * The team collection of the user.
   */
  @JsonProperty("teams")
  private final TeamCollection teams;

  /**
   * The google apps status of the user.
   */
  @JsonProperty("googleapps")
  private final boolean googleApps;

  /**
   * The facebook apps status of the user.
   */
  @JsonProperty("facebookapps")
  private final boolean facebookApps;

  /**
   * The microsoft apps status of the user.
   */
  @JsonProperty("microsoftapps")
  private final boolean microsoftApps;

  /**
   * The status of the user.
   */
  @JsonProperty("status")
  private final Status status;

  /**
   * The settings of the user.
   */
  @JsonProperty("settings")
  private final Settings settings;

  /**
   * The organization settings collection of the user.
   */
  @JsonProperty("organization_settings")
  private final OrganizationSettingsCollection organizationSettings;

  /**
   * The issue notification collection of the user.
   */
  @JsonProperty("issue_notifications")
  private final IssueNotificationCollection issueNotifications;

  /**
   * The merchant account collection of the user.
   */
  @JsonProperty("merchant_accounts")
  private final MerchantAccountCollection merchantAccounts;

  /**
   * The cloud export account details of the user.
   */
  @JsonProperty("cloud_export_account_details")
  private final CloudExportAccountDetail cloudExportAccountDetails;

  /**
   * The organization of the user.
   */
  @JsonProperty("organization")
  private final Organization organization;

  /**
   * The registration source of the user.
   */
  @JsonProperty("registration_source")
  private final String registrationSource;

  /**
   * The avatar URL of the user.
   */
  @JsonProperty("avatar_url")
  private final String avatarUrl;

  /**
   * The signer phone invite of the user.
   */
  @JsonProperty("signer_phone_invite")
  private final String signerPhoneInvite;

  /**
   * The locale of the user.
   */
  @JsonProperty("locale")
  private final String locale;

  /**
   * The password changed status of the user.
   */
  @JsonProperty("password_changed")
  private final Integer passwordChanged;

  /**
   * The upload limit of the user.
   */
  @JsonProperty("upload_limit")
  private final Integer uploadLimit;

  /**
   * Constructor for UserGetResponse.
   *
   * @param id The unique identifier of the user.
   * @param firstName The first name of the user.
   * @param lastName The last name of the user.
   * @param active The active status of the user.
   * @param verified The verification status of the user.
   * @param type The type of the user.
   * @param pro The pro status of the user.
   * @param created The creation date of the user.
   * @param emails The email collection of the user.
   * @param primaryEmail The primary email of the user.
   * @param subscriptions The subscription collection of the user.
   * @param credits The credits of the user.
   * @param hasAtticusAccess The atticus access status of the user.
   * @param isLoggedIn The login status of the user.
   * @param billingPeriod The billing period of the user.
   * @param premiumAccess The premium access of the user.
   * @param companies The company collection of the user.
   * @param documentCount The document count of the user.
   * @param monthlyDocumentCount The monthly document count of the user.
   * @param lifetimeDocumentCount The lifetime document count of the user.
   * @param teams The team collection of the user.
   * @param googleApps The google apps status of the user.
   * @param facebookApps The facebook apps status of the user.
   * @param microsoftApps The microsoft apps status of the user.
   * @param status The status of the user.
   * @param settings The settings of the user.
   * @param organizationSettings The organization settings collection of the user.
   * @param issueNotifications The issue notification collection of the user.
   * @param merchantAccounts The merchant account collection of the user.
   * @param cloudExportAccountDetails The cloud export account details of the user.
   * @param organization The organization of the user.
   * @param registrationSource The registration source of the user.
   * @param avatarUrl The avatar URL of the user.
   * @param signerPhoneInvite The signer phone invite of the user.
   * @param locale The locale of the user.
   * @param passwordChanged The password changed status of the user.
   * @param uploadLimit The upload limit of the user.
   */
  public UserGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName,
      @JsonProperty("active") String active,
      @JsonProperty("verified") String verified,
      @JsonProperty("type") int type,
      @JsonProperty("pro") int pro,
      @JsonProperty("created") String created,
      @JsonProperty("emails") EmailCollection emails,
      @JsonProperty("primary_email") String primaryEmail,
      @JsonProperty("subscriptions") SubscriptionCollection subscriptions,
      @JsonProperty("credits") int credits,
      @JsonProperty("has_atticus_access") boolean hasAtticusAccess,
      @JsonProperty("is_logged_in") boolean isLoggedIn,
      @JsonProperty("billing_period") BillingPeriod billingPeriod,
      @JsonProperty("premium_access") PremiumAccess premiumAccess,
      @JsonProperty("companies") CompanyCollection companies,
      @JsonProperty("document_count") int documentCount,
      @JsonProperty("monthly_document_count") int monthlyDocumentCount,
      @JsonProperty("lifetime_document_count") int lifetimeDocumentCount,
      @JsonProperty("teams") TeamCollection teams,
      @JsonProperty("googleapps") boolean googleApps,
      @JsonProperty("facebookapps") boolean facebookApps,
      @JsonProperty("microsoftapps") boolean microsoftApps,
      @JsonProperty("status") Status status,
      @JsonProperty("settings") Settings settings,
      @JsonProperty("organization_settings") OrganizationSettingsCollection organizationSettings,
      @JsonProperty("issue_notifications") IssueNotificationCollection issueNotifications,
      @JsonProperty("merchant_accounts") MerchantAccountCollection merchantAccounts,
      @JsonProperty("cloud_export_account_details")
          CloudExportAccountDetail cloudExportAccountDetails,
      @JsonProperty("organization") Organization organization,
      @JsonProperty("registration_source") String registrationSource,
      @JsonProperty("avatar_url") String avatarUrl,
      @JsonProperty("signer_phone_invite") String signerPhoneInvite,
      @JsonProperty("locale") String locale,
      @JsonProperty("password_changed") Integer passwordChanged,
      @JsonProperty("upload_limit") Integer uploadLimit) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.active = active;
    this.verified = verified;
    this.type = type;
    this.pro = pro;
    this.created = created;
    this.emails = emails;
    this.primaryEmail = primaryEmail;
    this.subscriptions = subscriptions;
    this.credits = credits;
    this.hasAtticusAccess = hasAtticusAccess;
    this.isLoggedIn = isLoggedIn;
    this.billingPeriod = billingPeriod;
    this.premiumAccess = premiumAccess;
    this.companies = companies;
    this.documentCount = documentCount;
    this.monthlyDocumentCount = monthlyDocumentCount;
    this.lifetimeDocumentCount = lifetimeDocumentCount;
    this.teams = teams;
    this.googleApps = googleApps;
    this.facebookApps = facebookApps;
    this.microsoftApps = microsoftApps;
    this.status = status;
    this.settings = settings;
    this.organizationSettings = organizationSettings;
    this.issueNotifications = issueNotifications;
    this.merchantAccounts = merchantAccounts;
    this.cloudExportAccountDetails = cloudExportAccountDetails;
    this.organization = organization;
    this.registrationSource = registrationSource;
    this.avatarUrl = avatarUrl;
    this.signerPhoneInvite = signerPhoneInvite;
    this.locale = locale;
    this.passwordChanged = passwordChanged;
    this.uploadLimit = uploadLimit;
  }

  /**
   * Returns the unique identifier of the user.
   *
   * @return the unique identifier of the user.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the first name of the user.
   *
   * @return the first name of the user.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the last name of the user.
   *
   * @return the last name of the user.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Returns the active status of the user.
   *
   * @return the active status of the user.
   */
  public String getActive() {
    return this.active;
  }

  /**
   * Returns the verification status of the user.
   *
   * @return the verification status of the user.
   */
  public String getVerified() {
    return this.verified;
  }

  /**
   * Returns the type of the user.
   *
   * @return the type of the user.
   */
  public int getType() {
    return this.type;
  }

  /**
   * Returns the pro status of the user.
   *
   * @return the pro status of the user.
   */
  public int getPro() {
    return this.pro;
  }

  /**
   * Returns the creation date of the user.
   *
   * @return the creation date of the user.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the email collection of the user.
   *
   * @return the email collection of the user.
   */
  public EmailCollection getEmails() {
    return this.emails;
  }

  /**
   * Returns the primary email of the user.
   *
   * @return the primary email of the user.
   */
  public String getPrimaryEmail() {
    return this.primaryEmail;
  }

  /**
   * Returns the subscription collection of the user.
   *
   * @return the subscription collection of the user.
   */
  public SubscriptionCollection getSubscriptions() {
    return this.subscriptions;
  }

  /**
   * Returns the credits of the user.
   *
   * @return the credits of the user.
   */
  public int getCredits() {
    return this.credits;
  }

  /**
   * Returns the atticus access status of the user.
   *
   * @return the atticus access status of the user.
   */
  public boolean hasAtticusAccess() {
    return this.hasAtticusAccess;
  }

  /**
   * Returns the login status of the user.
   *
   * @return the login status of the user.
   */
  public boolean isLoggedIn() {
    return this.isLoggedIn;
  }

  /**
   * Returns the billing period of the user.
   *
   * @return the billing period of the user.
   */
  public BillingPeriod getBillingPeriod() {
    return this.billingPeriod;
  }

  /**
   * Returns the premium access of the user.
   *
   * @return the premium access of the user.
   */
  public PremiumAccess getPremiumAccess() {
    return this.premiumAccess;
  }

  /**
   * Returns the company collection of the user.
   *
   * @return the company collection of the user.
   */
  public CompanyCollection getCompanies() {
    return this.companies;
  }

  /**
   * Returns the document count of the user.
   *
   * @return the document count of the user.
   */
  public int getDocumentCount() {
    return this.documentCount;
  }

  /**
   * Returns the monthly document count of the user.
   *
   * @return the monthly document count of the user.
   */
  public int getMonthlyDocumentCount() {
    return this.monthlyDocumentCount;
  }

  /**
   * Returns the lifetime document count of the user.
   *
   * @return the lifetime document count of the user.
   */
  public int getLifetimeDocumentCount() {
    return this.lifetimeDocumentCount;
  }

  /**
   * Returns the team collection of the user.
   *
   * @return the team collection of the user.
   */
  public TeamCollection getTeams() {
    return this.teams;
  }

  /**
   * Returns the google apps status of the user.
   *
   * @return the google apps status of the user.
   */
  public boolean hasGoogleApps() {
    return this.googleApps;
  }

  /**
   * Returns the facebook apps status of the user.
   *
   * @return the facebook apps status of the user.
   */
  public boolean hasFacebookApps() {
    return this.facebookApps;
  }

  /**
   * Returns the microsoft apps status of the user.
   *
   * @return the microsoft apps status of the user.
   */
  public boolean hasMicrosoftApps() {
    return this.microsoftApps;
  }

  /**
   * Returns the status of the user.
   *
   * @return the status of the user.
   */
  public Status getStatus() {
    return this.status;
  }

  /**
   * Returns the settings of the user.
   *
   * @return the settings of the user.
   */
  public Settings getSettings() {
    return this.settings;
  }

  /**
   * Returns the organization settings collection of the user.
   *
   * @return the organization settings collection of the user.
   */
  public OrganizationSettingsCollection getOrganizationSettings() {
    return this.organizationSettings;
  }

  /**
   * Returns the issue notification collection of the user.
   *
   * @return the issue notification collection of the user.
   */
  public IssueNotificationCollection getIssueNotifications() {
    return this.issueNotifications;
  }

  /**
   * Returns the merchant account collection of the user.
   *
   * @return the merchant account collection of the user.
   */
  public MerchantAccountCollection getMerchantAccounts() {
    return this.merchantAccounts;
  }

  /**
   * Returns the cloud export account details of the user.
   *
   * @return the cloud export account details of the user.
   */
  public CloudExportAccountDetail getCloudExportAccountDetails() {
    return this.cloudExportAccountDetails;
  }

  /**
   * Returns the organization of the user.
   *
   * @return the organization of the user.
   */
  public Organization getOrganization() {
    return this.organization;
  }

  /**
   * Returns the registration source of the user.
   *
   * @return the registration source of the user.
   */
  public String getRegistrationSource() {
    return this.registrationSource;
  }

  /**
   * Returns the avatar URL of the user.
   *
   * @return the avatar URL of the user.
   */
  public String getAvatarUrl() {
    return this.avatarUrl;
  }

  /**
   * Returns the signer phone invite of the user.
   *
   * @return the signer phone invite of the user.
   */
  public String getSignerPhoneInvite() {
    return this.signerPhoneInvite;
  }

  /**
   * Returns the locale of the user.
   *
   * @return the locale of the user.
   */
  public String getLocale() {
    return this.locale;
  }

  /**
   * Returns the password changed status of the user.
   *
   * @return the password changed status of the user.
   */
  public Integer getPasswordChanged() {
    return this.passwordChanged;
  }

  /**
   * Returns the upload limit of the user.
   *
   * @return the upload limit of the user.
   */
  public Integer getUploadLimit() {
    return this.uploadLimit;
  }
}