SNJavaSDK
=========

This is an SDK that wraps the SignNow REST API. Documentation for the REST API can be found out https://signnow.atlassian.net/wiki/display/SAPI/REST+Endpoints

# Dependencies

Package management is handled by Gradle. Please install ~v1.12 on your system using the instructions found at http://www.gradle.org/get-started

# Test

Unit tests are in the standard test directory at ```src/test/java```

If you are running into an error ```javax.net.ssl.SSLProtocolException: handshake alert:  unrecognized_name``` refer to this StackOverflow article http://stackoverflow.com/a/14884941/91358

# Build

```gradle jar``` will compile package the artifacts into a jar file in ```build/libs/```


# SignNowJavaSDK.jar

To start using the SignNow Java SDK, download the jar file from 
https://github.com/signnow/SNJavaSDK/tree/master/build  add it to the class path.


After importing the jar file you can create a java class with main method. Initialize the Config as shown in the examples.
If you want to use eval, use signnow.eval
If you want to use public, use signnow.public
Pass the client id and client secret you received.


Below are the few examples. 

#Examples

Initialize the below:

		ObjectMapper objectMapper =new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        IUserService userService = new UserService();
        ((UserService) userService).setObjectMapper(getObjectMapper());		
        IAuthenticationService authenticationService = new OAuth2TokenService();
        ((OAuth2TokenService) authenticationService).setObjectMapper(getObjectMapper());
        IDocumentService documentService = new DocumentService();
        ((DocumentService) documentService).setObjectMapper(getObjectMapper());

1. Create a User:

		public void createUser() 
		{
        String randomEmail = "Your Email Id";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");
        Config config = new Config("signnow.eval","Your Client Id","Your Client Secret");
        User resultUser = userService.create(user);
		System.out.println("Result User id "+ resultUser.getId());
		}

2. Get User:

		public void getUser() 
		{
        String randomEmail = "Your Email Id";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");
		Config config = new Config("signnow.eval","Your Client Id","Your Client Secret");		
        User resultUser = userService.create(user);
        resultUser.setPassword("fakePassword");
        System.out.println("Result User id "+ resultUser.getId());
        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        System.out.println("Access Token"+ requestedToken.getAccessToken());
        resultUser.setOauth2Token(requestedToken);
        User getUser = userService.get(resultUser);
        System.out.println("Result User ID" + getUser.getId());
        }

3. Request Token:

		public void requestToken () {
        String randomEmail = "Your Email Id";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("fakePassword");
		Config config = new Config("signnow.eval","Your Client Id","Your Client Secret");		
        User resultUser = userService.create(user);
        resultUser.setPassword("fakePassword");
        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        System.out.println("Access Token"+ requestedToken.getAccessToken());
		}

	
4. Create Document:

		public void createDocument () {
        String randomEmail = "Your Email Id";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");
		Config config = new Config("signnow.eval","Your Client Id","Your Client Secret");
        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        //create a class folder and copy the any pdf file (example: ReleaseForm.pdf file) to the classfolder.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
		}

5. Get Document:

		public void getDocument () {
        String randomEmail = "Your Email Id";
        User user = new User();
        user.setEmail(randomEmail);
        user.setPassword("password");
		Config config = new Config("signnow.eval","Your Client Id","Your Client Secret");
        User resultUser = userService.create(user);
        resultUser.setPassword("password");
        Oauth2Token requestedToken = authenticationService.requestToken(resultUser);
        //copy the ReleaseForm.pdf file to the test/resources.
        Document doc = new Document();
        String docFilePath = getClass().getClassLoader().getResource("ReleaseForm.pdf").getFile();
        doc.setFilePath(docFilePath);
        Document document = documentService.create(requestedToken,doc);
        Document resultDoc = documentService.getDocument(requestedToken,document.getId());
		}




