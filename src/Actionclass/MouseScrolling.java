package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScrolling {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	Actions act = new Actions (driver);
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
//	act.scrollToElement(facebook).perform();
//	act.scrollByAmount(0, 1000).perform();
	act.keyDown(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	act.keyDown(Keys.PAGE_UP).perform();
}
}
