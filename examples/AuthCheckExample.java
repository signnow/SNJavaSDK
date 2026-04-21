import com.signnow.api.auth.request.TokenGetRequest;
import com.signnow.api.auth.response.TokenGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class AuthCheckExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //---------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
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
