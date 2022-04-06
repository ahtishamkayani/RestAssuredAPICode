package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Createwithoutbody {
	public static String user, userPassword, userName;

	@Test(priority = 6)
	public static void create_without_body() throws Exception {
		Datainput data = new Datainput();
		userPassword = data.Password;

		given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).when().post(data.baseUrl + "/user/local").then()
				.statusCode(200).log().all();

	}

}
