package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Changepassword extends Login{
  @Test (priority = 15)
  public void change_password() {
	  JSONObject request = new JSONObject();
	  Data obj1 = new Data();
	  request.put("userId",U_id);
	  request.put("oldPassword", obj1.password);
	  request.put("newPassword", obj1.Newpassword);
	  
	  
	  given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
		.header("x-api-key", obj1.Api_key ).body(request.toJSONString())
		.patch(obj1.Base_url+"/auth/change-password").then()
		.statusCode(200).log().all();
	  
	  
	  
  }
}
