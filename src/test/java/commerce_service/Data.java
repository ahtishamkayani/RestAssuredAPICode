package commerce_service;

import org.testng.annotations.Test;

public class Data extends Readpropertyfile{
	 String user = LoadProperties().getProperty("username");
		String password = LoadProperties().getProperty("password");
		String Content_Type = LoadProperties().getProperty("Content-Type");
		String Api_key = LoadProperties().getProperty("x-api-key");
		String Site_context = LoadProperties().getProperty("x-site-context");
		String Base_url = LoadProperties().getProperty("url");
		String Newpassword= LoadProperties().getProperty("newPassword");
		String Newuser = LoadProperties().getProperty("newUsername");
		String email = LoadProperties().getProperty("email");//user;
  @Test (priority = -1)
  public void info_data() {
	  
	  
	  
  }
}
