/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request;

import com.signnow.api.template.request.data.TemplateIdsToAddCollection;
import com.signnow.api.template.request.data.TemplateIdsToRemoveCollection;
import com.signnow.api.template.request.data.routingdetail.RoutingDetail;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "updateDocumentGroupTemplate",
    url = "/documentgroup/template/{template_id}",
    method = "put",
    auth = "bearer",
    namespace = "template",
    entity = "groupTemplate",
    type = "application/json")
public final class GroupTemplatePutRequest implements RequestInterface<Object> {

  private final RoutingDetail routingDetails;

  private final String templateGroupName;

  private final TemplateIdsToAddCollection templateIdsToAdd;

  private final TemplateIdsToRemoveCollection templateIdsToRemove;

  private final Map<String, String> uriParams = new HashMap<>();

  public GroupTemplatePutRequest(
      RoutingDetail routingDetails,
      String templateGroupName,
      TemplateIdsToAddCollection templateIdsToAdd,
      TemplateIdsToRemoveCollection templateIdsToRemove) {
    this.routingDetails = routingDetails;
    this.templateGroupName = templateGroupName;
    this.templateIdsToAdd = templateIdsToAdd;
    this.templateIdsToRemove = templateIdsToRemove;
  }

  public GroupTemplatePutRequest(RoutingDetail routingDetails, String templateGroupName) {
    this(
        routingDetails,
        templateGroupName,
        new TemplateIdsToAddCollection(),
        new TemplateIdsToRemoveCollection());
  }

  public TemplateIdsToAddCollection getTemplateIdsToAdd() {
    return this.templateIdsToAdd;
  }

  public TemplateIdsToRemoveCollection getTemplateIdsToRemove() {
    return this.templateIdsToRemove;
  }

  public RoutingDetail getRoutingDetails() {
    return this.routingDetails;
  }

  public String getTemplateGroupName() {
    return this.templateGroupName;
  }

  public GroupTemplatePutRequest withTemplateId(String templateId) {
    this.uriParams.put("template_id", templateId);
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
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("template_ids_to_add", this.getTemplateIdsToAdd().toArray());
    map.put("template_ids_to_remove", this.getTemplateIdsToRemove().toArray());
    map.put("routing_details", this.getRoutingDetails());
    map.put("template_group_name", this.getTemplateGroupName());
    return map;
  }
}
