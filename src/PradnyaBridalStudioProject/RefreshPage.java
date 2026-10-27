package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://pradnya-studio.web.app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		if (driver.getTitle() != null) {
			System.out.println("PASS: Page reloaded correctly after pressing F5");

		} else {
			System.out.println("FAIL: Page did not reload correctly after pressing F5");
		}

		driver.quit();
	}
}