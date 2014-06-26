package com.signnow.sdk.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.signnow.sdk.Config;
import com.signnow.sdk.model.User;
import com.signnow.sdk.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserService implements IUserService {
    final static Logger logger = LoggerFactory.getLogger(UserService.class);

    private ObjectMapper objectMapper;

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

    @Override
    public User get(User user) {
        return null;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
