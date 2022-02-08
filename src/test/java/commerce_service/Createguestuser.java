package commerce_service;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Createguestuser extends Login {
  @Test (priority = 12)
  public void guest_user() {
	  Data obj1 = new Data();
	  
	  
		// header("Authorization","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxZjk2Mjg1ZThhODQ3MzllN2U2YTBmMyIsInJvbGVzIjpbeyJpZCI6IjVlMTk2MjUwNWVmNjEyMDAwODlmM2IyMiJ9XSwicGVybWlzc2lvbnMiOltdLCJhY2NvdW50aWQiOiI2MWY5NjI4NWM2NDBmNjAwMDk5YTBmMmYiLCJhY2NvdW50SWQiOm51bGwsInVzZXJUeXBlIjp7ImtpbmQiOiJSRUdJU1RFUkVEIn0sImlzc3VlciI6IjM4MjU3NjUwNjgxMSIsImlhdCI6MTY0Mzc5NjM2OSwiZXhwIjoxNjQzNzk4MTY5fQ.lXLz2c88EgC6ldsI0615AWAlSz7UjW8zHD5b3avSpQW7C2LxWZHD1xQhwCFVLhVrkIiCPjkapTtBlVZhMv-dbn2jJNl3Hh5vHfyezJuBASWbYo5gjU0o6WJSV8FWYX8b9MhMFaOCjzG2bxiPNjXONDLULaPHpB6kIuu044F7N_k").
	  given().header("Authorization",accessToken).header("Content-Type",obj1.Content_Type).header("x-site-context", obj1.Site_context)
		.header("x-api-key", obj1.Api_key )
				.get(obj1.Base_url+"/user/guest").then().statusCode(200)
				.log().all();

	  
	  
  }
}
