package v1_scenario;

import java.io.InputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import io.restassured.http.Header;

public class Readproperties {

	@Test

	public Properties LoadProperties() {

		try {
			InputStream inStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			Properties prop = new Properties();
			prop.load(inStream);
			return prop;
		} catch (Exception e) {
			System.out.println("File not found");
			return null;
		}

	}

}
