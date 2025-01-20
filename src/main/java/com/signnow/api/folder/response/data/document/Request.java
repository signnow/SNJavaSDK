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

/**
 * This class represents a Request which extends ApiData.
 */
public final class Request extends ApiData {

  /**
   * Collection of email sent statuses.
   */
  @JsonProperty("email_sent_statuses")
  private final EmailSentStatusCollection emailSentStatuses;

  /**
   * Constructor for Request.
   *
   * @param emailSentStatuses Collection of email sent statuses.
   */
  @JsonCreator
  public Request(@JsonProperty("email_sent_statuses") EmailSentStatusCollection emailSentStatuses) {
    this.emailSentStatuses = emailSentStatuses;
  }

  /**
   * Getter for email sent statuses.
   *
   * @return Collection of email sent statuses.
   */
  public EmailSentStatusCollection getEmailSentStatuses() {
    return this.emailSentStatuses;
  }

  /**
   * Converts the Request object to a Map.
   *
   * @return Map representation of the Request object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email_sent_statuses", this.getEmailSentStatuses());
    return map;
  }

  /**
   * Static method to create a Request object from a Map.
   *
   * @param data Map containing the data to create a Request object.
   * @return New Request object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Request fromMap(@NotNull Map<String, Object> data) {
    return new Request((EmailSentStatusCollection) data.get("email_sent_statuses"));
  }
}