/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Request extends ApiData {

  @JsonProperty("email_sent_statuses")
  private final EmailSentStatusCollection emailSentStatuses;

  @JsonCreator
  public Request(@JsonProperty("email_sent_statuses") EmailSentStatusCollection emailSentStatuses) {
    this.emailSentStatuses = emailSentStatuses;
  }

  public EmailSentStatusCollection getEmailSentStatuses() {
    return this.emailSentStatuses;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email_sent_statuses", this.getEmailSentStatuses());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Request fromMap(@NotNull Map<String, Object> data) {
    return new Request((EmailSentStatusCollection) data.get("email_sent_statuses"));
  }
}
