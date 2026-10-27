package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathLoginAndShoppingCart {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("asmita1419@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asmita@12");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Build your own cheap computer']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_65']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_91']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_58']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_93']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).sendKeys("2");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Shopping cart')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='/logout']")).click();
	Thread.sleep(1000);
	driver.close();
	
}
}
