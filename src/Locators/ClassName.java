package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement searchField = driver.findElement(By.tagName("input"));
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		Thread.sleep(3000);
		
	}

}
