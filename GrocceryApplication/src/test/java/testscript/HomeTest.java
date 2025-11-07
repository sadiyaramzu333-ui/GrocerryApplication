package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeTest {
	public WebDriver driver;
	public HomeTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
