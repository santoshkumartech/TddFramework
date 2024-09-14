package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Automation_Practice_sign_in extends Base_Test {
		
		@Test
		public void signIn() throws IOException, InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement Sign_In = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			Utility_Functions.click(Sign_In);
			
			WebElement Create_Ac = driver.findElement(By.xpath("//input[@name='email_create']"));
			Utility_Functions.sendKeys(Create_Ac,Utility_Functions.testConfiguration("email"));
			
			WebElement Click_Create = driver.findElement(By.xpath("(//button)[2]"));
			Utility_Functions.click(Click_Create);
			
			WebElement radio = driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
			Utility_Functions.click(radio);
			
			Thread.sleep(10000);
			
			WebElement fn = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
			Utility_Functions.sendKeys(fn,Utility_Functions.testConfiguration("FirstName"));
			
			WebElement ln = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
			Utility_Functions.sendKeys(ln,Utility_Functions.testConfiguration("LastName"));
		
			WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			Utility_Functions.sendKeys(pwd,Utility_Functions.testConfiguration("Password"));
	
			WebElement Add = driver.findElement(By.xpath("(//input[@type=\"text\"])[8]"));
			Utility_Functions.sendKeys(Add,Utility_Functions.testConfiguration("Address"));
			
			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
			Utility_Functions.sendKeys(city,Utility_Functions.testConfiguration("City"));
			
			WebElement State = driver.findElement(By.xpath("//select[@name='id_state']"));
			Utility_Functions.usingIndex(State, 32);
			
			WebElement code = driver.findElement(By.xpath("//input[@name='postcode']"));
			Utility_Functions.sendKeys(code,Utility_Functions.testConfiguration("Code"));
			
			WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
			Utility_Functions.usingIndex(country, 01);
			
			WebElement mob = driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
			Utility_Functions.sendKeys(mob,Utility_Functions.testConfiguration("Mobile"));
			
			WebElement ali = driver.findElement(By.xpath("(//input[@type=\"text\"])[9]"));
			Utility_Functions.sendKeys(ali,Utility_Functions.testConfiguration("Alias"));
			
			WebElement submit = driver.findElement(By.xpath("//button[@name='submitAccount']"));
			Utility_Functions.click(submit);
			
			
		}
}
