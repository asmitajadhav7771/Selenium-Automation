package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	WebElement rightClick = driver.findElement(By.xpath("//body[@id='authentication']/span"));
	//act.contextClick(rightClick).perform();
   WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
   act.moveToElement(rightClick).contextClick().click(copy).perform();
   Thread.sleep(2000);
   driver.switchTo().alert().accept();
   Thread.sleep(3000);

	WebElement paste = driver.findElement(By.xpath("//span[text()='Paste']"));
	
	act.moveToElement(rightClick).contextClick().click(paste).perform();
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(5000);
	
	driver.quit();
	}
}
