package webDriverBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Testin");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("g");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println("Total no. of suggestions are: "+list.size());
		
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing methodologies"))
			{
				list.get(i).click();
				break;
			}
		}
		
		//driver.close();
		
	}

}
