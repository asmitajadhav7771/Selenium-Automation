package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopping_cart {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver()	;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement shoppingcart = driver.findElement(By.className("cart-label"));
		shoppingcart.click();
		Thread.sleep(5000);
		
		
	}

}
