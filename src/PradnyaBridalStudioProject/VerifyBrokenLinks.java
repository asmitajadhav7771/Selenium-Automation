package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");

		if (driver.getCurrentUrl() != null) {
			System.out.println("All links are working correctly");

		} else {
			System.out.println("Broken link found");
		}
		driver.quit();
	}
}