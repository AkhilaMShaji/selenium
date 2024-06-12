package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserManagement {
	WebDriver driver;
	public UserManagement (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
