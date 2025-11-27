package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class HomeTest extends Base{
	HomePage homepage;
	
	@Test(description="verifying user successfully logout ",retryAnalyzer = retry.Retry.class)
	public void VerifyUSerCanLogoutSucessfully() throws IOException
	{
		String username= ExcelUtility.getStringData(0, 0, "LoginPage");
		String password= ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		 homepage=loginpage.clickOnSignInButton();
		
		
		homepage.clickOnAdminLink();
		loginpage=homepage.clickOnLogoutButton();
		boolean issigntextdisplayed = homepage.isSignInTextDisplayed();
		Assert.assertTrue(issigntextdisplayed,Constant.logouterrormessage);
		
		
	}
	
	

}
