package v1_scenario;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Loginwitholdpassword {

	public String accessToken, userId, refreshToken, Name, Password;

	@Test(priority = 4)
	public void login_user() throws Exception {

		Datascenario data = new Datascenario();

		JSONObject request = new JSONObject();
		request.put("username", data.userName);
		request.put("password", data.Password);

		accessToken = given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(request.toJSONString()).when()
				.post(data.baseUrl + "/auth/local/login").then().statusCode(400).log().all().extract().jsonPath()
				.getString("accessToken");

		userId = given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(request.toJSONString()).when()
				.post(data.baseUrl + "/auth/local/login").then().statusCode(400).log().all().extract().jsonPath()
				.getString("_id");

		refreshToken = given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(request.toJSONString()).when()
				.post(data.baseUrl + "/auth/local/login").then().statusCode(400).log().all().extract().jsonPath()
				.getString("refreshToken");

	}

}
