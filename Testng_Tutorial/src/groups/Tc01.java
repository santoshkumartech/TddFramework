package groups;

import org.testng.annotations.Test;

public class Tc01 {
	@Test
	public void registerTest()
	{
		System.out.println("running register test");
	}
	@Test(groups = "smoke test")
	public void loginTest()
	{
		System.out.println("running login test");
	}
	@Test(groups = "smoke test")
	public void productCart()
	{
		System.out.println("running productCart test");
	}

}
