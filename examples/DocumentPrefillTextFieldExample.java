import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.documentfield.request.DocumentPrefillPutRequest;
import com.signnow.api.documentfield.response.DocumentPrefillPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import com.signnow.api.documentfield.request.data.*;
import com.signnow.core.response.Reply;
public class DocumentPrefillTextFieldExample {
    public static void main(String[] args) {

        // Set your actual input data here
        // Note: following values are dummy, just for example
        //----------------------------------------------------
        // if it is not specified here, a new Bearer token will be created automatically
        String bearerToken = "";
        String signerRole = "Product Manager";
        String pathToDocument = "/your/path/to/file.pdf";

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