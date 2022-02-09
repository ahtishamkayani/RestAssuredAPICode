package commerce_service;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Login {

	public String accessToken, User_id, refresh_token, Password, Name;

	@Test(priority = 1)
	public void login_user() throws Exception {
		Createuser name = new Createuser();
		Data obj1 = new Data();

		JSONObject request = new JSONObject();
		request.put("username", name.userName);
		request.put("password", name.userPassword);
		Name = name.userName;
		Password = name.userPassword;

		accessToken = given().header("Content-Type", obj1.Content_Type).header("x-site-context", obj1.Site_context)
				.header("x-api-key", obj1.Api_key).body(request.toJSONString()).when()
				.post(obj1.Base_url + "/auth/local/login").then().statusCode(200).log().all().extract().jsonPath()
				.getString("accessToken");
		

		User_id = given().header("Content-Type", obj1.Content_Type).header("x-site-context", obj1.Site_context)
				.header("x-api-key", obj1.Api_key).body(request.toJSONString()).when()
				.post(obj1.Base_url + "/auth/local/login").then().statusCode(200).log().all().extract().jsonPath()
				.getString("_id");

		refresh_token = given().header("Content-Type", obj1.Content_Type).header("x-site-context", obj1.Site_context)
				.header("x-api-key", obj1.Api_key).body(request.toJSONString()).when()
				.post(obj1.Base_url + "/auth/local/login").then().statusCode(200).log().all().extract().jsonPath()
				.getString("refreshToken");

	}

}
