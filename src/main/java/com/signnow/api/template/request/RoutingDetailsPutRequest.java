/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.template.request;

import com.signnow.api.template.request.data.ApproverPutCollection;
import com.signnow.api.template.request.data.CcPutCollection;
import com.signnow.api.template.request.data.CcStepPutCollection;
import com.signnow.api.template.request.data.InviteLinkInstructionPutCollection;
import com.signnow.api.template.request.data.TemplateDataObjectPutCollection;
import com.signnow.api.template.request.data.TemplateDataPut;
import com.signnow.api.template.request.data.ViewerPutCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "updateRoutingDetails",
    url = "/document/{document_id}/template/routing/detail",
    method = "put",
    auth = "bearer",
    namespace = "template",
    entity = "routingDetails",
    type = "application/json")
public final class RoutingDetailsPutRequest implements RequestInterface<Object> {

  private final TemplateDataPut templateData;

  private final TemplateDataObjectPutCollection templateDataObject;

  private final CcPutCollection cc;

  private final CcStepPutCollection ccStep;

  private final ViewerPutCollection viewers;

  private final ApproverPutCollection approvers;

  private final InviteLinkInstructionPutCollection inviteLinkInstructions;

  private final HashMap<String, String> uriParams = new HashMap<>();

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

  public TemplateDataPut getTemplateData() {
    return this.templateData;
  }

  public TemplateDataObjectPutCollection getTemplateDataObject() {
    return this.templateDataObject;
  }

  public CcPutCollection getCc() {
    return this.cc;
  }

  public CcStepPutCollection getCcStep() {
    return this.ccStep;
  }

  public ViewerPutCollection getViewers() {
    return this.viewers;
  }

  public ApproverPutCollection getApprovers() {
    return this.approvers;
  }

  public InviteLinkInstructionPutCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }

  public RoutingDetailsPutRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return uriParams;
  }

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
