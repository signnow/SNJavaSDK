import com.signnow.api.documentgroup.request.DownloadDocumentGroupPostRequest;
import com.signnow.api.documentgroup.request.data.DocumentOrderCollection;
import com.signnow.api.documentgroup.response.DownloadDocumentGroupPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class DownloadDocumentGroupExample {
    public static void main(String[] args) {
        // Fill in your actual data in examples/signnow-example.properties before running
        //----------------------------------------------------
        SignNowExampleData data = new SignNowExampleData();
        String bearerToken = data.getBearerToken();
        String documentGroupId = data.getDownloadDocumentGroupDocumentGroupId();
        String documentId1 = data.getDownloadDocumentGroupDocumentId1();
        String documentId2 = data.getDownloadDocumentGroupDocumentId2();

        try {
            ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);
            DocumentOrderCollection documentOrder = new DocumentOrderCollection();
            // this order prescribes how downloaded documents will be located in merged file
            // the collection is allowed to be empty
            documentOrder.add(documentId1);
            documentOrder.add(documentId2);
            DownloadDocumentGroupPostRequest request = new DownloadDocumentGroupPostRequest("zip",
                    "no",
                    documentOrder);
            request.withDocumentGroupId(documentGroupId);
            DownloadDocumentGroupPostResponse response = (DownloadDocumentGroupPostResponse) client.send(request).getResponse();
            File downloadedFile = response.getFile();
            System.out.println(downloadedFile.getAbsolutePath());
        } catch (SignNowApiException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
