package commerce_service;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Data extends Readpropertyfile {

	String password = LoadProperties().getProperty("password");
	String Content_Type = LoadProperties().getProperty("Content-Type");
	String Api_key = LoadProperties().getProperty("x-api-key");
	String Site_context = LoadProperties().getProperty("x-site-context");
	String Base_url = LoadProperties().getProperty("url");
	String Newuser = LoadProperties().getProperty("newUsername");
	String Address = LoadProperties().getProperty("Address1");
	String Create_address = LoadProperties().getProperty("Address2");
	String Newpassword = LoadProperties().getProperty("newPassword");

	@Test(priority = -1)
	public static void email() {

	}
}
