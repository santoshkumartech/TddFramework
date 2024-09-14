package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register_Data_Provider 
{
	@DataProvider(name = "TestData")
	public Object[][] testdata()
	{
		Object[][] data = new Object[2][5];
		data[0][0] = "santu";
		data[0][1] = "msk";
		data[0][2] = "santu@gmail.com.com";
		data[0][3] = "santuu123";
		data[0][4] = "santu123";
		
		data[1][0] = "pooja";
		data[1][1] = "tn";
		data[1][2] = "pooja1@gmail.com";
		data[1][3] = "pooja123";
		data[1][4] = "pooja123";
		return data;
	}
	@Test(dataProvider = "TestData")
	public void demo(String fn , String ln , String email , String pwd , String cpwd ) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
	    WebDriver  driver = new ChromeDriver();
		String url = "http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		 driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fn);
		 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(ln);
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		 driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(cpwd);
		 driver.findElement(By.xpath("//input[@id='register-button']")).click();
		 
	}
}


