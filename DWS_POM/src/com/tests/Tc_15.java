package com.tests;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.pages.Books_Page;
import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Tc_15 extends Base_Test {

	@DataProvider(name="TestData")
	public Object[][] td() throws IOException{
	Object[][] data = Utility_Functions.testData("Sheet4");
	return data;
}
	@Test(dataProvider="TestData")
	public void tc(String text) 
	{
		
	Books_Page page1 = new Books_Page(driver);
	page1.clickBook();
	page1.selectGrid(text);
	
	}
}
