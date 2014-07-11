package com.signnow.sdk.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.sdk.service.IDocumentService;

import java.util.List;
import java.util.Map;

/**
 * Created by Bhanu on 6/27/2014.
 *
 * This class is used to create the document model object
 */
public class Document {

    private String id;
    private Oauth2Token oauth2Token;
    private String link;
    private String filePath;
    private Fields []fields;

    public Fields[] getFields() {
        return fields;
    }

    public void setFields(Fields[] fields) {
        this.fields = fields;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Oauth2Token getOauth2Token() {
        return oauth2Token;
    }

    public void setOauth2Token(Oauth2Token oauth2Token) {
        this.oauth2Token = oauth2Token;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}