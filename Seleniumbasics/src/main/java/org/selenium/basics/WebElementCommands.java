package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com");
		driver.manage().window().maximize();
		WebElement userNameField=driver.findElement(By.id("user-name"));
         userNameField.sendKeys("standard_user");
		WebElement passwordfield =driver. findElement (By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.id("login button"));
		loginButton.click();
	}

}
