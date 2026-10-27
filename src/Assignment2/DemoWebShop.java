package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pollanswers-3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
