package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class AddToCart_DWS extends Base_Test {
	
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
		WebElement Books = driver.findElement(By.xpath("(//a[@href='/books'])[1]"));
		Utility_Functions.click(Books);
		WebElement Add_To_Cart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		Utility_Functions.click(Add_To_Cart);
		WebElement shoping_Cart = driver.findElement(By.xpath("(//a[@href='/cart'])[1]"));
		Utility_Functions.click(shoping_Cart);
		WebElement product = driver.findElement(By.xpath("//a[@class='product-name']"));
		if(product.getText().equalsIgnoreCase("Computing and Internet"))
		{
		System.out.println(product.getText());
		}
		
	}
}
