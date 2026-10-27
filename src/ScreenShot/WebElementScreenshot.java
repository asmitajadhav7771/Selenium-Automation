package ScreenShot;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import UtilityClass.Javautility;
import UtilityClass.SeleniumUtility;

public class WebElementScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	LocalDateTime date= LocalDateTime.now();
	String dateTime = date.toString().replace(':', '-');
	String dynamicName = "zomatoicon+dateTime";
	System.out.println(dynamicName);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/pune");
	Thread.sleep(2000);
	WebElement zomato_icon = driver.findElement(By.xpath("//div[@class='sc-gw7xuz-0 hVNItB']"));
	//without factory method 
//	File from = zomato_icon.getScreenshotAs(OutputType.FILE);
//	File to = new File("C:\\selenium Popup\\"+dynamicName+".png");
//	FileHandler.copy(from, to);
//	Thread.sleep(1000);
	
	//with factory method
	String name = Javautility.dynamicnameWithDateTime("zomato");
	SeleniumUtility.ElementScreenshot(zomato_icon, name);
	Thread.sleep(1000);
	driver.quit();
	
}
}
