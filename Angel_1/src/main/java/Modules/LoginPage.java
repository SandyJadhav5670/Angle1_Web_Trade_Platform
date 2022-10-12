package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement PWD;
	@FindBy(xpath="//a[@id='loginBtn']") private WebElement clikonsignin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginPageUserid(String Userid)
	{
		UN.sendKeys(Userid);
	}
	public void LoginPagePass(String Password)
	{
		PWD.sendKeys(Password);
	}
	public void LoginPageClikbtn()
	{
	    clikonsignin.click();
	}
	
	

}
