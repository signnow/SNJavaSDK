package com.signnow.sdk.service.impl;

import com.signnow.sdk.Config;
import com.signnow.sdk.TestBase;
import com.signnow.sdk.model.Oauth2Token;
import com.signnow.sdk.model.User;
import com.signnow.sdk.service.IAuthenticationService;
import com.signnow.sdk.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class UserServiceTest extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);
    private IUserService userService;
    private IAuthenticationService authenticationService;

    @Before
    public void before() {
        userService = new UserService();
        ((UserService) userService).setObjectMapper(getObjectMapper());
        authenticationService = new OAuth2TokenService();
        ((OAuth2TokenService) authenticationService).setObjectMapper(getObjectMapper());
    }

    @Test
    public void createUser() {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        Config config = new Config("signnow.eval","0fccdbc73581ca0f9bf8c379e6a96813","3719a124bcfc03c534d4f5c05b5a196b");

        User resultUser = userService.create(user);

        assertNotNull("No user id from creating user", resultUser.getId());
    }


    @Test
    public void getUser() {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);
        resultUser.setPassword("fakePassword");

        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        resultUser.setOauth2Token(requestedToken);

        User getUser = userService.get(resultUser);
        assertEquals("Found",resultUser.getId(), getUser.getId());

    }
}
