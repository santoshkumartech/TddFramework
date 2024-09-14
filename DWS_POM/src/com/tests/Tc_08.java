package com.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.LoginLandingPage;
import com.pages.HomePage;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class Tc_08 extends Base_Test{
	@DataProvider(name="TestData")
	public Object[][] td() throws IOException {
		Object[][] data = Utility_Functions.testData("Sheet9");
		return data;
	}
	@Test(dataProvider="TestData")
	public void tc01(String email, String Pwd) {
		
		HomePage page1 =new HomePage(driver);
		page1.clickOnLogin();
		
		LoginLandingPage page2 = new LoginLandingPage(driver);
		page2.enterMail(email);
		page2.enterPwd(Pwd);
		page2.clickLogin();
	}
}
