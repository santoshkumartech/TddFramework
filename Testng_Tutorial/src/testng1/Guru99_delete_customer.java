package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99_delete_customer {
	@Test
	public void delete() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url ="http://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("(//a[contains(@text(),Delete)])[10]")).click();
		String cid = "123";
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys(cid);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert ale = driver.switchTo().alert();
		ale.accept();
		Thread.sleep(1000);
		ale.accept();
		Thread.sleep(1000);
		driver.close();
	}
	

}
