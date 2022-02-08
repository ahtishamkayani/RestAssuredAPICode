package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Resetpasword extends Login {
	@Test(priority = 2)
	public void reset_password() {
		Data obj1 = new Data();
		JSONObject request = new JSONObject();
		// Resetpasword authToken = new Resetpasword();
		request.put("username", obj1.user);

		// System.out.println(request);
		// System.out.println(request.toJSONString());

		 given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
			.header("x-api-key", obj1.Api_key ).body(request.toJSONString()).patch(obj1.Base_url + "/auth/local/reset").then()
				.statusCode(200).log().all();
		// System.out.println("abc" +accessToken);
	}

}
