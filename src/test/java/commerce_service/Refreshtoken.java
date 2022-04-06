package commerce_service;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Refreshtoken extends Login {
	@Test(priority = 11)
	public void token_refresh() {
		Data data = new Data();

		JSONObject request = new JSONObject();

		request.put("refreshToken", refreshToken);
		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).when().post(data.baseUrl + "/auth/local/refresh").then().statusCode(200)
				.log().all();

	}
}
