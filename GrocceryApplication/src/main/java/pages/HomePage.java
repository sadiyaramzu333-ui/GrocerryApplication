package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="//a[text()='Admin']") WebElement adminlink;
	//@FindBy(xpath="//a[@class='dropdown-item'and @href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logoutbutton;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminbutton;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") WebElement logoutbutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement adminMoreInfoLink;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement manageNewsMoreInfoLink;

	
	
	
	public void clickOnAdminLink()
	{
		adminbutton.click();
	}
	
	public void clickOnLogoutButton()
	{
		logoutbutton.click();
	}
	public void clickOnAdminMoreInfoLink()
	{
		adminMoreInfoLink.click();
	}
	public void clickOnNewsMoreInfoLink()
	{
		manageNewsMoreInfoLink.click();	
	}
	
	
}
