package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utility.ExcelUtility;

public class ManageNewsTest extends Base {
	HomePage homepage;
	ManageNewsPage managenews;
	
	@Test(priority=1,description="verifying user able to add news")
	public void verifyUserAbleToAddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSignInButton();
		//HomePage homepage = new HomePage(driver);
		 managenews=homepage.clickOnNewsMoreInfoLink();

		String news = ExcelUtility.getStringData(0, 0, "ManageNews");

		//ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.addNewNews().enterNewsOnNewsField(news).clickOnSubmitButton();
		boolean isaddnewsdisplayed = managenews.isNewsCreatedSuccessfullyDisplayed();
		Assert.assertTrue(isaddnewsdisplayed,Constant.addingnewserrormessage);
		

	}

	@Test(priority=2,description="verfying user Able to search added news")
	public void verifyUserAbleToSearchAddedNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homepage=loginpage.clickOnSignInButton();
		//HomePage homepage = new HomePage(driver);
		managenews=homepage.clickOnNewsMoreInfoLink();
		String news = ExcelUtility.getStringData(0, 0, "ManageNews");

		//ManageNewsPage managenews = new ManageNewsPage(driver);

		managenews.clickOnSearchButtonOnManageNews().enterNewsOnTitleField(news).clickOnSearchButtonOnSearchingNews();
		boolean issearchbuttondisplayed=managenews.isSearchedNewsDisplayed();
		Assert.assertTrue(issearchbuttondisplayed,Constant.searchingnewserrormessage);
	}

	
}
