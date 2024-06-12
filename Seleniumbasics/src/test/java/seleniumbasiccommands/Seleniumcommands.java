package seleniumbasiccommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class Seleniumcommands extends BrowserLaunch {
	@Test
	public void validDemoWebshop() {
		
		driver.get("https://demowebshop.tricentis.com");
		WebElement loginField= driver.findElement(By.className("ico-login"));
		loginField.click();
		WebElement userNameField= driver.findElement(By.id("Email"));
		userNameField.sendKeys("akhilamshaji@gmail.com");
		WebElement password= driver.findElement(By.id("Password"));
		password.sendKeys("Akhila@123");
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginButton.click();
		WebElement actualemailfield=driver.findElement(By.xpath("//a[@class='account'and text()='akhilamshaji@gmail.com']"));
		String actualresult=actualemailfield.getText();
		String expectedresult="akhilamshaji@gmail.com";
		Assert.assertEquals(actualresult, expectedresult, "Login not success");
				
	}
	@Test
	public void demoWeb() {
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstName.sendKeys("Akhilaa");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("Shajii");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("akhilamshajiii@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("akhila@123");
		WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		cpassword.sendKeys("akhila@123");
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
		WebElement continuebutton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continuebutton.click();
		WebElement actualemailfield= driver.findElement(By.xpath("//a[@class='account'and text()='akhilamshaji@gmail.com']"));
		String actualemail = actualemailfield.getText();
		System.out.println(actualemail);
		//String Expectedemail = "akhilamshaji@gmail.com";
		//Assert.assertEquals(actualemail, Expectedemail, "Login is not sucess");
	}

	
	@Test
	public void guru() {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Akhila");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Shaji");
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("12345");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("akhilamshaji1234@gmail.com");
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
		WebElement nameofemail= driver.findElement(By.xpath("//text()='b' Note: Your user name is testuser.']"));
		String actualname = nameofemail.getText();
		String Expectedname = "Note: Your user name is testuser." ;
		Assert.assertEquals(actualname, Expectedname, "Login not successful");
		Assert.assertTrue(true);// Boolean
	}

		@Test
		public void validateIsSelected() {
			boolean ismaleselected;
			driver.get("https://demowebshop.tricentis.com/register");
			WebElement maleradiobutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
			ismaleselected = maleradiobutton.isSelected();
			Assert.assertFalse(ismaleselected, "Radio button is selected");
			System.out.println("Male element before selected"+" "+ismaleselected);
			maleradiobutton.click();
			ismaleselected = maleradiobutton.isSelected();
			Assert.assertTrue(ismaleselected, "Radio button is not selected");
			System.out.println("Male element after selected"+" "+ismaleselected);
		}
		
		@Test
		public void validateButtonIsEnabled() {
			boolean issubscribebuttonenabled;
			driver.get("https://demowebshop.tricentis.com/");
			WebElement subscribebutton = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
			issubscribebuttonenabled = subscribebutton.isEnabled();
			Assert.assertTrue(issubscribebuttonenabled, "Subscribe button is not enabled");
			System.out.println("Subscribe button is enabled"+" "+issubscribebuttonenabled);
			}
		@Test
		public void validateButtonIsDisplayed() {
			boolean isvotebuttondisplayed;
			driver.get("https://demowebshop.tricentis.com/");
			WebElement votebutton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
			isvotebuttondisplayed = votebutton.isDisplayed();
			Assert.assertTrue(isvotebuttondisplayed, "Vote button is not displayed");
			System.out.println("Vote button is displayed"+" "+isvotebuttondisplayed);
			}
		@Test
		public void verifyRightClick() {
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			WebElement rightclickbutton=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
					Actions action= new Actions(driver);
			action.contextClick(rightclickbutton).build().perform();
			;
		}
		@Test
		
		public void verifyDoubleClick() {
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action= new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
				}
		@Test
		
		public void dragAndDrop() {
			driver.get("https://demoqa.com/droppable");
			WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
			Actions action= new Actions(driver);
			action.dragAndDrop(drag, drop).build().perform();
			
		}
		@Test
		public void dragAndDropOffset() {
			driver.get("https://demoqa.com/dragabble");
			WebElement drag=driver.findElement(By.xpath("//div[@id='dragBox']"));
			Actions action= new Actions(driver);
			action.dragAndDropBy(drag, 150, 150).build().perform();
		}
		@Test
		
		public void verifyMouseOver() {
			driver.get("https://demoqa.com/menu/");
			WebElement mouseover=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
			Actions action= new Actions(driver);
			action.moveToElement(mouseover).build().perform();
			WebElement mouseover2=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
			action.moveToElement(mouseover2).build().perform();
			
		}
		@Test
		
		
		public static void verifyMultipleDropdown() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement multipleelements=  driver.findElement(By.xpath("//select[@class='form-control'and@id='multi-select-field']"));
				Select select= new Select(multipleelements);
				select.selectByVisibleText("Red");
				select.selectByVisibleText("Yellow");
				Boolean selectedvalue=select.isMultiple();
				System.out.println(selectedvalue);
				List<WebElement>selectedvalues= select.getAllSelectedOptions();
				for(WebElement e:selectedvalues) {
					System.out.println(e.getText());
				}
	
		
	}
	@Test	

