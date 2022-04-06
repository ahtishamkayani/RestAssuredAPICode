package Negative_scenario;

import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Readproperty {

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
