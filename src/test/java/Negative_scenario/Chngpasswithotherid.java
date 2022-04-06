package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Chngpasswithotherid extends Loginuser{
	@Test(priority = 15)
	public void change_blank_newpass() {
		JSONObject request = new JSONObject();

		Datainput data = new Datainput();
		request.put("userId", data.otherUserId);
		request.put("oldPassword",Password);
		request.put("newPassword", data.newPassword);
		System.out.println("@@@@@@@@@@@@@@@@@@@@" +data.newPassword);

		given().header("Authorization", accessToken).header("Content-Type", data.contentType)
				.header("x-site-context", data.siteContext).header("x-api-key", data.apiKey)
				.body(request.toJSONString()).patch(data.baseUrl + "/auth/change-password").then().statusCode(200).log()
				.all();

	}

}
