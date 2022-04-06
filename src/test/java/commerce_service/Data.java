package commerce_service;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Data extends Readpropertyfile {

	
	public String contentType = LoadProperties().getProperty("Content-Type");
	public String apiKey = LoadProperties().getProperty("x-api-key");
	public String siteContext = LoadProperties().getProperty("x-site-context");
	public String baseUrl = LoadProperties().getProperty("url");
	public String Address = LoadProperties().getProperty("Address1");
	public String createAddress = LoadProperties().getProperty("Address2");
	public String Password = LoadProperties().getProperty("password");
	

	@Test(priority = -1)
	public static void email() {

	}
}
