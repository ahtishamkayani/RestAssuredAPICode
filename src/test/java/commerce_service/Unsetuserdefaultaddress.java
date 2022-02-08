package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Unsetuserdefaultaddress extends Createaddress {
	@Test(priority = 9)
	public void unset_address() {
		Data obj1 = new Data();
		 given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
			.header("x-api-key", obj1.Api_key )
				.post(obj1.Base_url + "/user/" + U_id + "/address/unset").then().statusCode(200).log().all();
	}
}
