package groups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework_utility.Utility_Functions;

public class Assertion_TestCase  {
        
        @Test
    	public void loginWith() {
   		String email = "divya574@gmail.com";
    		String password = "Di1234";
    		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		String link = "http://demowebshop.tricentis.com/";
    		driver.get(link);
    		driver.manage().window().maximize();
     		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		
     		//working with Hard Assert
    		Assert.assertEquals("Demo Web Shop", driver.getTitle(), "title matched");
    		WebElement login_button = driver.findElement(By.xpath("//a[@class='ico-login']"));
    		Assert.assertTrue(login_button.isEnabled());
    		Utility_Functions.click(login_button);
    		
    		WebElement email_tf = driver.findElement(By.id("Email"));
    		Assert.assertTrue(email_tf.isDisplayed());
    		Utility_Functions.sendKeys(email_tf,email);
    		//Utility_Functions.Enter_Value_In_Editfield(email_tf, email);
    		
    		WebElement pwd_textf = driver.findElement(By.id("Password"));
    		Assert.assertTrue(pwd_textf.isDisplayed());
    		framework_utility.Utility_Functions.sendKeys(pwd_textf,password);
    	   // Utility_Functions.Enter_Value_In_Editfield(pwd_textf, password);
    	   
    		WebElement login_butt = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
    		Assert.assertTrue(login_butt.isEnabled());
    		Utility_Functions.click(login_button);
    	//	Utility_Functions.Click(login_butt);
    		
    		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='account']")).isEnabled());
    		String text=driver.findElement(By.xpath("//a[@class='account']")).getText();
    		System.out.println(text);
    		Assert.assertEquals("divya574@gmail.com",text , "text is not matching");
    		driver.quit();


//when we have minor defects then we go for this like after product is added we get message 
            //working with soft assert
//        	SoftAssert ast=new SoftAssert();
//        	ast.assertEquals(driver.getTitle(), "Demo webb shop");
//        	ast.assertEquals(55,55);
//        	ast.assertEquals('a', 'a');
//        	ast.assertNotEquals("divya", "d","the given names do not match");
//        	
//        	driver.close();
//        	//below statement compulsory to record all the assertions and display it
//        	ast.assertAll();
        	
    		

	}
}

