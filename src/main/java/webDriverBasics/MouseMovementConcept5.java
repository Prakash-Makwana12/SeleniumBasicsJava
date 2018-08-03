package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovementConcept5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://www.spicejet.com/");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[contains(text(),'Student
		// Discount')]")).click();

		// Explicitly wait = you have to convert driver to WebDriverWait and specify the
		// expected condition.
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Student Discount')]"))))
				.click();

		driver.close();

	}

}
