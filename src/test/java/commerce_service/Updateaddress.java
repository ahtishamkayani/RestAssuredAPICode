package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Updateaddress extends Createaddress {
	@Test(priority = 5)

	public void update_address() {
		JSONObject request = new JSONObject();
		Data data = new Data();
		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey).body(data.Address).when()
				.patch(data.baseUrl + "/user/" + userId + "/address/" + addressId).then().statusCode(200).log().all();

	}
}
