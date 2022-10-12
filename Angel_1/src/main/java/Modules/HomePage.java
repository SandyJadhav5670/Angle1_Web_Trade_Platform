package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(//button[@class='close icon-cancel'])[6]") private WebElement clikclosebtn;
	@FindBy(xpath="//a[@role='button']") private WebElement userid;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HomePageHidden()
	{
		clikclosebtn.click();
	}
	public String VerifyUserID()
	{
		String actUser = userid.getText();
		return actUser;
		
	}
	
	

}
