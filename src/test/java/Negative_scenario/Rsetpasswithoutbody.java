package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Rsetpasswithoutbody extends Loginuser {

	@Test(priority = 7)
	public void reset_without_body() {
		Datainput data = new Datainput();

		JSONObject request = new JSONObject();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.patch(data.baseUrl + "/auth/local/reset").then().statusCode(200).log().all();

	}

}
