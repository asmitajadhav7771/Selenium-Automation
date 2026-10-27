package PopUps;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserPopup {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	String expected_url = "https://www.facebook.com/nopCommerce";
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.scrollByAmount(0, 1000).perform();
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
	for(WebElement web : links) {
		web.click();
		Thread.sleep(2000);
	}
	Thread.sleep(2000);
    Set<String> childs = driver.getWindowHandles();
    for(String str : childs) {
    	driver.switchTo().window(str);
    	String actual_url = driver.getCurrentUrl();
    	if(expected_url.equals(actual_url)) {
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
    		break;
    	}
    	Thread.sleep(2000);
    }
}
}
