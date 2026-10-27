package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterModule {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.className("ico-register"));
	    register.click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.name("FirstName")).sendKeys ("Asmita");
	    driver.findElement(By.id("LastName")).sendKeys ("Jadhav");
	    driver.findElement(By.id("Email")).sendKeys ("asmita123@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("Password")).sendKeys ("Asmita@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys ("Asmita@123");
		Thread.sleep(1000);
	
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(7000);
        driver.close();

	}	
}
