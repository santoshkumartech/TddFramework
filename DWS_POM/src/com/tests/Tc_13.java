package com.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.HomePage;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Tc_13 extends Base_Test {

	@DataProvider(name="TestData")
	public Object[][] testData() throws IOException {
		Object[][] data = Utility_Functions.testData("Sheet4");
		return data;
	}
	@Test(dataProvider="TestData")
	public void tc(String text) {
	
		HomePage page1 = new HomePage(driver);
		page1.search(text);
		page1.clickSearch();
		
	}
}
          