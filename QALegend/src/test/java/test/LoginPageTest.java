package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import constants.Messages;
import dataProvider.DataProviders;
import page.HomePage;
import page.LoginPage;
import utilities.ExcelUtility;
@Test

public class LoginPageTest extends Base{
	
	
	@Test
	public void verifyUserLoginWithValidCredentials() {
		String username=ExcelUtility.readStringData(1, 1, Constants.LOGIN_PAGE);
		String password=ExcelUtility.readIntegerData(0, 1, Constants.LOGIN_PAGE);
		String expected_result=ExcelUtility.readStringData(0, 4, Constants.LOGIN_PAGE);
		  LoginPage login = new LoginPage(driver);
		    login.enterUserName(username);
		    login.enterPassword(password);
		    HomePage home =  login.clickOnLoginButton();
		    String  actual_result = home.getLoginUserText();
		    Assert.assertEquals(actual_result,expected_result ,Messages.LOGIN_FAILURE);
	   
	}

	
	@Test
	public void verifyLoginPageTitle() {
	 String expectedtitle=ExcelUtility.readStringData(0, 0, Constants.LOGIN_PAGE);
	 
	 LoginPage login=new LoginPage(driver);
	 String actualtitle= login.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle,"ivalidtitle");
	}
	
	
	@Test(dataProvider="invalidUserCredentials" ,dataProviderClass=DataProviders.class)
	public void verifyUserLoginWithInvalidCredential(String username , String password)
		{
			String expected_errormsg = ExcelUtility.readStringData(1, 0, Constants.LOGIN_PAGE);
			LoginPage login = new LoginPage(driver);
		    login.enterUserName(username);
		    login.enterPassword(password);
		    login.clickOnLoginButton();
			String actual_errormsg = login.getInvalidLoginUserText();
			Assert.assertEquals(actual_errormsg,expected_errormsg ,Messages.LOGIN_FAILURE);
		}
				}
