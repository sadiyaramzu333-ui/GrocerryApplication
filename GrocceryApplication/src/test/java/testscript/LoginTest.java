package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base{
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		String username= ExcelUtility.getStringData(0, 0, "LoginPage");
		String password= ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		String username= ExcelUtility.getStringData(1, 0, "LoginPage");
		String password= ExcelUtility.getStringData(1, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		
	}
	@Test
	
	public void VerifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		String username= ExcelUtility.getStringData(2, 0, "LoginPage");
		String password= ExcelUtility.getStringData(2, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() throws IOException
	{
		String username= ExcelUtility.getStringData(3, 0, "LoginPage");
		String password= ExcelUtility.getStringData(3, 1,"LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
	}
	
	
	

}
