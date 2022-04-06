package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Resetpasswithinvalid extends Loginuser{

	@Test(priority = 8)
	public void reset_invalid_username() {
		Datainput data = new Datainput();
		
		JSONObject request = new JSONObject();

		request.put("username",data.invalidData);

		given().header("Authorization",accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/auth/local/reset").then().statusCode(200).log()
				.all();

	}

	
	
}
