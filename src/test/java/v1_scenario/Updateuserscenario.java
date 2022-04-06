package v1_scenario;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Updateuserscenario extends Loginwithnewpassword {

	

	@Test(priority = 6)
	public void updateName() {

		JSONObject request = new JSONObject();
		Datascenario data = new Datascenario();

		request.put("oldUsername", data.userName);
		request.put("newUsername", data.newUser);

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/user/" + userId + "/username").then()
				.statusCode(200).log().all();

	}
}