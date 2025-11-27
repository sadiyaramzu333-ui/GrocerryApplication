package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement adminbutton;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	WebElement logoutbutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement adminMoreInfoLink;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	WebElement manageNewsMoreInfoLink;
	@FindBy(xpath="//p[text()='Sign in to start your session']")WebElement signintext;

	public HomePage clickOnAdminLink() {
		adminbutton.click();
		return this;
	}

	public LoginPage clickOnLogoutButton() {
		logoutbutton.click();
		return new LoginPage(driver);
	}

	public AdminPage clickOnAdminMoreInfoLink() {
		adminMoreInfoLink.click();
		return new AdminPage(driver);
	}

	public ManageNewsPage clickOnNewsMoreInfoLink() {
		manageNewsMoreInfoLink.click();
		return new ManageNewsPage(driver);
	}
	public boolean isSignInTextDisplayed()
	{
		return signintext.isDisplayed();
	}

}
