package Negative_scenario;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Createspaceinpassword {
	
		public static String userPassword, userName,Email;

		@Test(priority = 0)
		public static void create_space_inpasword() throws Exception {
			Faker faker = new Faker();
			String firstName = faker.name().firstName();
			String lastName = faker.name().lastName();
			userName = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com";
			Email=  lastName.toLowerCase() + "@gmail.com";
			Datainput data = new Datainput();
			userPassword = data.blankFields;

			String payload = "{\r\n\"user\":{\r\n\"registrationSite\":\"local\",\r\n\"name\":{\r\n\"first\":\"The\",\r\n\"middle\":\"Mitchal\",\r\n\"last\":\"Marsh\"\r\n},\r\n\"phone\":[\r\n{\r\n\"number\":\"5369876879\",\r\n\"countryCode\":\"+1\",\r\n\"extension\":\"123\",\r\n\"kind\":\"mobile\"\r\n}\r\n],\r\n\"email\":\""
					+ Email
					+ "\",\r\n\"extra\":{\r\n\"dob\":\"05-29-1985\"\r\n}\r\n},\r\n\"provider\":{\r\n\"username\":\""
					+ userName + "\",\r\n\"password\":\"" + userPassword + "\"\r\n}\r\n}";

			given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
					.header("x-site-context", data.siteContext).body(payload).when().post(data.baseUrl + "/user/local")
					.then().statusCode(200).log().all();

		}

}
