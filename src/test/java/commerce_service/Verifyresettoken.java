package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Verifyresettoken extends Login {
	@Test(priority = 17)
	public void verify_token() {
		Data data = new Data();

		given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key)
				.get(data.Base_url + "/auth/token/be167d6bbe56b1a6f2644c49").then().statusCode(200).log().all();

	}
}
