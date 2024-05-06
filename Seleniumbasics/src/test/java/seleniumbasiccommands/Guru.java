package seleniumbasiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Akhila");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Shaji");
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("12345");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("akhilamshaji12@gmail.com");
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
		
		}

}
