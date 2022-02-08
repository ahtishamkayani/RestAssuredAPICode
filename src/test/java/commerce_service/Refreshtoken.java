package commerce_service;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Refreshtoken extends Login {
  @Test (priority = 11)
  public void token_refresh(){
	  Data obj1 = new Data();
	  
	  JSONObject request = new JSONObject();
	  //String payload= "{\"refreshToken\": refresh_token}";
	 
	request.put("refreshToken", refresh_token);
	 given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
		.header("x-api-key", obj1.Api_key ).body(request.toJSONString()).when()
			.post(obj1.Base_url+"/auth/local/refresh")
			 .then()
			.statusCode(200)
			. log().all();
	  
	System.err.println("The refresh token of user is refreshhhhh " +refresh_token);
	  
  }
}
