package PradnyaBridalStudioProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonSpacing {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
        
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (driver.findElements(By.tagName("button")).size() > 0) {
			System.out.println("PASS: Buttons had equal spacing");

		} else {
			System.out.println("FAIL: Buttons did not have equal spacing");
		}

		driver.quit();
	}
}