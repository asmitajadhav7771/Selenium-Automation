package PopUps;

import java.awt.AWTException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
        Alert alt = driver.switchTo().alert();
        Thread.sleep(1000);
        alt.accept();
}
}