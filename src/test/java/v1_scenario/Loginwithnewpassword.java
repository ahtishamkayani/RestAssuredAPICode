package v1_scenario;

import org.testng.annotations.Test;
import commerce_service.Createuser;
import commerce_service.Data;
import static io.restassured.RestAssured.given;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Loginwithnewpassword {
	public String accessToken, userId, refreshToken, Name, Password;

	@Test(priority = 5)
	public void loginWithNewPassword() throws Exception {

		Datascenario data = new Datascenario();

		JSONObject request = new JSONObject();
		request.put("username", data.userName);
		request.put("password", data.newPassword);

		accessToken = given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(request.toJSONString()).when()
				.post(data.baseUrl + "/auth/local/login").then().statusCode(200).log().all().extract().jsonPath()
				.getString("accessToken");

		userId = given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(request.toJSONString()).when()
				.post(data.baseUrl + "/auth/local/login").then().statusCode(200).log().all().extract().jsonPath()
				.getString("_id");

		refreshToken = given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(request.toJSONString()).when()
				.post(data.baseUrl + "/auth/local/login").then().statusCode(200).log().all().extract().jsonPath()
				.getString("refreshToken");

	}

}
