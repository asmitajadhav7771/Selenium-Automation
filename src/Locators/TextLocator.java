package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Shopping")).click();
		driver.findElement(By.linkText("Good")).click();
		}

}
