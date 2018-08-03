package webDriverBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWaitConcept7 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		
		WebDriver driver = new ChromeDriver();//launch browser
		driver.get("http://www.amazon.com");// enter the url
		
		driver.manage().window().maximize();//maximize the browser window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		//Dynamic wait or global waits
		//pageLoadTimeout will allow time to load the page upto 30 seconds
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//this will allow maximum 20 seconds of timeout to load all the elements of the page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicitly wait = you have to convert driver to WebDriverWait and specify the expected condition.
			new WebDriverWait(driver,10).until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Student Discount')]")))).click();
				
		
		//to close the current browser window.
		//driver.close();
		
		//to close all the browser window opened by current program execution
		//driver.quit();
	}

}
