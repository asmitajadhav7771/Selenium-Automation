package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Consultation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);

		if (driver.findElement(By.xpath("//button[text()='Book Consultation']")).isDisplayed()) {

			System.out.println("PASS: Book Consultation section was displayed successfully");

		} else {

			System.out.println("FAIL: Book Consultation section was not displayed");
		}
		driver.quit();
	}
}