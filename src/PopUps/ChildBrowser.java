package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Actions act = new Actions (driver);
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	String parent = driver.getWindowHandle();
	act.scrollToElement(facebook).click(facebook).perform();
	Thread.sleep(2000);
	Set<String> childs = driver.getWindowHandles();
	for(String str : childs) {
		driver.switchTo().window(str);
		Thread.sleep(2000);
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	
	
	
}
}
