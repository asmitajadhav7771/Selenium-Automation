package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndName {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.name("q")).sendKeys("mobile");
	    driver.findElement(By.name("q")).clear();
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		Thread.sleep(3000);
	}

}
