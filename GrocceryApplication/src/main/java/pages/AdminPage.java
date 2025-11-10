package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	public WebDriver driver;
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
	
	
	
	public void addNewUser()
	{
		newbutton.click();
	}
	
    public void enterUsernameOnUsernameFeild(String username1) 
    {
    	usernamefield.sendKeys(username1);
    }
    public void enterpasswordOnPasswordFeild(String password1)
    {
    	passwordfield.sendKeys(password1);
    }
    public void selectingUserType()
    {
    	Select select = new Select(usertypedropdown);
    	select.selectByValue("admin");		
    }
    public void ClickOnSaveButton() 
    {
    	savebutton.click();
    }
    public void clickOnSearchButton() 
    {
    	searchbutton.click();
    }
    public void enterUsernameOnSearchAdminUsers(String username)
    {
    	usernameFeildonSearchUser.sendKeys(username);
    }
    public void selectUserTypeOnSearchAdminUser()
    {
        Select select = new Select(userTypeDropdownOnSearchUser);
        select.selectByValue("admin");
    }
    
    public void clickOnSearchButtonOnAdminSeachUser()
    {
    	searchbttn.click();
    }
    public void clickOnResetButtonOnAdminUser()
    {
    	resetbutton.click();
    }
  

}
