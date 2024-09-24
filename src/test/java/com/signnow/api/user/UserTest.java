/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.user.request.UserGetRequest;
import com.signnow.api.user.request.UserPostRequest;
import com.signnow.api.user.request.UserPutRequest;
import com.signnow.api.user.response.UserGetResponse;
import com.signnow.api.user.response.UserPostResponse;
import com.signnow.api.user.response.UserPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest extends BaseTest {

  private ApiClient apiClient;

  private SignNowFaker faker;

  @BeforeEach
  public void setUp() {
    try {
      apiClient = this.client();
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }
    faker = this.faker();
  }

  @Test
  public void testGetUser() {
    Expectation expectation = this.expectation("get_user_info", "get");
    UserGetRequest request = new UserGetRequest();

    assertDoesNotThrow(
        () -> {
          UserGetResponse response = (UserGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response);
          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("first_name"), response.getFirstName());
          this.assertSame(expectation.get("last_name"), response.getLastName());
          this.assertSame(expectation.get("active"), response.getActive());
          this.assertSame(expectation.get("verified"), response.getVerified());
          this.assertSame(expectation.get("type"), response.getType());
          this.assertSame(expectation.get("pro"), response.getPro());
          this.assertSame(expectation.get("created"), response.getCreated());
          this.assertSame(expectation.get("emails.0"), response.getEmails().get(0));
          this.assertSame(expectation.get("primary_email"), response.getPrimaryEmail());
          this.assertSame(expectation.get("subscriptions"), response.getSubscriptions());
          this.assertSame(expectation.get("credits"), response.getCredits());
          this.assertSame(expectation.get("has_atticus_access"), response.hasAtticusAccess());
          this.assertSame(
              expectation.get("cloud_export_account_details"),
              response.getCloudExportAccountDetails());
          this.assertSame(expectation.get("is_logged_in"), response.isLoggedIn());
          this.assertSame(expectation.get("billing_period"), response.getBillingPeriod());
          this.assertSame(expectation.get("premium_access"), response.getPremiumAccess());
          this.assertSame(expectation.get("companies"), response.getCompanies());
          this.assertSame(expectation.get("document_count"), response.getDocumentCount());
          this.assertSame(
              expectation.get("monthly_document_count"), response.getMonthlyDocumentCount());
          this.assertSame(
              expectation.get("lifetime_document_count"), response.getLifetimeDocumentCount());
          this.assertSame(expectation.get("teams"), response.getTeams());
          this.assertSame(expectation.get("status"), response.getStatus());
          this.assertSame(expectation.get("settings"), response.getSettings());
          this.assertSame(
              expectation.get("organization_settings"), response.getOrganizationSettings());
          this.assertSame(expectation.get("issue_notifications"), response.getIssueNotifications());
          this.assertSame(expectation.get("merchant_accounts"), response.getMerchantAccounts());
          this.assertSame(expectation.get("organization"), response.getOrganization());
          this.assertSame(expectation.get("registration_source"), response.getRegistrationSource());
          this.assertSame(expectation.get("avatar_url"), response.getAvatarUrl());
          this.assertSame(expectation.get("signer_phone_invite"), response.getSignerPhoneInvite());
          this.assertSame(expectation.get("locale"), response.getLocale());
          this.assertSame(expectation.get("password_changed"), response.getPasswordChanged());
          this.assertSame(expectation.get("upload_limit"), response.getUploadLimit());
        });
  }

  @Test
  public void testPostUser() {
    Expectation expectation = this.expectation("create_user", "post");
    UserPostRequest request =
        new UserPostRequest(
            faker.email(), faker.password(), faker.firstName(), faker.lastName(), faker.number());

    assertDoesNotThrow(
        () -> {
          UserPostResponse response = (UserPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response);
          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("verified"), response.getVerified());
          this.assertSame(expectation.get("email"), response.getEmail());
        });
  }

  @Test
  public void testPutUser() {
    Expectation expectation = this.expectation("update_user", "put");
    UserPutRequest request =
        new UserPutRequest(
            faker.firstName(),
            faker.lastName(),
            faker.password(),
            faker.oldPassword(),
            faker.logoutAll());

    assertDoesNotThrow(
        () -> {
          UserPutResponse response = (UserPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response);
          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("first_name"), response.getFirstName());
          this.assertSame(expectation.get("last_name"), response.getLastName());
        });
  }
}
