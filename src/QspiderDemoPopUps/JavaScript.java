package QspiderDemoPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='false']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Delete']")).click();
	Thread.sleep(1000);
	Robot bot = new Robot();
//	bot.keyPress(KeyEvent.VK_TAB);
	bot.keyPress(KeyEvent.VK_ENTER);
	bot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	
}
}
