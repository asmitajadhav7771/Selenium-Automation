package Qspideriframes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
	Thread.sleep(2000);
    driver.switchTo().frame(0);
    Thread.sleep(1000);
    driver.switchTo().frame(0);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Asmita");
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Asmita123");
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Asmita123");
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//button[@id='submitButton']")).click();
    Thread.sleep(1000);
 
}
}
