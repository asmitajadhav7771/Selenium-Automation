package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLoadingSpeed {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://pradnya-studio.web.app/")) {
			System.out.println("Page loaded successfully");
			System.out.println("TC_38 : PASS");

		} else {
			System.out.println("Page loading not successful");
			System.out.println("TC_38 : FAIL");
		}
		driver.quit();
	}
}
