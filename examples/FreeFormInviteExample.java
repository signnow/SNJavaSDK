import com.signnow.api.documentinvite.request.FreeFormInvitePostRequest;
import com.signnow.api.documentinvite.response.FreeFormInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class FreeFormInviteExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String senderEmail = "sender@signnow.com";
    String signerEmail = "signer@signnow.com";
    String documentId = "b2072009b7e0427dba1f6de56df4812da5d8eb9c"; // Document to be signed

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      FreeFormInvitePostRequest request = new FreeFormInvitePostRequest(signerEmail, senderEmail);
      request.withDocumentId(documentId);
      FreeFormInvitePostResponse response = (FreeFormInvitePostResponse) client.send(request).getResponse();

      System.out.println("Invite Request ID: " + response.getId());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
