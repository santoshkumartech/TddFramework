package com.tests;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.pages.LoginPage;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;

public class LoginTc01 extends Base_Test{
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException 
	{
		Object[][] data=Utility_Functions.testData("log");
		return data;
	}
	@Test(dataProvider ="TestData")
	public void demo(String email , String password) throws IOException, InterruptedException
	{
		LoginPage page=new LoginPage(driver);
		page.Click_Login_Link();
		page.Enter_value_in_email(email);
		page.Enter_value_in_pwd(password);
		page.Click_remember();
		page.Click_login();
	}

}
