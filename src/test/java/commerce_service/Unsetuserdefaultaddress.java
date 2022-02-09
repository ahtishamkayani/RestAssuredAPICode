package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Unsetuserdefaultaddress extends Createaddress {
	@Test(priority = 9)
	public void unset_address() {
		Data data = new Data();
		given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key)
				.post(data.Base_url + "/user/" + User_id + "/address/unset").then().statusCode(200).log().all();
	}
}
