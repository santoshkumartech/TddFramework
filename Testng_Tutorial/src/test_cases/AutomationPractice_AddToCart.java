package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class AutomationPractice_AddToCart extends Base_Test {
	
	@Test
	public void addToCart() throws IOException
	{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement Sign_In = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	Utility_Functions.click(Sign_In);
	
	WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
	Utility_Functions.sendKeys(email1,Utility_Functions.testConfiguration("email"));
	
	WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
	Utility_Functions.sendKeys(pwd,Utility_Functions.testConfiguration("Password"));
	
	WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	Utility_Functions.click(login);
	
	WebElement Tshirt = driver.findElement(By.xpath("(//li[@class='sfHoverForce'])[2]"));
	Utility_Functions.click(Tshirt);
	
	}
}
