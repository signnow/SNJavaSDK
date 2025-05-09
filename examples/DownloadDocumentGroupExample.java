import com.signnow.api.documentgroup.request.DownloadDocumentGroupPostRequest;
import com.signnow.api.documentgroup.request.data.DocumentOrderCollection;
import com.signnow.api.documentgroup.response.DownloadDocumentGroupPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DownloadDocumentGroupExample {
    public static void main(String[] args) {
        // Set your actual input data here
        // Note: following values are dummy, just for example
        //----------------------------------------------------
        // if it is not specified here, a new Bearer token will be created automatically
        String bearerToken = "";
        String documentGroupId = "e1b4c8a2f930d7e6a5b1f4c3d8a09e2b7c5d1f0a";
        String documentId1 = "05fbed799231d85cf3471121ecd6a4221f9c5610";
        String documentId2 = "9a3b1e4f0c2d7a8e5f6b9c1d3e0a4b7c8f2d6a9e";

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
