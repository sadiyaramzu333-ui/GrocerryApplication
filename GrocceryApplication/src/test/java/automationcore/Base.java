package automationcore;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public WebDriver driver;     //webdriver intialization
	
	@BeforeMethod
	public void intializeBrowser()
	{
		driver = new ChromeDriver(); // launch browser
		//url up --- chrome 
		driver.get(" https://groceryapp.uniqassosiates.com/admin/login");  // url get
		driver.manage().window().maximize();  // to maximize automatically
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
		public void  driverCloseAndQuit()
		{
			//driver.close();    //only close last window
			//driver.quit();     // close All tab 
		}

}
