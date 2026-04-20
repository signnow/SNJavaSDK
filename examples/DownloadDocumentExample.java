import com.signnow.api.document.request.DocumentDownloadGetRequest;
import com.signnow.api.document.response.DocumentDownloadGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class DownloadDocumentExample {
    public static void main(String[] args) {
        // Fill in your actual data in examples/signnow-example.properties before running
        //----------------------------------------------------
        SignNowExampleData data = new SignNowExampleData();
        String bearerToken = data.getBearerToken();
        String documentId = data.getDocumentId();

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
