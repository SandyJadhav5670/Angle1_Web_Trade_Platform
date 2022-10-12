package Library_File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass 
{
	public WebDriver driver;
	public void initializeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace1\\Angel_1\\Browsers\\chromedriver.exe");						
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(UtilityClass.getPFData("URL"));
		
	}


}
