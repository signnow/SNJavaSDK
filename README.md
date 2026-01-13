# signNow API Java SDK
## v3.5.1

[![Java Version](https://img.shields.io/badge/codebase-java--11-yellowgreen)](https://www.java.com/)

### About SignNow
SignNow is a powerful web-based e-signature solution that streamlines the signing process and overall document flow for businesses of any size. SignNow offers SaaS as well as public and private cloud deployment options using the same underlying API. With SignNow you can easily sign, share and manage documents in compliance with international data laws and industry-specific regulations. SignNow enables you to collect signatures from partners, employees and customers from any device within minutes. For more details, please, visit [SignNow API Reference](https://docs.signnow.com/docs/signnow/welcome).

### Requirements
- Java 11
- Maven

### Installation
Get SDK code from GitHub:
```bash
git clone https://github.com/signnow/SNJavaSDK.git
```
Install dependencies
```bash
# We must run the API mock server first, as it is a dependency for the tests
make mock-up

# Install all the dependencies and run the tests
mvn install
```

### Configuration
Copy `.env.example` to `.env` and fill your credentials in the required values.
```bash
cp .env.example .env
```

### Credentials
To run examples or use the SDK in your project, you will need API keys. Follow these steps to obtain them:

1. Register for an account on SignNow [here](https://www.signnow.com/api)
2. Create a new application.
3. Obtain the Basic Authentication API token for your application.
4. Add your email, password, and the Basic token to the .env file.

Now, you are ready to use the SDK.

### Run tests
```bash
## Run mock server locally (must be started first, before running tests)
make mock-up

## Run all the tests
make tests

## Run a specified test
make test T=SdkTest
make test T=TokenTest#testPostToken

## Stop mock server
make mock-stop
```
Mock server will be available at `http://127.0.0.1:8086`.
To change the host or port, edit [wiremock-config.env](./src/test/resources/wiremock-config.env) for starting WireMock,
and [.env.test](./src/test/resources/.env.test) for running tests.

### Usage
To start using the SDK, you need to create a new instance of the SDK API client. This can be done manually or through the SdkFactory.
Example of manually creating a new token:
```java
import com.signnow.api.user.request.UserGetRequest;
import com.signnow.api.user.response.UserGetResponse;
import com.signnow.Sdk;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.token.BearerToken;

public class AuthenticateExample {
    public static void main(String[] args) {
        
        try {
            // Create a new instance of the API client containing a freshly created bearer token
            Sdk sdk = new Sdk();
            ApiClient client = sdk
                    .build()
                    .authenticate()
                    .getApiClient();

            // you can save the token for further usage if you want
            BearerToken token = client.getBearerToken();

            // or continue using client
            UserGetRequest request = new UserGetRequest();
            UserGetResponse response = (UserGetResponse) client.send(request);

            System.out.println("User ID: " + response.getId());
            System.out.println("User name: " + response.getFirstName());
        } catch (SignNowApiException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
```

Example of using an already created token:
```java
import com.signnow.api.user.request.UserGetRequest;
import com.signnow.api.user.response.UserGetResponse;
import com.signnow.Sdk;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.token.BearerToken;

public class AuthenticateExample {
    public static void main(String[] args) {
        
        try {
            // Create a new instance without authentication (no tokens)
            Sdk sdk = new Sdk();
            ApiClient client = sdk
                    .build()
                    .getApiClient();

            // Use previously saved token
            client.setBearerToken(token);

            // then continue using authenticated client with token
            UserGetRequest request = new UserGetRequest();
            UserGetResponse response = (UserGetResponse) client.send(request);

            System.out.println("User ID: " + response.getId());
            System.out.println("User name: " + response.getFirstName());
        } catch (SignNowApiException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
```

Example of creating a new token through SDK:
```java
import com.signnow.api.document.request.DocumentGetRequest;
import com.signnow.api.document.response.DocumentGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DocumentGetExample {
    public static void main(String[] args) {

        // Provide your actual document ID here
        String documentId = "05fbed799231d85cf3471121ecd6a4221f9c5610";

        try {
            // The required authorization token will be created automatically by SdkFactory
            // using your credentials from .env file
            ApiClient client = SdkFactory.createApiClient();

            // You are now ready to send API requests using the SDK
            DocumentGetRequest request = new DocumentGetRequest();
            request.withDocumentId(documentId);
            DocumentGetResponse response = (DocumentGetResponse) client.send(request);

            System.out.println("Document ID: " + response.getId());
            System.out.println("Document Name: " + response.getDocumentName());
            System.out.println("Document Owner: " + response.getUserId());
        } catch (SignNowApiException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
```

#### Proxy endpoints usage

If you need to call an API endpoint that is not yet available in the SDK, you can still access it using the proxy mechanism.

This allows you to send custom requests without waiting for an official SDK update.

To do this, create a class that extends `CustomProxyRequest` and annotate it with `@ApiEndpoint`, setting: `namespace = "proxy"`.

The `name` and `entity` values within the annotation can be arbitrary and do not affect functionality.

Example of creating a request to proxy any unimplemented endpoint that returns JSON data: [ProxyJsonTest](./src/test/java/com/signnow/api/proxy/ProxyJsonTest.java).

Example of creating a request to proxy any unimplemented endpoint that returns a file: [ProxyFileTest](./src/test/java/com/signnow/api/proxy/ProxyFileTest.java).

### Examples
You can find more examples of API usage in the [examples](./examples) directory.
