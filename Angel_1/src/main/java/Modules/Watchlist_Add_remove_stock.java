package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Watchlist_Add_remove_stock 
{
	@FindBy(xpath="//a[@class='watchlistA']") private WebElement clikwatchlist;
	@FindBy(xpath="//a[@id='aWTCHLIST2']") private WebElement clikwatchlist2;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement clikonserach;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement sendstockname;
	@FindBy(xpath="(//span[@class='icon-add-external'])[1]") private WebElement clikonaddstock;
	@FindBy(xpath="(//span[@class='header'])[9]") private WebElement clikonstock;
	
	public Watchlist_Add_remove_stock(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void anglewatchlist()
	{
		clikwatchlist.click();
	}
	public void anglewatc2()
	{
		clikwatchlist2.click();
	}
	public void anglesearch()
	{
		clikonserach.click();
	}
	public void anglesendstockname(String stock)
	{
		sendstockname.sendKeys(stock);
	}
	public void angleaddstock()
	{
		clikonaddstock.click();
	}
	public void clickstock()
	{
		clikonstock.click();
	}
	
	
}
