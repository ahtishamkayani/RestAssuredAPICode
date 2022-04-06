package v1_scenario;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Createaddresssecnario extends Loginupdateduser {

	public String addressId;

	@Test(priority = 9)
	public void createAddress() {
		Datascenario data = new Datascenario();

		addressId = given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey).body(data.createAddress)
				.when().post(data.baseUrl + "/user/" + userId + "/address").then().statusCode(200).log().all().extract()
				.jsonPath().getString("address._id[0]");

	}
}
