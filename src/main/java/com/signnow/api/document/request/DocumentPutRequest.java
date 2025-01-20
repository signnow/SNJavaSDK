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

/**
 * Represents a request to update a document.
 */
@ApiEndpoint(
    name = "updateDocument",
    url = "/document/{document_id}",
    method = "put",
    auth = "bearer",
    namespace = "document",
    entity = "document",
    type = "application/json")
public final class DocumentPutRequest implements RequestInterface<Object> {

  /**
   * Collection of fields in the document.
   */
  private final FieldCollection fields;

  /**
   * Collection of lines in the document.
   */
  private final LineCollection lines;

  /**
   * Collection of checks in the document.
   */
  private final CheckCollection checks;

  /**
   * Collection of radio buttons in the document.
   */
  private final RadiobuttonCollection radiobuttons;

  /**
   * Collection of signatures in the document.
   */
  private final SignatureCollection signatures;

  /**
   * Collection of texts in the document.
   */
  private final TextCollection texts;

  /**
   * Collection of attachments in the document.
   */
  private final AttachmentCollection attachments;

  /**
   * Collection of hyperlinks in the document.
   */
  private final HyperlinkCollection hyperlinks;

  /**
   * Collection of integration objects in the document.
   */
  private final IntegrationObjectCollection integrationObjects;

  /**
   * Collection of elements to be deactivated in the document.
   */
  private final DeactivateElementCollection deactivateElements;

  /**
   * Name of the document.
   */
  private final String documentName;

  /**
   * Client timestamp.
   */
  private final String clientTimestamp;

  /**
   * URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentPutRequest with the specified parameters.
   */
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

  /**
   * Constructs a new DocumentPutRequest with the specified fields.
   */
  public DocumentPutRequest(FieldCollection fields) {
    this(fields, null, null, null, null, null, null, null, null, null, null, null);
  }

  /**
   * Constructs a new DocumentPutRequest with the specified fields and document name.
   */
  public DocumentPutRequest(FieldCollection fields, String documentName) {
    this(fields, null, null, null, null, null, null, null, null, null, documentName, null);
  }

  /**
   * Returns the fields of the document.
   */
  public FieldCollection getFields() {
    return fields;
  }

  /**
   * Returns the lines of the document.
   */
  public LineCollection getLines() {
    return lines;
  }

  /**
   * Returns the checks of the document.
   */
  public CheckCollection getChecks() {
    return checks;
  }

  /**
   * Returns the radio buttons of the document.
   */
  public RadiobuttonCollection getRadiobuttons() {
    return radiobuttons;
  }

  /**
   * Returns the signatures of the document.
   */
  public SignatureCollection getSignatures() {
    return signatures;
  }

  /**
   * Returns the texts of the document.
   */
  public TextCollection getTexts() {
    return texts;
  }

  /**
   * Returns the attachments of the document.
   */
  public AttachmentCollection getAttachments() {
    return attachments;
  }

  /**
   * Returns the hyperlinks of the document.
   */
  public HyperlinkCollection getHyperlinks() {
    return hyperlinks;
  }

  /**
   * Returns the integration objects of the document.
   */
  public IntegrationObjectCollection getIntegrationObjects() {
    return integrationObjects;
  }

  /**
   * Returns the elements to be deactivated in the document.
   */
  public DeactivateElementCollection getDeactivateElements() {
    return deactivateElements;
  }

  /**
   * Returns the name of the document.
   */
  public String getDocumentName() {
    return documentName;
  }

  /**
   * Returns the client timestamp.
   */
  public String getClientTimestamp() {
    return clientTimestamp;
  }

  /**
   * Sets the document ID for the request.
   */
  public DocumentPutRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns the URI parameters for the request.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns the payload for the request.
   */
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
