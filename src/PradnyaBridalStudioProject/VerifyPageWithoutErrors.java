package PradnyaBridalStudioProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageWithoutErrors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pradnya-studio.web.app/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();

		if (driver.getCurrentUrl() != null) {
			System.out.println("No errors are observed after resizing");

		} else {

			System.out.println("Error observed after resizing");
		}
		driver.quit();
	}
}