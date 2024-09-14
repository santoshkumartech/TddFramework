package test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Register_Tc extends Base_Test {
		@DataProvider(name="test_data")
		public Object[][] testData() throws IOException
		{
			Object[][] test = Utility_Functions.testData("Sheet3");
			return test;
		}
		@Test(dataProvider = "TestData")
		public void demo(String fn , String ln , String email , String password , String cpassword ) throws InterruptedException
		{
		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Utility_Functions.click(register);
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='gender-female']"));
		Utility_Functions.click(radioButton);
		
		WebElement firstno = driver.findElement(By.xpath("//input[@id='FirstName']"));
		Utility_Functions.sendKeys(firstno, fn);
		
		WebElement lastno = driver.findElement(By.xpath("//input[@id='LastName']"));
		Utility_Functions.sendKeys(lastno, ln);
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='Email']"));
		Utility_Functions.sendKeys(mail,email);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='Password']"));
		Utility_Functions.sendKeys(pwd,password);
		
		WebElement cpwd = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		Utility_Functions.sendKeys(cpwd,cpassword);
		
		WebElement reg = driver.findElement(By.xpath("//input[@id='register-button']"));
		Utility_Functions.click(reg);
		}
}
