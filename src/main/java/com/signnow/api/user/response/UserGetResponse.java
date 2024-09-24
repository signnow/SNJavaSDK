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

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserGetResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("first_name")
  private final String firstName;

  @JsonProperty("last_name")
  private final String lastName;

  @JsonProperty("active")
  private final String active;

  @JsonProperty("verified")
  private final String verified;

  @JsonProperty("type")
  private final int type;

  @JsonProperty("pro")
  private final int pro;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("emails")
  private final EmailCollection emails;

  @JsonProperty("primary_email")
  private final String primaryEmail;

  @JsonProperty("subscriptions")
  private final SubscriptionCollection subscriptions;

  @JsonProperty("credits")
  private final int credits;

  @JsonProperty("has_atticus_access")
  private final boolean hasAtticusAccess;

  @JsonProperty("is_logged_in")
  private final boolean isLoggedIn;

  @JsonProperty("billing_period")
  private final BillingPeriod billingPeriod;

  @JsonProperty("premium_access")
  private final PremiumAccess premiumAccess;

  @JsonProperty("companies")
  private final CompanyCollection companies;

  @JsonProperty("document_count")
  private final int documentCount;

  @JsonProperty("monthly_document_count")
  private final int monthlyDocumentCount;

  @JsonProperty("lifetime_document_count")
  private final int lifetimeDocumentCount;

  @JsonProperty("teams")
  private final TeamCollection teams;

  @JsonProperty("googleapps")
  private final boolean googleApps;

  @JsonProperty("facebookapps")
  private final boolean facebookApps;

  @JsonProperty("microsoftapps")
  private final boolean microsoftApps;

  @JsonProperty("status")
  private final Status status;

  @JsonProperty("settings")
  private final Settings settings;

  @JsonProperty("organization_settings")
  private final OrganizationSettingsCollection organizationSettings;

  @JsonProperty("issue_notifications")
  private final IssueNotificationCollection issueNotifications;

  @JsonProperty("merchant_accounts")
  private final MerchantAccountCollection merchantAccounts;

  @JsonProperty("cloud_export_account_details")
  private final CloudExportAccountDetail cloudExportAccountDetails;

  @JsonProperty("organization")
  private final Organization organization;

  @JsonProperty("registration_source")
  private final String registrationSource;

  @JsonProperty("avatar_url")
  private final String avatarUrl;

  @JsonProperty("signer_phone_invite")
  private final String signerPhoneInvite;

  @JsonProperty("locale")
  private final String locale;

  @JsonProperty("password_changed")
  private final Integer passwordChanged;

  @JsonProperty("upload_limit")
  private final Integer uploadLimit;

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

  public String getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getActive() {
    return this.active;
  }

  public String getVerified() {
    return this.verified;
  }

  public int getType() {
    return this.type;
  }

  public int getPro() {
    return this.pro;
  }

  public String getCreated() {
    return this.created;
  }

  public EmailCollection getEmails() {
    return this.emails;
  }

  public String getPrimaryEmail() {
    return this.primaryEmail;
  }

  public SubscriptionCollection getSubscriptions() {
    return this.subscriptions;
  }

  public int getCredits() {
    return this.credits;
  }

  public boolean hasAtticusAccess() {
    return this.hasAtticusAccess;
  }

  public boolean isLoggedIn() {
    return this.isLoggedIn;
  }

  public BillingPeriod getBillingPeriod() {
    return this.billingPeriod;
  }

  public PremiumAccess getPremiumAccess() {
    return this.premiumAccess;
  }

  public CompanyCollection getCompanies() {
    return this.companies;
  }

  public int getDocumentCount() {
    return this.documentCount;
  }

  public int getMonthlyDocumentCount() {
    return this.monthlyDocumentCount;
  }

  public int getLifetimeDocumentCount() {
    return this.lifetimeDocumentCount;
  }

  public TeamCollection getTeams() {
    return this.teams;
  }

  public boolean hasGoogleApps() {
    return this.googleApps;
  }

  public boolean hasFacebookApps() {
    return this.facebookApps;
  }

  public boolean hasMicrosoftApps() {
    return this.microsoftApps;
  }

  public Status getStatus() {
    return this.status;
  }

  public Settings getSettings() {
    return this.settings;
  }

  public OrganizationSettingsCollection getOrganizationSettings() {
    return this.organizationSettings;
  }

  public IssueNotificationCollection getIssueNotifications() {
    return this.issueNotifications;
  }

  public MerchantAccountCollection getMerchantAccounts() {
    return this.merchantAccounts;
  }

  public CloudExportAccountDetail getCloudExportAccountDetails() {
    return this.cloudExportAccountDetails;
  }

  public Organization getOrganization() {
    return this.organization;
  }

  public String getRegistrationSource() {
    return this.registrationSource;
  }

  public String getAvatarUrl() {
    return this.avatarUrl;
  }

  public String getSignerPhoneInvite() {
    return this.signerPhoneInvite;
  }

  public String getLocale() {
    return this.locale;
  }

  public Integer getPasswordChanged() {
    return this.passwordChanged;
  }

  public Integer getUploadLimit() {
    return this.uploadLimit;
  }
}
