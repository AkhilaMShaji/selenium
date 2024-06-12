package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import page.HomePage;
import page.LoginPage;
import page.User;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class UserTest extends Base{
	@Test
	
public void verifyAddUser(){
		 String username = ExcelUtility.readStringData(0, 0,Constants.USER);
		    String password = ExcelUtility.readIntegerData(0, 1, Constants.USER);
		    String firstname=RandomDataUtility.getFirstname();
		    String lastname=RandomDataUtility.getLastname();
		    String email = firstname+"."+lastname+"@gmail.com";
		    String password2=firstname+"123..";
		    LoginPage login = new LoginPage(driver);
		    login.enterUserName(username);
			login.enterPassword(password);
			login.clickOnLoginButton();
		
		    
		    HomePage home= new HomePage(driver) ;
			home.clickOnUserManagementbutton();
			home.clickOnUser();
			
			 User user= new User(driver);
			user.clickOnAddButton();
			user.enterFirstname(firstname);
			user.enterLastname(lastname);
			user.enterEmail(email);
			user.enterpassword(password2);
			user.addConfirmpassword(password2);
			user.clickOnSubmitButton();
	
}
	@Test
public void verifySearchUser() {
	    String username = ExcelUtility.readStringData(0, 0,Constants.USER);
	    String password = ExcelUtility.readIntegerData(0, 1, Constants.USER);
	    String searchfield=ExcelUtility.readStringData(0, 2, Constants.USER);
	
	    LoginPage login=new LoginPage(driver);
	login.enterUserName(username);
	login.enterPassword(password);
	login.clickOnLoginButton();
	
	HomePage home= new HomePage(driver) ;
	home.clickOnUserManagementbutton();
	home.clickOnUser();
	 User user= new User(driver);
	 user.enterSearchData(searchfield);;
	}

	@Test
public void verifyViewUser() {
	
}
	@Test
public void verifyDeleteUser() {
	
}
}
