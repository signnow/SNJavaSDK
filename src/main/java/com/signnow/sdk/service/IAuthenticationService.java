package com.signnow.sdk.service;

import com.signnow.sdk.model.Oauth2Token;
import com.signnow.sdk.model.User;

/**
 * Created by Bhanu on 6/26/2014.
 *
 * This interface is used to perform to OAuth2 specific operations in the SignNow Application.
 */
public interface IAuthenticationService {
    /**
     * Requests an OAuth2 token for the user. User's email, password, and grantType are required. The scope attribute
     * is optional.
     *
     * @param user
     * @return a user with the system generated OAuth2 credentials
     */
    Oauth2Token requestToken(User user);


    /**
     * Verify that an OAuth2 token is still valid for some user.
     *
     * @return
     */
    Oauth2Token verify(Oauth2Token token);
}
