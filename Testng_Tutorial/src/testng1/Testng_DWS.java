package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_DWS 
{
	@Test()
	public void register() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url ="http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		String fn = "santosh";
		String ln =  "kumar";
		String email = "santu123@gmail.com";
		String p = "@#$123san";
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fn);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(ln);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(p);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(p);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
