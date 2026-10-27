package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCard {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("$25 Virtual Gift Card")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("giftcard_2_RecipientName"))
				.sendKeys("AsmitaJadhav");

		driver.findElement(By.id("giftcard_2_RecipientEmail"))
				.sendKeys("asmitajadhav123@gmail.com");

		driver.findElement(By.id("giftcard_2_SenderName"))
				.sendKeys("Asmita");

		driver.findElement(By.id("giftcard_2_SenderEmail"))
				.sendKeys("asmita123@gmail.com");

		driver.findElement(By.id("giftcard_2_Message"))
				.sendKeys("Happy Birthday");

		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
