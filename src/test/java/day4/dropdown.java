package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=marketplace/extension");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement drop= driver.findElement(By.xpath("//select[@id='input-sort']"));
		Select s= new Select(drop);
		//s.selectByVisibleText("Name");
		List<WebElement> lst= s.getOptions();
		
		for(WebElement web:lst)
		{
			if(web.getText().equals("Name")) {
				web.click();
				break;
			}
		}

	}

}
