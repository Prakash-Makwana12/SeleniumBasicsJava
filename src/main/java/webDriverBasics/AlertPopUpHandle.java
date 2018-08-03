package webDriverBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//1
		Alert alert = driver.switchTo().alert();
		
		//2
		String alertMessage = alert.getText();
		System.out.println("Alert Message = "+alert.getText());
		
		Assert.assertEquals(alertMessage, "Please enter a valid user name","Incorrect alert message.");
		
		//3
		alert.accept();//clicks on OK button.
		
		//4
		//alert.dismiss();// to dismiss the popup.
				
		driver.close();
		
	}

}
