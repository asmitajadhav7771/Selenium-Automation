package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleDragAndDrop {
	public static void main(String[]args)throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[contains(.,'Mouse Actions')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/ul/li/a/section[contains(.,'Drag & Drop')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul/li[3]/a[contains(.,'Drag Position')]")).click();
		Thread.sleep(1000);
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Thread.sleep(1000);
		WebElement laptopAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Thread.sleep(1000);
		WebElement mc = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		act.clickAndHold(mc).moveToElement(mobileAccessories).release().perform();
		Thread.sleep(1000);
		
		WebElement mcover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		act.clickAndHold(mcover).moveToElement(mobileAccessories).release().perform();
		Thread.sleep(1000);
		
		WebElement lc = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		act.clickAndHold(lc).moveToElement(laptopAccessories).release().perform();
		Thread.sleep(1000);
		
		WebElement laptopover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		act.clickAndHold(laptopover).moveToElement(laptopAccessories).release().perform();
		Thread.sleep(1000);
	
	}
	}