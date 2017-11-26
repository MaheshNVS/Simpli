package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class Junit_First {
	
	@Test
	public void Begining_Junit()
	{
		System.out.println("Inside JUNit Test Annotation");
	}
	@After
	public void chk_After()
	{
		System.out.println("Inside JUnit After Annotation");
	}
	@Before
	public void chk_Before()
	{
		System.out.println("Inside JUnit Before Annotation");
	}
	@AfterClass
	public static void chk_AfterClass()
	{
		System.out.println("Inside JUnit AfterClass Annotation");
	}
	@BeforeClass
	public  static void chk_BeforeClass()
	{
		System.out.println("Inside JUnit BeforeClass Annotation");
	}
	
		

}
