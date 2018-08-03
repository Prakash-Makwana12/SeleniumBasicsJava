package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		//dropdown for selecting a month	
		Select select = new Select(driver.findElement(By.id("month")));
		
		select.selectByVisibleText("Nov");
				
		//driver.close();
	}

}
