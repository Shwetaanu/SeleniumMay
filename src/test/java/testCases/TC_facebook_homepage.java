package testCases;

import org.testng.annotations.Test;

import pageObjects.facebook_homepage;

public class TC_facebook_homepage extends BaseClass{
	

	
	@Test(priority =1)
	public void search_contact() throws InterruptedException
	{
		facebook_homepage home = new facebook_homepage(driver);
		home.setEmail("shwetchaudhari@gmail.com");
		home.setpassword("Shwet@6043");
		home.loginclick();
		Thread.sleep(3);
		String name= "Gitesh Chaudhari";
		home.searchcontact(name);
		
	}

}
