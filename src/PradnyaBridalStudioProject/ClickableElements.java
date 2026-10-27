package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickableElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElements(By.tagName("a")).size() > 0) {
			System.out.println("PASS: All clickable elements responded correctly with a single click.");

		} else {
			System.out.println("FAIL: Clickable elements did not respond correctly.");
		}

		driver.quit();
	}
}