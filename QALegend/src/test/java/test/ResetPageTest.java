package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import page.LoginPage;
import page.ResetPage;
import utilities.ExcelUtility;

public class ResetPageTest extends Base{
	
	@Test
	public void verifyForgotpasswordWithInvalidEmailid() 
	{
		String emailid=ExcelUtility.readStringData(0, 0, "Resetpage");
	    String expected_text=ExcelUtility.readStringData(0, 1, "Resetpage");
        LoginPage login = new LoginPage(driver);
	    login.clikOnForgotePassword();
	    ResetPage reset = new ResetPage(driver);
	    reset.getEmailidField(emailid);
        reset.clickpasswordreset_button();
        String actual_text = reset.getTextmsgOfResetmailfail(emailid);
        Assert.assertEquals(actual_text, expected_text,"The error messages does not match");
	 }
}