package com.signnow.sdk.model;
import com.signnow.sdk.service.IDocumentService;

import java.util.List;
import java.util.Map;

/**
 * Created by Bhanu on 6/27/2014.
 */
public class Document {

    String id;
    private Oauth2Token oauth2Token;
    private String link;

    private Map<String,List<Fields>> fields ;

    public Map<String,List<Fields>> getFields() {
        return fields;
    }

    public void setFields(Map<String,List<Fields>> fields) {
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

}