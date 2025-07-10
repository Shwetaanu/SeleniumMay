package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class serach_google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
		List<WebElement> web= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(web.size());
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		for(WebElement list:web)
		{
			if(list.getText().contains("selenium rich foods"))
			{
				js.executeScript("arguments[0].click()", list);
				//list.click();
				break;
			}
		}
		

	}

}
