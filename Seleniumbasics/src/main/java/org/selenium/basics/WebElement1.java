package org.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement1 {
	 WebDriver driver;
	public void commands()
	{
		driver = new FirefoxDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 WebElement userNameField=driver.findElement(By.id("user-name"));
		    userNameField.sendKeys("standard_user");
		    WebElement passwordField=driver.findElement(By.id("password"));
			passwordField.sendKeys("secret_sauce");
			WebElement loginButton=driver.findElement(By.id("login-button"));
			loginButton.click();
			driver.close();

	}
		public void TotalNumberOfTagsInTheApplication() {
		
			driver = new FirefoxDriver();
			 driver.get("https://www.saucedemo.com/");
			 driver.manage().window().maximize();
			 List<WebElement>divtags=driver.findElements(By.tagName("div"));
			int divtagsize= divtags.size();
			 System.out.println("Total number of divtag is "+divtagsize);
			 driver.close();
		}
	

	public static void main(String[] args) {
		WebElement1 obj=new WebElement1();
		obj.commands();
		obj.TotalNumberOfTagsInTheApplication();
	}
}