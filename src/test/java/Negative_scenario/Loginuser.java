package Negative_scenario;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Loginuser {

	public String accessToken, userId, refreshToken, Name, Password,Email;

	@Test(priority = 1)
	public void login_user() throws Exception {
		Createlocaluser name = new Createlocaluser();
		Datainput data = new Datainput();

		JSONObject request = new JSONObject();
		request.put("username", name.userName);
		request.put("password", data.Password);
		Name = name.userName;
		Password = data.Password;
		Email= name.Email;
	

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
