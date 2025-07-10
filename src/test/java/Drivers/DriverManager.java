package Drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static final ThreadLocal<WebDriver> tdl = new ThreadLocal<>();
	
		public static void SetDriver(String browser)
		{
			WebDriver driver= driverFactory.CreateInstance(browser);
			tdl.set(driver);
		}
		
		public static WebDriver getDriver()
		{
			return tdl.get();
			
		}
		
		public static void quitDriver()
		{
			WebDriver driver = tdl.get();
			if(driver!=null)
			{
				driver.quit();
				tdl.remove();
			}
		}

	

}
