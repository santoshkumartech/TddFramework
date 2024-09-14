package data_provider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;


public class Automation_Demo_DataPro_Register extends Base_Test 
{
	@DataProvider(name = "Testdata")
	public Object[][] test()
	{
		Object[][] data = new Object[2][8];
		
		//1st iteration
		data[0][0] = "nanditha";
		data[0][1] = "tn";
		data[0][2] = "katriguppe banglore";
		data[0][3] = "nandu123@gmail.com";
		data[0][4] = "1235647789";
		data[0][5] = "nandu123";
		data[0][6] = "nandu123";
		
		//2nd iteration
		data[1][0] = "nanditha";
		data[1][1] = "tn";
		data[1][2] = "katriguppe banglore";
		data[1][3] = "nandu123@gmail.com";
		data[1][4] = "1235647789";
		data[1][5] = "nandu123";
		data[1][6] = "nandu123";
		return data;
	}
	public void demo(String fn , String ln , String add , String mail , String phno , String pwd , String cpwd) throws IOException, InterruptedException
	{
		WebElement register = driver.findElement(By.xpath("//a[text() = 'Register']"));
		Utility_Functions.click(register);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Utility_Functions.sendKeys(firstname, fn);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Utility_Functions.sendKeys(lastname, ln);
		
		WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		Utility_Functions.sendKeys(address, add);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		Utility_Functions.sendKeys(email, mail);
	//	Utility_function.find_element_for_text_field(email, mail);
		
		WebElement phoneno = driver.findElement(By.xpath("//input[@type='tel']"));
		Utility_Functions.sendKeys(phoneno, phno);
	//	Utility_function.find_element_for_text_field(phoneno, phno);
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Utility_Functions.click(radio);
	/*	
		WebElement habbies = driver.findElement(By.xpath("//input[@value='Movies']"));
		Utility_function.click_on_the_link(habbies);
		
		WebElement  skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Utility_function.select_class1(skills, "Adobe InDesign");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Utility_function.select_class1(country,"Australia");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][1]"));
		Utility_function.find_element_for_text_field(password, pwd);
		
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		Utility_function.find_element_for_text_field(confirmpassword, cpwd);
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	*/	
		
	}

}
