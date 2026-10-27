package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrowserBackButton {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		Thread.sleep(2000);
		String firstPage = driver.getCurrentUrl();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		if (driver.getCurrentUrl().equals(firstPage)) {

			System.out.println("Previous page opens successfully");

		} else {

			System.out.println("Previous page is not opened");
		}

		driver.quit();
	}
}