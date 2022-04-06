package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Getaddressofalluser extends Login {
	@Test(priority = 7)
	public void address_of_alluser() {
		Data data = new Data();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/user/" + userId + "/address").then().statusCode(200).log().all();

	}
}
