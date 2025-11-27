package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @onclick='click_button(1)']")
	WebElement newButton;
	@FindBy(id="news")WebElement newsfield;
	@FindBy(xpath = "//button[@type='submit']")WebElement submitButton;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	WebElement searchButton;
	@FindBy(name="un")WebElement searchnewsFeild;
	@FindBy(xpath = "//button[@value='sr']")WebElement searchButton1;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")WebElement resetbutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successnewsalert;





	
	public ManageNewsPage addNewNews()
	{
		newButton.click();
		return this;
	}
	public ManageNewsPage enterNewsOnNewsField(String news)
	{
		newsfield.sendKeys(news);
		return this;
	}
	public ManageNewsPage clickOnSubmitButton()
	{
		submitButton.click();
		return this;
	}
	public ManageNewsPage clickOnSearchButtonOnManageNews()
	{
		searchButton.click();
		return this;
	}
	public ManageNewsPage enterNewsOnTitleField(String news)
	{
		searchnewsFeild.sendKeys(news);
		return this;
	}
	public ManageNewsPage clickOnSearchButtonOnSearchingNews()
	{
		searchButton1.click();
		return this;
	}
	
	public boolean isNewsCreatedSuccessfullyDisplayed()
    {
    	return successnewsalert.isDisplayed();   
    }
	public boolean isSearchedNewsDisplayed()
	{
		return searchButton1.isDisplayed();
	}



}
