package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class RegistrationPageTest extends Base {
	@Test(groups= {"Regression"})
	
public void verifyRegisterPageTitle() {
		driver.get("https://demowebshop.tricentis.com/register");
		String actualtitle = driver.getTitle();
		System.out.println("title is"+actualtitle);
		//String expectedtitle="Demo Web Shop. Register";
		String expectedtitle = ExcelUtility.readStringData(0, 0, "Registrationpage");
		Assert.assertEquals(actualtitle, expectedtitle, "title invalid");
}
	@Test(groups= {"Sanity"})
	
	 public void verifyUserRegistration() // Random Data Generation
	 {
			String first_name = RandomDataUtility.getFirstname();
			String last_name = RandomDataUtility.getLastname();
			String mailid = first_name+"."+last_name+"@yahoo.com";
			String password_new = first_name+"."+last_name;
			
			driver.get("https://demowebshop.tricentis.com/register ");
			WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
			firstname.sendKeys(first_name);
			WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
			lastname.sendKeys(last_name);
			WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
			email.sendKeys(mailid);
			WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
			password.sendKeys(password_new);
			WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			confirmpassword.sendKeys(password_new);
			WebElement register = driver.findElement(By.xpath("//input[@id='register-button']"));
			register.click();
			WebElement success_message = driver.findElement(By.xpath("//div[@class='result']"));
			String actualsuccess_message = success_message.getText();
			String expectedsuccess_message = ExcelUtility.readStringData(0, 1,"Registrationpage");
			Assert.assertEquals(actualsuccess_message,expectedsuccess_message,"Registration not successful");
	 }
}