public  void verifySimpleAlert() {

	driver.get("https://demoqa.com/alerts");
	WebElement clickmebutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
	clickmebutton.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
	@Test
	
	public  void verifyConfirmationAlert() {
		driver.get("https://demoqa.com/alerts");
		WebElement confirmbutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmbutton.click();
		Alert alert=driver.switchTo().alert();
		String alert_text=alert.getText();
		System.out.println(alert_text);
		alert.dismiss();
		WebElement clickcancelelement=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String actualresult=clickcancelelement.getText();
		String expectedresult="You selected cancel";
		Assert.assertEquals(actualresult, expectedresult, "You selected OK");
		
}
	@Test
	
	public  void validatePromtAlert() {
		driver.get("https://demoqa.com/alerts");
		WebElement promt_button=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promt_button.click();
		Alert alert=driver.switchTo().alert();
		String alert_text=alert.getText();
		System.out.println(alert_text);
		alert.sendKeys("The name is Test");
		alert.accept();
		WebElement textmessage_name=driver.findElement(By.xpath("//span[@id='promptResult']"));
		String actualresult=textmessage_name.getText();
		String expectedresult="You entered name is test";
		Assert.assertEquals(actualresult, expectedresult, "You have not entered a text");
	}
	@Test
	   
	   public void validatePromptAlert() 
	   {
		 driver.get("https://demoqa.com/alerts");  
		 WebElement prompt_button = driver.findElement(By.xpath("//button[@id='promtButton']"));
		 prompt_button.click();
		 Alert alert = driver.switchTo().alert();
		 String alert_text = alert.getText();
		 System.out.println(alert_text);
		 alert.sendKeys("The name is test");
		 alert.accept();
		 WebElement textmessage_name = driver.findElement(By.xpath("//span[@id='promptResult']"));
		 String actualresult = textmessage_name.getText();
		 String expectedresult = "You entered The name is test";
		 Assert.assertEquals(actualresult, expectedresult,"You have not entered a text");
		 
	   }
	    @Test
	    
	   public void validateDoubleClickAlert() 
	   {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");   
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
	    Alert alert = driver.switchTo().alert();
		String alert_text = alert.getText();
		System.out.println(alert_text);
		alert.accept();
	  }
	    @Test
	    
	   
	public void verifyMultipleWindowHandling() 
	    { 
	       driver.get("https://demo.guru99.com/popup.php"); 
	       String parentwindow_handleid = 	driver.getWindowHandle(); 
	       System.out.println(parentwindow_handleid); 
	       WebElement click_button = driver.findElement(By.xpath("//a[@target='_blank'and text()='Click Here']")); 
	       click_button.click(); 
	       Set<String> windowshandlesid = driver.getWindowHandles(); 
	       System.out.println(windowshandlesid); 
	       Iterator<String>values=windowshandlesid.iterator();
	       while(values.hasNext())// return type boolean 
	       { 
	    	String handleid = values.next(); 
	    	if(!handleid.equals(parentwindow_handleid))  
	    	 { 
	    		WebElement emailid = driver.findElement(By.xpath("//input[@name='emailid']")); 
	    		emailid.sendKeys("abc@gmail.com"); 
	    		WebElement submit_button = driver.findElement(By.xpath("//input[@name='btnLogin']")); 
	    		submit_button.click(); 
	    		driver.close(); 
	    		 
	    	 } 
	      } 
	       driver.switchTo().window(parentwindow_handleid); 
	    } 
	    @Test
	    
	    public  void verifyDynamicTable() {
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
				 }}

