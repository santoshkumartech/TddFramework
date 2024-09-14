package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class LoginTestCase extends Base_Test {
	@Test
	public void dlogin_testcase() {
		String email="manojhonda691@gmail.com";
		String password="7829228202manu";
		WebElement loginlink=driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
		Utility_Functions.click(loginlink);
		WebElement emailtext=driver.findElement(By.xpath("//input[@class=\"email\"]"));
		Utility_Functions.sendKeys(emailtext, email);
		WebElement passwordtext=driver.findElement(By.xpath("//input[@class=\"password\"]"));
		Utility_Functions.sendKeys(passwordtext, password);
		WebElement loginbutton=driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]"));
		Utility_Functions.click(loginbutton);
		WebElement validate= driver.findElement(By.xpath("(//a)[2][@class='account']"));
		if(validate.getText().equalsIgnoreCase(email)) {
			System.out.println("validation successful");
		}
	}

}
