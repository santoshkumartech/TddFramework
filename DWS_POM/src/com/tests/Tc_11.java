package com.tests;

import org.testng.annotations.Test;

import com.pages.Books_Page;
import com.pages.Shopping_Cart;

import framework_utility.Base_Test;

public class Tc_11 extends Base_Test{
	
	@Test
	public void tc() {
		
		Books_Page page1 = new Books_Page(driver);
		page1.clickBook();
		page1.clickAddToCart();
		
		Shopping_Cart page2 = new Shopping_Cart(driver);
		page2.clickCart();
		page2.changeQuantity("80");
		
	}

}
