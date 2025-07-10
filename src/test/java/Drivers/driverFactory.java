package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {
 
	public static WebDriver CreateInstance(String browser)
	{
		WebDriver driver= null;
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			default:
				System.out.println("invalid browser");
			break;
		}
		return driver;
		
	}
}
