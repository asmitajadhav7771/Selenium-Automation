package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	driver.switchTo().frame(1);
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement outter = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
	driver.switchTo().frame(outter);
	Thread.sleep(2000);
	
	
}
}
