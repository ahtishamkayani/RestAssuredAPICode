package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import commerce_service.Data;

public class Chngpasswithoutold extends Loginuser{
	@Test(priority = 10)
	public void change_without_old() {
		JSONObject request = new JSONObject();

		Datainput data = new Datainput();
		request.put("userId", userId);
		request.put("newPassword", Password);

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/auth/change-password").then().statusCode(200).log()
				.all();

	}
}
