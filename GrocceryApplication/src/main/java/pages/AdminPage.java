package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constant.Constant;
import utility.PageUtility;
import utility.WaitUtility;

public class AdminPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	WaitUtility waitUtility = new WaitUtility();
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(id="username")WebElement usernamefield;
	@FindBy(id="password")WebElement passwordfield;
	@FindBy(id="user_type")WebElement usertypedropdown;
	@FindBy(name="Create")WebElement savebutton;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")WebElement searchbutton;
	@FindBy(id="un")WebElement usernameFeildonSearchUser;
	@FindBy(id="ut")WebElement userTypeDropdownOnSearchUser;
	@FindBy(xpath = "//button[@value='sr']")WebElement searchbttn;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")WebElement resetbutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successalert;
	@FindBy(xpath="//a[@class='page-link']")WebElement usernameresult;
	
	
	
	
	public AdminPage addNewUser()
	{
		waitUtility.waitUntilElementToBeClickable(driver, newbutton);
		newbutton.click();
		return this;
	}
	
    public AdminPage enterUsernameOnUsernameFeild(String username1) 
    {
    	usernamefield.sendKeys(username1);
    	return this;
    }
    public AdminPage enterpasswordOnPasswordFeild(String password1)
    {
    	passwordfield.sendKeys(password1);
    	return this;
    }
    public AdminPage selectingUserType()
    {
    	pageutility.selectDropdownWithValue(usertypedropdown,Constant.dropdownvalue);
    	//Select select = new Select(usertypedropdown);
    	//select.selectByValue("admin");	
    	return this;
    }
    public AdminPage ClickOnSaveButton() 
    {
    	savebutton.click();
    	return this;
    }
    public AdminPage clickOnSearchButton() 
    {
    	
    	searchbutton.click();
    	return this;
    }
    public AdminPage enterUsernameOnSearchAdminUsers(String username)
    {
    	usernameFeildonSearchUser.sendKeys(username);
    	return this;
    }
    public AdminPage selectUserTypeOnSearchAdminUser()
    {
        Select select = new Select(userTypeDropdownOnSearchUser);
        select.selectByValue("admin");
        return this;
    }
    
    public AdminPage clickOnSearchButtonOnAdminSeachUser()
    {
    	searchbttn.click();
    	return this;
    }
    public AdminPage clickOnResetButtonOnAdminUser()
    {
    	resetbutton.click();
    	return this;
    }
    public boolean isUserCreationSuccessAlertDisplayed()
    {
    	return successalert.isDisplayed();
    }
    public boolean isSearchedUserDisplayed() 
    {
    	return usernameresult.isDisplayed();
    }
    public boolean isResetButtonDisplayed()
    {
    	return resetbutton.isDisplayed();
    }

  

}
