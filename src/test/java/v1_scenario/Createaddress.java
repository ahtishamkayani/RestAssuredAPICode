package v1_scenario;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import commerce_service.Data;

public class Createaddress extends Loginupdateduser {

	public String addressId;

	@Test(priority = 12)
	public void addressOtherTOken() {
		Datascenario data = new Datascenario();
		Loginuserscenario data1 = new Loginuserscenario();
		
		addressId = given().header("Authorization", data.Token).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey).body(data.createAddress)
				.when().post(data.baseUrl + "/user/" + userId + "/address").then().statusCode(403).log().all().extract()
				.jsonPath().getString("address._id[0]");

	}
}
