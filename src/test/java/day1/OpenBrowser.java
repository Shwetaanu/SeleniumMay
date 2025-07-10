package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\Chrome\\Chrome 136\\chromedriver.exe");
		//System.setProperty("webdriver.Edge.driver", "D:\\Shweta\\Edge\\Edge 136\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver =	 new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		

	}

}
