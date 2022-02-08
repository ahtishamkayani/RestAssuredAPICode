package commerce_service;

import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.http.Header;


	
//	protected Properties prop = null;
//	protected InputStream input =Readpropertyfile.class.getClassLoader().getResourceAsStream("C:\\Users\\Ahtisham Kashif\\eclipse-workspace\\commerService\\src\\test\\java\\commerce_service\\config.properties");
//	 public Readpropertyfile() throws Exception {
//		  prop = new Properties();
//		  prop.load(input);
//	  }
public class Readpropertyfile {
	@Test
	
	public Properties LoadProperties() {
 
		try {
			InputStream inStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			Properties prop = new Properties();
			prop.load(inStream);
			return prop;
			}
			catch(Exception e){
				System.out.println("File not found");
				return null;
			}
		
		
		
		
		
		
		
		
		
		
//	 public String getUrl() {
//		System.out.println(prop.getProperty("url"));
//		 return prop.getProperty("url");
//		 
//	 }
//	
//	 
//	 public String getxContext() {
//		 
//		 return prop.getProperty("x-site-context");
//	 }
//	 
//	 public String getcontentType() {
//		 
//		 return prop.getProperty("Content-Type");
//	 }
//	 
// public String getapiKey() {
//		 
//		 return prop.getProperty("x-api-key");
//	 }
// 
// public String getuserName() {
//	 
//	 return prop.getProperty("username");
// }
// 
// public String getpassword() {
//	 
//	 return prop.getProperty("password");
// }
 
//public String getnewUserame() {
//	 
//	 return prop.getProperty("newUsername");
//	 
//}
//public String getnewPassword() {
//	 
//	 return prop.getProperty("newPassword");
//}


}
}