package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ValidDemoWebshop {
public void Validdemowebshop() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	WebElement loginField= driver.findElement(By.className("ico-login"));
	loginField.click();
	WebElement userNameField= driver.findElement(By.id("Email"));
	userNameField.sendKeys("akhilamshaji@gmail.com");
	WebElement password= driver.findElement(By.id("Password"));
	password.sendKeys("Akhila@123");
	WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
	loginButton.click();
	driver.close();
}
	 public void TotalNumberofTagesinApplication() {
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://demowebshop.tricentis.com/");
		    driver.manage().window().maximize();
		    List<WebElement> divtags = driver.findElements(By.tagName("div"));// To find list of web elements
		    int divtagesize = divtags.size(); //variable.size
		    System.out.println("Total number of div tag is " + divtagesize );
		    driver.close();
		    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidDemoWebshop obj= new ValidDemoWebshop();
		obj.Validdemowebshop();
	}

}
