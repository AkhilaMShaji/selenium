package org.selenium.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qabible {
	
	public static void verifyValuesFromDropdown() {
		WebDriver driver= new ChromeDriver();
		driver.get(" https://selenium.qabible.in/");
		driver.manage().window().maximize();
	 WebElement inputform =	driver.findElement(By.xpath("//a[@class='nav-link'and@href='simple-form-demo.php']"));
		 inputform.click();
		 WebElement selectinput =	driver.findElement(By.xpath("//a[@href='select-input.php']"));
		 selectinput.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control'and@id='single-input-field']"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(1);
		select.selectByValue("Yellow");//String 
		//WebElement getcolourname = select.getFirstSelectedOption();
		//System.out.println(getcolourname.getText());
		List<WebElement> obj = select.getOptions();
		for(int i= 0; i<obj.size();i++)	{ 
			System.out.println(obj.get(i).getText());
		}
		}
	
	public static void main(String[] args) {
		
		verifyValuesFromDropdown();
	}

}
