import com.signnow.api.user.request.UserGetRequest;
import com.signnow.api.user.response.UserGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class UserInfoExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      UserGetRequest request = new UserGetRequest();
      UserGetResponse response = (UserGetResponse) client.send(request).getResponse();

      System.out.println("User ID: " + response.getId());
      System.out.println("User name: " + response.getFirstName());
      System.out.println("User surname: " + response.getLastName());
      System.out.println("User email: " + response.getEmails().toJson());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
