package framework_utility;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
	public static WebDriver driver;
	@BeforeClass
	public void browser_setup1() throws IOException {
		
	   	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	//	String url= Utility_Functions.testConfiguration("URL");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void close()
	{
		//driver.close();
	}
}
