package day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_phone {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\Chrome\\Chrome 136\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String rating[] = new String[5];
		String price[] = new String[5];
	
	for(int i=1,j=0;i<=5 && j<5;i++,j++)
	{
		//rating= driver.findElement(By.xpath("//div[@role='listitem']["+1+"]//div[@class='a-row a-size-small']/span[@class='a-declarative']//span[@class='a-icon-alt']")).getText();
rating[j]= driver.findElement(By.xpath("//div[@role='listitem']["+i+"]//div[@class='a-row a-size-small']/span[@class='a-declarative']//a")).getAttribute("aria-label");
//price[j]= driver.findElement(By.xpath("//div[@role='listitem']["+i+"]//span[@class='a-declarative']//div[@class='puisg-row puis-desktop-list-row']//span[@class='a-price']/span[@class='a-offscreen']")).getText().toString();
		//System.out.println(rating[j] + "    "+price[j]);
System.out.println(rating[j]);
		
	}
	
		
	}

}
