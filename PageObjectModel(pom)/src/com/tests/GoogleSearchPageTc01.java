package com.tests;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.pages.GoogleSearchPage;
import com.pages.ResultPage;
import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class GoogleSearchPageTc01 extends Base_Test {
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException 
	{
		Object[][] data=Utility_Functions.testData("GoogleSheet");
		return data;
	}
	@Test(dataProvider ="TestData")
	public void TC01(String value) 
	{
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.Enter_searchText("autocarsindia");
		page.Click_searchButton();
		ResultPage resultpage=new ResultPage(driver);
		resultpage.Link_Click();
	}
}
