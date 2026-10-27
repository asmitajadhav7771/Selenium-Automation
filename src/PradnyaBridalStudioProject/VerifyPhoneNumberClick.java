package PradnyaBridalStudioProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPhoneNumberClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pradnya-studio.web.app/");

		Thread.sleep(3000);

		driver.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);
		WebElement callStudio = driver.findElement(By.xpath("//a[text()='Call Studio']"));
		callStudio.click();
		System.out.println("PASS : Dialer opened successfully after clicking the phone number");

		driver.quit();
	}
}