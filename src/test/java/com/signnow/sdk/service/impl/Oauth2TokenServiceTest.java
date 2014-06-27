package com.signnow.sdk.service.impl;

import com.signnow.sdk.model.Oauth2Token;
import com.signnow.sdk.model.User;
import com.signnow.sdk.service.IAuthenticationService;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.signnow.sdk.TestBase;

import java.util.Date;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Bhanu on 6/26/2014.
 */
public class Oauth2TokenServiceTest extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(Oauth2TokenServiceTest.class);
    private IAuthenticationService authenticationService;
    private UserService userService;
    @Before
    public void before() {
        userService = new UserService();
        authenticationService = new OAuth2TokenService();
        ((OAuth2TokenService) authenticationService).setObjectMapper(getObjectMapper());
        ((UserService) userService).setObjectMapper(getObjectMapper());
    }

    @Test
    public void requestToken () {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);

        resultUser.setPassword("fakePassword");


        assertNotNull("No user id from creating user", resultUser.getId());


        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);

        assertNotNull("Access Token", requestedToken.getAccessToken());

    }

    @Test
    public void verifyToken () {

        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);

        resultUser.setPassword("fakePassword");


        assertNotNull("No user id from creating user", resultUser.getId());


        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);

        assertNotNull("Access Token", requestedToken.getAccessToken());

        Oauth2Token verifiedToken = authenticationService.verify(requestedToken);

        assertNotNull("Verify Token", verifiedToken.getAccessToken());


        assertEquals("Verified", requestedToken.getAccessToken(), verifiedToken.getAccessToken());

        assertNotSame("Refresh Token", requestedToken.getAccessToken(), verifiedToken.getRefreshToken());
    }

}
