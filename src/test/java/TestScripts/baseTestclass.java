package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Drivers.DriverManager;

public class baseTestclass {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	/*
	 * @Parameters("browser")
	 * 
	 * @BeforeMethod public void setup(String browser) {
	 * DriverManager.SetDriver(browser); driver=DriverManager.getDriver();
	 * System.out.println(driver); wait= new
	 * WebDriverWait(driver,Duration.ofSeconds(10));
	 * System.out.println("before method called"); }
	 */
	
	
	  @BeforeMethod public void setup() { 
		  String browser=	  System.getProperty("browser","chrome");
		  DriverManager.SetDriver(browser);
	  driver=DriverManager.getDriver(); System.out.println(driver); wait= new
	  WebDriverWait(driver,Duration.ofSeconds(10));
	  System.out.println("before method called"); }
	 
	
	
	  @AfterMethod() public void tearDown() 
	  {
		  DriverManager.quitDriver();
		System.out.println("after method is called");  
	  }
	 

	protected void navigateto(String url)
	{
		driver=DriverManager.getDriver();
		driver.get(url);
	}
}
