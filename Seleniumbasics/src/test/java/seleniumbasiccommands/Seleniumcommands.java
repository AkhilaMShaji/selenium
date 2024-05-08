package seleniumbasiccommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test

public class Seleniumcommands extends BrowserLaunch {
	@Test
	public void validDemoWebshop() {
		
		driver.get("https://demowebshop.tricentis.com");
		WebElement loginField= driver.findElement(By.className("ico-login"));
		loginField.click();
		WebElement userNameField= driver.findElement(By.id("Email"));
		userNameField.sendKeys("akhilamshaji@gmail.com");
		WebElement password= driver.findElement(By.id("Password"));
		password.sendKeys("Akhila@123");
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginButton.click();
		WebElement actualemailfield=driver.findElement(By.xpath("//a[@class='account'and text()='akhilamshaji@gmail.com']"));
		String actualresult=actualemailfield.getText();
		String expectedresult="akhilamshaji@gmail.com";
		Assert.assertEquals(actualresult, expectedresult, "Login not success");
				
	}
	@Test
	public void demoWeb() {
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstName.sendKeys("Akhila");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("Shaji");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("akhilamshaji12@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("akhila@123");
		WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		cpassword.sendKeys("akhila@123");
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
		WebElement continuebutton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continuebutton.click();
		WebElement auctualemailfield= driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		String actualresult=auctualemailfield.getText();
		String expectedresult ="The specified email already exists";
		Assert.assertEquals(actualresult,expectedresult,"The specified email already exists");
		
	}

	
	@Test
	public void guru() {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Akhila");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Shaji");
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("12345");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("akhilamshaji1234@gmail.com");
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("akhilahome");
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("ranny");
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("kerala");
		WebElement postal=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postal.sendKeys("689673");
		
		WebElement CountryDropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select= new Select(CountryDropdown);
		select.selectByVisibleText("INDIA");
		WebElement userName=driver.findElement(By.xpath("//input[@name='email']"));
		userName.sendKeys("Akhila");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("akhila@123");
		WebElement cpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		cpassword.sendKeys("akhila@123");
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		WebElement actualusernamefiled =driver.findElement(By.xpath("//input[@name='email']"));
		   String actualresult =actualusernamefiled.getText();
		   String expectedresult ="Akhila";
		   Assert.assertEquals(actualresult, expectedresult,"Username valid");
	}

		
		
		

	
	public static void verifyMultipleDropdown() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement multipleelements=  driver.findElement(By.xpath("//select[@class='form-control'and@id='multi-select-field']"));
				Select select= new Select(multipleelements);
				select.selectByVisibleText("Red");
				select.selectByVisibleText("Yellow");
				Boolean selectedvalue=select.isMultiple();
				System.out.println(selectedvalue);
				List<WebElement>selectedvalues= select.getAllSelectedOptions();
				for(WebElement e:selectedvalues) {
					System.out.println(e.getText());
				}
	
		
	}

}
