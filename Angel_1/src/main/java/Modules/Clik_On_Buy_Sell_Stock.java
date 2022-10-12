package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clik_On_Buy_Sell_Stock 
{
	@FindBy(xpath="//a[@id='watchlistBuy']") private WebElement clikonBuybtn;
	@FindBy(xpath="(//button[@type='button'])[17]") private WebElement clikonCancelbtn;
	@FindBy(xpath="//a[@id='watchlistSell']") private WebElement clikonSellbtn;
	@FindBy(xpath="(//button[@type='button'])[17]") private WebElement clikonCancelbtn2;
	@FindBy(xpath="//input[@min='1']") private WebElement Quantity;
	
	public Clik_On_Buy_Sell_Stock(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Buy_Sell_clikbuy()
	{
		clikonBuybtn.click();
	}
	public void Buy_Sell_Clilcan()
	{
		clikonCancelbtn.click();
	}
	public void Buy_Sell_cliksell()
	{
		clikonSellbtn.click();
	}
	public void Buy_Sell_clikcan2()
	{
		clikonCancelbtn2.click();
	}
	public String VerifyByDefaultQuan()
	{
		String ByDefaultQuantity = Quantity.getText();
		return ByDefaultQuantity;
	}

}
