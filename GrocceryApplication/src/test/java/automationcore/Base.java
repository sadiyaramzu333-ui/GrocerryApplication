package automationcore;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.ScreenshotUtility;

public class Base {
public WebDriver driver;     //webdriver intialization
	
	@BeforeMethod(alwaysRun=true)
	@Parameters("browsers")
	public void intializeBrowser(String browsers) throws Exception
	{
		if(browsers.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver(); 
		}
		else if(browsers.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver(); 

		}
		else if (browsers.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			throw new Exception("invalid browser");
		}
		
	
		//url up --- chrome 
		driver.get(" https://groceryapp.uniqassosiates.com/admin/login");  // url get
		driver.manage().window().maximize();  // to maximize automatically
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit waits
	}
	@AfterMethod(alwaysRun=true)
		
	 public void driverQuit(ITestResult iTestResult) throws IOException { 
		  
	 		if (iTestResult.getStatus() == ITestResult.FAILURE) { 
	  
	 			ScreenshotUtility screenShot = new ScreenshotUtility(); 
	 			screenShot.getScreenshot(driver, iTestResult.getName()); 
	 		} 
	  
	 	}

}
