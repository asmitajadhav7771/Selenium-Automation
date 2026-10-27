package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(2000);
    driver.findElement(By.linkText("Alert with OK & Cancel")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert alt = driver.switchTo().alert();
	alt.dismiss();
	
}
}
