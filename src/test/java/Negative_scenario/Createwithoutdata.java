package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Createwithoutdata {
	public static String userName, userPassword;

	@Test(priority = 5)
	public static void create_without_data() throws Exception {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		userName = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com";
		Datainput data = new Datainput();
		
		userPassword = data.Password;

		String payload = "{\r\n\"user\":{\r\n\"email\":\""
				+ userName + "\"},\r\n\"provider\":{\r\n\"username\":\""
				+ userName + "\",\r\n\"password\":\"" + userPassword + "\"\r\n}\r\n}";

		given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(payload).when().post(data.baseUrl + "/user/local")
				.then().statusCode(200).log().all();

	}

}
