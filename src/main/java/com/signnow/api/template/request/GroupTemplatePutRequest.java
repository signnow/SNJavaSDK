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

/**
 * Represents a request to update a group template.
 * This class is used to send a PUT request to the "updateDocumentGroupTemplate" API endpoint.
 */
@ApiEndpoint(
    name = "updateDocumentGroupTemplate",
    url = "/documentgroup/template/{template_id}",
    method = "put",
    auth = "bearer",
    namespace = "template",
    entity = "groupTemplate",
    type = "application/json")
public final class GroupTemplatePutRequest implements RequestInterface<Object> {

  /**
   * The routing details for the request.
   */
  private final RoutingDetail routingDetails;

  /**
   * The name of the template group.
   */
  private final String templateGroupName;

  /**
   * The collection of template IDs to add.
   */
  private final TemplateIdsToAddCollection templateIdsToAdd;

  /**
   * The collection of template IDs to remove.
   */
  private final TemplateIdsToRemoveCollection templateIdsToRemove;

  /**
   * The URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new GroupTemplatePutRequest with the specified parameters.
   *
   * @param routingDetails the routing details
   * @param templateGroupName the template group name
   * @param templateIdsToAdd the template IDs to add
   * @param templateIdsToRemove the template IDs to remove
   */
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

  /**
   * Constructs a new GroupTemplatePutRequest with the specified parameters and empty collections for template IDs to add and remove.
   *
   * @param routingDetails the routing details
   * @param templateGroupName the template group name
   */
  public GroupTemplatePutRequest(RoutingDetail routingDetails, String templateGroupName) {
    this(
        routingDetails,
        templateGroupName,
        new TemplateIdsToAddCollection(),
        new TemplateIdsToRemoveCollection());
  }

  /**
   * Returns the collection of template IDs to add.
   *
   * @return the collection of template IDs to add
   */
  public TemplateIdsToAddCollection getTemplateIdsToAdd() {
    return this.templateIdsToAdd;
  }

  /**
   * Returns the collection of template IDs to remove.
   *
   * @return the collection of template IDs to remove
   */
  public TemplateIdsToRemoveCollection getTemplateIdsToRemove() {
    return this.templateIdsToRemove;
  }

  /**
   * Returns the routing details.
   *
   * @return the routing details
   */
  public RoutingDetail getRoutingDetails() {
    return this.routingDetails;
  }

  /**
   * Returns the template group name.
   *
   * @return the template group name
   */
  public String getTemplateGroupName() {
    return this.templateGroupName;
  }

  /**
   * Adds a template ID to the URI parameters and returns this request.
   *
   * @param templateId the template ID to add
   * @return this request
   */
  public GroupTemplatePutRequest withTemplateId(String templateId) {
    this.uriParams.put("template_id", templateId);
    return this;
  }

  /**
   * Returns a new map containing the URI parameters.
   *
   * @return a new map containing the URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a map containing the payload for the request.
   *
   * @return a map containing the payload for the request
   */
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
