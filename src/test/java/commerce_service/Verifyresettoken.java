package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Verifyresettoken extends Login {
	@Test(priority = 17)
	public void verify_token() {
		Data obj1= new Data();
		
		given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
		.header("x-api-key", obj1.Api_key ).get(obj1.Base_url + "/auth/token/be167d6bbe56b1a6f2644c49")
				.then().statusCode(200).log().all();

	}
}
