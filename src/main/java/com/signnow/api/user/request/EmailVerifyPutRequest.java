/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to verify a user's email.
 * It implements the RequestInterface with a String type.
 */
@ApiEndpoint(
    name = "userEmailVerify",
    url = "/user/email/verify",
    method = "put",
    auth = "basic",
    namespace = "user",
    entity = "emailVerify",
    type = "application/json")
public final class EmailVerifyPutRequest implements RequestInterface<String> {

  /**
   * The email of the user to be verified.
   */
  private final String email;

  /**
   * The verification token for the user's email.
   */
  private final String verificationToken;

  /**
   * Constructs a new EmailVerifyPutRequest with the specified email and verification token.
   *
   * @param email the email of the user to be verified
   * @param verificationToken the verification token for the user's email
   */
  public EmailVerifyPutRequest(String email, String verificationToken) {
    this.email = email;
    this.verificationToken = verificationToken;
  }

  /**
   * Returns the email of the user to be verified.
   *
   * @return the email of the user
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the verification token for the user's email.
   *
   * @return the verification token
   */
  public String getVerificationToken() {
    return this.verificationToken;
  }

  /**
   * Returns a new HashMap for URI parameters.
   *
   * @return a new HashMap
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a Map containing the payload for the request.
   * The payload includes the email and verification token.
   *
   * @return a Map containing the payload for the request
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("email", this.getEmail());
    map.put("verification_token", this.getVerificationToken());
    return map;
  }
}