package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScrapping2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement reg = driver.findElement(By.className("ico-register"));
		System.out.println("Text of Register is :"+reg.getText());
		WebElement login = driver.findElement(By.className("ico-login"));
		System.out.println("Text of Login is :"+login.getText());
		WebElement cart = driver.findElement(By.className("cart-label"));
		System.out.println("Text of Shopping Cart is :"+cart.getText());
		WebElement wishlist = driver.findElement(By.className("ico-wishlist"));
		System.out.println("Text of Wishlist is :"+wishlist.getText());
		driver.close();
		
	}

	}