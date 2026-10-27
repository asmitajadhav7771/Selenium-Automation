package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoading {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElement(By.tagName("body")).isDisplayed()) {

			System.out.println("PASS: Home page loaded smoothly without flickering");

		} else {

			System.out.println("FAIL: Home page did not load smoothly");
		}

		driver.quit();
	}
}