package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Select_to_cart_data_provider  extends Base_Test
	{
	@DataProvider(name="TestData")
	public Object[][] testdata1(){
		Object[][] data=new Object[1][1];
		//1st iteration
		data[0][0]=2;
		
		return data;
	}
		@Test(dataProvider="TestData")
    public void Tc03(int index)
    {
	WebElement books=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
	Utility_Functions.click(books);
	
	WebElement position=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Utility_Functions.usingIndex(position, index);
		
	}
}
