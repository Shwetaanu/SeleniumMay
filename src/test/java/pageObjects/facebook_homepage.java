package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import testBase.basePage;

public class facebook_homepage extends basePage {
	
	WebDriver driver;
	public facebook_homepage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement txtpass;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement buttonLogin;
	
	@FindBy(xpath="//input[@placeholder='Search Facebook']")
	WebElement searchcontactbox;
	
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
	
	
	
	public void searchcontact(String name)
	{
		searchcontactbox.sendKeys(name);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		
	}

}
