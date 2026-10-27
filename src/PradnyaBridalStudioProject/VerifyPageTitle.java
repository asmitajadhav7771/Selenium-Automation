package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
        Thread.sleep(2000);
		String title = driver.getTitle();

		if (!title.isEmpty()) {
			System.out.println("Page title is displayed correctly : Test Case Is Pass");

		} else {

			System.out.println("Page title is not displayed : Test Case Is Fail");
		}
		driver.quit();
	}
}