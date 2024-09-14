package com.tests;

import org.testng.annotations.Test;
import com.pages.Books_Page;
import framework_utility.Base_Test;

public class Tc_10 extends Base_Test {
		@Test
		public void tc01() {
			Books_Page page = new Books_Page(driver);
			page.clickBook();
			page.clickAddToCart();
			page.printMsg();
		}
}
