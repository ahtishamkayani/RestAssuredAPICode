package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Updateaddress extends Createaddress {
	@Test(priority = 5)

	public void update_address() {
		JSONObject request = new JSONObject();
		Data data = new Data();

		given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key).body(data.Address).when()
				.patch(data.Base_url + "/user/" + User_id + "/address/" + address_id).then().statusCode(200).log()
				.all();

	}
}
