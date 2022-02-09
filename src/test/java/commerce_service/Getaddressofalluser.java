package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Getaddressofalluser extends Login {
	@Test(priority = 7)
	public void address_of_alluser() {
		Data obj1 = new Data();

		given().header("Authorization", accessToken).header("Content-Type", obj1.Content_Type)
				.header("x-site-context", obj1.Site_context).header("x-api-key", obj1.Api_key)
				.get(obj1.Base_url + "/user/" + User_id + "/address").then().statusCode(200).log().all();

	}
}
