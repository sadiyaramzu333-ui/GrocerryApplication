package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitUtility;

public class LoginPage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")WebElement usernamefield;
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")WebElement signinbutton;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//b[text()='7rmart supermarket']")WebElement title;
	
	
	public LoginPage enterUsernameOnUsernameField(String username) //chaining of pages
	{
		usernamefield.sendKeys(username);
		return this;

	}
	public LoginPage enterPasswordOnPasswordField(String password)
	{
		passwordfield.sendKeys(password);
		return this;

	}
	public HomePage clickOnSignInButton()
	{
		waitutility.waitUntilElementToBeClickable(driver, signinbutton);
		signinbutton.click();
		return new HomePage(driver);
	}
	public boolean dashBoardDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public String getTitle()
	{
		return title.getText();
	}

}
