package TestNG_;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class MyNewTNG {
	
	@Test
  public void f() {
	  System.out.println("Inside @Test Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside @BeforeMethod Annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside @AfterMEthod Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside @BeforeCLass Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside @AfterClass Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside @BeforeTest Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside @AfterTest Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside @BeforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside @AfterSuite Annotation");
  }

}
