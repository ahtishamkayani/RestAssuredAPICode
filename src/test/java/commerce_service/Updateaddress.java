package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Updateaddress extends Createaddress {
	@Test(priority = 5)

	public void update_address() {
		Data obj1 = new Data();
		// System.err.println("the update address access token " +accessToken);
		// System.err.println("the update address is " +address_id);
		// Login addressObj= new Login();
		// String accesstoken= addressObj.accessToken;
		// System.err.println("the update address is 1 " +address_id);
		String payload = "{ \"address1\":\"569 Leaman Place\",\"city\":\"Brooklyn Heights\",\"state\":\"NY\",\"country\": \"USA\",\"zipCode\":\"11203\",\"kind\":\"customer\",\"name\":{\"first\":\"Cap's\",\"last\":\"House\"},\"isVerified\":false}";
		 given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
			.header("x-api-key", obj1.Api_key ).body(payload).when()
				.patch(obj1.Base_url + "/user/" + U_id + "/address/" + address_id).then().statusCode(200).log().all();
		// System.err.println("the update address access token " +accessToken);
		System.err.println("the update address is   " + address_id);

	}
}
