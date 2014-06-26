package com.signnow.sdk.service.impl;

import com.signnow.sdk.TestBase;
import com.signnow.sdk.model.User;
import com.signnow.sdk.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static junit.framework.TestCase.assertNotNull;

public class UserServiceTest extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);
    private IUserService userService;

    @Before
    public void before() {
        userService = new UserService();
        ((UserService) userService).setObjectMapper(getObjectMapper());
    }

    @Test
    public void createUser() {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);

        assertNotNull("No user id from creating user", resultUser.getId());
    }
}
