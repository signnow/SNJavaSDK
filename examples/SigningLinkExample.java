import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.documentinvite.request.SigningLinkPostRequest;
import com.signnow.api.documentinvite.response.SigningLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class SigningLinkExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    // Preconditions: you have a document available for signing
    // it means the document must contain at least one field with assigned signining role
    // Details: https://docs.signnow.com/docs/signnow/signing-link/operations/create-a-link
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    // Provide actual URL to be redirected after successful signing (if you need it)
    String redirectUrl = null;
    // Document to be signed
    String pathToDocument = "/your/path/to/file.pdf"; // Path to a document to be signed

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId = response.getId();

      // Add fields with roles to the document
      FieldCollection fields = new FieldCollection();
      fields.add(
          new Field(
              205,
              18,
              122,
              12,
              "text",
              0,
              true,
              signerRole,
              "signer_reason_text_field",
              "Reason to sign"));
      DocumentPutRequest putFieldsRequest = new DocumentPutRequest(fields);
      putFieldsRequest.withDocumentId(documentId);
      client.send(putFieldsRequest);

      SigningLinkPostRequest request = new SigningLinkPostRequest(documentId, redirectUrl);
      SigningLinkPostResponse response = (SigningLinkPostResponse) client.send(request).getResponse();

      System.out.println("Signing link: " + response.getUrl());
      System.out.println("Signing link: [no signup]" + response.getUrlNoSignup());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
