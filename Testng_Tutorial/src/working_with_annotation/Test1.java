package working_with_annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void medical_shop() 
	{
		System.out.println("medical shop getting executed");
	}
	@Test
	public void web_shop() {
		System.out.println("web shop getting executed");
	}
	@Test
	public void mobile_shop() {
		System.out.println("mobile shop getting executed");
	}
	@BeforeSuite
	public void before_suite()
	{
		System.out.println("executed before suite");
	}
	@BeforeMethod
	public void before_method() {
		System.out.println("executed before method");
	}
	@AfterMethod
	public void after_method() {
		System.out.println("executed after method");
	}
	@AfterSuite
	public void after_suite() {
		System.out.println("executed after suite");
	}

}
