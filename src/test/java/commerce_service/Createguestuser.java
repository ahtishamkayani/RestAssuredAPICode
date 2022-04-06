package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Createguestuser extends Login {
	@Test(priority = 12)
	public void guest_user() {
		Data data = new Data();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/user/guest").then().statusCode(200).log().all();

	}
}
