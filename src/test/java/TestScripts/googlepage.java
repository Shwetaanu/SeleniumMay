package TestScripts;

import org.openqa.selenium.WebDriver;

import Drivers.DriverManager;

public class googlepage extends baseTestclass{
	
//	WebDriver driver= DriverManager.getDriver();
	public void launchurl(String url)
	{
		//driver.get(url);
		
		navigateto(url);
	}

}
