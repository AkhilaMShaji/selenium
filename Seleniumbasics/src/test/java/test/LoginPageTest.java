package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Listeners.RetryAnalyzer;
import automationcore.Base;
import dataProvider.DataProviders;
import utilities.ExcelUtility;

public class LoginPageTest extends Base {
	@Test(groups= {"Sanity"})
	
	public void verifyLoginPageTitle() {
		driver.get("https://demowebshop.tricentis.com/login");
	    String title = 	driver.getTitle();
	    System.out.println(" The page Title login page is " + title);
	    String expectedtitle = ExcelUtility.readStringData(0, 0,"LoginPage") ;  
	     Assert.assertEquals(title, expectedtitle, "Invalid Title");
	  }
	@Test(retryAnalyzer= RetryAnalyzer.class)
	
	public void verifyUserLogin() {
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement userNameField= driver.findElement(By.id("Email"));
		userNameField.sendKeys("akhilamshaji@gmail.com");
		WebElement password= driver.findElement(By.id("Password"));
		password.sendKeys("Akhila@123");
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginButton.click();
		WebElement actualemailfield=driver.findElement(By.xpath("//a[@class='account'and text()='akhilamshaji@gmail.com']"));
		String actualresult=actualemailfield.getText();
		String expectedresult = ExcelUtility.readStringData(0, 1, "Loginpage");
		//String expectedresult="akhilamshaji@gmail.com";
		Assert.assertEquals(actualresult, expectedresult, "Login not success");
				
	}
	@Test(dataProvider="invalidUserCredentials" ,dataProviderClass=DataProviders.class)
	
	public void verifyUserLoginWithInvalidCredentials(String username, String password) {
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailid_field = driver.findElement(By.id("Email"));
		emailid_field.sendKeys(username);
		WebElement password_field = driver.findElement(By.id("Password"));
		password_field.sendKeys(password);
		WebElement login_button = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		login_button.click();
		WebElement textloginmessage = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		String textloginmessage_actual = textloginmessage.getText();
		String textloginmssage_expected = ExcelUtility.readStringData(0, 3,"Loginpage");
		Assert.assertEquals(textloginmessage_actual, textloginmssage_expected, "Login failed warning message not found");
	}}

