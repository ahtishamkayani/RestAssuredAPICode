package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Createaddress extends Login {
	public String address_id;

	@Test(priority = 4)
	public void create_address() {
		Data data = new Data();

		address_id = given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key).body(data.Create_address)
				.when().post(data.Base_url + "/user/" + User_id + "/address").then().statusCode(200).log().all()
				.extract().jsonPath().getString("address._id[0]");

	}
}
