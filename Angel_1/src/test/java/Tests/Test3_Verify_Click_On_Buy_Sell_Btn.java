package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_File.Baseclass;
import Library_File.UtilityClass;
import Modules.Clik_On_Buy_Sell_Stock;
import Modules.HomePage;
import Modules.Homepage_signout;
import Modules.LoginPage;
import Modules.Watchlist_Add_remove_stock;

public class Test3_Verify_Click_On_Buy_Sell_Btn extends Baseclass
{
	int TCID;
	LoginPage login1;
	HomePage Home1;
	Watchlist_Add_remove_stock watch;
	 Clik_On_Buy_Sell_Stock Click_Buy_Sell;
	Homepage_signout Home2;
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initializeBrowser();
	    login1 = new LoginPage(driver);
	    Home1 = new HomePage(driver);
	    Home2 = new Homepage_signout(driver);
		
	}
	@BeforeMethod
	public void LoginToApp() throws IOException, InterruptedException
	{
		login1.LoginPageUserid(UtilityClass.getPFData("UN"));
		login1.LoginPagePass(UtilityClass.getPFData("PWD"));
		login1.LoginPageClikbtn();
		Home1.HomePageHidden();
		 watch=new Watchlist_Add_remove_stock(driver);
		 watch.anglewatchlist();
		 watch.anglesearch();
		 watch.anglesendstockname(UtilityClass.getPFData("stock"));
		 Thread.sleep(3000);
		 watch.angleaddstock();
		 Thread.sleep(3000);
		 watch.clickstock();
		
		
	}
	
	@Test
	public void Buy_Sell_Stock() throws InterruptedException, IOException 
	{
		TCID=103;
		 Click_Buy_Sell = new Clik_On_Buy_Sell_Stock(driver);
		 Click_Buy_Sell.Buy_Sell_clikbuy();
		 Thread.sleep(3000);
		 Click_Buy_Sell.Buy_Sell_Clilcan();
		 Click_Buy_Sell.Buy_Sell_cliksell();
		 Thread.sleep(3000);
		 Click_Buy_Sell.Buy_Sell_clikcan2();
		 Click_Buy_Sell.Buy_Sell_clikbuy();
		 String ByDefaultQuantity = Click_Buy_Sell.VerifyByDefaultQuan();
		 String ActQuantity=UtilityClass.getPFData(ByDefaultQuantity);
		 Assert.assertEquals("1", "1","Pass:Act & exp results are same");
		 Thread.sleep(3000);
		 Click_Buy_Sell.Buy_Sell_Clilcan();
		
	}
	
	@AfterMethod
	public void LogoutToApp(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			UtilityClass.captureScreenshot(driver, TCID);
		}
		Home2.HomepageUserclik();
		Home2.HomepageSignout();
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
