package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleAlert {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Alert with OK")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Thread.sleep(1000);
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
}
}