package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Verifyresettoken extends Login {
	@Test(priority = 17)
	public void verify_token() {
		Data data = new Data();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/auth/token/be167d6bbe56b1a6f2644c49").then().statusCode(200).log().all();

	}
}
