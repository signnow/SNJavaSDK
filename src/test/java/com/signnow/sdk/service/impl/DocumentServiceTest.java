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

import java.util.ArrayList;
import java.util.Date;
import java.io.File;
import java.util.HashMap;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;

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
    public void updateDocument () {
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

        // Build the data for Signature Test
        String filePath="E:/SignNow/TestImage.jpg";
        String imageStr= getEncodedImage(filePath);

        String filePath1="E:/SignNow/TestImage1.jpg";
        String imageStr1= getEncodedImage(filePath1);

        Signature signature = new Signature();
        signature.setX(305);
        signature.setY(18);
        signature.setPageNumber(1);
        signature.setWidth(100);
        signature.setHeight(30);
        signature.setData(imageStr);

        Signature signature1 = new Signature();
        signature1.setX(205);
        signature1.setY(28);
        signature1.setPageNumber(1);
        signature1.setWidth(100);
        signature1.setHeight(30);
        signature1.setData(imageStr1);

        ArrayList<Fields> signatureList = new ArrayList();
        signatureList.add(signature);
        signatureList.add(signature1);

        // Build the data for Texts Test

        Text text = new Text();
        text.setPageNumber(0);
        text.setSize(30);
        text.setX(61);
        text.setY(72);
        text.setData("TEXT DATA FOR TESTING SIGNNOW");
        text.setFont("Arial");
        text.setLineHeight(9.075);


        Text text1 = new Text();
        text1.setPageNumber(1);
        text1.setSize(30);
        text1.setX(61);
        text1.setY(72);
        text1.setData("TEXT DATA FOR TESTING SIGNNOW AGAIN");
        text1.setFont("Arial");
        text1.setLineHeight(9.075);


        ArrayList<Fields> textsList = new ArrayList();
        textsList.add(text);
        textsList.add(text1);

        // Build the data for Checks

        Checkbox checks = new Checkbox();
        checks.setPageNumber(0);
        checks.setX(250);
        checks.setY(500);
        checks.setWidth(20);
        checks.setHeight(20);

        Checkbox checks1 = new Checkbox();
        checks1.setPageNumber(1);
        checks1.setX(250);
        checks1.setY(500);
        checks1.setWidth(20);
        checks1.setHeight(20);

        ArrayList<Fields> checksList = new ArrayList();
        checksList.add(checks);
        checksList.add(checks1);

        Fields fields = new Fields();
        fields.setPageNumber(1);
        fields.setHeight(121);
        fields.setWidth(25);
        fields.setRequired(true);
        fields.setRole("buyer");
        fields.setType("signature");
        fields.setX(13);
        fields.setY(133);


        ArrayList<Fields> fieldsList = new ArrayList();
        fieldsList.add(fields);

        HashMap <String,List<Fields>> fieldsMap = new HashMap<String,List<Fields>>();
        fieldsMap.put("signatures",signatureList);
        fieldsMap.put("texts",textsList);
        fieldsMap.put("checks",checksList);
        fieldsMap.put("fields",fieldsList);

        Document documentUpdate = new Document();
        documentUpdate.setFields(fieldsMap);

        Document resultDoc = documentService.updateDocument(requestedToken,documentUpdate.getFields(),document.getId());

    }

    public String getEncodedImage(String filePath)
    {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedImage newImg;
        String imgstr;
        imgstr = encodeToString(img, "jpg");
        return imgstr;
    }

    public String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();

            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
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

        File f = new File("E:\\SignNow\\Result.pdf");

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
      //  assertNotNull("document history", result.toString());

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