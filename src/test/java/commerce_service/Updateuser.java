package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Updateuser extends Login {
  @Test (priority = 13)
  public void update_user() {
	  Data obj1= new Data();
	  //JSONObject request = new JSONObject();
	  String payload= "{\"user\": {\"name\":{\"first\":\"Shae\",\"middle\":\"Hussy\",\"last\":\"Fast\"},\"phone\":[{\"number\":\"5566987000\",\"countryCode\":\"+1\",\"extension\":\"123\",\"kind\":\"mobile\"}],\"email\":\"" + user_name + "\", \"extra\": {\"dob\":\"05-29-1992\"},\"provider\":{\"username\":\"" + user_name + "\", \"password\":\"" + user_password+"\"}}}";
	  given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
		.header("x-api-key", obj1.Api_key ).body(payload)
		.patch(obj1.Base_url + "/user/" + U_id).then().statusCode(200).log().all();
  }
}
