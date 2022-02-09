package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Changepassword extends Login {
	
	@Test(priority = 15)
	public void change_password() {
		JSONObject request = new JSONObject();

		Data data = new Data();
		request.put("userId", User_id);
		request.put("oldPassword", Password);
		request.put("newPassword", Password );//User_id +"_Fabric"

		given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key)
				.body(request.toJSONString()).patch(data.Base_url + "/auth/change-password").then().statusCode(200).log().all();

			}
}
