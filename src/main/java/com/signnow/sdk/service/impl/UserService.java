package com.signnow.sdk.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.signnow.sdk.Config;
import com.signnow.sdk.model.User;
import com.signnow.sdk.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bhanu on 6/26/2014.
 *
 * This class is used to perform to Create / GET User details in the SignNow Application.
 */
public class UserService implements IUserService {
    final static Logger logger = LoggerFactory.getLogger(UserService.class);
    private ObjectMapper objectMapper;

    /**
     * This method is used to create (POST) a User in the SignNow Application.
     */
    @Override
    public User create(User user) {
        User createdUser = null;
        try {
            String requestBody = objectMapper.writeValueAsString(user);
            logger.debug("POSTING to /user \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/user")
                    .basicAuth(Config.getClientId(), Config.getClientSecret())
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .asString();
            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            createdUser = objectMapper.readValue(json, User.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
        return createdUser;
    }

    /**
     * This method is used to retrieve (GET) a User in the SignNow Application.
     */
    @Override
    public User get(User user) {
        User getUser = null;
        try {
            String requestBody = objectMapper.writeValueAsString(user);
            logger.debug("GET user to /user \n" + requestBody);

            HttpResponse httpResponse = Unirest.get(Config.getApiBase() + "/user")
                    .header("Authorization", "Bearer "+ user.getOauth2Token().getAccessToken())
                    .header("Accept", "application/json")
                    .asString();
            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            getUser = objectMapper.readValue(json, User.class);
        }
        catch(Exception ex) {
            logger.error(ex.getMessage());
        }
        return getUser;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
