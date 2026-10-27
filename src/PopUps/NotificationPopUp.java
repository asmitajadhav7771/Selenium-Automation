package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
public static void main(String[] args) throws InterruptedException, AWTException {
	//By using chromeOptions
	ChromeOptions options = new ChromeOptions();
	//Disable notification
	options.addArguments("--disable-notification");
	//Open in incognito mode
	options.addArguments("--incognito");
	//Open in headless mode
	options.addArguments("--headless");
	System.out.println("Execution Start");
	ChromeDriver driver = new ChromeDriver(options);
	System.out.println("Browser is openned");
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
	System.out.println("Execution Done")	;
	Thread.sleep(2000);
	Robot bot = new Robot();
	bot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	bot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	bot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);

}
}