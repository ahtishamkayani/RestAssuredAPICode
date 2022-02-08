package commerce_service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Createaddress extends Login {
	public String address_id;
	
  @Test (priority = 4)
  public void create_address() {
	  Data obj1 = new Data();
	
	 //JSONObject request = new JSONObject(); 
	String payload= "{\"address1\":\"Cliffside Dr & Birdview Ave\",\"city\":\"Malibu\",\"state\":\"FL\",\"country\": \"USA\",\"zipCode\":\"90265\",\"kind\":\"customer\",\"name\":{\"first\":\"The\",\"last\":\"Bold\"},\"isVerified\":false }";
  
	  

		//System.out.println("data of post " +payload);
		// System.out.println(request.toJSONString());

	address_id = given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
			.header("x-api-key", obj1.Api_key ).body(payload).when()
				.post(obj1.Base_url+"/user/" +U_id +"/address").
				 then().
				statusCode(200).
				 log().all().
				 extract().
				 jsonPath().
				 getString("address._id[0]");
				
		 System.err.println("id of address " +address_id);
		 
		 
		 

  
  
  }
}
