package com.signnow.sdk.service.impl;

import ch.qos.logback.core.util.FileUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.signnow.sdk.Config;
import com.signnow.sdk.model.*;
import com.signnow.sdk.service.IDocumentService;
import org.omg.IOP.Encoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Bhanu on 6/27/2014.
 *
 * This class is used to perform operations on the Documents. This class is provides the guidle lines on how to call the SignNow API
 * for several operations like Create (POST), GetDocuemnt (GET), Update Document (PUT), Get Document History, etc.,
 */
public class DocumentService implements IDocumentService{
    final static Logger logger = LoggerFactory.getLogger(DocumentService.class);
    private ObjectMapper objectMapper;


    /*
    This method is used to create  or POST the document for a given user in the SignNow Application
     */
    @Override
    public Document create(Oauth2Token token,Document documentPath) {
        Document document = null;
        try {
            String requestBody = objectMapper.writeValueAsString(documentPath.getFilePath());
            logger.debug("POSTING to /document \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/document")
                    .header("Accept", "application/json")
                    //.header("Content-Type","multipart/form-data")
                    .header("Authorization", "Bearer "+token.getAccessToken())
                    .field("file", new File(documentPath.getFilePath()))
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

    /*
        This method is used to GET the document for a given user from the SignNow Application
     */
    @Override
    public Document getDocument(Oauth2Token token,String id) {
        Document document = null;
        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("Getting the Document to /document/documentId \n" + requestBody);
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

    /*
        This method is used to update [PUT] the document for a given user from the SignNow Application
     */
    @Override
    public Document updateDocument(Oauth2Token token,HashMap<String,List<Fields>> fieldsMap,String id) {
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

    /*
        This method is used to download (POST) the document as PDF for a given user from the SignNow Application
     */

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

    /*
        This method is used to (GET) download the Collapsed document for a given user from the SignNow Application
     */
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
            // TODO:  Write the response to a new pdf file and see if the raw data is saved properly.. open the file and verify...

            document = objectMapper.readValue(json, Document.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
        return document;
    }

    /*
        This method is used to (POST) invite the signers to sign on  the document in the SignNow Application
     */
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

    /*
        This method is used to (GET) get the Document History for a given Document and for a given user from the SignNow Application
     */
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
            document = objectMapper.readValue(json, Object.class).toString();
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
        return document;
    }

    /*
        This method is used to (POST)  create the template from a document in the SignNow Application
     */
    @Override
    public Template createTemplate(Oauth2Token token, Template template) {
        Template templ = null;
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
            templ = objectMapper.readValue(json, Template.class);        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
        return templ;
    }

     /*
        This method is used to (POST) create a new document from the given template id in the SignNow Application
     */

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


     /*
        This method is used to (POST) merge the new document from the given template id in the SignNow Application
     */

    @Override
    public InputStream mergeDocuments(Oauth2Token token, HashMap <String, List<String>> myMergeMap) {
        Document document = null;
        try {
            String requestBody = objectMapper.writeValueAsString(myMergeMap);
            logger.debug("POST  to /document/merge \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/document"+"/"+"merge")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/pdf")
                    .header("Authorization", "Bearer "+ token.getAccessToken())
                    .body(requestBody)
                    .asString();

           InputStream inputStream = httpResponse.getRawBody();
            return inputStream;
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
        return null;
    }
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
