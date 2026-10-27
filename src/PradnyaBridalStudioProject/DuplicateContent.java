package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateContent {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);

		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);

		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);

		if (driver.findElement(By.tagName("body")).isDisplayed()) {

			System.out.println("PASS: No duplicate content was displayed");

		} else {

			System.out.println("FAIL: Duplicate content was displayed");
		}

		driver.quit();
	}
}