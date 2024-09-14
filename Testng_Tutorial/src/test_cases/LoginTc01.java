package test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class LoginTc01 extends Base_Test {
	@DataProvider(name="test_data")
	public Object[][] testData() throws IOException
	{
		Object[][] test = Utility_Functions.testData("Sheet2");
		return test;
	}
	@Test(dataProvider="test_data")
	public void login(String email, String password) throws IOException
	{
			WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
			Utility_Functions.click(login);
			
			WebElement mail = driver.findElement(By.xpath("//input[@id='Email']"));
			Utility_Functions.sendKeys(mail, email);
			
			WebElement pwd = driver.findElement(By.xpath("//input[@id='Password']")); 
			Utility_Functions.sendKeys(pwd, password);
			
			WebElement rem = driver.findElement(By.xpath("//input[@id='RememberMe']"));
			Utility_Functions.click(rem);
	}
}
