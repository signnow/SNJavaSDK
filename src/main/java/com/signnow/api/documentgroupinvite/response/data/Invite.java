/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Invite in the signNow API.
 */
public final class Invite extends ApiData {

  /**
   * The link of the invite.
   */
  @JsonProperty("link")
  private final String link;

  /**
   * The name of the document associated with the invite.
   */
  @JsonProperty("document_name")
  private final String documentName;

  /**
   * The email of the person who sent the invite.
   */
  @JsonProperty("inviter_email")
  private final String inviterEmail;

  /**
   * The action associated with the invite.
   */
  @JsonProperty("action")
  private final String action;

  /**
   * The status of the invite.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructs an Invite object with the specified details.
   *
   * @param link the link of the invite
   * @param documentName the name of the document associated with the invite
   * @param inviterEmail the email of the person who sent the invite
   * @param action the action associated with the invite
   * @param status the status of the invite
   */
  @JsonCreator
  public Invite(
      @JsonProperty("link") String link,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("inviter_email") String inviterEmail,
      @JsonProperty("action") String action,
      @JsonProperty("status") String status) {
    this.link = link;
    this.documentName = documentName;
    this.inviterEmail = inviterEmail;
    this.action = action;
    this.status = status;
  }

  /**
   * Returns the link of the invite.
   *
   * @return the link of the invite
   */
  public String getLink() {
    return this.link;
  }

  /**
   * Returns the name of the document associated with the invite.
   *
   * @return the name of the document associated with the invite
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Returns the email of the person who sent the invite.
   *
   * @return the email of the person who sent the invite
   */
  public String getInviterEmail() {
    return this.inviterEmail;
  }

  /**
   * Returns the action associated with the invite.
   *
   * @return the action associated with the invite
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Returns the status of the invite.
   *
   * @return the status of the invite
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Converts this Invite object to a Map.
   *
   * @return a Map representing this Invite object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("link", this.getLink());
    map.put("document_name", this.getDocumentName());
    map.put("inviter_email", this.getInviterEmail());
    map.put("action", this.getAction());
    map.put("status", this.getStatus());
    return map;
  }

  /**
   * Creates an Invite object from the specified Map.
   *
   * @param data a Map containing the details of the Invite
   * @return a new Invite object
   */
  @NotNull
  @Contract("_ -> new")
  public static Invite fromMap(@NotNull Map<String, Object> data) {
    return new Invite(
        (String) data.get("link"),
        (String) data.get("document_name"),
        (String) data.get("inviter_email"),
        (String) data.get("action"),
        (String) data.get("status"));
  }
}
