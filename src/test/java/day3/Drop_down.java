package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Shweta\\Chrome\\Chrome 136\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
driver.get("https://www.opencart.com/index.php?route=marketplace/extension");
WebElement drop= driver.findElement(By.xpath("//select[@id='input-sort']"));

Select select= new Select(drop);
select.selectByVisibleText("Price");




	}

}
