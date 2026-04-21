import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.request.DocumentPutRequest;
import com.signnow.api.document.request.data.FieldCollection;
import com.signnow.api.document.request.data.Field;
import com.signnow.api.documentinvite.request.SigningLinkPostRequest;
import com.signnow.api.documentinvite.response.SigningLinkPostResponse;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class SigningLinkExample {
  public static void main(String[] args) {
    // Preconditions: you have a document available for signing
    // it means the document must contain at least one field with assigned signing role
    // Details: https://docs.signnow.com/docs/signnow/signing-link/operations/create-a-link
    //----------------------------------------------------
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String pathToDocument = data.getPathToDocument();
    String signerRole = data.getFirstRecipientRole();
    String redirectUrl = null;

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      DocumentPostRequest requestUpload = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse responseUpload = (DocumentPostResponse) client.send(requestUpload).getResponse();
      String documentId = responseUpload.getId();

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
