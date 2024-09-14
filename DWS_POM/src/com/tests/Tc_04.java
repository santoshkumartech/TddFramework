package com.tests;

import org.testng.annotations.Test;
import com.pages.HomePage;
import com.pages.Register_Radio_page;
import framework_utility.Base_Test;

public class Tc_04 extends Base_Test {
	
	@Test
	public void Tc01()
	{
		HomePage page1 =new HomePage(driver);
		page1.clickOnRegister();
		
		Register_Radio_page page3 = new Register_Radio_page(driver);
		page3.clickOnRadio();
		
	}

}
