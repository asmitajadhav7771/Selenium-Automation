package Actionclass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Dynamic.html");
	Thread.sleep(1000);
     Actions act = new Actions(driver);
     WebElement angular = driver.findElement(By.id("angular"));
     WebElement mongo = driver.findElement(By.id("mongo"));
     WebElement selenium = driver.findElement(By.id("node"));
     WebElement target = driver.findElement(By.id("droparea"));

     act.dragAndDrop(angular, target).perform();
     act.dragAndDrop(mongo, target).perform();
     act.dragAndDrop(selenium, target).perform();
     List<WebElement> boxes = driver.findElements(By.xpath("//div[@id='droparea']/div"));
    		  
  
//	 act.dragAndDrop(angular, boxes.get(0)).perform();
//     act.dragAndDrop(mongo, boxes.get(1)).perform();
//     act.dragAndDrop(selenium, boxes.get(2)).perform();
//}
}
}