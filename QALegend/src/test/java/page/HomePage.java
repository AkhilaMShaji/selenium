package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
public HomePage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//h1")
WebElement headercontent;
@FindBy(xpath="//section[@class='content-header']")
WebElement welcome_user;

@FindBy(xpath="//i[@class='fa fa-calculator fa-lg']")
WebElement date;
@FindBy(xpath="//span[@class='title']")
WebElement usermanagementfield;
@FindBy(xpath="//span[@class='title']")
WebElement userfield;
  public String getLoginUserText() {
	 String text = welcome_user.getText();
	 return text;
  }
public String getActualTitle() {
	String actualtitle=driver.getTitle();
	return actualtitle;
}
public String homepageDate() {
	String datedisplayed= date.getText();
	return datedisplayed;
}
public String getSystemDate() 
{
 String system_date =java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
 return system_date;
}
public void clickOnUserManagementbutton() {
	usermanagementfield.click();
	
}
public void clickOnUser() {
	userfield.click();
}

}
  