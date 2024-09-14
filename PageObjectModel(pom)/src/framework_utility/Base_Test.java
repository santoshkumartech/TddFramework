package framework_utility;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
		String url= Utility_Functions.testConfiguration("URL");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterClass
	public void close()
	{
		//driver.close();
	}
}
