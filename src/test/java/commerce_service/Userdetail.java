package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Userdetail extends Login {
	@Test(priority = 3)

	public void get_detail() {
		Data data = new Data();
		given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key)
				.get(data.Base_url + "/user/" + User_id).then().statusCode(200).log().all();

	}

}
