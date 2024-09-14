package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Select_Book_Tc extends Base_Test {
	@Test
	public void login() throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
		Utility_Functions.click(login);
		WebElement email = driver.findElement(By.xpath("//input[@class='email']"));
		Utility_Functions.sendKeys(email, Utility_Functions.testConfiguration("Username"));
		WebElement pwd = driver.findElement(By.xpath("//input[@class='password']"));
		Utility_Functions.sendKeys(pwd,Utility_Functions.testConfiguration("Password"));
		WebElement click = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		Utility_Functions.click(click);
		WebElement Books = driver.findElement(By.xpath("(//a[contains(text(),Books)])[6]"));
		Utility_Functions.click(Books);
		WebElement sort_by = driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Utility_Functions.click(sort_by);
		WebElement sort_by1 = driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Utility_Functions.usingIndex(sort_by1, 1);
		Thread.sleep(3000);
		WebElement sort_by2 = driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Utility_Functions.usingText(sort_by2,"Price: High to Low");
		Thread.sleep(3000);
	//	Utility_Functions.usingValue(sort_by,"Created on");
		
	}
}