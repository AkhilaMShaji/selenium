package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch {

public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//webdriver is an interface and chromedriver is class
driver.get("https://www.seleniumeasy.com/");//to load a url
driver.manage().window().maximize();//to maximize
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
