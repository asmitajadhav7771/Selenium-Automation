package PopUps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube {
public static void main(String[] args) throws InterruptedException {
	String facebook_url = "https://www.facebook.com/nopCommerce";
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.scrollByAmount(0, 1000).perform();
	Thread.sleep(2000);
}
}
