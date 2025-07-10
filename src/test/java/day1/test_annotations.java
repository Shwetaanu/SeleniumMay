package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_annotations {
	@BeforeSuite
	public void setup1()
	{
		System.out.println("start beforesuite");
	}
	
	@BeforeTest
	public void setup2()
	{
		System.out.println("start before test");
	}
	@BeforeClass
	public void setup3()
	{
		System.out.println("start before class");
	}
	@BeforeMethod
	public void setup4()
	{
		System.out.println("start before Method");
	}
	
	@Test
	public void setup5()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void setup6()
	{
		System.out.println("Test2");
	}
	
	@Test
	public void setup7()
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void setup8()
	{
		System.out.println("Ends after Method");
	}
	
	@AfterClass
	public void setup9()
	{
		System.out.println("Ends after class");
	}

	@AfterTest
	public void setup10()
	{
		System.out.println("Ends after test");
	}
	@AfterSuite
	public void setup11()
	{
		System.out.println("Ends after suite");
	}

}
