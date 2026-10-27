package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateNewAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='group']/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='23']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@role='group']/div[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[text()='May']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@role='group']/div[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[text()='2000']")).click();
	}



}
