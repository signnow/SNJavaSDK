package com.signnow.sdk.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.signnow.sdk.Config;
import com.signnow.sdk.model.Document;
import com.signnow.sdk.model.Oauth2Token;
import com.signnow.sdk.service.IDocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;

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
            //File f  = new File("E:/SignNow/TestDocument.docx");
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/document")
                    .header("Accept", "application/json")
                    .header("Authorization", "Bearer "+token.getAccessToken())
                    .field("file", new File("E:/SignNow/SAPI-RESTEndpoints-120614-0559-2.pdf"))
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
            //File f  = new File("E:/SignNow/TestDocument.docx");
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
    public Document downLoadDocumentAsPDF(Oauth2Token token, String id) {
        Document document = null;

        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("POST  to /documentI/id/download/link \n" + requestBody);
            //File f  = new File("E:/SignNow/TestDocument.docx");
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
            //File f  = new File("E:/SignNow/TestDocument.docx");
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

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
