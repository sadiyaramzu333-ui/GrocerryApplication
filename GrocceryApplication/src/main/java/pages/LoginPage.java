package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
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
	
	
	public void enterUsernameOnUsernameField(String username)
	{
		usernamefield.sendKeys(username);

	}
	public void enterPasswordOnPasswordField(String password)
	{
		passwordfield.sendKeys(password);

	}
	public void clickOnSignInButton()
	{
		signinbutton.click();
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
