package PopUps;

import java.awt.AWTException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alt = driver.switchTo().alert();
        Thread.sleep(1000);
        alt.sendKeys("Manu");
        alt.accept();
}
}