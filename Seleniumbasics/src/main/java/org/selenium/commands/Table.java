package org.selenium.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void verifyDynamicTable() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/indices");
			 driver.manage().window().maximize();
			 WebElement showmore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
			 showmore.click();
			 WebElement webtable=driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
			 List<WebElement>rows=webtable.findElements(By.tagName("td"));
			 int rowsize=rows.size();
			 for(int i=0;i<rowsize;i++) {
				 List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
				 int columnsize=columns.size();
				 for(int j=0;j<columnsize;j++) {
					 String celltext=columns.get(j).getText();
					 if(celltext.equals("S&P BSE 200")) {
						 System.out.println("Pre close value is "+columns.get(1).getText());
						
					 }
				 }
			 }
			driver.close() ;
	}
public static void main(String[] args) {
	verifyDynamicTable();
}
}
