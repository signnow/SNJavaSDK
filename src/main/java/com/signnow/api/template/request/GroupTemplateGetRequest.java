/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to get a group template.
 * It implements the RequestInterface with a String type parameter.
 * The API endpoint is defined by the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "getDocumentGroupTemplate",
    url = "/documentgroup/template/{template_id}",
    method = "get",
    auth = "bearer",
    namespace = "template",
    entity = "groupTemplate",
    type = "application/json")
public final class GroupTemplateGetRequest implements RequestInterface<String> {

  /**
   * This map holds the URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * This method adds a template ID to the URI parameters.
   *
   * @param templateId The ID of the template to get.
   * @return The current instance of GroupTemplateGetRequest.
   */
  public GroupTemplateGetRequest withTemplateId(String templateId) {
    this.uriParams.put("template_id", templateId);
    return this;
  }

  /**
   * This method returns a copy of the URI parameters.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * This method returns an empty payload.
   *
   * @return A new empty HashMap.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}