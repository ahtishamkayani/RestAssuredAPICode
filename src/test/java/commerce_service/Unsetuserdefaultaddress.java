package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Unsetuserdefaultaddress extends Createaddress {
	@Test(priority = 9)
	public void unset_address() {
		Data data = new Data();
		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.post(data.baseUrl + "/user/" + userId + "/address/unset").then().statusCode(200).log().all();
	}
}
