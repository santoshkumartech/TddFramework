package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dws_Login_Tc {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url ="http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		String email = "santu123@gmail.com";
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		String p = "@#$123san";
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(p);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//Thread.sleep(5000);
		driver.close();
	}
}
