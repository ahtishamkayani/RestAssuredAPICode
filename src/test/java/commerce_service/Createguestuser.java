package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Createguestuser extends Login {
	@Test(priority = 12)
	public void guest_user() {
		Data data = new Data();

		given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key)
				.get(data.Base_url + "/user/guest").then().statusCode(200).log().all();

	}
}
