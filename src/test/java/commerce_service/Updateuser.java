package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Updateuser extends Login {
	@Test(priority = 14)
	public void update_user() {
		Data data = new Data();

		String payload = "{\"user\": {\"name\":{\"first\":\"Shae\",\"middle\":\"Hussy\",\"last\":\"Fast\"},\"phone\":[{\"number\":\"5566987000\",\"countryCode\":\"+1\",\"extension\":\"123\",\"kind\":\"mobile\"}],\"email\":\""
				+ Name + "\", \"extra\": {\"dob\":\"05-29-1992\"},\"provider\":{\"username\":\"" + Name
				+ "\", \"password\":\"" + Password + "\"}}}";
		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey).body(payload)
				.patch(data.baseUrl + "/user/" + userId).then().statusCode(200).log().all();
	}
}
