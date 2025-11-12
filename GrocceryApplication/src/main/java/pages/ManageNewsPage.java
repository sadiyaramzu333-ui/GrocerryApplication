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



	
	public void addNewNews()
	{
		newButton.click();
	}
	public void enterNewsOnNewsField(String news)
	{
		newsfield.sendKeys(news);
	}
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
	public void clickOnSearchButtonOnManageNews()
	{
		searchButton.click();
	}
	public void enterNewsOnTitleField(String news)
	{
		searchnewsFeild.sendKeys(news);
	}
	public void clickOnSearchButtonOnSearchingNews()
	{
		searchButton1.click();
	}
	public void clickOnResetButtonOnManageNews()
	{
		resetbutton.click();
	}



}
