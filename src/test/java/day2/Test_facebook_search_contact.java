package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_facebook_search_contact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Shweta\\Chrome\\Chrome 136\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shwetchaudhari@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Shwet@6043");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		/*
		 * Thread.sleep(3); String name= "Gitesh Chaudhari";
		 * driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).
		 * sendKeys("Gitesh Chaudhari"); Actions action = new Actions(driver);
		 * action.sendKeys(Keys.ENTER);
		 */
		

	}

}
