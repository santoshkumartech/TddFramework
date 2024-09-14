package groups;

import org.testng.annotations.Test;

public class Tc02 {
	@Test
	public void normalTest()
	{
		System.out.println("running normal test");
	}
	
	@Test(groups = "smoke test")
	public void productCart()
	{
		System.out.println("running productCart test");
	}
	
	@Test(groups = "smoke test")
	public void productionCart()
	{
		System.out.println("running production cart test");
	}
}
