package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import commerce_service.Data;

public class Chngpasswithoutbody extends Loginuser{
	@Test(priority = 11)
	public void change_without_body() {
		JSONObject request = new JSONObject();

		Datainput data = new Datainput();


		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.patch(data.baseUrl + "/auth/change-password").then().statusCode(200).log()
				.all();

	}
	
	
	
}
