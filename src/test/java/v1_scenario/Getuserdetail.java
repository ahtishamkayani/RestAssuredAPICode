package v1_scenario;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import commerce_service.Data;

public class Getuserdetail extends Loginupdateduser {

	
	@Test (priority = 13)
	
	
	public void getDetaileOtherToken() {
		Datascenario data = new Datascenario();
		
		given().header("Authorization", data.Token).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/user/" + userId).then().statusCode(403).log().all();

	}
}
