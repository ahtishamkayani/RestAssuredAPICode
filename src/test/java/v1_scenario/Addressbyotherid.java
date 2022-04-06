package v1_scenario;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import commerce_service.Data;

public class Addressbyotherid extends Createaddresssecnario {

	@Test(priority = 13)
	public void getAddressById() {
		Datascenario data = new Datascenario();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/user/" + data.otherUserId + "/address/" + addressId).then().statusCode(403).log().all();

	
	
	
}}
