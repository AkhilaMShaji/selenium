package test;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import automationcore.Base;
import utilities.ExcelUtility;

public class HomepageTest extends Base {
	@Test(groups= {"Sanity"})
	
	
	public void verifyHomePageTitle()
	  {
		
		driver.get("https://demowebshop.tricentis.com/");
	    String  actualtitle = 	driver.getTitle();
	    System.out.println(" The page Title is " + actualtitle);
	    String expectedtitle = ExcelUtility.readStringData(0, 0,"HomePage") ;  
		Assert.assertEquals(actualtitle, expectedtitle, " Title is invalid ");
	  }

	
	@Test
	
	public void verifyCoomunityPoolSelection() 
	  
	  {
	       driver.get("https://demowebshop.tricentis.com/ ");
	       List<WebElement> communitypoolelements = driver.findElements(By.xpath("//li[@class='answer']//input[@name='pollanswers-1']//following-sibling::label")); // Because we have a list of elements using xpath get 4 element
	       String data = ExcelUtility.readStringData(0, 1, "Homepage");
	       for(int i= 0; i<communitypoolelements.size();i++)	{ // for loop to fetch for elements
		   
		   String pollElementText = communitypoolelements.get(i).getText(); // Store to a string variable
		   System.out.println(pollElementText);
		   if (pollElementText.equals(data)) 
		   { // to check if two strings are equal using equals()
		   communitypoolelements.get(i).click();// to click on that
		   }
			// Assertion for this??  not working for is selected
		   WebElement elementselected = driver.findElement(By.xpath("//label[@for='pollanswers-2']"));
		   boolean iselementenabled = elementselected.isSelected();
		   Assert.assertTrue(iselementenabled, "Element is not selected");
	       
    }

	  }}

