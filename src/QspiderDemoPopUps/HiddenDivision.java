package QspiderDemoPopUps;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customerName']")).sendKeys("Asmita");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customerEmail']")).sendKeys("asmita123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='prod']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Mobile']")).click();
		Thread.sleep(2000);
		
		WebElement msg = driver.findElement(By.xpath("//textarea[@id='message']"));
		msg.click();
		Thread.sleep(2000);
		msg.sendKeys("Hello Selenium...");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
}
}