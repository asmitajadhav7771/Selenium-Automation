package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement searchField = driver.findElement(By.tagName("input"));
	searchField.sendKeys("Watch");
	Thread.sleep(4000);
	driver.close();
	}
}
