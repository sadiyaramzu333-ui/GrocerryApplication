package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class AdminUserTest extends Base {
	
		@Test
	public void verifyUserAbleToAddNewAdminUser() throws IOException
	{
			String username= ExcelUtility.getStringData(0, 0, "LoginPage");
			String password= ExcelUtility.getStringData(0, 1,"LoginPage");
			
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(username);
			loginpage.enterPasswordOnPasswordField(password);
			loginpage.clickOnSignInButton();
			HomePage homepage = new HomePage(driver);
			homepage.clickOnAdminMoreInfoLink();
			
	
		String username1= ExcelUtility.getStringData(4, 0, "LoginPage");
		String password1= ExcelUtility.getStringData(4, 1, "LoginPage");
		AdminPage adminpage = new AdminPage(driver);
		adminpage.addNewUser();
		adminpage.enterUsernameOnUsernameFeild(username1);
		adminpage.enterpasswordOnPasswordFeild(password1);
		adminpage.selectingUserType();
		adminpage.ClickOnSaveButton();
	}
		@Test

	public void verifyUserAbleToSearchNewlyAddedAdminUser() throws IOException
	{
		String username= ExcelUtility.getStringData(0, 0, "LoginPage");
		String password= ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminMoreInfoLink();
		
		String username1= ExcelUtility.getStringData(4, 0, "LoginPage");
		AdminPage adminpage = new AdminPage(driver);
		adminpage.clickOnSearchButton();
		adminpage.enterUsernameOnSearchAdminUsers(username1);
		adminpage.selectUserTypeOnSearchAdminUser();
		adminpage.clickOnSearchButtonOnAdminSeachUser();

	}
		@Test
		public void verifyUserAbleToResetAdminUser() throws IOException
		{
			String username= ExcelUtility.getStringData(0, 0, "LoginPage");
			String password= ExcelUtility.getStringData(0, 1,"LoginPage");
			
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(username);
			loginpage.enterPasswordOnPasswordField(password);
			loginpage.clickOnSignInButton();
			HomePage homepage = new HomePage(driver);
			homepage.clickOnAdminMoreInfoLink();
			AdminPage adminpage = new AdminPage(driver);
			adminpage.clickOnResetButtonOnAdminUser();

			
		}
	
		
		
	
	

}
