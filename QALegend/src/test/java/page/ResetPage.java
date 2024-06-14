package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPage {
	
		WebDriver driver;
		public ResetPage(WebDriver driver) 
		{
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//a[@class='btn btn-link']")
		WebElement forgot_password;
		
		@FindBy(xpath="//input[@class='form-control']")
		WebElement email_field ;

		@FindBy(xpath="//button[@type='submit']")
				WebElement submitbutton;
		
		@FindBy(xpath = "//span[@class='help-block']")
		WebElement passwordresetfailure_text ;
		
		public void clickOnForgotPasswordField() {
			forgot_password.click();
		}
		
		public String enterEmailidToReset() {
			String emailid=email_field.getText();
			return emailid;
		}
		public void clickOnSubmitButton() {
			submitbutton.click();
		}
		public String getTextmsgOfResetmailfail(String mailidtext) 
		{
			String textmsg = passwordresetfailure_text.getText();
			return textmsg;
			
		}
		
		
	}