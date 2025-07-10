package TestScripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenshotUtil
{
	 public static void takeScreenshot(WebDriver driver, String testName)
	 {
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        File dest = new File(System.getProperty("user.dir")+"\\screenshots\\" + testName + "_" + timestamp + ".png");
	        System.out.println(dest.getPath());
	        try
	        {
	        	
	            Files.createParentDirs(dest.getParentFile());
	            Files.copy(src, dest);
	            System.out.println("Screenshot saved: " + dest.getAbsolutePath());
	        } catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	    }
}
