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
import Modules.HomePage;
import Modules.Homepage_signout;
import Modules.LoginPage;
import Modules.Watchlist_Add_remove_stock;

public class Test1_VerifyUserID extends Baseclass


{
	int TCID;
	LoginPage login1;
	HomePage Home1;

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
	public void LoginToApp() throws IOException
	{
		login1.LoginPageUserid(UtilityClass.getPFData("UN"));
		login1.LoginPagePass(UtilityClass.getPFData("PWD"));
		login1.LoginPageClikbtn();
		Home1.HomePageHidden();
		
		
	}
	
	@Test
	public void VerifyUserId() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=101;
		String actUser = Home1.VerifyUserID();
		Thread.sleep(5000);
		String expecUser = UtilityClass.getPFData(actUser);
		Assert.assertEquals("BBLM24363", "BBLM24363","Pass:Act & exp results are same");
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
