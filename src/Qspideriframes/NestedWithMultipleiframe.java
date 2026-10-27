package Qspideriframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedWithMultipleiframe {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement firstChild = driver.findElement(By.xpath("(//div[@class='form_container'])[2]/iframe"));
		driver.switchTo().frame(firstChild);
		Thread.sleep(1000);
		WebElement secondChild = driver.findElement(By.xpath("//div[@class='form-group']/iframe"));
		driver.switchTo().frame(secondChild);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asmita123@gmail.com");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		WebElement thirdChild = driver.findElement(By.xpath("(//div[@class='form-group']/iframe)[2]"));
		driver.switchTo().frame(thirdChild);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Asmita@123");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		
		WebElement fourthChild = driver.findElement(By.xpath("(//div[@class='form-group']/iframe)[3]"));
		driver.switchTo().frame(fourthChild);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Asmita@123");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		
		WebElement fifthChild = driver.findElement(By.xpath("(//div[@class='form-group']/iframe)[4]"));
		driver.switchTo().frame(fifthChild);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();
		
	
	}

}