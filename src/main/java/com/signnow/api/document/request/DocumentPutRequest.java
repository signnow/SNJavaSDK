/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.api.document.request.data.*;
import com.signnow.api.document.request.data.line.LineCollection;
import com.signnow.api.document.request.data.radiobutton.RadiobuttonCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "updateDocument",
    url = "/document/{document_id}",
    method = "put",
    auth = "bearer",
    namespace = "document",
    entity = "document",
    type = "application/json")
public final class DocumentPutRequest implements RequestInterface<Object> {

  private final FieldCollection fields;

  private final LineCollection lines;

  private final CheckCollection checks;

  private final RadiobuttonCollection radiobuttons;

  private final SignatureCollection signatures;

  private final TextCollection texts;

  private final AttachmentCollection attachments;

  private final HyperlinkCollection hyperlinks;

  private final IntegrationObjectCollection integrationObjects;

  private final DeactivateElementCollection deactivateElements;

  private final String documentName;

  private final String clientTimestamp;

  private final Map<String, String> uriParams = new HashMap<>();

  public DocumentPutRequest(
      FieldCollection fields,
      LineCollection lines,
      CheckCollection checks,
      RadiobuttonCollection radiobuttons,
      SignatureCollection signatures,
      TextCollection texts,
      AttachmentCollection attachments,
      HyperlinkCollection hyperlinks,
      IntegrationObjectCollection integrationObjects,
      DeactivateElementCollection deactivateElements,
      String documentName,
      String clientTimestamp) {
    this.fields = fields;
    this.lines = lines;
    this.checks = checks;
    this.radiobuttons = radiobuttons;
    this.signatures = signatures;
    this.texts = texts;
    this.attachments = attachments;
    this.hyperlinks = hyperlinks;
    this.integrationObjects = integrationObjects;
    this.deactivateElements = deactivateElements;
    this.documentName = documentName;
    this.clientTimestamp = clientTimestamp;
  }

  public DocumentPutRequest(FieldCollection fields) {
    this.fields = fields;
    this.lines = null;
    this.checks = null;
    this.radiobuttons = null;
    this.signatures = null;
    this.texts = null;
    this.attachments = null;
    this.hyperlinks = null;
    this.integrationObjects = null;
    this.deactivateElements = null;
    this.documentName = null;
    this.clientTimestamp = null;
  }

  public DocumentPutRequest(FieldCollection fields, String documentName) {
    this.fields = fields;
    this.lines = null;
    this.checks = null;
    this.radiobuttons = null;
    this.signatures = null;
    this.texts = null;
    this.attachments = null;
    this.hyperlinks = null;
    this.integrationObjects = null;
    this.deactivateElements = null;
    this.documentName = documentName;
    this.clientTimestamp = null;
  }

  public FieldCollection getFields() {
    return fields;
  }

  public LineCollection getLines() {
    return lines;
  }

  public CheckCollection getChecks() {
    return checks;
  }

  public RadiobuttonCollection getRadiobuttons() {
    return radiobuttons;
  }

  public SignatureCollection getSignatures() {
    return signatures;
  }

  public TextCollection getTexts() {
    return texts;
  }

  public AttachmentCollection getAttachments() {
    return attachments;
  }

  public HyperlinkCollection getHyperlinks() {
    return hyperlinks;
  }

  public IntegrationObjectCollection getIntegrationObjects() {
    return integrationObjects;
  }

  public DeactivateElementCollection getDeactivateElements() {
    return deactivateElements;
  }

  public String getDocumentName() {
    return documentName;
  }

  public String getClientTimestamp() {
    return clientTimestamp;
  }

  public DocumentPutRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
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
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("fields", this.getFields());
    map.put("lines", this.getLines());
    map.put("checks", this.getChecks());
    map.put("radiobuttons", this.getRadiobuttons());
    map.put("signatures", this.getSignatures());
    map.put("texts", this.getTexts());
    map.put("attachments", this.getAttachments());
    map.put("hyperlinks", this.getHyperlinks());
    map.put("integration_objects", this.getIntegrationObjects());
    map.put("deactivate_elements", this.getDeactivateElements());
    map.put("document_name", this.getDocumentName());
    map.put("client_timestamp", this.getClientTimestamp());
    return map;
  }
}
