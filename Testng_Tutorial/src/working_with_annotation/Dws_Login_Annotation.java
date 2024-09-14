package working_with_annotation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Dws_Login_Annotation {
	WebDriver driver;
	@BeforeTest
	public void driver_start() {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url ="http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
