package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Loginwithoutpassword {

	public String accessToken, userId, refreshToken, Name, Password;

	@Test(priority = 4)
	public void login_without_password() throws Exception {
		Createlocaluser name = new Createlocaluser();
		Datainput data = new Datainput();

		JSONObject request = new JSONObject();
		request.put("username", name.userName);
		
		

		accessToken = given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(request.toJSONString()).when()
				.post(data.baseUrl + "/auth/local/login").then().statusCode(200).log().all().extract().jsonPath()
				.getString("accessToken");

	}
}
