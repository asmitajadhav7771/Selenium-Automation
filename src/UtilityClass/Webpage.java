package UtilityClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	//without factory method 
	//TakeScreenshot ts = (TakesScreenshot)driver;
	//File from = ts.getScreenshotAs(OutputType.FILE);
	//File to = new File("C:\\Selenium\\demowebshop.png");
	//FileHandler.copy(from,to);
	//Thread.sleep(1000);
	
	//with factory method 
	String name = Javautility.dynamicnameWithDateTime("demo");
	SeleniumUtility.webpageScreenshot(driver, name);
	
}
}
