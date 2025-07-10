package day4;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().deleteAllCookies();

driver.get("https://www.google.com/");

List<WebElement> lst= driver.findElements(By.tagName("a"));

List<WebElement> active= new ArrayList<>();

for(int i=0;i<lst.size();i++)
{
	if(lst.get(i).getAttribute("href")!=null)
	{
		active.add(lst.get(i));
	}
}

for(int i=0;i<active.size();i++)
{
	HttpURLConnection conn= (HttpURLConnection)new URL(active.get(i).getAttribute("href")).openConnection();
	conn.connect();
	String str=conn.getResponseMessage();
	System.out.println(active.get(i).getAttribute("href")+"-->"+str);
	conn.disconnect();
}

	}

}
