package com.signnow.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bhanu on 6/30/2014.
 */
public class Template {
    @JsonProperty("document_id")
    private String documentId;

    @JsonProperty("document_name")
    private String documentName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

}
