package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDisableButtonClick{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
	    
		driver.findElement(By.id("timerButton")).click();
		Thread.sleep(2000);
		driver.quit();
		
}
}