package Negative_scenario;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import commerce_service.Createuser;
import commerce_service.Data;

public class Rsetpasswithemail extends Loginuser {

	@Test(priority = 6)
	public void reset_password_email() {
		Datainput data = new Datainput();
		
		JSONObject request = new JSONObject();

		request.put("username",Email);

		given().header("Authorization",accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/auth/local/reset").then().statusCode(200).log()
				.all();

	}
	
}
