package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	
	public void setup(String Browser)
	{
		switch(Browser)
		{
		case "Chrome" :
			System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\Chrome\\Chrome 136\\chromedriver.exe");
			
			driver= new ChromeDriver(); break;
		/*
		 * case "Edge" : System.setProperty("webdriver.Edge.driver",
		 * "D:\\Shweta\\Edge\\Edge 136\\msedgedriver.exe"); driver= new
		 * EdgeDriver();break;
		 */default: System.out.println("invalid browser"); break;
		}
		//driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown() throws InterruptedException
	{
		driver.quit();
	}
}
