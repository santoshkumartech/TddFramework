package com.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.Dws_Register_Page;
import com.pages.Dws_Register_page2;

import framework_utility.Base_Test;
import framework_utility.Utility_Functions;


public class Dws_RegisterTC01 extends Base_Test{
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException 
	{
		Object[][] data=Utility_Functions.testData("reg");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void demo(String fn , String ln , String email , String password , String cpassword ) throws InterruptedException
	{
		Dws_Register_Page page=new Dws_Register_Page(driver);
		
		Dws_Register_page2 page2 = new Dws_Register_page2(driver);
		page.Click_registerLink();
		page2.Click_radioButton();
		page2.Enter_value_in_fn(fn);
		page2.Enter_value_in_ln(ln);
		page2.Enter_value_in_email(email);
		page2.Enter_value_in_password(password);
		page2.Enter_value_in_cpassword(cpassword);
		page2.Click_registerButton();
	}
}
