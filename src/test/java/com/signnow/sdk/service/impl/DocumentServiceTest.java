package com.signnow.sdk.service.impl;

import com.signnow.sdk.TestBase;
import com.signnow.sdk.model.Document;
import com.signnow.sdk.model.Oauth2Token;
import com.signnow.sdk.model.User;
import com.signnow.sdk.service.IAuthenticationService;
import com.signnow.sdk.service.IDocumentService;
import com.signnow.sdk.service.IUserService;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Bhanu on 6/27/2014.
 */
public class DocumentServiceTest extends TestBase{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);
    private IUserService userService;
    private IAuthenticationService authenticationService;
    private IDocumentService documentService;

    @Before
    public void before() {
        userService = new UserService();
        ((UserService) userService).setObjectMapper(getObjectMapper());
        authenticationService = new OAuth2TokenService();
        ((OAuth2TokenService) authenticationService).setObjectMapper(getObjectMapper());

        documentService = new DocumentService();
        ((DocumentService) documentService).setObjectMapper(getObjectMapper());
    }

    @Test
    public void createDocument () {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);

        resultUser.setPassword("fakePassword");


        assertNotNull("No user id from creating user", resultUser.getId());


        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);

        assertNotNull("Access Token", requestedToken.getAccessToken());

        Document document = documentService.create(requestedToken);

        assertNotNull("DocumentId" , document.getId());

    }

    @Test
    public void getDocument () {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);

        resultUser.setPassword("fakePassword");


        assertNotNull("No user id from creating user", resultUser.getId());


        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);

        assertNotNull("Access Token", requestedToken.getAccessToken());

        Document document = documentService.create(requestedToken);

        assertNotNull("DocumentId" , document.getId());

        Document document1 = documentService.getDocument(requestedToken,document.getId());
        System.out.println("document1::::::::::::::::::::"+document1.getId());
        Assert.assertNotNull("Document1 id", document1.getId());

    }

    @Test

    public void getDocumentAsPDF()
    {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);

        resultUser.setPassword("fakePassword");


        assertNotNull("No user id from creating user", resultUser.getId());


        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);

        assertNotNull("Access Token", requestedToken.getAccessToken());

        Document document = documentService.create(requestedToken);

        assertNotNull("DocumentId" , document.getId());

        Document document1 = documentService.downLoadDocumentAsPDF(requestedToken,document.getId());
        System.out.println("document1 Link::::::::::::::::::::"+document1.getLink());
        Assert.assertNotNull("Document1 Link", document1.getLink());
    }


    @Test

    public void getCollapsedDocument()
    {
        String randomEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");

        User resultUser = userService.create(user);

        resultUser.setPassword("fakePassword");


        assertNotNull("No user id from creating user", resultUser.getId());


        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);

        assertNotNull("Access Token", requestedToken.getAccessToken());

        Document document = documentService.create(requestedToken);

        assertNotNull("DocumentId" , document.getId());

        Document document1 = documentService.downLoadCollapsedDocument(requestedToken,document.getId());

        // TODO:  Write teh response to a new pdf file and see if the raw data is saved properly.. open the file and verify...

        //
    }
}
