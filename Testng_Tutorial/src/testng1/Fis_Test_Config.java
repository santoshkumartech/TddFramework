package testng1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fis_Test_Config {
	@Test
	public void testConfig() throws IOException
	{
		String filePath = "Test Configeration/config.properties";
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("FirstName"));
		System.out.println(prop.getProperty("LastName"));
	}

}
