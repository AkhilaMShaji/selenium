package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

public class Commands {
	public static void Verifycommunitypool() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		java.util.List<WebElement>communitypoolelements=driver.findElements(By.xpath("//li[@class='answer']//input[@name='pollanswers-1']//following-sibling::label"));
		for (int i=0;i<communitypoolelements.size();i++) {
			String poolElementText=communitypoolelements.get(i).getText();
			if(poolElementText.equals("Good")) {
				communitypoolelements.get(i).click();
				driver.close();
			}
					}
		

	}
	public static void verifyValuesFromDropdown() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement CountryDropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select= new Select(CountryDropdown);
		//select.selectByVisibleText("INDIA");
		//select.selectByIndex(7);
		select.selectByValue("ANGOLA");
		WebElement GetCountryName=select.getFirstSelectedOption();
		System.out.println(GetCountryName.getText());
	}
	public static void multySelectDropdown() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement multipleelements=  driver.findElement(By.xpath("//select[@class='form-control'and@id='single-input-field']"));
				Select select= new Select(multipleelements);
				Boolean selectedvalue=select.isMultiple();
				System.out.println(selectedvalue);
				select.selectByVisibleText("Red");
				select.selectByVisibleText("Yellow");
				java.util.List<WebElement>selectedvalues= select.getAllSelectedOptions();
				for(WebElement e:selectedvalues) {
					System.out.println(e.getText());
				}
	}
	public static void IsSelector() {
		
	}

	public static void main(String[] args) {
		Verifycommunitypool();
		//verifyValuesFromDropdown();
		//multySelectDropdown();
	}
	}

