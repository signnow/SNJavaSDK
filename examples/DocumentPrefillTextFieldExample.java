import com.signnow.api.document.request.DocumentPutRequest;
import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.documentfield.request.DocumentPrefillPutRequest;
import com.signnow.api.documentfield.response.DocumentPrefillPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import com.signnow.api.documentfield.request.data.*;
import com.signnow.core.response.Reply;
import java.io.File;

public class DocumentPrefillTextFieldExample {
    public static void main(String[] args) {
        // Fill in your actual data in examples/signnow-example.properties before running
        //----------------------------------------------------
        SignNowExampleData data = new SignNowExampleData();
        String bearerToken = data.getBearerToken();
        String signerRole = data.getDocumentPrefillTextFieldSignerRole();
        String pathToDocument = data.getPathToDocument();

        try {
            ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

            // Upload a new document
            // or you can use an existing document
            DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
            DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
            String documentId = response.getId();

            // Add fields with roles to the new document
            var documentFields = new com.signnow.api.document.request.data.FieldCollection();
            documentFields.add(
                    new com.signnow.api.document.request.data.Field(
                            50,
                            18,
                            200,
                            20,
                            "text",
                            0,
                            true,
                            signerRole,
                            "field_1",
                            "Reason to sign"));
            DocumentPutRequest putFieldsRequest = new DocumentPutRequest(documentFields);
            putFieldsRequest.withDocumentId(documentId);
            client.send(putFieldsRequest);

            // Prefill an existing field by their name "field_1"
            var prefillFields = new FieldCollection();
            prefillFields.add(new Field("field_1", "custom prefilled text here"));
            DocumentPrefillPutRequest prefillPutRequest = new DocumentPrefillPutRequest(prefillFields);
            prefillPutRequest.withDocumentId(documentId);

            Reply<DocumentPrefillPutResponse> responsePrefillFields = client.send(prefillPutRequest);
            System.out.println(responsePrefillFields.getStatusCode());
        } catch (SignNowApiException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}