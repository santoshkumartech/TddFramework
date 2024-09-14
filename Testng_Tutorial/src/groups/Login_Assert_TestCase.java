package groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Assert_TestCase {

	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
	    WebDriver  driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = "http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
	//	Assert.assertEquals("Demo Web Shop", driver.getTitle());
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='ico-login']")).isEnabled());
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@class=\"email\"]")).isEnabled());
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("manojhonda691@gmail.com");
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@class='password']")).isEnabled());
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("7829228202manu");
		
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='submit'])[2]")).isEnabled());
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@href='/customer/info'])[1]")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("(//a[@href='/customer/info'])[1]")).getText());
		
		driver.close();
		
	}
}
