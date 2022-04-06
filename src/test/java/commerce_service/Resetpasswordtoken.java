package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Resetpasswordtoken extends Login {
	@Test(priority = 13)
	public void reset_password_token() {
		Data data = new Data();

		JSONObject request = new JSONObject();

		request.put("username", Name);

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/auth/local/reset/token").then().statusCode(200)
				.log().all();
	}
}
