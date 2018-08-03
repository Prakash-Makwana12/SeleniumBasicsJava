package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"u_0_2\"]"));
		
		//String color = "rgb(265,0,0)";
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].style.backgroundColor = 'red'", loginBtn);
		
		//changeColor(driver,color,loginBtn);
		
		flash(driver, loginBtn);
		drawBorder(loginBtn, driver);
	}
	public static void flash(WebDriver driver, WebElement loginBtn) throws InterruptedException
	{
		String bgColor = loginBtn.getCssValue("backgroundColor");
		for(int i = 0; i<10;i++)
		{
			changeColor(driver, "rgb(265,0,0)", loginBtn);
			Thread.sleep(2000);
			changeColor(driver, bgColor, loginBtn);
		}
	}
	public static void changeColor(WebDriver driver, String color, WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	}
	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border = '2px solid red'", element);
	}
	
	
	
}
