package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Userdetail extends Login {
	@Test(priority = 2)

	public void get_detail() {
		Data data = new Data();
		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/user/" + userId).then().statusCode(200).log().all();

	}

}
