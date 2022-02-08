package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Deleteaddress extends Createaddress {
  @Test (priority = 10)
  public void del_address() {
	  Data obj1 = new Data();
	  
	  given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
		.header("x-api-key", obj1.Api_key )
		.get(obj1.Base_url+"/user/" +U_id +"/address/" +address_id)
		.then()
		.statusCode(200).log().all();
	  
	  
  }
}