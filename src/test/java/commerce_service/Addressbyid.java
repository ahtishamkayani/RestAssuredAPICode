package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Addressbyid extends Createaddress {
	
	@Test(priority = 6)
	public void get_addressby_id() {
		Data data = new Data();
		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/user/" + userId + "/address/" + addressId).then().statusCode(200).log().all();
	}
}
