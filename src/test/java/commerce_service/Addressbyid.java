package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Addressbyid extends Createaddress {
	@Test (priority = 6)
	public void get_addressby_id() {
		Data obj1 = new Data();

		given().header("Authorization", accessToken)
		.header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
		.header("x-api-key", obj1.Api_key )
				.get(obj1.Base_url+"/user/" +U_id +"/address/" +address_id)
				.then().statusCode(200).log().all();

	}
}
