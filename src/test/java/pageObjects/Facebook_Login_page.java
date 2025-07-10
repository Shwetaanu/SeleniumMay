package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class Facebook_Login_page extends basePage {
	
	WebDriver driver;
	public Facebook_Login_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement txtpass;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement buttonLogin;
	
	
	public void setEmail(String emailid)
	{
		txtemail.sendKeys(emailid);
	}
	
	public void setpassword(String pwd)
	{
		txtpass.sendKeys(pwd);
	}

	public void loginclick()
	{
		buttonLogin.click();
	
	}
}
