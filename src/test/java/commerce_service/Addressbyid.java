package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Addressbyid extends Createaddress {
	@Test (priority = 6)
	public void get_addressby_id() {
		Data data = new Data();

		given().header("Authorization", accessToken)
		.header("Content-Type",data.Content_Type).header("x-site-context", data.Site_context)
		.header("x-api-key", data.Api_key )
				.get(data.Base_url+"/user/" +User_id +"/address/" +address_id)
				.then().statusCode(200).log().all();

	}
}
