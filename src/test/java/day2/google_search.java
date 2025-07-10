package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\Chrome\\Chrome 136\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//span[@class='YrSbJc' and text()='Stay signed out']")).click();
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("facebook");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		for(WebElement list1: list)
		{
			if(list1.getText().equals("facebook login"))
			{
				list1.click();
				break;
			}
				
		}
		
		
	}

}
