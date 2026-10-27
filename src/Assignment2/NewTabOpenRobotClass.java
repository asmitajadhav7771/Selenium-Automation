package Assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabOpenRobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		Robot bot = new Robot();
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(2000);

		for(int i = 1; i <= 16; i++) {
		    bot.keyPress(KeyEvent.VK_TAB);
		    bot.keyRelease(KeyEvent.VK_TAB);
		    Thread.sleep(1000);
		}

		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		
		for(int i = 1; i <= 18; i++) {
		    bot.keyPress(KeyEvent.VK_TAB);
		    bot.keyRelease(KeyEvent.VK_TAB);
		    Thread.sleep(1000);
		}

		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		 bot.keyPress(KeyEvent.VK_TAB);
		 bot.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(500);
		 bot.keyPress(KeyEvent.VK_ENTER);
         bot.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
}
}