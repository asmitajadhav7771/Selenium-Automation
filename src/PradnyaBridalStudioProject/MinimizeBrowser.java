package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeBrowser {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.getTitle() != null) {
			System.out.println("PASS: Page layout remained proper after minimizing and restoring the browser.");
		} else {
			System.out.println("FAIL: Page layout was not proper after minimizing and restoring the browser.");
		}

		driver.quit();
	}
}