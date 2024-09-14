package data_provider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import framework_utility.Utility_Functions;

public class Register_Data_Provider_01 {
		@DataProvider(name = "TestData")
		public Object[][] testdata()
		{
			Object[][] data = new Object[2][5];
			data[0][0] = "santu";
			data[0][1] = "msk";
			data[0][2] = "santu1212@gmail.com.com";
			data[0][3] = "santuu123";
			data[0][4] = "santu123";
			
			data[1][0] = "pooja";
			data[1][1] = "tn";
			data[1][2] = "pooja154@gmail.com";
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
			
			WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
			Utility_Functions.click(register);
			WebElement gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
			Utility_Functions.click(gender);
			WebElement first_name=driver.findElement(By.xpath("//input[@id='FirstName']"));
			Utility_Functions.sendKeys(first_name,fn);
			WebElement last_name=driver.findElement(By.xpath("//input[@id='LastName']"));
			Utility_Functions.sendKeys(last_name,ln);
			WebElement email1 =driver.findElement(By.xpath("//input[@id='Email']"));
			Utility_Functions.sendKeys(email1,email);
			WebElement pwd1=driver.findElement(By.xpath("//input[@id='Password']"));
			Utility_Functions.sendKeys(pwd1, pwd);
			WebElement pwd2=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			Utility_Functions.sendKeys(pwd2,pwd);
			WebElement reg =driver.findElement(By.xpath("//input[@id='register-button']"));
			Utility_Functions.click(reg);
			driver.close();
			
	}
}
