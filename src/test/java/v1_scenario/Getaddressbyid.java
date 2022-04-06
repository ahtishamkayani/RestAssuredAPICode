package v1_scenario;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import commerce_service.Data;

public class Getaddressbyid extends Deleteaddress {

	@Test(priority = 11)
	public void getAddressById() {
		Datascenario data = new Datascenario();

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.get(data.baseUrl + "/user/" + userId + "/address/" + addressId).then().statusCode(404).log().all();

	}

}
