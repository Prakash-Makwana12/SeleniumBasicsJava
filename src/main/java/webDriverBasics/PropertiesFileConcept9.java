package webDriverBasics;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileConcept9 {

	public static void main(String[] args) throws IOException {

		
		//step :1 Create a object of a Properties class
		Properties prop = new Properties();
		
		//step 2: Create a  create a object of FileInputStream class and provide the path of the ".properties" file.
		FileInputStream ip = new FileInputStream("/Users/Prakash/eclipse-workspace/SeleniumBasics/src/main/java/webDriverBasics/config.properties");
		
		//step 3: Use the load() method of Properties class to load the properties file through FileInputStream
		prop.load(ip);
		
		//step 4: Use the getProperty() method to read/access properties defined through "key".
		System.out.println("URL: "+prop.getProperty("url"));
		
		System.setProperty("webdriver.chrome.driver", "/Users/Prakash/eclipse-workspace/SeleniumBasics/Resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		
		
		driver.close();
	
	
	}

}
