package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Updateusername extends Login {
	@Test(priority = 16)
	public void update_name() {

		JSONObject request = new JSONObject();
		Data obj1 = new Data();
		request.put("oldUsername", obj1.user);
		request.put("newUsername", obj1.Newuser);

		 given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
			.header("x-api-key", obj1.Api_key ).body(request.toJSONString())
				.patch(obj1.Base_url + "/user/" + U_id + "/username").then().statusCode(200).log().all();
	}
}
