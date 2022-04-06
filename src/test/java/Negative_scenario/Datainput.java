package Negative_scenario;

import org.testng.annotations.Test;

public class Datainput extends Readproperty {

	public String baseUrl = LoadProperties().getProperty("url");
	public String userName = LoadProperties().getProperty("user");
	public String Password = LoadProperties().getProperty("password");
	public String newUser = LoadProperties().getProperty("updateduser");
	public String newPassword = LoadProperties().getProperty("updatedpassword");
	public String contentType = LoadProperties().getProperty("Content-Type");
	public String apiKey = LoadProperties().getProperty("x-api-key");
	public String siteContext = LoadProperties().getProperty("x-site-context");
	public String Address = LoadProperties().getProperty("Address1");
	public String createAddress = LoadProperties().getProperty("Address2");
	public String exitUser = LoadProperties().getProperty("existinguser");
	public String Token = LoadProperties().getProperty("otherusertoken");
	public String otherUserId = LoadProperties().getProperty("userid");
	public String invalidData = LoadProperties().getProperty("Invalidname");
	public String blankFields = LoadProperties().getProperty("Spaces");
	public String Email = LoadProperties().getProperty("email");
	public String userNameP = LoadProperties().getProperty("userprovider");
	public String invalidPass = LoadProperties().getProperty("Invalidpassword");
	@Test(priority = -1)
	public static void email() {
		
	}
	
	

}
