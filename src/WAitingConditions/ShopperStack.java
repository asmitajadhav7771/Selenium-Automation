package WAitingConditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
	driver.findElement(By.id("loginBtn")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
	driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	driver.close();
	
}
}
