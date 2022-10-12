package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_signout 
{
	@FindBy(xpath="//a[@role='button']") private WebElement clikonuserid;
	@FindBy(xpath="//a[@onclick='SignOut()']") private WebElement clikonsignout;
	
	public Homepage_signout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HomepageUserclik()
	{
		clikonuserid.click();
	}
	public void HomepageSignout()
	{
		clikonsignout.click();
	}

}
