package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://text-compare.com/");
driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
Actions act= new Actions(driver);
act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();




	}

}
