package v1_scenario;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import commerce_service.Data;

public class Createuserscenario {

	public static String user, userPassword;

	@Test(priority = 0)
	public static void create_local_user() throws Exception {

		Datascenario data = new Datascenario();
		user = data.userName;
		userPassword = data.Password;

		String payload = "{\r\n\"user\":{\r\n\"registrationSite\":\"local\",\r\n\"name\":{\r\n\"first\":\"The\",\r\n\"middle\":\"Mitchal\",\r\n\"last\":\"Marsh\"\r\n},\r\n\"phone\":[\r\n{\r\n\"number\":\"5369876879\",\r\n\"countryCode\":\"+1\",\r\n\"extension\":\"123\",\r\n\"kind\":\"mobile\"\r\n}\r\n],\r\n\"email\":\""
				+ user + "\",\r\n\"extra\":{\r\n\"dob\":\"05-29-1985\"\r\n}\r\n},\r\n\"provider\":{\r\n\"username\":\""
				+ user + "\",\r\n\"password\":\"" + userPassword + "\"\r\n}\r\n}";

		given().header("Content-Type", data.contentType).header("x-api-key", data.apiKey)
				.header("x-site-context", data.siteContext).body(payload).when().post(data.baseUrl + "/user/local")
				.then().statusCode(200).log().all();

	}

}
