package com.signnow.sdk.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.signnow.sdk.Config;
import com.signnow.sdk.model.*;
import com.signnow.sdk.service.IDocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by Bhanu on 6/27/2014.
 */
public class DocumentService implements IDocumentService{
    final static Logger logger = LoggerFactory.getLogger(DocumentService.class);
    private ObjectMapper objectMapper;


    @Override
    public Document create(Oauth2Token token) {
        Document document = null;

        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("POSTING to /document \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/document")
                    .header("Accept", "application/json")
                    .header("Authorization", "Bearer "+token.getAccessToken())
                    .field("file", new File("E:/SignNow/ReleaseForm.pdf"))
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            document = objectMapper.readValue(json, Document.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return document;
    }

    @Override
    public Document getDocument(Oauth2Token token,String id) {
        Document document = null;

        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("Getting the Document to /documentI/documentId \n" + requestBody);
            HttpResponse httpResponse = Unirest.get(Config.getApiBase() + "/document" + "/" + id)
                    .header("Accept", "application/json")
                    .header("Authorization", "Bearer " + token.getAccessToken())
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            document = objectMapper.readValue(json, Document.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return document;
    }

    @Override
    public Document updateDocument(Oauth2Token token,Map<String,List<Fields>> fieldsMap,String id) {
        Document document = null;
        try {
            String requestBody = objectMapper.writeValueAsString(fieldsMap);
            logger.debug("PUT to /document/<id> \n" + requestBody);
            HttpResponse httpResponse = Unirest.put(Config.getApiBase() + "/document" + "/" + id)
                    .header("Accept", "application/json")
                    .header("Content-Type","application/json")
                    .header("Authorization", "Bearer " + token.getAccessToken())
                    .body(requestBody)
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            document = objectMapper.readValue(json, Document.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return document;
    }


    @Override
    public Document downLoadDocumentAsPDF(Oauth2Token token, String id) {
        Document document = null;

        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("POST  to /documentI/id/download/link \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/document" + "/" + id + "/download/link")
                    .header("Accept", "application/json")
                    .header("Authorization", "Bearer " + token.getAccessToken())
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            document = objectMapper.readValue(json, Document.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return document;
    }

    @Override
    public Document downLoadCollapsedDocument(Oauth2Token token, String id) {
        Document document = null;

        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("GET  to /document/id/download?type=collapsed \n" + requestBody);
            HttpResponse httpResponse = Unirest.get(Config.getApiBase() + "/document" + "/" + id + "/download?type=collapsed")
                    .header("Accept", "application/json")
                    .header("Authorization", "Bearer " + token.getAccessToken())
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            document = objectMapper.readValue(json, Document.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return document;
    }

    @Override
    public String invite(Oauth2Token token,Invitation invitation, String id) {
        String result = null;

        try {
            String requestBody = objectMapper.writeValueAsString(invitation);
            logger.debug("POSTING to /document/id/invite \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/document"+"/"+id+"/invite?email=disable")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer "+token.getAccessToken())
                    .body(requestBody)
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            result = objectMapper.readValue(json, Invitation.class).toString();
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return result;
    }

/*    @Override
    public String notaryInvite(Oauth2Token token, Invitation invitation) {
        String result = null;

        try {
            String requestBody = objectMapper.writeValueAsString(invitation);
            logger.debug("POSTING to /notaryinvite \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/notaryinvite")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer "+token.getAccessToken())
                    .body(requestBody)
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            result = objectMapper.readValue(json, Invitation.class).toString();
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return result;
    }*/

    @Override
    public String getDocumentHistory(Oauth2Token token, String id) {
        String document = null;
        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("GET  to /document/<id>/history \n" + requestBody);
            HttpResponse httpResponse = Unirest.get(Config.getApiBase() + "/document" + "/" + id + "/history")
                    //.header("Accept", "application/json")
                    .header("Authorization", "Bearer " + token.getAccessToken())
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            document = objectMapper.readValue(json, Document.class).toString();
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
        return document;

    }

    @Override
    public Template createTemplate(Oauth2Token token, Template template) {
        Template temp = null;

        try {
            String requestBody = objectMapper.writeValueAsString(template);

            logger.debug("POST  to /template \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/template")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer "+ token.getAccessToken())
                    .body(requestBody)
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            temp = objectMapper.readValue(json, Template.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return temp;

    }


    @Override
    public String createNewDocumentFromTemplate(Oauth2Token token, Template template) {
        String str = null;

        try {
            String requestBody = objectMapper.writeValueAsString(template);

            logger.debug("POST  to /template \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/template"+"/"+template.getId()+"/copy")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer "+ token.getAccessToken())
                    .body(requestBody)
                    .asString();

            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            str = objectMapper.readValue(json, Template.class).toString();
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }

        return str;

    }
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
