import com.signnow.api.document.request.DocumentDownloadGetRequest;
import com.signnow.api.document.response.DocumentDownloadGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DownloadDocumentExample {
    public static void main(String[] args) {
        // Set your actual input data here
        // Note: following values are dummy, just for example
        //----------------------------------------------------
        // if it is not specified here, a new Bearer token will be created automatically
        String bearerToken = "";
        String documentId = "05fbed799231d85cf3471121ecd6a4221f9c5610";

        try {
            ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);
            DocumentDownloadGetRequest request = new DocumentDownloadGetRequest();
            request.withDocumentId(documentId)
                    .withType("collapsed")
                    .withHistory("no");
            DocumentDownloadGetResponse response = (DocumentDownloadGetResponse) client.send(request).getResponse();
            File downloadedFile = response.getFile();
            System.out.println(downloadedFile.getAbsolutePath());
        } catch (SignNowApiException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
