package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class googlepageTest extends baseTestclass {
	
	@Test
	public void openurl()
	{
		googlepage page= new googlepage();
		page.launchurl("https://www.google.co.in/");
	}

	/*
	 * @Test public void display() 
	 * { System.out.println("hello"); }
	 */
	/*
	 * @Test(retryAnalyzer=MyRetry.class)
	 *  public void display1() {
	 * System.out.println("shweta"); Assert.assertEquals(1, 2); }
	 */
	
	@Test(groups={"sanity"})
	public void display1()
	{
		System.out.println("shweta");
		//Assert.assertEquals(1, 2);
	}
	
	@Test(groups={"sanity"})
	public void display4()
	{
		System.out.println("shweta4");
	//	Assert.assertEquals(1, 2);
	}
	
	@Test(groups={"regression"})
	public void display5()
	{
		System.out.println("shweta5");
	//	Assert.assertEquals(1, 2);
	}
	
	@Test(groups={"sanity","regression"})
	public void display6()
	{
		System.out.println("shweta6");
	//	Assert.assertEquals(1, 2);
	}
	
	@Test(groups={"sanity"})
	public void display7()
	{
		System.out.println("shweta7");
		Assert.assertEquals(1, 2);
	}
	/*
	 * @Test public void display2() { System.out.println("chaudhari"); }
	 */
	
}
