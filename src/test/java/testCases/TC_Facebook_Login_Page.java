package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Facebook_Login_page;

public class TC_Facebook_Login_Page extends BaseClass {
	
	//public WebDriver driver;
	
	
	@Test(priority =1)
	public void verify_facebookLogin()
	{
		
		Facebook_Login_page fb = new Facebook_Login_page(driver);
	fb.setEmail("shwetchaudhari@gmail.com");
fb.setpassword("Shwet@6043");
	fb.loginclick();
	}
	
	
	
}
