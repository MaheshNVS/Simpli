package JUnit;

import org.junit.Test;
import org.testng.Assert;

public class Assertions_Example {
	
	@Test
	public void chkList()
	{
		int ActualList = 100;
		int ExpectedList = 100;
		
//		if(ActualList == ExpectedList)
//		{
//			System.out.println("Passed");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		
		System.out.println("Before Asserting");
		Assert.assertEquals(ActualList, ExpectedList);
		System.out.println("After Asserting");
		
		
		
		
	}

}
