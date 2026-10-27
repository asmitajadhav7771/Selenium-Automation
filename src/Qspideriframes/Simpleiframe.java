package Qspideriframes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simpleiframe {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
	Thread.sleep(2000);
	driver.switchTo().frame(0);

	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Asmita");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Asmita@2000");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='submitButton']")).click();

	
}
}
