package seleniumbasiccommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class Seleniumcommands extends BrowserLaunch {
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

}
