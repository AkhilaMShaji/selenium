package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import page.LoginPage;
import page.ResetPage;
import sun.tools.jconsole.Messages;
import utilities.ExcelUtility;

public class ResetPageTest extends Base{
	
	@Test
	public void verifyForgotpasswordWithInvalidEmailid() 
	{
		String emailid=ExcelUtility.readStringData(0, 0, Constants.RESET_PAGE);
	    String expected_text=ExcelUtility.readStringData(0, 1, Constants.RESET_PAGE);
	    
        LoginPage login = new LoginPage(driver);
	    login.clikOnForgotePassword();
	    ResetPage reset = new ResetPage(driver);
	    reset.enterEmailidToReset();
        reset.clickOnSubmitButton();
        String actual_text = reset.getTextmsgOfResetmailfail(emailid);
        Assert.assertEquals(actual_text, expected_text,Messages.MESSAGE);
	 }
}