package com.signnow.sdk.service.impl;

import com.signnow.sdk.TestBase;
import com.signnow.sdk.model.*;
import com.signnow.sdk.service.IAuthenticationService;
import com.signnow.sdk.service.IDocumentService;
import com.signnow.sdk.service.IUserService;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.io.File;

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

        Document resultDoc = documentService.getDocument(requestedToken,document.getId());
        System.out.println("resultDoc::::::::::::::::::::"+resultDoc.getId());
        Assert.assertNotNull("resultDoc id", resultDoc.getId());

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

        Document resultDoc = documentService.downLoadDocumentAsPDF(requestedToken,document.getId());
        System.out.println("resultDoc Link::::::::::::::::::::"+resultDoc.getLink());
        Assert.assertNotNull("resultDoc Link", resultDoc.getLink());
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

        Document resultDoc = documentService.downLoadCollapsedDocument(requestedToken,document.getId());

        // TODO:  Write teh response to a new pdf file and see if the raw data is saved properly.. open the file and verify...


        //
    }

    @Test
    public void invite () {
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

        String toEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";

        Invitation invitation = new Invitation();
        invitation.setFromEmail(resultUser.getEmail());
        invitation.setToEmail(toEmail);

        System.out.println("calling the invite method  >>>>>>>>>>>>>>" + requestedToken.getAccessToken() + "-----" + document.getId() + "-----" + invitation.getFromEmail() + "-----" + invitation.getToEmail());
        String result  = documentService.invite(requestedToken,invitation, document.getId());
        Assert.assertNotNull("result" + result.contains("success"));

    }


   /* @Test
    public void notaryInvite () {
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

        //template
        Template template = new Template();
        template.setDocumentId(document.getId());
        template.setDocumentName("my template");

        // call createTemplate
        Template resultTemplate  = documentService.createTemplate(requestedToken,template);
        assertNotNull("template create result", resultTemplate.getId());

        //template

        String toEmail = "lukeskywalker" + new Date().getTime() + "@mailinator.com";

        Invitation invitation = new Invitation();
        invitation.setFromEmail(resultUser.getEmail());
        invitation.setToEmail(toEmail);
        invitation.setBoolOriginatorPay(true);
        invitation.setDocumentId(resultTemplate.getId());
        System.out.println("calling the invite method  >>>>>>>>>>>>>>" + requestedToken.getAccessToken() + "-----" + document.getId() + "-----" + invitation.getFromEmail() + "-----" + invitation.getToEmail()+"----"+invitation.isBoolOriginatorPay());
        String result  = documentService.notaryInvite(requestedToken,invitation);
        Assert.assertNotNull("result" + result.contains("success"));

    }*/


    @Test
    public void getDocumentHistory () {
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

       // call getDocumentHistory
       String result  = documentService.getDocumentHistory(requestedToken,document.getId());
        assertNotNull("document history", result.toString());

    }


    @Test
    public void createTemplate () {
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

        Template template = new Template();
        template.setDocumentId(document.getId());
        template.setDocumentName("my template");

        // call createTemplate
        Template resultTemplate  = documentService.createTemplate(requestedToken,template);
        assertNotNull("template create result", resultTemplate.getId());
    }

    @Test
    public void createDocumentFromTemplate () {
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

        Template template = new Template();
        template.setDocumentId(document.getId());
        template.setDocumentName("my template");

        // call createTemplate
        Template resultTemplate  = documentService.createTemplate(requestedToken,template);
        assertNotNull("template create result", resultTemplate.getId());

        String doc = documentService.createNewDocumentFromTemplate(requestedToken,resultTemplate);
        assertNotNull("document id",doc);

    }
}
