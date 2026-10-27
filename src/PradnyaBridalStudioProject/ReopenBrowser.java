package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReopenBrowser {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.close();
		driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		if (driver.findElement(By.tagName("body")).isDisplayed()) {

			System.out.println("PASS: Home page opened successfully after reopening the browser");

		} else {

			System.out.println("FAIL: Home page did not open successfully after reopening the browser");
		}
		driver.quit();
	}
}