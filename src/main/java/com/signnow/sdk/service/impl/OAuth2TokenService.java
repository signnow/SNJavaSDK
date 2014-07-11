package com.signnow.sdk.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.signnow.sdk.Config;
import com.signnow.sdk.model.Oauth2Token;
import com.signnow.sdk.model.User;
import com.signnow.sdk.service.IAuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bhanu on 6/26/2014.
 * <p/>
 * This class is used to perform the OAuth2 token specific operations to access SignNow Application.
 */
public class OAuth2TokenService implements IAuthenticationService {

    final static Logger logger = LoggerFactory.getLogger(OAuth2TokenService.class);
    private ObjectMapper objectMapper;

    /**
     * This method is used to request (POST)the OAuth2 token for a specific user to access SignNow Application.
     */
    @Override
    public Oauth2Token requestToken(User user) {
        Oauth2Token requestedToken = null;
        try {
            String requestBody = objectMapper.writeValueAsString(user);
            logger.debug("POSTING to /oauth2/token \n" + requestBody);
            HttpResponse httpResponse = Unirest.post(Config.getApiBase() + "/oauth2/token")
                    .basicAuth(Config.getClientId(), Config.getClientSecret())
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .field("username", user.getEmail())
                    .field("password", user.getPassword())
                    .field("grant_type", "password")
                    .asString();
            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            requestedToken = objectMapper.readValue(json, Oauth2Token.class);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return requestedToken;
    }

    /**
     * This method is used to verify (GET) the OAuth2 token for a specific user to access SignNow Application.
     */
    @Override
    public Oauth2Token verify(Oauth2Token token) {
        Oauth2Token verifyToken = null;
        try {
            String requestBody = objectMapper.writeValueAsString(token);
            logger.debug("GET to /oauth2/token \n" + requestBody);

            HttpResponse httpResponse = Unirest.get(Config.getApiBase() + "/oauth2/token")
                    .header("Authorization", "Bearer " + token.getAccessToken())
                    .header("Accept", "application/json")
                    .asString();
            String json = httpResponse.getBody().toString();
            logger.debug("Response body is " + json);
            verifyToken = objectMapper.readValue(json, Oauth2Token.class);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return verifyToken;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
