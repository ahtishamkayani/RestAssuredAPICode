package commerce_service;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Login {

	public String accessToken, U_id, refresh_token, x_context, api_key, url, user_name, content_T, user_password,
			username;

	@Test(priority = 1)
	public void login_user() throws Exception {
		 
		
		Data obj1 = new Data();
		// username = obj1.user;
//		user_name = "pitowyji@givmail.com";
//		user_password = "ahtishamkashif";
//		url = "https://stg02-apigw.newbailey.fabric.zone/api-commerceIdentity";
//		api_key = "d41d8cd98f00b204e9800998ecf8427e";
//		content_T = "application/json";
//		x_context = "{\"stage\": \"stg02\", \"account\": \"5f689caa4216e7000750d1ef\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}";
		JSONObject request = new JSONObject();

		request.put("username", obj1.user);
		request.put("password", obj1.password);
		Readpropertyfile data = new Readpropertyfile();
		System.out.println(request);
		// System.out.println(request.toJSONString());
		
		//Extracting access token
		accessToken = given().header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
				.header("x-api-key", obj1.Api_key ).body(request.toJSONString()).when().post(obj1.Base_url + "/auth/local/login").then()
				.statusCode(200).log().all().extract().jsonPath().getString("accessToken");
		
		System.err.println("The access token of user is " + accessToken);
		
		//Extracting User id
		U_id = given().header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
				.header("x-api-key", obj1.Api_key ).body(request.toJSONString()).when().post(obj1.Base_url + "/auth/local/login").then()
				.statusCode(200).log().all().extract().jsonPath().getString("_id");

		System.err.println("The login id of user is " + U_id);
		
//Extracting refresh token
		refresh_token = given().header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
				.header("x-api-key", obj1.Api_key ).body(request.toJSONString()).when().post(obj1.Base_url + "/auth/local/login").then()
				.statusCode(200).log().all().extract().jsonPath().getString("refreshToken");
		
		System.err.println("The refresh token of user is " + refresh_token);

	}

}
