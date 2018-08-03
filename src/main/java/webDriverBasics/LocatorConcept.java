package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		
		//1.XPATH
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Alex");
		
		//2.ID
		driver.findElement(By.id("u_0_a")).click();
		
		//3.Name
		//driver.findElement(By.name("firstname")).sendKeys("Alex");
		
		//4.linktext
		
		Boolean link = driver.findElement(By.linkText("Forgot account?")).isDisplayed();
		if(link)
		{
			System.out.println("Forget Account link is visible.");
		}
		
		
		//5.if id is there then put #{id}
		driver.findElement(By.cssSelector("#month")).sendKeys("Aug");
		
		//6.partialLinkText - Not Recommended
		Boolean linkTest = driver.findElement(By.partialLinkText("Forgot")).isEnabled();
		if(linkTest)
		{
			System.out.println("Forget Account link is enabled.");
		}
		
		//7.className - not recommended
		//driver.findElement(By.className("_5dba")).sendKeys("Aug");
		//driver.close();
	}

}
