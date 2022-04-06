package v1_scenario;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import commerce_service.Data;

public class Deleteaddress extends Createaddresssecnario {

	@Test(priority = 10)
	public void delAddress() {
		Datascenario data = new Datascenario();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.delete(data.baseUrl + "/user/" + userId + "/address/" + addressId).then().statusCode(200).log().all();
		
	}

}
