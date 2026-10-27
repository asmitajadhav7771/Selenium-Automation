package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomPage {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		if (driver.findElement(By.tagName("body")).isDisplayed()) {

			System.out.println("PASS: Page is displayed properly at 125% browser zoom.");

		} else {

			System.out.println("FAIL: Page is not displayed properly at 125% browser zoom.");
		}

		driver.quit();
	}
}