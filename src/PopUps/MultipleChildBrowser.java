package PopUps;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MultipleChildBrowser {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    String parent_dws = driver.getWindowHandle();
    System.out.println(parent_dws);
    Thread.sleep(2000);
    Actions act = new Actions (driver);
    act.keyDown(Keys.PAGE_DOWN).perform();
    Thread.sleep(1000);
    List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
    for(WebElement web : links) {
    	web.click();
    
    	Thread.sleep(1000);
    }
    Thread.sleep(1000);
    
    Set<String>allhandles = driver.getWindowHandles();
    System.out.println(allhandles);  
    
}
}
