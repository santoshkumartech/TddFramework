package com.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.Register_Result_Page;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Tc_03 extends Base_Test {
	
	@DataProvider(name="TestData")
	public Object[][] testData() throws IOException
	{
		Object[][] data = Utility_Functions.testData("Sheet5");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void Tc01(String fstnme)
	{
		HomePage page1 =new HomePage(driver);
		page1.clickOnRegister();
		
		Register_Result_Page page2 = new Register_Result_Page(driver);
		page2.firstNameData(fstnme);
		
		
	}

}
