package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
 import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
	Thread.sleep(2000);
	Robot bot = new Robot();
	driver.findElement(By.linkText("Alert with Textbox")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();

	 Alert alt = driver.switchTo().alert();
	 System.out.println(alt.getText());
     alt.sendKeys("Manu");
     Thread.sleep(1000);
     alt.accept();
     Thread.sleep(1000);
     String text = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
     System.out.println(text);
}
}
