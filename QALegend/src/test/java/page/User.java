package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User  {
	WebDriver driver;
	public User(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement searchfield;
	@FindBy(xpath ="//a[@class='btn btn-block btn-primary']")
	WebElement addbutton;
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	 @FindBy(id="last_name")
	WebElement lastname ;
	 @FindBy(id="email")
	WebElement emailid ;
	 @FindBy(id="password")
	WebElement password1 ;
	 @FindBy(id="confirm_password")
	WebElement confirm_password;
	 @FindBy(id ="submit_user_button")
    WebElement submitbutton;
	     
		  
	  
public void enterSearchData(String searchfieldv) {
	searchfield.sendKeys(searchfieldv);
}
public void clickOnAddButton() {
	addbutton.click();
}


public void enterFirstname(String firstname1) 
{
	firstname.sendKeys(firstname1);
}

public void enterLastname(String lastname1) 
{
	lastname.sendKeys(lastname1);
}

public void enterEmail(String email) 
{
	emailid.sendKeys(email);
}

public void enterpassword(String password) 
{
	password1.sendKeys(password);
}

public void addConfirmpassword(String confirmpassword) 
{
	confirm_password.sendKeys(confirmpassword);
}

public void clickOnSubmitButton() 
{
	submitbutton.click();
}
}
