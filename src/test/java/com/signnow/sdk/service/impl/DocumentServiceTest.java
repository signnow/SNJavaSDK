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
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Bhanu on 6/27/2014.
 *
 * This test class is used to perform and test the Document specific test operations.
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

    /**
     *
     * This test method is used to create a Document in SignNow Application
     */
    @Test
    public void createDocument () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());
    }

    /**
     *
     * This test method is used to update an existing Document in SignNow Application
     */
    @Test
    public void updateDocument () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        // Build the data for Signature Test
        String signatureImageFilePath=getClass().getClassLoader().getResource("SignatureImage.jpg").getFile();
        String encodedString= getEncodedImage(signatureImageFilePath);

        String signatureImageFilePath1=getClass().getClassLoader().getResource("SignatureImage1.jpg").getFile();
        String encodedString1= getEncodedImage(signatureImageFilePath1);

        Signature signature = new Signature();
        signature.setX(305);
        signature.setY(18);
        signature.setPageNumber(1);
        signature.setWidth(100);
        signature.setHeight(30);
        signature.setData(encodedString);

        Signature signature1 = new Signature();
        signature1.setX(205);
        signature1.setY(28);
        signature1.setPageNumber(1);
        signature1.setWidth(100);
        signature1.setHeight(30);
        signature1.setData(encodedString1);

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

        ArrayList<Fields> textsList = new ArrayList<Fields>();
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

        Document resultDoc = documentService.updateDocument(requestedToken, fieldsMap,document.getId());

    }

    /**
     *
     * This utility method is used to get the encoded image from a given filePath
     */

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

    /**
     *
     * This utility method is used to convert the image based on its type to a base 64 encoded String.
     */
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

    /**
     *
     * This test method is used to GET the Document for a given user based on the given DocumentID from SignNow Application
     */
    @Test
    public void getDocument () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        Document resultDoc = documentService.getDocument(requestedToken,document.getId());
        Assert.assertNotNull("resultDoc id", resultDoc.getId());

    }

    /**
     *
     * This test method is used to GET a Document as PDF in SignNow Application
     */

    @Test
    public void getDocumentAsPDF()
    {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        Document resultDoc = documentService.downLoadDocumentAsPDF(requestedToken,document.getId());
        Assert.assertNotNull("resultDoc Link", resultDoc.getLink());
    }

    /**
     *
     * This test method is used to GET the Collapsed Document in SignNow Application
     */

    @Test

    public void getCollapsedDocument()
    {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        Document resultDoc = documentService.downLoadCollapsedDocument(requestedToken,document.getId());
    }

    /**
     *
     * This test method is used to invite the signers to sign the Document in SignNow Application
     */
    @Test
    public void invite () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        String toEmail = "bhanu" + new Date().getTime() + "@mailinator.com";

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


    /**
     *
     * This test method is used to GET the Document History for a given Document ID in SignNow Application
     */
    @Test
    public void getDocumentHistory () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

       // call getDocumentHistory
        String result  = documentService.getDocumentHistory(requestedToken,document.getId());
        assertNotNull("document history", result);
    }

    /**
     *
     * This test method is used to create a Template for a Given Document in SignNow Application
     */
    @Test
    public void createTemplate () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        Template template = new Template();
        template.setDocumentId(document.getId());
        template.setDocumentName("my template");

        // call createTemplate
        Template resultTemplate  = documentService.createTemplate(requestedToken,template);
        assertNotNull("template create result", resultTemplate.getId());
    }

    /**
     *
     * This test method is used to create a Document from a Template based on the template id SignNow Application
     */
    @Test
    public void createDocumentFromTemplate () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        Template template = new Template();
        template.setDocumentId(document.getId());
        template.setDocumentName("my template");

        // call createTemplate
        Template resultTemplate  = documentService.createTemplate(requestedToken,template);
        assertNotNull("template create result", resultTemplate.getId());

        String doc1 = documentService.createNewDocumentFromTemplate(requestedToken,resultTemplate);
        assertNotNull("document id",doc1);
    }


    /**
     *
     * This test method is used to merge the list of documents based on the given document id's in SignNow Application
     */
    @Test
    public void mergeDocument () {
        String randomEmail = "bhanu" + new Date().getTime() + "@mailinator.com";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");

        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        assertNotNull("No user id from creating user", resultUser.getId());

        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        assertNotNull("Access Token", requestedToken.getAccessToken());

        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document.getId());

        Document doc1 = new Document();
        String docFilePath1 = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath1);
        Document document1 = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document1.getId());

        Document doc2 = new Document();
        String docFilePath2 = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath2);
        Document document2 = documentService.create(requestedToken,doc);
        assertNotNull("DocumentId", document2.getId());

        ArrayList<String> docIds = new ArrayList<String>();
        docIds.add(document.getId());
        docIds.add(document1.getId());
       // docIds.add(document2.getId());
        HashMap <String, List<String>> myMergeMap = new HashMap<String, List<String>>();
        myMergeMap.put("document_ids",docIds);

        Document mergeDocument = new Document();
        mergeDocument = documentService.mergeDocuments(requestedToken, myMergeMap);
    }

}