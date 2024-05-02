package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title is"+title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(" current url is "+currenturl);
		String windowhandle=driver.getCurrentUrl();
		System.out.println("Current url is"+currenturl);
		String pagesource=driver.getPageSource();
		System.out.println("page source is"+pagesource);
		driver.close();
			}

	
}
