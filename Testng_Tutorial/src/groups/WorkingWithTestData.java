package groups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithTestData {
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object [][] data=new Object[2][2];
		
	//1st
		data[0][0]=1;
		data[0][1]=2;
	//2nd
		data[1][0]=3;
		data[1][1]=4;
		 return data;
	}
	@Test(dataProvider="TestData")
		public void Demo(int num1,int num2)
	{
			System.out.println("num1 :"+num1);
			System.out.println("num2 :"+num2);
			}

}
