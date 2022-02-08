package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Createuser  {
	// public String x_context, api_key,url;
//	String user = LoadProperties().getProperty("username");
//	String password = LoadProperties().getProperty("password");
//	String Content_Type = LoadProperties().getProperty("Content-Type");
//	String Api_key = LoadProperties().getProperty("x-api-key");
//	String Site_context = LoadProperties().getProperty("x-site-context");
//	String Base_url = LoadProperties().getProperty("url");
//	String Newpassword= LoadProperties().getProperty("newPassword");
//	String Newuser = LoadProperties().getProperty("newUsername");
//	String email = LoadProperties().getProperty("email");//user;

	@Test(priority = 0)
	public void create_local_user() throws Exception {
		Data obj1 = new Data();
		JSONObject request = new JSONObject();
		// user = "pitowyji@givmail.com";
		// email = user;
		// Readpropertyfile data = new Readpropertyfile();
//		url= "https://stg02-apigw.newbailey.fabric.zone/api-commerceIdentity";
//		api_key = "d41d8cd98f00b204e9800998ecf8427e";
//		x_context = "{\"stage\": \"stg02\", \"account\": \"5f689caa4216e7000750d1ef\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}";
//		System.out.println("the id of userrr " + user);
//		System.out.println("the id of userrr " + email);
//		System.out.println("the id of userrr " + password);

		String payload = "{\r\n\"user\":{\r\n\"registrationSite\":\"local\",\r\n\"name\":{\r\n\"first\":\"The\",\r\n\"middle\":\"Mitchal\",\r\n\"last\":\"Marsh\"\r\n},\r\n\"phone\":[\r\n{\r\n\"number\":\"5369876879\",\r\n\"countryCode\":\"+1\",\r\n\"extension\":\"123\",\r\n\"kind\":\"mobile\"\r\n}\r\n],\r\n\"email\":\""
				+ obj1.user + "\",\r\n\"extra\":{\r\n\"dob\":\"05-29-1985\"\r\n}\r\n},\r\n\"provider\":{\r\n\"username\":\""
				+ obj1.user + "\",\r\n\"password\":\"" + obj1.password + "\"\r\n}\r\n}";

		given().header("Content-Type", obj1.Content_Type).header("x-api-key", obj1.Api_key).header("x-site-context", obj1.Site_context)
				.body(payload).when().post(obj1.Base_url + "/user/local").then().statusCode(200).log().all();
		// System.out.println("the id of userrr " +payload);

	}
}
