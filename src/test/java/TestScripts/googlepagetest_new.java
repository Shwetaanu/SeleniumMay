package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class googlepagetest_new extends baseTestclass {
	@Test
	public void openurl()
	{
		googlepage page= new googlepage();
		page.launchurl("https://www.google.co.in/");
	}

	/*
	 * @Test public void display() { System.out.println("hello"); }
	 */
	@Test
	public void display1()
	{
		System.out.println("Anay");
	}
	
	/*
	 * @Test(retryAnalyzer=MyRetry.class) public void display2() {
	 * System.out.println("chaudhari"); Assert.assertEquals(1, 2); }
	 */
	@Test
	public void display2()
	{
		System.out.println("chaudhari");
		Assert.assertEquals(1, 2);
	}
}
