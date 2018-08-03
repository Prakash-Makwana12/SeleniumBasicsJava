package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
//		//FireFox Browser settings
//		System.setProperty("webdriver.gecko.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/geckodriver");
//		driver = new FirefoxDriver();
		
		
		//Chrome browser settings
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		//driver = new ChromeDriver();
		
		driver = new HtmlUnitDriver();
		
		driver.get("http://www.google.com");
		
		String pageTitle = driver.getTitle();// Title of the page
		System.out.println("Current Page Title is "+pageTitle);
		
		
		String currentUrl = driver.getCurrentUrl();//URL
		System.out.println("URL :"+currentUrl);
		
		
		//Title Validation
		Assert.assertEquals("Google", pageTitle,"Incorrect title.");
		
		if(pageTitle.equals("Google"))
		{
			System.out.println("Correct Title.");
		}
		else
		{
			System.out.println("Incorrect Title.");
		}
		
		driver.close();

	}

}
