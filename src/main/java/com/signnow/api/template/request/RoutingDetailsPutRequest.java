/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.template.request;

import com.signnow.api.template.request.data.*;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to update routing details.
 */
@ApiEndpoint(
    name = "updateRoutingDetails",
    url = "/document/{document_id}/template/routing/detail",
    method = "put",
    auth = "bearer",
    namespace = "template",
    entity = "routingDetails",
    type = "application/json")
public final class RoutingDetailsPutRequest implements RequestInterface<Object> {

  /**
   * Template data for the request.
   */
  private final TemplateDataPut templateData;

  /**
   * Collection of template data objects for the request.
   */
  private final TemplateDataObjectPutCollection templateDataObject;

  /**
   * Collection of CCs for the request.
   */
  private final CcPutCollection cc;

  /**
   * Collection of CC steps for the request.
   */
  private final CcStepPutCollection ccStep;

  /**
   * Collection of viewers for the request.
   */
  private final ViewerPutCollection viewers;

  /**
   * Collection of approvers for the request.
   */
  private final ApproverPutCollection approvers;

  /**
   * Collection of invite link instructions for the request.
   */
  private final InviteLinkInstructionPutCollection inviteLinkInstructions;

  /**
   * URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructor for the RoutingDetailsPutRequest class.
   *
   * @param templateData The template data for the request.
   * @param templateDataObject The collection of template data objects for the request.
   * @param cc The collection of CCs for the request.
   * @param ccStep The collection of CC steps for the request.
   * @param viewers The collection of viewers for the request.
   * @param approvers The collection of approvers for the request.
   * @param inviteLinkInstructions The collection of invite link instructions for the request.
   */
  public RoutingDetailsPutRequest(
      TemplateDataPut templateData,
      TemplateDataObjectPutCollection templateDataObject,
      CcPutCollection cc,
      CcStepPutCollection ccStep,
      ViewerPutCollection viewers,
      ApproverPutCollection approvers,
      InviteLinkInstructionPutCollection inviteLinkInstructions) {
    this.templateData = templateData;
    this.templateDataObject = templateDataObject;
    this.cc = cc;
    this.ccStep = ccStep;
    this.viewers = viewers;
    this.approvers = approvers;
    this.inviteLinkInstructions = inviteLinkInstructions;
  }

  /**
   * @return The template data for the request.
   */
  public TemplateDataPut getTemplateData() {
    return this.templateData;
  }

  /**
   * @return The collection of template data objects for the request.
   */
  public TemplateDataObjectPutCollection getTemplateDataObject() {
    return this.templateDataObject;
  }

  /**
   * @return The collection of CCs for the request.
   */
  public CcPutCollection getCc() {
    return this.cc;
  }

  /**
   * @return The collection of CC steps for the request.
   */
  public CcStepPutCollection getCcStep() {
    return this.ccStep;
  }

  /**
   * @return The collection of viewers for the request.
   */
  public ViewerPutCollection getViewers() {
    return this.viewers;
  }

  /**
   * @return The collection of approvers for the request.
   */
  public ApproverPutCollection getApprovers() {
    return this.approvers;
  }

  /**
   * @return The collection of invite link instructions for the request.
   */
  public InviteLinkInstructionPutCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }

  /**
   * Adds a document ID to the URI parameters for the request.
   *
   * @param documentId The document ID to add.
   * @return The updated request.
   */
  public RoutingDetailsPutRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * @return The URI parameters for the request.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return uriParams;
  }

  /**
   * @return The payload for the request.
   */
  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("template_data", this.getTemplateData());
    map.put("template_data_object", this.getTemplateDataObject().toArray());
    map.put("cc", this.getCc().toArray());
    map.put("cc_step", this.getCcStep().toArray());
    map.put("viewers", this.getViewers().toArray());
    map.put("approvers", this.getApprovers().toArray());
    map.put("invite_link_instructions", this.getInviteLinkInstructions().toArray());
    return map;
  }
}
