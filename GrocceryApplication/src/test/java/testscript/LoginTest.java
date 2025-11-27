package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {
	HomePage homepage;
	@Test(priority = 1, description = "verifying succesfull user login with valid credentials",groups= {"smoke"})
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);//chaining of methods
		homepage=loginpage.clickOnSignInButton();
		boolean isDashBoardDispalyed=loginpage.dashBoardDisplayed();
		Assert.assertTrue(isDashBoardDispalyed,Constant.validcredentialserrormessage);

	}

	@Test(priority = 2,description="verifying UserLogin With Invalid Username And ValidPassword ")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		String actual = loginpage.getTitle();
		String expected ="7rmart supermarket";
		Assert.assertEquals(actual, expected,Constant.invalidusernameerrormessage);
	
		

	}

	@Test(priority = 3,description="Verifying User Login With Valid Username  And InvalidPassword")

	public void VerifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		String actual = loginpage.getTitle();
		String expected = "7rmart supermarket";
		Assert.assertEquals(actual, expected,Constant.invalidpassworderrormessage);
	}

	@Test(priority = 4,description="verifying User Login With Invalid Credentials",groups= {"smoke"},dataProvider="loginProvider")
	public void verifyUserLoginWithInvalidCredentials(String username,String password) throws IOException {
		//String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		//String password = ExcelUtility.getStringData(3, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		String actual = loginpage.getTitle();
		String expected ="7rmart supermarket";
		Assert.assertEquals(actual, expected,Constant.invalidcredebtialerrormessage);
	
		

	}
	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },//data read
				// new Object[] {ExcelUtility.getStringData(3,
				// 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
		};

}
}
