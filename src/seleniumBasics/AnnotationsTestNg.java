package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNg {

	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("Before Method");
	}
	
	
	@Test
	public void runTest()
	{
		
		System.out.println("My Test Case");
		
	}
	
	@Test
	public void runTest2()
	{
		
		System.out.println("My Test Case2");
		
	}
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterMethod1()
	{
		
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterMethod2()
	{
		
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterMethod4()
	{
		
		System.out.println("After Suite");
	}
	
	
}
