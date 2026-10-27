package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysByUsingRobot {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("small-searchterms")).click();
	Thread.sleep(1000);
	Robot ref = new Robot();
	ref.keyPress(KeyEvent.VK_M);
	Thread.sleep(1000);
	ref.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	ref.keyPress(KeyEvent.VK_N);
	Thread.sleep(1000);
	ref.keyPress(KeyEvent.VK_U);
	Thread.sleep(1000);
	
	ref.keyRelease(KeyEvent.VK_M);
	ref.keyRelease(KeyEvent.VK_A);
	ref.keyRelease(KeyEvent.VK_N);
	ref.keyRelease(KeyEvent.VK_U);
	
}
}
