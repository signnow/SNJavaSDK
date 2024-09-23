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

@ApiEndpoint(
    name = "userEmailVerify",
    url = "/user/email/verify",
    method = "put",
    auth = "basic",
    namespace = "user",
    entity = "emailVerify",
    type = "application/json")
public final class EmailVerifyPutRequest implements RequestInterface<String> {

  private final String email;

  private final String verificationToken;

  public EmailVerifyPutRequest(String email, String verificationToken) {
    this.email = email;
    this.verificationToken = verificationToken;
  }

  public String getEmail() {
    return this.email;
  }

  public String getVerificationToken() {
    return this.verificationToken;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("email", this.getEmail());
    map.put("verification_token", this.getVerificationToken());
    return map;
  }
}
