package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Createaddress extends Login {
	public String addressId;

	@Test(priority = 3)
	public void create_address() {
		Data data = new Data();

		addressId = given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey).body(data.createAddress)
				.when().post(data.baseUrl + "/user/" + userId + "/address").then().statusCode(200).log().all().extract()
				.jsonPath().getString("address._id[0]");

	}
}
