package v1_scenario;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import commerce_service.Data;

public class Changepswrdscenario extends Loginuserscenario {

	@Test(priority = 3)

	public void change_password() {

		JSONObject request = new JSONObject();

		Datascenario data = new Datascenario();

		request.put("userId", userId);
		request.put("oldPassword", data.Password);
		request.put("newPassword", data.newPassword);

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/auth/change-password").then().statusCode(200).log()
				.all();

	}

}
