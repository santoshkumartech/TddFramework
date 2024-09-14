package working_with_annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dws_annotation_test {
	WebDriver driver;
	String email = "santu126@gmail.com";
	String p = "@#$123san";
	@BeforeTest
	public void browser_setup() {
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
	@Test
	public void tc1_register() {
		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		register.click();
		String fn = "santosh";
		String ln =  "kumar";
		String email = "santu129@gmail.com";
		String p = "@#$123san";
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fn);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(ln);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(p);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(p);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}
	@Test
	public void tc2_logout() {
		WebElement logout = driver.findElement(By.xpath("//a[@class='ico-logout']"));
		logout.click();
	}
	
	@Test
	public void tc3_login(){
		WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
	//	String email = "santu123@gmail.com";
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
	//	String p = "@#$123san";
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(p);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

}
