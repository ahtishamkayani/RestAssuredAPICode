package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Changepassword extends Login {

	@Test(priority = 15)
	public void change_password() {
		JSONObject request = new JSONObject();

		Data data = new Data();
		request.put("userId", userId);
		request.put("oldPassword", Password);
		request.put("newPassword", Password);// User_id +"_Fabric"

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/auth/change-password").then().statusCode(200).log()
				.all();

	}
}
