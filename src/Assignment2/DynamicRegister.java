package Assignment2;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRegister {
public static void main(String[] args) throws InterruptedException {
	Random r = new Random();
	int num = r.nextInt(1000);
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-female")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("FirstName")).sendKeys("Asmita");
	Thread.sleep(1000);
	driver.findElement(By.id("LastName")).sendKeys("Jadhav");
	Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("asmita"+num+"@gmail.com");
	
	driver.findElement(By.id("Password")).sendKeys("Asmita@7771");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Asmita@7771");
	Thread.sleep(1000);
	driver.findElement(By.id("register-button")).click();
	driver.close();
	
}
}
