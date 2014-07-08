package com.signnow.sdk.service;


import com.mashape.unirest.http.exceptions.UnirestException;
import com.signnow.sdk.model.User;

/**
 * Created by Bhanu on 6/26/2014.
 *
 * This interface is used to perform to User specific operations in the SignNow Application.
 */
public interface IUserService {

    /**
     * Creates a user in the SignNow system. User's email and password are required but first and last name
     * are optional attributes.
     *
     * @param user
     * @return the newly created user with her system generated ID
     */
    User create(User user);

    /**
     * Gets a user from the SignNow system based on her OAuth2 bearer token.
     *
     * @param user
     * @return
     */
    User get(User user);
}
