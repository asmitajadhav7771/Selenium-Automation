package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleDrag {

  public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapps.qspiders.com/");
	  Thread.sleep(1000);

	 Actions act = new Actions(driver);

	 driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	 Thread.sleep(1000);

	 driver.findElement(By.xpath("//section[contains(.,'Mouse Actions')]")).click();
	 Thread.sleep(2000);

	 driver.findElement(By.xpath("//div/ul/li/a/section[contains(.,'Drag & Drop')]")).click();
	 Thread.sleep(1000);     
	            
	 WebElement dragposition =driver.findElement(By.xpath("//a[text()='Drag Multiple']"));
	 act.moveToElement(dragposition).click().perform();
	 Thread.sleep(1000);

	 WebElement lc = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	 Thread.sleep(1000);

	 WebElement lcover = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
     WebElement laptopAccessories = driver.findElement(By.id("dropZone2"));

	 lc.click();
	 lcover.click();

	  act.dragAndDrop(lcover, laptopAccessories).perform();
	  Thread.sleep(1000);

	  WebElement mobileCover =driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	  Thread.sleep(1000);

	  WebElement mobileCharger =driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	                
	  WebElement mobileAccessories =driver.findElement(By.id("dropZone1"));    
	        mobileCover.click();
	        mobileCharger.click();
	        act.dragAndDrop(mobileCharger, mobileAccessories).perform();

	        Thread.sleep(1000);
	        driver.close();
	    }
	}

