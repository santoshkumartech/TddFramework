package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Register_Tc_Dws extends Base_Test
{
	@Test
	public void register()
	{
		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Utility_Functions.click(register);
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
		Utility_Functions.click(gender);
		WebElement first_name=driver.findElement(By.xpath("//input[@id='FirstName']"));
		Utility_Functions.sendKeys(first_name,"santu");
		WebElement last_name=driver.findElement(By.xpath("//input[@id='LastName']"));
		Utility_Functions.sendKeys(last_name,"msk");
		WebElement email =driver.findElement(By.xpath("//input[@id='Email']"));
		Utility_Functions.sendKeys(email, "santumsk21@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='Password']"));
		Utility_Functions.sendKeys(pwd, "santumsk123");
		WebElement pwd2=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		Utility_Functions.sendKeys(pwd2,"santumsk123");
		WebElement reg =driver.findElement(By.xpath("//input[@id='register-button']"));
		Utility_Functions.click(reg);
	}
	
	
}
