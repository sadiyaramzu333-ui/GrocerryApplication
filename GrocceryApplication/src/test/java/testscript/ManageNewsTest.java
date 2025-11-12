package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utility.ExcelUtility;

public class ManageNewsTest extends Base
{
	@Test
	public void verifyUserAbleToAddNewNews() throws IOException
{
	String username= ExcelUtility.getStringData(0, 0, "LoginPage");
	String password= ExcelUtility.getStringData(0, 1,"LoginPage");
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSignInButton();
	HomePage homepage = new HomePage(driver);
	homepage.clickOnNewsMoreInfoLink();
	
	String news= ExcelUtility.getStringData(0, 0, "ManageNews");

	ManageNewsPage managenews = new ManageNewsPage(driver);
	managenews.addNewNews();
	managenews.enterNewsOnNewsField(news);
	managenews.clickOnSubmitButton();
	
}
	@Test
	public void verifyUserAbleToSearchAddedNews() throws IOException
	{
		String username= ExcelUtility.getStringData(0, 0, "LoginPage");
		String password= ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnNewsMoreInfoLink();
		String news= ExcelUtility.getStringData(0, 0, "ManageNews");

		ManageNewsPage managenews = new ManageNewsPage(driver);
	
		managenews.clickOnSearchButtonOnManageNews();
		managenews.enterNewsOnTitleField(news);
		managenews.clickOnSearchButtonOnSearchingNews();
	}
	@Test
	public void verifyUserAbleToRestNews() throws IOException
	{
		String username= ExcelUtility.getStringData(0, 0, "LoginPage");
		String password= ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnNewsMoreInfoLink();
		
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.clickOnResetButtonOnManageNews();
		
	}
}
