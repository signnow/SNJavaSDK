/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "cancelFreeFormInvite",
    url = "/invite/{invite_id}/cancel",
    method = "put",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "cancelFreeFormInvite",
    type = "application/json")
public final class CancelFreeFormInvitePutRequest implements RequestInterface<String> {

  private final String reason;

  private final Map<String, String> uriParams = new HashMap<>();

  public CancelFreeFormInvitePutRequest(String reason) {
    this.reason = reason;
  }

  public String getReason() {
    return this.reason;
  }

  public CancelFreeFormInvitePutRequest withInviteId(String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("reason", this.getReason());
    return map;
  }
}
