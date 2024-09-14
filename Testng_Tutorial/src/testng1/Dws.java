package testng1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dws {
	
	@Test
	public void tc() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
				WebDriver driver =  new ChromeDriver();
				driver.get("http://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				
				//javascript
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,300)", " ");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,-500)", " ");
				
			
	}
	

}
