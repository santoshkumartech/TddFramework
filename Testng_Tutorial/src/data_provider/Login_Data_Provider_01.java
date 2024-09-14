package data_provider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Login_Data_Provider_01 extends Base_Test
{
	@DataProvider(name = "TestData")
	public Object[][] testData()
	{
		Object [][] data = new Object[2][2];
		data[0][0] = "santu@gmail.com";
		data[0][1] = "santu123";
		
		data[1][0] = "pooja212gmail.com";
		data[1][1] = "pooja123";
		return data;
	}
	
	@Test(dataProvider ="TestData")
	public void demo(String email , String password) throws IOException, InterruptedException
	{
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
		Utility_Functions.click(login);
		WebElement email1 = driver.findElement(By.xpath("//input[@id='Email']"));
		Utility_Functions.sendKeys(email1, email);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='Password']"));
		Utility_Functions.sendKeys(pwd, password );
		WebElement login1 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		Utility_Functions.click(login1);
		
	/*	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.close();*/
		
	}
		
}