@Test
 
 public void verifyFrames()  
 { 
   driver.get("https://demoqa.com/frames");	 
   List <WebElement> iframe_tags = driver.findElements(By.tagName("iframe")); 
   int size =  iframe_tags.size(); 
   System.out.println("The total number of frames in the Webpage  "+ size); 
   //driver.switchTo().frame(3); 
   //driver.switchTo().frame("frame1"); 
   WebElement frame = driver.findElement(By.id("frame1")); 
   driver.switchTo().frame(frame); 
   WebElement frame1_text = driver.findElement(By.id("sampleHeading")); 
   String frame_text = frame1_text.getText(); 
   System.out.println(frame_text); 
   driver.switchTo().defaultContent();// to home page from a frame 
 }  
@Test
public void verifyFileUpload() {

	driver.get("https://demo.guru99.com/test/upload/");
	WebElement fileupload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	fileupload.sendKeys("D:\\Java\\SeleniumBasics\\src\\main\\resources\\Java_Arrays.docx");
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
	checkbox.click();
	WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
	submitbutton.click();
	
}
@Test
public void framesAssignment() {
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	WebElement text=driver.findElement(By.xpath("//input[@class='frmTextBox'and @id='name']"));
	text.sendKeys("hi");
	WebElement frame1 = driver.findElement(By.id("header-wrappers"));
	driver.switchTo().frame(frame1);
	WebElement frame_dropdown=driver.findElement(By.id("selectnav1"));
	Select select=new Select(frame_dropdown);
	select.selectByValue("java");
	driver.switchTo().defaultContent();
	WebElement dropdownbox1 = driver.findElement(By.xpath("//select[@id='selectnav1']"));
	Select select1 = new Select(dropdownbox1);
	select1.selectByVisibleText("-- Selenium");
	driver.switchTo().defaultContent();
}
@Test

public void verifyImplicitWait() {
	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("timerAlertButton")));
WebElement click_button=driver.findElement(By.id("timerAlertButton"));
click_button.click();
wait.until(ExpectedConditions.alertIsPresent());
Alert alert=driver.switchTo().alert();
alert.accept();
}
@	Test

public void verifyFluentWait() {
	driver.get("https://demoqa.com/alerts");
	FluentWait wait=new FluentWait(driver);
	//wait.withTimeout(Duration.ofSeconds(20));
	//wait.pollingEvery(Duration.ofSeconds(8));
	//wait.ignoring(NoSuchElementException.class);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("timerAlertButton")));
		WebElement click_button=driver.findElement(By.id("timerAlertButton"));
		click_button.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();
	 
}
@Test

public void verifyJavaScriptSendKeysandClick() {
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("document.getElementById(\"newsletter-email\").value='abc@gmail.com'");
	js.executeAsyncScript("document.getElementById(\"newsletter-subscribe-button\").click()");
}
@Test

public void verifyVerticalScrolll() {
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
}
@Test
public void javaScriptAssignment() {
	driver.get("https://demowebshop.tricentis.com/login");
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("document.getElementById(\"Email\").value='akhilamshaji@gmail.com'");
	js.executeScript("document.getElementById(\"Password\").value='Akhila@123'");
	js.executeScript("document.getElementsByClassName('button-1 login-button')[0].click()");
}

@Test
public void verifyscrollasmt() {
	 driver.get("https://demoqa.com/alerts");  
	 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
}
@Test

public void verifyScreenshot() {
	 driver.get("https://demowebshop.tricentis.com/login");
	 String actualtitle=driver.getTitle();
	 System.out.println("Actual title is "+actualtitle);
	 String expectedtitle="demowebshop";
	 Assert.assertEquals(actualtitle, expectedtitle,"Invalid title");
	 
	 
}
}


		
	

