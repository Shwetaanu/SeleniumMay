package day3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\Chrome\\Chrome 136\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		List<WebElement> active_links = new ArrayList<>();
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href")!=null)
			{
				active_links.add(links.get(i));
			}
		}
		System.out.println(active_links.size());
			
		for(int i=0;i<active_links.size();i++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(active_links.get(i).getAttribute("href")).openConnection();
			connection.connect();
			String msg= connection.getResponseMessage();
			connection.disconnect();
			System.out.println(links.get(i).getAttribute("href") +"-->"+msg);
		}
		
	}
}