package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Iframe with an Iframe")).click();
//	By using index
//	driver.switchTo().frame(1);
//	Thread.sleep(1000);
//	driver.switchTo().frame(0);
	//By using WebElement
	WebElement outter = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
	driver.switchTo().frame(outter);
	Thread.sleep(1000);
    WebElement inner = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
	driver.switchTo().frame(inner);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mani");
	
}
}
