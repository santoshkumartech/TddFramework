package data_provider;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;

public class Login_Data_Provider extends Base_Test
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
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.close();
		
	}
		
}


