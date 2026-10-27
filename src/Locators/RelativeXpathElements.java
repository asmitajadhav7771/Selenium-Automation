package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathElements {
public static void main(String[] args) throws InterruptedException  {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	Thread.sleep(2000);
	List <WebElement> add = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	for (WebElement web : add) {
		web.click();
		Thread.sleep(500);
	}
	driver.findElement(By.xpath("cart-label")).click();
}
}
