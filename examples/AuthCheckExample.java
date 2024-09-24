import com.signnow.api.auth.request.TokenGetRequest;
import com.signnow.api.auth.response.TokenGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class AuthCheckExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is empty or null, a new Bearer token will be created automatically
    String bearerToken = "";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);
      TokenGetResponse response = (TokenGetResponse) client.send(new TokenGetRequest()).getResponse();
      System.out.println("Token: " + response.getAccessToken());
      System.out.println("Type: " + response.getTokenType());
      System.out.println("Scope: " + response.getScope());
      System.out.println("Expires at: " + response.getExpiresIn());
    } catch (SignNowApiException e) {
      System.err.println("Exception when signNow API call TokenGetRequest");
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
