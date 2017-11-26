package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_Third {
	
	public static boolean chkLogin()
	{		
		return true;//if true it will execute all the test cases
	}
	
	@BeforeClass
	public static void Begining()
	{
		System.out.println("************Begining*****************");
		Assume.assumeTrue(chkLogin());
		
	}
	
	@AfterClass
	public static void Ending()
	{
		System.out.println("***************ENDING***************");
	}
	
	@After
	public void AfterMethod()
	{
		System.out.println("Inside AfterMethod");
	}
	@Before
	public void BeforeMethod()
	{
		System.out.println("Inside BeforeMethod");
	}
	@Test
	public void myTest()
	{
		System.out.println("Inside MyTest");
	}
	@Test
	public void mySecondTest()
	{
		System.out.println("Inside MySecondTest");
	}
	
	
	
	
	
	
	
	
	
	

}
