package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;
import utility.FakerUtility;

public class AdminUserTest extends Base {
	
		@Test(priority=1,description="verifying user able to add new user")
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
			
		  
		AdminPage adminpage = new AdminPage(driver);
		adminpage.addNewUser();
		FakerUtility fakerutility = new FakerUtility();
		String username1= fakerutility.createRandomUsername();
		String password1= fakerutility.createRandomPassword();
		adminpage.enterUsernameOnUsernameFeild(username1);
		adminpage.enterpasswordOnPasswordFeild(password1);
		adminpage.selectingUserType();
		adminpage.ClickOnSaveButton();
		
		boolean isSuccessAlertDisplayed  = adminpage.isUserCreationSuccessAlertDisplayed();
		Assert.assertTrue(isSuccessAlertDisplayed,Constant.addingnewusererrormessage);
		
	}
		@Test(priority=2,description="verifying user able to search newly added user")

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
		
		AdminPage adminpage = new AdminPage(driver);
		adminpage.clickOnSearchButton();
		String username1= ExcelUtility.getStringData(0, 0, "AdminPage");
;
		adminpage.enterUsernameOnSearchAdminUsers(username1);
		adminpage.selectUserTypeOnSearchAdminUser();
		adminpage.clickOnSearchButtonOnAdminSeachUser();
		
		boolean isUserFound  = adminpage.isSearchedUserDisplayed();
		Assert.assertTrue(isUserFound,Constant.searchingusererrormessage);
		

	}
		@Test(priority=3,description="verifying user able to reset admin user")
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
			boolean isresetbuttondisplayed = adminpage.isResetButtonDisplayed();
			Assert.assertTrue(isresetbuttondisplayed,Constant.resetusererrormessage);
			

			
		}
	
		
		
	
	

}
