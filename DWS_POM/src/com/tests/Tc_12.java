package com.tests;

import org.testng.annotations.Test;

import com.pages.HomePage;

import framework_utility.Base_Test;

public class Tc_12 extends Base_Test {
	@Test 
	public void quality_check()
	{
		HomePage page1 = new HomePage(driver);
		page1.clickWishlist();
	}
}
