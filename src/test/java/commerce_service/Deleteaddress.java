package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Deleteaddress extends Createaddress {
	@Test(priority = 10)
	public void del_address() {
		Data data = new Data();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.delete(data.baseUrl + "/user/" + userId + "/address/" + addressId).then().statusCode(200).log().all();

	}
}
