package Assignment2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rating5Star {
    public static void main(String[] args) throws InterruptedException {

      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demoapps.qspiders.com/");
      Thread.sleep(2000);
      Actions act = new Actions(driver);
      driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//section[contains(., 'Mouse Actions')]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div/ul/li/a/section[contains(.,'Mouse Hover')]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//ul/li[3]/a[contains(.,'Ratings')]")).click();
      Thread.sleep(1000);
      WebElement scroll = driver.findElement(By.xpath("//p[text()='Your Rating is  ']"));
	  act.scrollToElement(scroll).perform();
      Thread.sleep(1000);
      
      List<WebElement> stars = driver.findElements(By.xpath("//div[@class ='flex justify-center pt-2']/label"));
      for(WebElement web : stars) {
    	  web.click();
    	  Thread.sleep(1000);
      }
      act.click();
      WebElement rating = driver.findElement(By.xpath("//p[text() = 'Your Rating is ']"));
	  System.out.print(rating.getText());
    }
}