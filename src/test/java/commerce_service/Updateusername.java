package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Updateusername extends Login {
	public static String newName;

	@Test(priority = 16)
	public void update_name() {

		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String Test = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@xbox.com";
		newName = Test;

		JSONObject request = new JSONObject();
		Data data = new Data();
		Createuser name = new Createuser();
		request.put("oldUsername", Name);
		request.put("newUsername", newName);

		given().header("Authorization", accessToken).header("Content-Type", data.Content_Type)
				.header("x-site-context", data.Site_context).header("x-api-key", data.Api_key)
				.body(request.toJSONString()).patch(data.Base_url + "/user/" + User_id + "/username").then()
				.statusCode(200).log().all();
	}

}
