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

@ApiEndpoint(
    name = "getDocumentGroupTemplate",
    url = "/documentgroup/template/{template_id}",
    method = "get",
    auth = "bearer",
    namespace = "template",
    entity = "groupTemplate",
    type = "application/json")
public final class GroupTemplateGetRequest implements RequestInterface<String> {

  private final Map<String, String> uriParams = new HashMap<>();

  public GroupTemplateGetRequest withTemplateId(String templateId) {
    this.uriParams.put("template_id", templateId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
